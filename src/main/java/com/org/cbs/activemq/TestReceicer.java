package com.org.cbs.activemq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReceicer {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("activemq.xml");
        HelloReceiver receiver = (HelloReceiver) context.getBean("HelloReceiver");
        System.out.println(11);
        System.out.print(receiver.receiveMessage());
        System.out.println("接受信息成功");
	}

}
