package com.sample.di.demo3;

public class SmsMessageSender implements MessageSender {
	
	@Override
	public void sendMessage(String title, String content, String from, String to) {
		System.out.println("------SMS 메세지 발송------");
		System.out.println("보내는 곳" + from);
		System.out.println("받는 곳" + to);
		System.out.println("제 목" + title);
		System.out.println("내 용" + title);
		System.out.println("-----------------------");
		
	}
	
}
