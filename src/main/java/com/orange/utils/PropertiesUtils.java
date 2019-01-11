package com.orange.utils;

import java.util.Properties;

public class PropertiesUtils {
	
	public static Properties pps;
	
	public static String getString(String key){
		return pps.getProperty(key);
	}
	
}
