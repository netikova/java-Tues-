package chapter08;
import java.io.*;
import java.util.*;

public class Ex08_12 {

	public static void main(String[] args) {
		//사용자가 키보드로 입혁한 값이 들어간 in 버퍼의 내용을 읽어들일 reader
		BufferedReader reader = null;
		//사용자가 입력한 값을 파일에 출력할 writer
		BufferedWriter writer = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("=========메모장 프로그램 v1=========");
		System.out.println("저장할 파일명 >>> ");
		String filename = scan.next();
		System.out.println("저장은 마지막 라인에 bye 입력");
		
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			writer = new BufferedWriter(new FileWriter("d:\\" + filename));
			String msg;
			while(!(msg = reader.readLine()).equals("bye")) 
				writer.write(msg + "\r\n");
				
				reader.close();
				writer.close();
			
		}
		catch(IOException e) {e.printStackTrace();}
	}

}
