package chapter08;

import java.io.*;
import java.net.*;

public class Server1 {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(5000);//1.서버소켓 준비
			System.out.println("#서버 실행...");
			while(true) {
				Socket s = ss.accept();              //2. 요청된 소켓연결
				BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream())); //input으로 들어오는 바이틀르 2바이트로 묶오 Buffer에 담는다.
				System.out.println("클라이언트 연결 완료...");
				System.out.println("클라이언트 메세지 : " +reader.readLine());
				reader.close();
				
			}
		}
		catch(IOException e) {e.printStackTrace();}

	}

}
