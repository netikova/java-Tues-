package Chapter05;

class Pointz{
	private int x, y; //한 점을 구성하는 x, y좌표
	public Pointz() {
		this.x = this.y = 0;
	}

    public Pointz(int x, int y) {
    	this.x = x; this.y = y;
    }
    public void showPoint() { //점의 좌표 출력
    	System.out.println("(" + x + "," + y + ")");
    }
 }
 
 class ColorPointz extends Pointz{
	 private String color; //점의 색
	 public ColorPointz(int x, int y, String color) {
		 super(x,y); //Point의 생성자 Point(x, y)호출
		 this.color = color;
	 }
	 public void showColorPoint() { //컬러 점의 좌표 출력
		 System.out.println(color);
		 showPoint(); //Point클래스의 showPoint() 호출
	 }
 }
 
public class SuperEx {

	public static void main(String[] args) {
		ColorPointz cp = new ColorPointz(5, 6, "blue");
		cp.showColorPoint();

	}

}
