package com.lemon.common.util.sftp;

import java.util.Properties;

import org.apache.log4j.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

/**
 * 
 * @author jiangqk
 * @data 2017年12月26日 下午3:36:54
 */
public class SFTPChannel {
	
	private static final Logger logger = Logger.getLogger(SFTPChannel.class);
	
	Session session = null;
    Channel channel = null;
    
    private String host;
    private int port;
    private String username;
    private String password;
    
    public SFTPChannel(String host, int port, String username, String password) {
    	this.host = host;
    	this.port = port;
    	this.username = username;
    	this.password = password;
	}
    
    public ChannelSftp getChannel(int timeout) throws JSchException {
    	//获取session
    	JSch jsch = new JSch();
    	session = jsch.getSession(username, host, port);
    	session.setPassword(password);
    	Properties config = new Properties();
    	config.put("StrictHostKeyChecking", "no");
    	session.setConfig(config);
    	if (timeout!=0) {
    		session.setTimeout(timeout);
    	}
    	session.connect();
    	logger.info("session connected");
    	
    	//打开SFTP通道
    	channel = session.openChannel("sftp");
    	channel.connect();
    	logger.info("channel connected");
    	
    	return (ChannelSftp) channel;
    }
    
    /**
     * 关闭连接
     */
    public void closeChannel() {
    	if (channel!=null && channel.isConnected()) {
    		channel.disconnect();
    	}
    	if (session!=null && session.isConnected()) {
    		session.disconnect();
    	}
    }
}
