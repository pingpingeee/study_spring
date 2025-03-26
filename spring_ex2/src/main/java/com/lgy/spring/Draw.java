package com.lgy.spring;

public class Draw {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();

		circle.setRadius(10);
		rectangle.setH(30);
		rectangle.setW(20);

		System.out.println("원의 면적 : " + circle.getArea());
		System.out.println("사각형의 면적 : " + rectangle.getArea());
	}
}
