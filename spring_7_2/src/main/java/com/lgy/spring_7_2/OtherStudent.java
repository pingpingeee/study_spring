package com.lgy.spring_7_2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class OtherStudent {
	private String name;
	private int age;

	@PostConstruct
	public void initMethod() {
		System.out.println("initMehtod()");
	}

	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroyMethod()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public OtherStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
