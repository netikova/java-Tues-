package chapter03;

import java.util.Scanner;

public class Ex3_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("����: ");
			int dividend = scan.nextInt();
			System.out.println("�и�: ");
			int divisor = scan.nextInt();
			try 
			{
				System.out.println("���������: " + dividend/divisor);
				break;
			}
			catch(ArithmeticException e)
			{
				System.out.println("�и� 0�̶� ���� �� �����!");
			   //e.printStackTrace();//������ �������� �����޼����� �ܼ�â�� ���	
			}
		}
			
		
	}

}
