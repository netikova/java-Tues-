package exercise;

import java.util.Scanner;

public class Ch3Ex14 {

	public static void main(String[] args) {
	
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		boolean a = false;

		Scanner scan = new Scanner(System.in);		

/*(1)	for(int i=0; i<5; i++)
		{
			if(course[i].equals(k)) {
				System.out.println(score[i]);	
				a == true;	
			}			
			
		}
		if(a == false)
			System.out.println("없는 과목입니다.");*/
		
	while(true){	
		System.out.println("과목이름 >> ");
		String k = scan.next();	
		if(k.equals("그만")) break;
		int i;
		for(i=0; i<course.length; i++) {
		if(course[i].equals(k)) {
			System.out.println(score[i]); break;
		   }		
		}
		
		if(i == course.length) System.out.println("없는 과목입니다.");	 
	  }
	
	//그만 입력시 빠져나오는 부분
	System.exit(1);
	scan.close();
	}

}
