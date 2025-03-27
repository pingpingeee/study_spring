package spring_ex_3_4;

public class MyWon2Dollar {
	private Won2Dollar won2Dollar;
	private int num;
	
	public void exchange() {
		won2Dollar.exchange(num);
	}
	public Won2Dollar getWon2Dollar() {
		return won2Dollar;
	}
	public void setWon2Dollar(Won2Dollar won2Dollar) {
		this.won2Dollar = won2Dollar;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
