package org.event.listener;

import org.event.event.EmailEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailListener implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent eve) {
		if (eve instanceof EmailEvent) {
			EmailEvent ee = (EmailEvent) eve;
			System.out.println("��Ҫ�����ʼ��Ľ��յ�ַ  " + ee.getAddress());
			System.out.println("��Ҫ�����ʼ����ʼ�����  " + ee.getText());
		} else {
			System.out.println("����������¼�:   " + eve);
		}

	}

}
