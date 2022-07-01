package exercise;

import java.util.Scanner;

//추상클래스 정의
abstract class Calc{
	protected int a;
	protected int b;  //속성
	void setValue(int a, int b){this.a = a; this.b = b;	}
	abstract int calculate(); //추상클래스는 정의하지 않아도 되는 메소드를 쓸때 사용한다.
	
	
}
class Add extends Calc{	
	@Override
	int calculate() {return super.a + super.b;}
}
class Sub extends Calc{	
	@Override
	int calculate() {return super.a - super.b;}
}
class Mul extends Calc{	
	@Override
	int calculate() {return super.a * super.b;} //그냥 a,b로 써도 되지만 부모를 상속받앗다는 확실한 표시를 위해 super를 써준다.
}
class Div extends Calc{	
	@Override
	int calculate() {
		int result=0;
		try {
			result =  super.a / super.b;
		}
		catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수는 없습니다.");
		}
		return result;
	}
}
public class Ch5Ex11 {
	public static void main(String[] args) {		
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        char operator = scan.next().charAt(0);
        
        switch(operator) {
           case '+': 
        	   Add add = new Add(); 
        	   add.setValue(num1,num2);
        	   System.out.println(add.calculate());
        	   break;
           case '-':
               Sub sub = new Sub(); 
               sub.setValue(num1,num2);
	    	   System.out.println(sub.calculate());
    	       break;
           case '*':
               Mul mul = new Mul(); 
               mul.setValue(num1,num2);
	    	   System.out.println(mul.calculate());
	    	   break;
           case '/':
               Div div = new Div(); 
               div.setValue(num1,num2);
	    	   System.out.println(div.calculate());
	    	   break;
        }
        
	}
}
