package com.orange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @ServletComponentScan与Listener配合使用
 * @EnableScheduling与定时任务配合使用
 * @author Derlin
 *
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ServletComponentScan
@EnableScheduling
public class OrangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangeApplication.class, args);
	}

}

