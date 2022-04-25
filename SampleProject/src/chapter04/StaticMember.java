package chapter04;

import java.util.Scanner;

public class StaticMember {

	public static void main(String[] args) {
		//로직 작성
		Scanner scan = new Scanner(System.in);
		//1. 원화를 입력 받는다.
		System.out.println("환율(1달러) >>> ");
		double rate = scan.nextDouble();
		CurrencyConverter.setRate(rate);
        
        System.out.println("백만원은 달러로 " + CurrencyConverter.toDollor(1000000));
        System.out.println("백달러는 원화로 " + CurrencyConverter.toKWR(100.0));
        Math.random();
        double won = scan.nextInt();
        CurrencyConverter.setRate(1250.0);
        
	}

}

class CurrencyConverter{
	//속성                                   
	private static double rate; //클래스 변수
	
	// private static final double rate; 변수에 받는 final은 상수, 메소드에 주는 final은 부모에게서 상속 받는 오버라이딩 금지 
	//메소드
	public static void setRate(double r){rate = r;}
	public static double getRate(){return rate;}
	public static double toDollor(double won)
	{return won / rate;}
	public static double toKWR(double dollar)
	{return dollar * rate;}
	
}

