package com.org.cbs.activemq;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component("defaultDestination")
public class HelloSender  {

	private JmsTemplate jmsTemplate;

	// getter and setter
	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void sendInfo() {
		jmsTemplate.send("subject",new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				MapMessage message = session.createMapMessage();
				message.setString("lastName", "ppp");
				return message;
			}

		});
	}

	/**
	 * @param args
	 *            jmsTemplate和destination都是在spring配置文件中进行配制的
	 *            Sender只使用了配置文件中的jmsFactory，jmsTemplate，还有destination这三个属性
	 */
	// public static void main(String[] args) {
	// System.out.println(1);
	// ApplicationContext applicationContext = new
	// ClassPathXmlApplicationContext("activemq.xml");
	// JmsTemplate template = (JmsTemplate)
	// applicationContext.getBean("jmsTemplate");
	// Destination destination = (Destination)
	// applicationContext.getBean("defaultDestination");
	// System.out.println(2);
	// template.send(destination, new MessageCreator() {
	// public Message createMessage(Session session) throws JMSException {
	// session.createObjectMessage("MQ 发送消息cheng");
	// return session.createTextMessage("发送消息：Hello ActiveMQ Text Message2！");
	// }
	// });
	// System.out.println("成功发送了一条JMS消息");
	// }
}