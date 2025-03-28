package com.lgy.spring_7_3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("applicationCTX.xml");

		Student student1 = ctx.getBean("student", Student.class);
		System.out.println("이름 : " + student1.getName());
		System.out.println("나이 : " + student1.getAge());
		System.out.println("==========================");

		Student student2 = ctx.getBean("student", Student.class);
		// 똑같이 가리키지만 세터를 통해 값 변경
		student2.setName("홍길자");
		student2.setAge(100);
		System.out.println("이름 : " + student2.getName());
		System.out.println("나이 : " + student2.getAge());
		System.out.println("==========================");
		
		if(student1.equals(student2)) {
			System.out.println("student1 == student2");
		}else {
			System.out.println("student1 != student2");
		}
		ctx.close();

	}
}
