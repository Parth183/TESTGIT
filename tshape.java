
 import java.lang.Math;

abstract class shape{ 
	double area;
	public shape(){

	}
	abstract void getArea();
}
class Triangle extends shape{
	double base, height;

	Triangle(double base, double height){
		super();
		this.base = base;
		this.height = height;
	}
	public void getArea(){
		
		area = 0.5*base*height;
		System.out.println("Area of Triangle : " +area);
	}
	
}
class Rectangle extends shape{
	double width, height;

	Rectangle(double width, double height){
		super();
		this.width = width;
		this.height = height;
	}
	public void getArea(){
		area = width*height;
		System.out.println("Area of Rectangle : " + area);
	}
	
}
public class tshape {
	public static void main(String[] args) {
		Triangle t = new Triangle(12, 10);
		Rectangle r = new Rectangle(25, 40);
		t.getArea();
		r.getArea();
		
	}
	
}




