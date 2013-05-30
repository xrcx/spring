package org.i18.test;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
		String[] a = {"∂¡’ﬂ"};
		Object[] b ={new Date()}; 
		
		String hello=ac.getMessage("hello", a,Locale.getDefault());
		String now =ac.getMessage("now", b, Locale.getDefault());
		
		System.out.println(hello);
		System.out.println(now);
	}

}
