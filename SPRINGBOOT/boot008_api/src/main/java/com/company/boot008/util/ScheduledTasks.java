package com.company.boot008.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	
	@Scheduled(fixedRate = 5000)	// 5초마다
	public void runTask1() {
		System.out.println("스케쥴러 실행중 : "+ System.currentTimeMillis());
	}
	@Scheduled(cron = "0 1 10 * * ?")	// 매일 자정
	public void runTest2() {
		System.out.println("스케쥴러 실행중 : "+System.currentTimeMillis());
	}
}

/*
	fixedRade : 1000 = 1초
	fixedDelay : 어떤 작업이 끝난 후 지정된 시간에 실행
	cron : "초 분 시 일 월 요일" ex) "0 30 18 * * ?" 매일 18시 30분, "0 0 0 1 * ?" 매월 1일 자정 
			"0 0 0 ? * MON" 매주 월요일 자정
			* : 제한 없는 모든 값 / ? : 특정 값 없음
	
	@EnableScheduling 구동시키기
	@SpringBootApplication
	@EnableScheduling
	public class Boot008SecurityApplication()
	
*/