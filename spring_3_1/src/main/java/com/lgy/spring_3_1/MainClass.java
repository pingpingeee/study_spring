package com.lgy.spring_3_1;

public class MainClass {
	public static void main(String[] args) {
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.setCalculator(new Calculator());

		myCalculator.setFirstNum(10);
		myCalculator.setFirstNum(2);

		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
	}
}
