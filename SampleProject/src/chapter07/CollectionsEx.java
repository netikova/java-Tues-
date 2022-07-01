package chapter07;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class CollectionsEx {
	//todo : 우리가 직접 짜는 이진 탐색 메소드
	static boolean binarySearch(LinkedList<String> my, String key) {
		Collections.sort(my);
		printList(my);
		int start = 0;
		int end = my.size() - 1;
		int middle;
		int state = 0;
		boolean success = false;
		
		while(start <= end) {
			middle = (start+end) / 2;
			System.out.println("검색인덱스 : " + middle);
			if(key.compareTo(my.get(middle))==0) {
			   success = true;
			   return success;
			   
		}
		//todo : 문자비교 (String의 compare 메소드 활용)
		else if(key.compareTo(my.get(middle)) < 0)
			end = middle - 1;
		else if(key.compareTo(my.get(middle)) > 0)
			start = middle + 1;
	}

	//todo : 문자비교 (String의 compare 메소드 활용)
//			if(state == 1) System.out.println("탐색성공!!!");
//			else	       System.out.println("탐색실패!!!");
	//todo : LinkedList<String>을 입력받아서 화면에 출력하는 메소드
		return success;
}
	static void printList(LinkedList<String> my) {
		Iterator<String> it = my.iterator();
        while(it.hasNext()) {
        	String e = it.next();
        	String seperator;
        	if(it.hasNext())
        		seperator = "->";
        	else
        		seperator = "\n";
        	System.out.print(e + seperator);
        }
		
	}	
	
	
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		
		//1. for문 사용
//		for(int i=0; i<myList.size();i++)
//			System.out.println(myList.get(i));
		//2. for-each문 사용
//		for(String movie : myList)
//			System.out.println(movie);
//		3. iterator 사용
//        Iterator<String> it = myList.iterator();
//        while(it.hasNext())
//        	System.out.println(it.next());
//		
//		//4. Collections 사용: 메소드들이 모두 static 으로 구성, sort(오름차순:ㄱ,ㄴ순)
//		Collections.sort(myList);	
//		System.out.println("==============================");
//		  it = myList.iterator();
//	        while(it.hasNext())
//	        	System.out.println(it.next());
	    //5. 내림차순
//	        printList(myList);
//	        Collections.sort(myList);
//	        Collections.sort(myList, Comparator.reverseOrder());
//	        it = myList.iterator();
//	        while(it.hasNext())
//	        	System.out.println(it.next());
//		    //오름차순 반대
//		    printList(myList);
//            Collections.sort(myList);
//            printList(myList);
//            Collections.reverse(myList);
//            printList(myList);
		
//		int index = Collections.binarySearch(myList, "아바타"); //아바타가 있는 index번호, 값이 없으면 -1로 리턴, 2진탐색이라 오름차순 정렬을 안해주면 있는 값도 못찾을 수 있다.
//		System.out.println("아바타는 " + index + "번 인덱스에 있습니다.");
		
		printList(myList);
		System.out.println("검색어 >> ");
		String search = sc.next().trim();
		if(binarySearch(myList, search)) System.out.println("탐색성공!!!");    
		else                             System.out.println("탐색실패!!!");


	}
}
