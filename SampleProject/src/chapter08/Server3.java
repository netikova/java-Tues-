package chapter08;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server3 {

	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter writer = null;
		ServerSocket ss = null;
		Socket s = null;
		Scanner scan = new Scanner(System.in);
				
		
		try {
	        ss= new ServerSocket(9999); //서버소켓 준비
	        s=ss.accept();              //소켓연결
	        reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
	        writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	        while(true) {
	        	String inputMessage = reader.readLine(); //클라이언트가 보낸 메시지 1줄단위 받기
	        	if(inputMessage.equals("bye")) {
	        		System.out.println("클라이언트 bye로 연결을 종료하였음");
	        		break;
	        	}
	        	System.out.println(inputMessage);
	        	String outputMessage = scan.nextLine();
	        	writer.write(outputMessage + "\n");      //키보드에서 입력받은 문자열 전송
	        	writer.flush();                          //writer에 남은 모든 문자열을 전송	        	
	        }
		}		
		catch(IOException e) {e.printStackTrace();}
        finally {
        	try{
        		scan.close();
        		s.close();
            	reader.close();
            	writer.close();            	
        	}
        	catch(IOException e) {e.printStackTrace();}
        	
        }
		}
	}



