package org.hqy.instance;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


public class BeanFactory_instance {
	public static void main(String[] args) {
		//������Ӧ�ó��򣬿���ͨ������ʵ����BeanFactory
		
		//1.������ǰ�ļ�·���µ�bean.xml
		FileSystemResource isr = new FileSystemResource("bean.xml");
		XmlBeanFactory factory = new XmlBeanFactory(isr);
		
		//2.���������·�����������·���µ�bean.xml�ļ�����
		ClassPathResource cr = new ClassPathResource("bean.xml");
		XmlBeanFactory factory2 = new XmlBeanFactory(cr);
		
		//���Ӧ���ж�����������ļ���Ӧ����ApplicationContext����BeanFactoryʵ��
		//���ض��xml
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"bean.xml","service.xml"});
		
	}

}
