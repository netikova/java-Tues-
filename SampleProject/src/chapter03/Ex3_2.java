package chapter03;

import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count=0;
		int sum=0;
		int avr;
		
		while(n != -1) 
		{
			
		  count++; 
		  sum += n;
		  n = scan.nextInt();	
		  
		  
		}
		if(count == 0) {System.out.println("��հ��Ұ�");}
		else {
	    avr = sum/count;
		System.out.println("������ ������"+ count + "�̸� �����"+ avr + "�Դϴ�." );
		}
		
	}

}
