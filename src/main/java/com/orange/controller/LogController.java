package com.orange.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
	
	private final static Logger logger = LoggerFactory.getLogger(LogController.class);
	
	/**
	 * 通过requestparam获取请求值
	 * @param id
	 */
	@RequestMapping("/log")
	public void log(){
		logger.info("1111");
		logger.error("2222");
	}
}
