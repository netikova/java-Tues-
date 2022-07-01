package chapter03;
//1~100까지의 누적합을 반복문들로 짜보기

public class Ex3_0 {

	public static void main(String[] args) {
		int num, sum=0;

		
		//1. while문
//		num = 1;
//		while(num <= 100) {
//			sum+=num;
//			num++;
//		}
		//2. do-while문
//		do {
//			sum+=num;
//			num++;
//		}while(num <= 100);
		//3. for문
		for(num = 1; num <= 100; num++)
		{
			sum+=num;
		}
		//4. 공통 출력문
		System.out.println("누적합 = " + sum);

	}

}
