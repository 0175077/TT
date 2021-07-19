package com.sample.di.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("context-di-demo3.xml");
		
		EventService eventService = container.getBean("eventService", EventService.class);
		eventService.noticeEvent("여름휴가 대비하세요", "집밖은 위험!");
	}
}
