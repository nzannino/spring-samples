package com.nzannino.hornetq.jms;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class HornetListener implements MessageListener{

	@Override
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
		      try {
		        System.out.println("Received message: "+((TextMessage) message).getText());
		        Thread.sleep(60000);
		      } catch (Exception ex) {
		        throw new RuntimeException(ex);
		      }
		    } else {
		      throw new IllegalArgumentException("Message must be of type TextMessage");
		    }
	}

}
