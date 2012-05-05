package com.nzannino.hornetq;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.ui.Model;

public class HomeControllerTest {
	
    private HomeController controller;
    private JmsTemplate jmsTemplate;
    
    @Before
    public void setUp(){
        controller = new HomeController();
        jmsTemplate = mock(JmsTemplate.class);
    }
    
    @Test
    public void testGetHome() throws Exception{        
    	controller.setJmsTemplate(jmsTemplate);
    	Locale locale = Locale.getDefault();
		Model model = mock(Model.class);
		String result = controller.home(locale, model);
		assertTrue(result.equals("home"));
    }

}
