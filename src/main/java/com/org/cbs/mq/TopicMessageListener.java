package com.org.cbs.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

public class TopicMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		// TextMessage tm = (TextMessage) message;
		ObjectMessage user = (ObjectMessage) message;
		try {
			System.out.println("消息接收TopicMessageListener \t" + user.getObject() + "user对象");
		} catch (JMSException e) {
			e.printStackTrace();
		}

	}

}
