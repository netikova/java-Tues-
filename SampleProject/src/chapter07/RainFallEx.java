package chapter07;
import java.util.*;

public class RainFallEx {
	//Vector를 받아서 출력하는 메소드
    public static void print(Vector<Integer> v) {  
	Iterator<Integer> it = v.iterator();
	while(it.hasNext())
		System.out.println(it.next() + " ");
	    System.out.println();
    }
    
    //Vector를 받아서 평균을 정수로 반환하는 메소드
    public static int average(Vector<Integer> v) {
    	Iterator<Integer> it = v.iterator();
    	int count = 0;
    	int sum=0;
    	int avg;
    	//v = v + v;
    	while(it.hasNext()) {    	
    			
    		sum = sum + it.next();     		
    		
    		count++;
    	}
    	avg = sum/count;
    	return avg;   	
    	
    }
	public static void main(String[] args) {
		//0을 입력할 때까지 강수량과 평균을 출력하는 시나리오
		//1. 필요한 객체를 선언한다
		Scanner scan = new Scanner(System.in);
		Vector<Integer> vec = new Vector<>();
		//2. 0을 입력할 때까지 강수량목록(print)과 평균(average)을 출력한다.
		while(true) {
			System.out.println("강수량 입력(0 입력시 종료) >> ");
			int num = scan.nextInt();
			if(num == 0 ) break;
			else         vec.add(num);
			print(vec);
			System.out.println("강수 평균 : " + average(vec));
		}
	}

}
