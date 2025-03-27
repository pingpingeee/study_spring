package spring_ex_3_10;

public class Capital {
	public void process(char c) {
		for (char i = 0; i <= c - 65; i++) {
			for (char j = (char) (c - 65); j > i; j--) {
				System.out.print((char)(c - j));
			}
			System.out.println();
		}
	}
}
