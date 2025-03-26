package com.lgy.spring;

public class Circle {
	private int radius;

	public double getArea() {
		return 3.14 * (radius * radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
