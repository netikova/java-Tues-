package chapter08;
import java.io.*;
import java.util.*;



class Person{
	String name;
	String gender;
	int weight;
	int height;
	static int t_weight = 0;
	static int count = 0;
	Person(){}
	Person(String name, String gender, int weight, int height) {
/*	this.name = name;
	this.gender = gender;
	this.weight = weight;
	this.height = height;*/
	
		if(gender.equals("남"))
		{
			t_weight = t_weight + weight;
			count++;
		}		
	}
	
	@Override
	public String toString() {
		return "남자의 평균체중은 " + t_weight/count + "kg 입니다.";
	}
}

public class FileRWTokenizer2 {

	public static void main(String[] args) {
		//사용자가 키보드로 입혁한 값이 들어간 in 버퍼의 내용을 읽어들일 reader
		BufferedReader reader = null;
		BufferedWriter writer = null;
		Person person = null;	
		//Person person1 = new Person();
		//ArrayList<Person> al = new ArrayList<>();
		
		try {
			reader = new BufferedReader(new FileReader(new File("d:\\sample2.csv")));
		    writer = new BufferedWriter(new FileWriter(new File("d:\\sample3.txt")));
			reader.readLine();			
			String msg;
			
			
			//al = new ArrayList<>();
			
			
			while((msg = reader.readLine()) != null) {
				    System.out.println(msg);
				    StringTokenizer st = new StringTokenizer(msg, ",");						  
				    String name = st.nextToken();
				    String gender = st.nextToken();
				    int weight = Integer.parseInt(st.nextToken());
				    int height = Integer.parseInt(st.nextToken());
					
				    person = new Person(name, gender, weight, height);					
                   
					writer.write(msg + "\r\n");						
					
	
			}      
				
				reader.close();
				writer.close();
				
				
			
		}
		catch(IOException e) {e.printStackTrace();}
		System.out.println(person.toString());
	}

}
