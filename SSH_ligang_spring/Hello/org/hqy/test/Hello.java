package org.hqy.test;

import org.hqy.service.PersionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		PersionService ps = ac.getBean("persionService",PersionService.class);
		ps.info();
	}
}
