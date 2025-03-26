package spring_ex2_3;

public class ThreeDivAndRemains {
	public static void main(String[] args) {
		Three three = new Three();
		DivAndRemains divAndRemains = new DivAndRemains();

		three.setNum(129);
		divAndRemains.setNum(77);

		three.process();
		divAndRemains.process();
	}
}
