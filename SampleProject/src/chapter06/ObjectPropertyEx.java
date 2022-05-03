package chapter06;

class Point{
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;		
	}
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(this.x == p.x && this.y == p.y)
			 return true;
		else return false;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj1) {
		System.out.println(obj1.getClass().getName());
		System.out.println("obj1 : " + obj1.hashCode());	
		System.out.println(obj1.toString());
		System.out.println(obj1);
		
	}

	public static void main(String[] args) {
		Point p1 = new Point(3, 4);
		Point p2 = new Point(3, 4);
		System.out.println(p1);
		System.out.println(p2);
		if(p1 == p2) System.out.println("객체아이디가 같습니다.");
		else System.out.println("객체아이디가 다릅니다.");
		if(p1.equals(p2)) System.out.println("같습니다."); //내용물이 같습니다. equals값을 재정의 해서 내용물을 비교하게 했다.
		else System.out.println("다릅니다.");
		//print(p); 
		
	}

}
