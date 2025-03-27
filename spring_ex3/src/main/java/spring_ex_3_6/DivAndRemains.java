package spring_ex_3_6;

public class DivAndRemains {
	public void process(int num) {
		int num1 = num / 10;
		int num2 = num % 10;
		
		if (num1 == num2) {
			System.out.println("입력된 수 : " + num + "는 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("입력된 수 : " + num + "는 10의 자리와 1의 자리가 같습니다.");
		}
	}
}
