package chapter04;

import java.util.Random;
import java.util.Scanner;

public class number_game {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		          //사용자입력한값
		int com = rand.nextInt(100) + 1; //컴퓨터 랜덤생성
		int tries = 1;
		//do - while 문으로 교체해보세요 !
		
		
		boolean success= false; //성공여부
				
		
		//int com1 = (int)(Math.random()*100 + 1);
		
		//시도횟수를 7회까지만 허용하라!
		
		  while(true) {
			if(tries>7) break;
			System.out.println("1~100사이의 숫자 입력 : ");
			int user = scan.nextInt(); 
			
			 if(user==com) 
			 {
			 success= true; 
					 break; //성공시 성공여부를 변경시킨다
			 }
			 else if(user > com) 
				 System.out.println("Down 시켜봐~");
			 else if(user < com)
				 System.out.println("Up 시켜봐~");
			 tries++;				
			 
		}
		
		
		//성공여부에 따른 처리
		if(success == true)
			System.out.println("맞췄습니다.");
		if(success == false)
			System.out.println("틀렸습니다.");
		
		System.out.println("컴퓨터 숫자: " + com);

	}

}
