package chapter04;

import java.util.Scanner;

public class Grade {
	 int math;
	 int science;
	 int eng;
     
     //생성자
     Grade(){    	 
     }
     Grade(int math, int science, int eng) {
    	 this.math = math;
    	 this.science = science;
         this.eng = eng;
        }
     //average 메소드
     double average() {
//    	 Grade(math, science, eng);
//    	 double avg = (math+science+eng)/3;
//		 return avg;
    	 return (this.math+this.science+this.eng)/3.0;
	 }
     
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 점수를 순서대로 입력 >>");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int eng =  scan.nextInt();
		Grade me = new Grade(math, science, eng);
		System.out.println("평균은 " + me.average());
	}

}
