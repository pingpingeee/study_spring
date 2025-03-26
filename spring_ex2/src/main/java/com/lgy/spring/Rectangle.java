package com.lgy.spring;

public class Rectangle {
	private int h;
	private int w;
	
	public int getArea() {
		return h * w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
}
