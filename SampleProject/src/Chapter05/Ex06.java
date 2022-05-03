package Chapter05;

class ColorPoint2 extends Point{
	String color;
	
	public ColorPoint2() {
		super(0,0);
		color = "Black";
	}
	
	public  ColorPoint2(int x, int y) {
		super(x,y);
		color="Black";
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return color + "색의(" + getX() + "," + getY() +")점";
	}	
	
}
	

public class Ex06 {

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2(); //(0,0)위치의 BLACK 색점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint2 cp = new ColorPoint2(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");

	}
}
//BLACK색의 (0,0)의 점입니다.
//RED색의 (5,5)의 점입니다.