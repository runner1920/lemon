package com.lemon.common.util.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.apache.log4j.Logger;

import com.lemon.common.util.StringUtils;

/**
 * 发送http请求
 * @author jiangqk
 * @data 2017年12月7日 下午3:20:29
 */
public class HttpUtil {
	
	private static final Logger logger = Logger.getLogger(HttpUtil.class);
	
	/**
	 * 发送https请求
	 * @param requestUrl 请求地址
	 * @param requestMethod GET Or POST
	 * @param outputStr 请求体
	 * @return
	 */
	public static String httpsRequest(String requestUrl, String requestMethod, String outputStr) {
		StringBuffer buffer = null;
		try {
			SSLContext sslContext=SSLContext.getInstance("SSL");
			TrustManager[] tm = {new MyX509TrustManager()};
			sslContext.init(null, tm, new SecureRandom());
			SSLSocketFactory ssf = sslContext.getSocketFactory();
			URL url = new URL(requestUrl);
			HttpsURLConnection conn= (HttpsURLConnection)url.openConnection();
			conn.setDoOutput(true);  
		    conn.setDoInput(true);  
		    conn.setUseCaches(false);  
		    conn.setRequestMethod(requestMethod);
		    //设置当前实例使用的SSLSoctetFactory  
		    conn.setSSLSocketFactory(ssf);
		    conn.connect();
		    //写入请求体
		    if (StringUtils.isNotEmpty(outputStr)) {
		    	OutputStream os=conn.getOutputStream();
		    	os.write(outputStr.getBytes("utf-8"));  
		        os.close();
		    }
		    //读取服务器端返回的内容  
		    InputStream is = conn.getInputStream();
		    InputStreamReader isr = new InputStreamReader(is,"utf-8");
		    BufferedReader br = new BufferedReader(isr);
		    buffer = new StringBuffer();
		    String line=null;  
		    while((line = br.readLine()) != null){  
		        buffer.append(line);  
		    }
		    return buffer.toString();
		} catch (NoSuchAlgorithmException e) {
			logger.error("NoSuchAlgorithmException",e);
		} catch (KeyManagementException e) {
			logger.error("KeyManagementException",e);
		} catch (MalformedURLException e) {
			logger.error("MalformedURLException",e);
		} catch (IOException e) {
			logger.error("IOException,",e);
		} catch (Exception e) {
			logger.error("Exception",e);
		}
		logger.error("请求数据:requestUrl="+requestUrl+",requestMethod"+requestMethod+",outputStr="+outputStr);
		return null;
	}
	
	/**
	 * 发送http请求
	 * @param requestUrl
	 * @param requestMethod
	 * @param outputStr
	 * @return
	 */
	public static String httpRequest(String requestUrl, String requestMethod, String outputStr) {
		StringBuffer buffer = null;
		try {
			URL url = new URL(requestUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setRequestMethod(requestMethod);
			conn.connect();
			// 写入请求体
			if (StringUtils.isNotEmpty(outputStr)) {
				OutputStream os = conn.getOutputStream();
				os.write(outputStr.getBytes("utf-8"));
				os.close();
			}
			
			//读取服务器端返回的内容  
		    InputStream is = conn.getInputStream();
		    InputStreamReader isr = new InputStreamReader(is,"utf-8");
		    BufferedReader br = new BufferedReader(isr);
		    buffer = new StringBuffer();
		    String line=null;  
		    while((line = br.readLine()) != null){  
		        buffer.append(line);  
		    }
		    return buffer.toString();
		} catch (MalformedURLException e) {
			logger.error("MalformedURLException",e);
		} catch (IOException e) {
			logger.error("IOException",e);
		}
		logger.error("请求数据:requestUrl="+requestUrl+",requestMethod"+requestMethod+",outputStr="+outputStr);
		return null;
	}
}
