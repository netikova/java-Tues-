package Chapter05;



//Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라. 다음 main()메소드를 포함하고 실행 결과와 같이 출력되게 하라.
class Point{
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}	
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	
}
 
class ColorPoint extends Point{
	private String Color;
	
	public ColorPoint(int x, int y, String Color) {
		super(x,y);
		this.Color = Color;
	}
	
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	public void setXY(int x, int y) {
		move(x,y);
	}
	@Override
	public String toString() {
		return Color+"색의 ("+getX()+","+getY()+")의 점";
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}

}
