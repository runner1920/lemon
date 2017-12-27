package com.lemon.common.util.sftp;

import java.io.InputStream;
import java.util.List;

import org.apache.log4j.Logger;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;

/**
 * SFTP操作文件
 * @author jiangqk
 * @data 2017年12月26日 下午3:26:30
 */
public class SFTPUtil {
	
	private static final Logger logger = Logger.getLogger(SFTPUtil.class);
	
	public static SFTPChannel getSFTPChannel() throws JSchException {
		return new SFTPChannel(SFTPConstant.SFTP_HOST, SFTPConstant.SFTP_PORT
				, SFTPConstant.SFTP_USERNAME, SFTPConstant.SFTP_PASSWORD);
	}
	
	/**
	 * 上传单个文件
	 * @param input
	 * @param directory
	 * @param fileName
	 * @throws JSchException
	 * @throws SftpException
	 */
	public static void uploadFile(InputStream input, String directory, String fileName) throws JSchException, SftpException {
		SFTPChannel channel = getSFTPChannel();
		try {
			ChannelSftp sftp = channel.getChannel(0);
			try {
				sftp.cd(directory);
			} catch (SftpException e) {
				logger.warn("directory is not exist");
				sftp.mkdir(directory);
				sftp.cd(directory);
			}
			sftp.put(input, fileName);
			logger.info(fileName+"文件上传成功");
		} finally {
			channel.closeChannel();
		}
	}
	
	/**
	 * 删除单个文件
	 * @param directory
	 * @param fileName
	 * @throws JSchException 
	 * @throws SftpException 
	 */
	public static void deleteFile(String directory, String fileName) throws JSchException, SftpException {
		SFTPChannel channel = getSFTPChannel();
		try {
			ChannelSftp sftp = channel.getChannel(0);
			sftp.cd(directory);
			sftp.rm(fileName);
			logger.info(fileName+"文件删除成功");
		} finally {
			channel.closeChannel();
		}
	}
	
	/**
	 * 批量删除文件
	 * @param dsts
	 * @throws SftpException
	 * @throws JSchException
	 */
	public static void deleteFiles(List<String> dsts) throws SftpException, JSchException {
		SFTPChannel channel = getSFTPChannel();
		try {
			ChannelSftp sftp = channel.getChannel(0);
			for (String dst : dsts) {
				sftp.rm(dst);
			}
			logger.info("批量文件删除成功");
		} finally {
			channel.closeChannel();
		}
	}
}
