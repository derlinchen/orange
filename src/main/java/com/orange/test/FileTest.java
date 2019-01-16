package com.orange.test;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.Gson;
import com.orange.bean.User;
import com.orange.utils.HttpDelete;

public class FileTest {

	public static void main(String[] args) {
		try {
			getmethod();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getmethod() throws Exception{
		// 创建httpclient对象
		CloseableHttpClient client = HttpClients.createDefault();
		URIBuilder builder = new URIBuilder("http://localhost:8080/orange/get.do");
		builder.setParameter("id", "张三");
		HttpGet httpGet = new HttpGet(builder.build());
		httpGet.setHeader("Content-type", "application/json;charset=utf-8");
		client.execute(httpGet);
	}
	
	public static void pathmethod() throws Exception {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://localhost:8080/orange/path/hello");
		httpGet.setHeader("Content-type", "application/json;charset=utf-8");
		client.execute(httpGet);
	}
	
	public static void putmethod() throws Exception {
		User user = new User();
		user.setId("122");
		// 创建httpclient对象
		CloseableHttpClient client = HttpClients.createDefault();
		// 创建post方式请求对象
		HttpPut httpPut = new HttpPut("http://localhost:8080/orange/put.do");
		httpPut.setHeader("Content-type", "application/json;charset=utf-8");
		// 解决参数传递乱码
		StringEntity se = new StringEntity(new Gson().toJson(user), "UTF-8");
		httpPut.setEntity(se);
		client.execute(httpPut);
	}
	
	public static void postmethod() throws Exception {
		User user = new User();
		user.setId("华盛顿");
		// 创建httpclient对象
		CloseableHttpClient client = HttpClients.createDefault();
		// 创建post方式请求对象
		HttpPost httpPost = new HttpPost("http://localhost:8080/orange/post.do");
		httpPost.addHeader("Content-Type", "application/json;charset=utf-8");
		// 解决参数传递乱码
		StringEntity entity = new StringEntity(new Gson().toJson(user), "UTF-8");
        httpPost.setEntity(entity);
		// 执行请求操作，并拿到结果（同步阻塞）
		client.execute(httpPost);
	}
	
	
	public static void deletemethod() throws Exception {
		User user = new User();
		user.setId("122");
		// 创建httpclient对象
		CloseableHttpClient client = HttpClients.createDefault();
		// 创建post方式请求对象
		HttpDelete httpDelete = new HttpDelete("http://localhost:8080/orange/delete.do");
		httpDelete.addHeader("Content-Type", "application/json;charset=utf-8");
		// 解决参数传递乱码
		StringEntity entity = new StringEntity(new Gson().toJson(user), "UTF-8");
		httpDelete.setEntity(entity);
		// 执行请求操作，并拿到结果（同步阻塞）
		client.execute(httpDelete);
	}
	
	
}
