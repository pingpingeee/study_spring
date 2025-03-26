package spring_ex2_2;

public class Won2dollar {
	private int money;
	
	public void process() {
		System.out.println("$" + money / 1200);
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
