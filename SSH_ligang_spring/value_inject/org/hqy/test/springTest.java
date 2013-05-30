package org.hqy.test;

import org.ci.service.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

		Person person = ac.getBean("chinese",Person.class);
		person.useAxe();
	}

}
