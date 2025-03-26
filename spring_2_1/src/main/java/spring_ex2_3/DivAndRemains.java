package spring_ex2_3;

public class DivAndRemains {
	private int num;

	public void process() {
		int num1 = num / 10;
		int num2 = num % 10;
		if(num1 == num2) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("10의 자리와 1의 자리가 틀립니다.");
		}
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
