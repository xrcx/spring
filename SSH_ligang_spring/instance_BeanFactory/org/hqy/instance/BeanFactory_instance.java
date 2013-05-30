package org.hqy.instance;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


public class BeanFactory_instance {
	public static void main(String[] args) {
		//独立的应用程序，可以通过以下实例化BeanFactory
		
		//1.搜索当前文件路径下的bean.xml
		FileSystemResource isr = new FileSystemResource("bean.xml");
		XmlBeanFactory factory = new XmlBeanFactory(isr);
		
		//2.搜索类加载路径，以类加载路径下的bean.xml文件创建
		ClassPathResource cr = new ClassPathResource("bean.xml");
		XmlBeanFactory factory2 = new XmlBeanFactory(cr);
		
		//如果应该有多个属性配置文件，应该用ApplicationContext创建BeanFactory实例
		//加载多个xml
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"bean.xml","service.xml"});
		
	}

}
