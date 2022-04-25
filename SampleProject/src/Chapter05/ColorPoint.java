package Chapter05;
class Point{
	int x;
	int y;
}
class ColorPoint extends Point{
	String color;
	
}
	

public class ColorPoint {

	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); //(0,0)위치의 BLACK 색점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");

	}
}
//BLACK색의 (0,0)의 점입니다.
//RED색의 (5,5)의 점입니다.