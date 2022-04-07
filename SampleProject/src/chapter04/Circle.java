package chapter04;

public class Circle {
    //�Ӽ�
	public double radius;    
    public String name;     
	
    public Circle(){}
    public Circle(double radius, String name){    	
    	this.radius = radius;
    	this.name = name;
    	System.out.println(this.name + ": " + this.getArea());
    	
    }
    
    //�Ϲ� �޼ҵ� 
    public double getArea(){
    	return 3.14 * radius * radius;
    }
	//main �޼ҵ�
	public static void main(String[] args) {
		Circle pizza =  new Circle(10.0, "�޺���̼�����"); //1. ��ü ����,��ü ������ ���������ϵ��� ��		
		Circle coin = new Circle();//1.��ü����, ��ü������ ���۷����ϵ��� ��
	    coin.radius = 5.0;
	    coin.name = "500�� ����";
	    System.out.println(coin.name + ": " + coin.getArea());
		
		
	}

}
