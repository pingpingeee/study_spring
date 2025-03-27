package spring_ex_3_6;

public class MyDivAndRemains {
	private DivAndRemains divAndRemains;
	private int num;
	
	public void process() {
		divAndRemains.process(num);
	}
	public DivAndRemains getDivAndRemains() {
		return divAndRemains;
	}
	public void setDivAndRemains(DivAndRemains divAndRemains) {
		this.divAndRemains = divAndRemains;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
