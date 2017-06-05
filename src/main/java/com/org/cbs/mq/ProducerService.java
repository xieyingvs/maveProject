package com.org.cbs.mq;

import javax.jms.Destination;

public interface ProducerService {

	public void sendMessage(Destination destination, final String msg);

	public void sendMessage(final String msg);
}
