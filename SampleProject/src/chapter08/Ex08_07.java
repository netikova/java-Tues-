package chapter08;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex08_07 {

	public static void main(String[] args) {
		FileReader fin = null;
		BufferedOutputStream out = null;
		try {
			fin = new FileReader("d://test2.txt");
			out = new BufferedOutputStream(System.out, 5); //System.out에 5바이트씩 모아서 출력
			int c;
			while((c = fin.read()) != -1) 
				out.write(c);
			
//			new Scanner(System.in).nextLine();
//			out.flush();
//			Scanner scan = new Scanner(System.in);
//			scan.nextLine();
			fin.close();
			out.close(); //이 close에서 닫으면서 남아있는 데이터를 내보낸다.
			
		}
		catch(IOException e) {e.printStackTrace();}

	}

}
