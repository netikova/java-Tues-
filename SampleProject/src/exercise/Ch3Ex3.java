package exercise;

import java.util.Scanner;

public class Ch3Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오 >>>");
		int j = scan.nextInt();		
		
		for (int i=0; i < j; i++)
		{
		   for(int k= j ; k >i; k--)
		   {
			System.out.print("*");			
		   }
		   System.out.println();
		}
		
//		for(int i=num; i>0; i--) {
//			for(int k=0; k<i; k++)
//				System.out.print("*");
//			System.out.println();
//		}

	}

}
