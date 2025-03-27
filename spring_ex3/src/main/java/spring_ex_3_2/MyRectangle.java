package spring_ex_3_2;

public class MyRectangle {
	private Rectangle rectangle;
	private int w;
	private int h;
	
	public void area() {
		rectangle.area(w, h);
	}
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
}
