package com.orange.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobSchedule {

	@Scheduled(cron = "0 0/1 * * * ?")
	public void startjob(){
		System.out.println("start job");
	}
}
