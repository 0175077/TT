package com.sample.di.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("context-di-demo1.xml");
		
		BookDao bookDao = container.getBean("bookDao", BookDao.class);
		CustomerDao customerDao = container.getBean(CustomerDao.class);
		OrderDao orderDao = container.getBean(OrderDao.class);
		
		bookDao.getAllBooks();
		customerDao.getCustomerBtId();
		orderDao.cancelOrder();
	}
}
