package chapter08;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {		
		BufferedReader reader = null;
		BufferedWriter writer = null;	
		Socket s = null;
		Scanner scan = new Scanner(System.in);
		try {
			s= new Socket("localhost",9999);   //소켓연결
			reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
	        writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	        
	        while(true) {
	        	System.out.println("서버로 보내기===================== ");
	        	String outMessage = scan.nextLine();
	            if(outMessage.equals("bye")) {
	               writer.write(outMessage + "\n");
	               writer.flush();
	        	   break;
	           }
	           writer.write(outMessage + "\n");
	           writer.flush();
	           String inMessage = reader.readLine();    //한줄단위로 읽기
	           
	           System.out.println("서버로부터 받기 ======================= ");
	           System.out.println(inMessage);
	        }
		}
		catch(IOException e) {e.printStackTrace();}
		finally {
			try{
				scan.close();
				if(s!=null) s.close();
				reader.close();
				writer.close();

			}
			catch(IOException e) {e.printStackTrace();}
		}

	}

}
