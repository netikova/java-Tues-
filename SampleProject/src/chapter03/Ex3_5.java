package chapter03;

import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			System.out.println("�Է�:");
			int n = scan.nextInt();
			if(n>0)
				sum += n;
			else
				continue;
		}
		System.out.println("�ջ����� " + sum);
		scan.close();

	}

}
