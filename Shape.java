package dat.dev;

public abstract class Shape {
	String ten;
	
	public Shape(String ten) {
		super();
		this.ten = ten;
	}
	abstract double chuVi();
	abstract double dienTich();
	
}