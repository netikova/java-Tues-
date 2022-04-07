package chapter04;

public class CircleArray {

	public static void main(String[] args) {
		Circle0 c[] = new Circle0[5];
		for(int i = 0; i < c.length; i++)
			c[i] = new Circle0(i);
		
		for(Circle0 cc: c)
			System.out.println(cc.getArea());
	}

}

class Circle0{
	//�ʵ�
	double radius;
	//�����ڸ޼ҵ�
	Circle0(double radius){
		this.radius = radius;
	}
	//�Ϲݸ޼ҵ�
	double getArea() {
		return 3.14 * radius * radius;
	}
	
}