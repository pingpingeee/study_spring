package spring_ex_3_10;

public class MyCapital {
	private Capital capital;
	private char c;


	public void process() {
		capital.process(c);
	}


	public Capital getCapital() {
		return capital;
	}


	public void setCapital(Capital capital) {
		this.capital = capital;
	}


	public char getC() {
		return c;
	}


	public void setC(char c) {
		this.c = c;
	}


}
