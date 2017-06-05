package com.org.cbs.mq;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.Topic;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class TopicProvider {

	private JmsTemplate topicJmsTemplate;

	/**
	 * 向指定的topic发布消息
	 * 
	 * @param topic
	 * @param msg
	 */
	public void publish(final Destination topic, final User user) {

		topicJmsTemplate.send(topic, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				System.out.println("topic name 是" + topic.toString() + "，发布消息内容为s:\t" + user);
				return session.createObjectMessage(user);
				// return session.createTextMessage(msg);
			}
		});
	}

	public void setTopicJmsTemplate(JmsTemplate topicJmsTemplate) {
		this.topicJmsTemplate = topicJmsTemplate;
	}

}
