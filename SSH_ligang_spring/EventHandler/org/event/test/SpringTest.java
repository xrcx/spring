package org.event.test;

import org.event.event.EmailEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		EmailEvent el = new EmailEvent("hello","163.com","this is a test");
		ac.publishEvent(el);

	}

}
