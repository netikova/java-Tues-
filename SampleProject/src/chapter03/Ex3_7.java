package chapter03;

import java.util.Scanner;

public class Ex3_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		for(int i=0; i < 5; i++) {
			intArray[i] = scan.nextInt();
		    if(intArray[i]>max)
		    	max = intArray[i];
		}
		System.out.println("���� ū ���� " +   max   + "�Դϴ�.");
		scan.close();
	}
	
}
