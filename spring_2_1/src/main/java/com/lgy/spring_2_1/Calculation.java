// 도메인 역순(패키지 lgy: legacy + spring_2_1 프로젝트 이름 포함)
package com.lgy.spring_2_1;

public class Calculation {
	private int firstNum;
	private int secondNnm;

	public void add() {
		System.err.println("add");
		System.err.println(firstNum + "+" + secondNnm + "=" + (firstNum + secondNnm));
	}

	public void sub() {
		System.err.println("sub");
		System.err.println(firstNum + "-" + secondNnm + "=" + (firstNum - secondNnm));
	}
	public void mul() {
		System.err.println("mul");
		System.err.println(firstNum + "*" + secondNnm + "=" + (firstNum * secondNnm));
	}
	public void div() {
		System.err.println("div");
		System.err.println(firstNum + "/" + secondNnm + "=" + (firstNum / secondNnm));
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNnm() {
		return secondNnm;
	}

	public void setSecondNnm(int secondNnm) {
		this.secondNnm = secondNnm;
	}

}
