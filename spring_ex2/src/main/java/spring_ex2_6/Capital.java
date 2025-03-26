package spring_ex2_6;

public class Capital {
	private char c;

	public void process() {
		for (char i = 0; i <= c - 65; i++) {
			for (char j = (char) (c - 65); j > i; j--) {
				System.out.print((char)(c - j));
			}
			System.out.println();
		}
	}
	
	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}
	
}
