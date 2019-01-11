package com.orange.listener;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.orange.utils.PropertiesUtils;


@WebListener
public class OrangeListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		PropertiesUtils.pps = new Properties();
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("config/orange.properties");
		try {
			PropertiesUtils.pps.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("listener destroyed");
	}
	
}
