package exercise;

import java.util.Scanner;

/*class Add{
	private int a,b;  //속성
	void setValue(int a, int b){this.a = a; this.b = b;	}
	int calculate() {return this.a + this.b;}
}
class Sub{
	private int a,b;  //속성
	void setValue(int a, int b){this.a = a; this.b = b;	}
	int calculate() {return this.a - this.b;}
}
class Mul{
	private int a,b;  //속성
	void setValue(int a, int b){this.a = a; this.b = b;	}
	int calculate() {return this.a * this.b;}
}
class Div{
	private int a,b;  //속성
	void setValue(int a, int b){this.a = a; this.b = b;	}
	int calculate() {
		int result=0;
		try {
			result =  a / b;
		}
		catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수는 없습니다.");
		}
		return result;
	}
}*/
public class Ch4Ex11 {
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
