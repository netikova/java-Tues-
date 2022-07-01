package chapter08;
import java.io.*;
import java.util.*;

public class FileRWTokenizer {

	public static void main(String[] args) {
		//사용자가 키보드로 입혁한 값이 들어간 in 버퍼의 내용을 읽어들일 reader
		BufferedReader reader = null;
		BufferedWriter writer = null;
		int t_weight = 0;
		int count = 0;
		
		try {
			reader = new BufferedReader(new FileReader(new File("d:\\sample2.csv")));
		    writer = new BufferedWriter(new FileWriter(new File("d:\\sample3.txt")));
			reader.readLine();
			
			String msg;
			while((msg = reader.readLine()) != null) {
				    System.out.println(msg);
				    StringTokenizer st = new StringTokenizer(msg, ",");				
					String name = st.nextToken();
					String gender = st.nextToken();
					int weight = Integer.parseInt(st.nextToken());
					int height = Integer.parseInt(st.nextToken());
					
					writer.write(msg + "\r\n");
					
					if(gender.equals("남"))
					{
						t_weight = t_weight + weight;
						count++;
					}
				
			}
			
				System.out.println("남자의 평균체중은 " + t_weight/count + "kg 입니다.");
				reader.close();
				writer.close();
				
				
			
		}
		catch(IOException e) {e.printStackTrace();}
	}

}
