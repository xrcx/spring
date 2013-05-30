package org.bfa.test;




import org.bfa.service.Chinese;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

		Chinese chi = ac.getBean("chinese", Chinese.class);
		System.out.println(chi.getAc());
		System.out.println(ac==chi.getAc());
	}

}
