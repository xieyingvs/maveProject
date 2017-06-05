package com.org.cbs.activemq;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.JmsUtils;

public class HelloReceiver {
	
	private JmsTemplate jmsTemplate;
    //getter and setter
    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }
    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
    public HelloReceiver() {
    }
    public String receiveMessage() {
        String my = "";
        MapMessage message = (MapMessage) jmsTemplate.receive();
        try {
            my = message.getString("lastName");
        } catch (JMSException e) {
            throw JmsUtils.convertJmsAccessException(e);
        }
        return my;
    }
	
//	public HelloReceiver() {
//
//	}
//
//	private JmsTemplate jmsTemplate;
//
//	public JmsTemplate getJmsTemplate() {
//		return jmsTemplate;
//	}
//
//	public void setJmsTemplate(JmsTemplate jmsTemplate) {
//		this.jmsTemplate = jmsTemplate;
//	}
//
//	/**
//	 * 监听到消息目的有消息后自动调用onMessage(Message message)方法
//	 */
//	public void recive() {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("activemq.xml");
//		Destination destination = (Destination) applicationContext.getBean("defaultDestination");
//		while (true) {
//			try {
//				TextMessage txtmsg = (TextMessage) jmsTemplate.receive(destination);
//				if (null != txtmsg) {
//					System.out.println("[DB Proxy] " + txtmsg);
//					System.out.println("[DB Proxy] 收到消息内容为: " + txtmsg.getText());
//				} else
//					break;
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//
//		}
//	}

}
