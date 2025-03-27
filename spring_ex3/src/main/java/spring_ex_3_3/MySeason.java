package spring_ex_3_3;

public class MySeason {
	private Season season;
	private int num;

	public void rsltSeason() {
		season.rsltSeason(num);
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
