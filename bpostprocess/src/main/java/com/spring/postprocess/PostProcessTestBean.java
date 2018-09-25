package com.spring.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessTestBean implements BeanPostProcessor {

	public PostProcessTestBean() {
		System.out.println("PostProcessTestBean::new");
	}
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#
	 * postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("inPostprocessBeforeInitialization");
		System.out.println("Bean name is  "+beanName);
		return bean;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#
	 * postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In postProcess after initialization");
		System.out.println("Bean name is  "+beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
