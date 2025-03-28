package com.lgy.spring_7_2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX.xml");

		// afterPropertiesSet();
		// destroy();
		ctx.refresh();
		ctx.close();
		
//		<context:annotation-config></context:annotation-config> 추가하면
//		@PostConstruct, @PreDestroy 2개가 동작됨
	}
}
