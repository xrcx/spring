package org.bfa.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Chinese implements ApplicationContextAware {
	private ApplicationContext ac;
	
	@Override
	public void setApplicationContext(ApplicationContext ac)
			throws BeansException {
		this.ac=ac;
	}

	public ApplicationContext getAc() {
		return ac;
	}

}
