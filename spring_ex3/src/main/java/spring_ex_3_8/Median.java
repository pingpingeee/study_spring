package spring_ex_3_8;

public class Median {
	public void process(int num1, int num2, int num3) {
		int middle = 0;
		if (((num1 > num2) && (num1 < num3)) || ((num1 > num3) && (num1 < num2)))
			middle = num1;

		if (((num2 > num3) && (num2 < num1)) || ((num2 > num1) && (num2 < num3)))
			middle = num2;

		if (((num3 > num1) && (num3 < num2)) || ((num3 > num2) && (num3 < num1)))
			middle = num3;
		
		System.out.println("입력된 정수가 " + num1 +"와 "+num2+"와 " + num3 +"의 중간값은 " + middle);
	}
}
