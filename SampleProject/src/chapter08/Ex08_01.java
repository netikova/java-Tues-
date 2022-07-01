package chapter08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        FileWriter fout;
        int c;
        
        try {
        	 fout = new FileWriter("d:\\phone.txt");
        	 System.out.println("전화번호 입력 프로그램입니다.");
        	 while(true) {
        		 System.out.println("이름 전화번호 >>");
        		 String line = scan.nextLine();
        		 //String number = scan.nextLine();
        		 if(line.equals("그만"))
        			 break;
        		 fout.write(line, 0, line.length()); //line을 0부터 length까지 쓴다.
        		 fout.write("\r\n", 0 , 2);

        	   }
        	   System.out.println("d:\\\\phone.txt에 저장하였습니다.");
        	   fout.close();
        	   scan.close();
        	 
        }
        catch(IOException e) {System.out.println("입출력오류!!!");
	}

	}

}
