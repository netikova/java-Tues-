package chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
public class URLEx {

	public static void main(String[] args) {
		try {
		     URL url = new URL("https://www.kopo.ac.kr/daejeon/index.do");
		     System.out.println("프로토콜 : " + url.getProtocol());
		     System.out.println("호스트 : " + url.getHost());
		     System.out.println("포트 :" + url.getPort());
		     
		     System.out.println(">> HTML 전송 시작");
		     InputStream is = url.openStream();
		     BufferedReader reader = new BufferedReader(new InputStreamReader(is));//1바이트로 가지고오는 것을 2바이트로 묶어서 버퍼에 넣는다.
		     String msg;
		     while((msg=reader.readLine()) != null) {
		    	 System.out.println(msg);
		     }
		     is.close();
		     reader.close();
		     
		}
		catch(IOException e) {e.printStackTrace();}

	}

}
