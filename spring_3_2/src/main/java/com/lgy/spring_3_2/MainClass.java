package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		MyCalculator myCalculator = new MyCalculator();
//		myCalculator.setCalculator(new Calculator());
//
//		myCalculator.setFirstNum(10);
//		myCalculator.setFirstNum(2);

		// classpath로 xml 객체 정보를 읽어서 configLoc 변수에 저장
		String configLoc = "classpath:applicationCTX.xml";
		// 업캐스팅으로 ctx 참조 변수로 받음
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		// getBean메소드로 객체정보를 가져옴
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
	}
}
