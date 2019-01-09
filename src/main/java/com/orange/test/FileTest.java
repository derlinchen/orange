package com.orange.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.Gson;
import com.orange.bean.User;

public class FileTest {

	public static void main(String[] args) {
		try {
			postmethod();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void putmethod() throws Exception {
		User user = new User();
		user.setId("122");
		// 创建httpclient对象
		CloseableHttpClient client = HttpClients.createDefault();
		// 创建post方式请求对象
		HttpPut httpPut = new HttpPut("http://localhost:8080/orange/put.do");
		httpPut.setHeader("Content-type", "application/json");
		StringEntity se = new StringEntity(new Gson().toJson(user));
		httpPut.setEntity(se);
		client.execute(httpPut);
	}
	
	public static void postmethod() throws Exception {
		// 创建httpclient对象
		CloseableHttpClient client = HttpClients.createDefault();
		// 创建post方式请求对象
		HttpPost httpPost = new HttpPost("http://localhost:8080/orange/post.do");
	
		// 装填参数
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("id", "12222"));
		// 设置参数到请求对象中
		httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
		// 执行请求操作，并拿到结果（同步阻塞）
		client.execute(httpPost);
	}
	
}
