package com.org.cbs.java;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.hpzc.common.dubbo.DubboService;

//@ContextConfiguration(locations = { "classpath:dubbo.xml" })
public class TestDubbo {

	// @Autowired
	// private DemoService demoService;

	@Test
	public void testService() throws MalformedURLException {
		System.out.println(12);
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "dubbo.xml" });
		context.start();
		DubboService demoService = (DubboService) context.getBean("DemoService");
		String hello = demoService.SayHello("郑国辉");
		System.out.println(hello);
//		try {
//			System.in.read();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}

}
