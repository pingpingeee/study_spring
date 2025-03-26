package spring_ex2_6;

public class Asterisk {
	private int num;

	public void process() {
		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
