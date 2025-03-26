package spring_ex2_4;

public class Median {
	private int num1;
	private int num2;
	private int num3;
	
	public void process() {
		int middle = 0;
		if (((num1 > num2) && (num1 < num3)) || ((num1 > num3) && (num1 < num2))) middle = num1;

		if (((num2 > num3) && (num2 < num1)) || ((num2 > num1) && (num2 < num3)))  middle = num2;

		if (((num3 > num1) && (num3 < num2)) || ((num3 > num2) && (num3 < num1)))  middle = num3;

		System.out.println("입력된 정수가 " + num1 +"와 "+num2+"와 " + num3 +"의 중간값은 " + middle);

	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	
}
