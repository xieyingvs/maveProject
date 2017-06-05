package com.org.cbs.mq;

import javax.jms.Destination;

public interface ConsumerService {

	public void receive(Destination destination);

}
