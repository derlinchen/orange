package com.orange.utils;

import java.net.URI;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public class HttpDelete extends HttpEntityEnclosingRequestBase{
	public static final String METHOD_NAME = "DELETE";
	 
    /**
     * 获取方法（必须重载）
     *
     * @return
     */
    @Override
    public String getMethod() {
        return METHOD_NAME;
    }
 
    public HttpDelete(final String uri) {
        super();
        setURI(URI.create(uri));
    }
 
    public HttpDelete(final URI uri) {
        super();
        setURI(uri);
    }
 
    public HttpDelete() {
        super();
    }
}
