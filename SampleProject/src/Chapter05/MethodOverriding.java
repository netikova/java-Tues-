package Chapter05;

class Shape{
	public void draw() {System.out.println("Shape");}
}
class Line extends Shape{
	@Override
	public void draw() {System.out.println("Line");}
}
class Rect extends Shape{
	@Override
	public void draw() {System.out.println("Rect");}
}
class Circle extends Shape{
	@Override
	public void draw() {System.out.println("Circle");}
}

public class MethodOverriding {
	static void paint(Shape p) {p.draw();}

	public static void main(String[] args) {
		paint(new Line());
		paint(new Rect());
		paint(new Circle());

	}

}
