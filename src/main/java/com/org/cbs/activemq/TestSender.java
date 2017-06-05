package com.org.cbs.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSender {
	
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("activemq.xml");
//		HelloSender sender = (HelloSender) context.getBean("HelloSender"); 
		HelloSender sender =new HelloSender();
		sender.sendInfo();
		System.out.println("发布成功");

	}
}
