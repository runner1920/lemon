package com.lemon.common.util.http;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

/**
 * 
 * @author jiangqk
 * @data 2017年12月7日 下午3:18:44
 */
public class MyX509TrustManager implements X509TrustManager {

	@Override
	public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
			throws CertificateException {
		
	}

	@Override
	public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
			throws CertificateException {
		
	}

	@Override
	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}

}
