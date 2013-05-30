package org.event.listener;

import org.event.event.EmailEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailListener implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent eve) {
		if (eve instanceof EmailEvent) {
			EmailEvent ee = (EmailEvent) eve;
			System.out.println("需要发送邮件的接收地址  " + ee.getAddress());
			System.out.println("需要发送邮件的邮件正文  " + ee.getText());
		} else {
			System.out.println("容器本身的事件:   " + eve);
		}

	}

}
