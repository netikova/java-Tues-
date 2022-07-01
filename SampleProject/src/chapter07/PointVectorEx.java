package chapter07;

import java.util.Iterator;
import java.util.Vector;

class Point{
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

public class PointVectorEx {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(1,2));
		v.add(new Point(2,3));
		v.add(new Point(30,-8));
		Iterator<Point> it = v.iterator();
		//순회시키는 인터페이스, 포인트별로 하나씩 돌아준다.

		
		while(it.hasNext())
			
			System.out.println(it.next()); 
		
//		for(int i=0; i<v.size(); i++)
//			System.out.println(v.get(i));
//		for(Point p : v)
//			System.out.println(p);
		
		

	}

}
