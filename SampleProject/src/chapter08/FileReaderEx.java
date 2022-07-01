package chapter08;
import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("d:\\test.txt");
			in = new InputStreamReader(fin, "UTF8"); //인코딩 방식
			int c;
			while((c = in.read()) != -1) //문서의 끝이 아닐때까지 계속 읽어들인다. -1 은 문서의 끝
				System.out.print((char)c);
			fin.close();
			
		}
		catch(IOException e){
			e.printStackTrace(); //오류 출력
			System.out.println("입출력오류!");
		}

	}

}
