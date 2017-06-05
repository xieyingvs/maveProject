package com.org.cbs.mq;

import javax.jms.Destination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/activemqtopic.xml" })
public class SpringJmsTestTopic {

	/**
	 * 主题 guo_topic
	 */
	@Autowired
	@Qualifier("topicDestination")
	private Destination topic;

	/**
	 * 主题消息发布者
	 */
	@Autowired
	private TopicProvider topicProvider;

	/**
	 * 测试主题监听
	 * 
	 * 1.生产者向主题发布消息
	 * 
	 * 2.ConsumerMessageListener监听主题，并消费消息
	 */
	@Test
	public void testTopic() throws Exception {
		User user = new User();
		user.setId(12);
		user.setName("hui");
		user.setAge(22);
		topicProvider.publish(topic, user);
	}

}
