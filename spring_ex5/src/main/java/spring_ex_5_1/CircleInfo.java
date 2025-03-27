package spring_ex_5_1;

public class CircleInfo {
	private Circle circle;

	public void getCircleInfo() {
		if(circle != null) {
			
			System.out.println("반지름 : " + circle.getRadius());
			System.out.println("원의 면적 : " + circle.process());
		}
	}

	public CircleInfo(Circle circle) {
		this.circle = circle;
	}


	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
}
