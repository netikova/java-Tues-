package chapter07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Ex07_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		double score;
		HashMap<String,Double> st = new HashMap<String,Double>();
		
		System.out.println("미래장학금관리시스템입니다.");
		for(int i = 0; i < 5;  i++) {		
		System.out.println("이름과 학점>" );
		name = sc.next();
		score = Double.parseDouble(sc.next());
		st.put(name, score);
		}
		
		System.out.println("장학생 선발 학점 기준: ");
		Double base = Double.parseDouble(sc.next());
		
		//p414참조 : 해시맵의 전체 검색
		//todo : 해시맵을 전체 검색하며 value값을 비교해서 base보다 크면 해당되는 key값을 출력한다.
		Set<String> keys = st.keySet(); //해시맵 h에 있는 모든 키를 Set 컬렉션으로 리턴
		Iterator<String> it = keys.iterator(); //Set의 각 문자열을 순차 검색하는 Iterator 리턴
		
		while(it.hasNext()) {
			String key = it.next();
			Double value = st.get(key);
			
			if(value >= base)
			System.out.println("(" + key + "," + value + ")"); //키와 값의 쌍 출력
		}
	}

}
