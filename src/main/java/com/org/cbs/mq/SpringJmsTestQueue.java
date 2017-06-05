package com.org.cbs.mq;

import javax.jms.Destination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/activemqqueue.xml" })
public class SpringJmsTestQueue {

	 @Autowired
	 private Destination queueDestination;
//
//	@Autowired
//	private Destination queueDestination2;

//	@Autowired
//	@Qualifier("producerService")
//	private ProducerServiceImpl producer;

	@Autowired
	@Qualifier("consumerService")
	private ConsumerServiceImpl consumer;

//	@Test
//	public void testSend() {
//		producer.sendMessage(queueDestination2, "Hello China~~~~~~~~~~~~~~~");
//	}

//	 @Test
//	 public void testProducer() {
//	 String msg = "Hello world!";
//	 producer.sendMessage(msg);
//	 System.out.println(1);
//	 }

	 @Test
	 public void testConsumer() {
//	 consumer.receive(queueDestination);
	 System.out.println(1);
	 }
}
