package chapter06;

import java.util.StringTokenizer;
//남자의 평균 체중을 구하라.
public class StringTokenizerEx {

	public static void main(String[] args) {
		String query = "김명수, 남, 77, 167/홍길동, 남, 65, 170/김새영, 여, 57, 164/이장군, 남, 77, 167/홍미영, 여, 64, 165";
		StringTokenizer st = new StringTokenizer(query,"/");
		StringTokenizer st1;
		String name;
		String gender;
		int weight;
		int height;
		int t_weight =0;
		int count = 0;
		
		while(st.hasMoreElements()) {
			 st1 = new StringTokenizer(st.nextToken(), ",");
		   while(st1.hasMoreTokens()) {
		     name = st1.nextToken().trim();
		     gender = st1.nextToken().trim();
		     weight = Integer.parseInt(st1.nextToken().trim());
		     height = Integer.parseInt(st1.nextToken().trim());
		     System.out.println("name : " + name);
		     System.out.println("gender : " + gender);
		     System.out.println("weight : " + weight);
		     System.out.println("height : " + height);
		     
		     if(gender.equals("남"))
		     {
		         t_weight = t_weight + weight;
		         count ++;		 
		     }

		   }
		
		}
        System.out.println("남자의 평균체중은 " + t_weight/count + "kg 입니다.");
	}

}
