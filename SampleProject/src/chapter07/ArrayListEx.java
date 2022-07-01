package chapter07;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		//1. 객체선언
		Scanner scan = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();

		//2. 이름을 입력받아 ArrayList에 add한다.
		for(int i=0; i<4; i++) {
			System.out.println("이름을 입력해주세요 >> ");			
			al.add(scan.next());
		}
		//3. ArrayList에 입력된 이름을 출력한다.
		//3-1. for문을 활용
		//3-2. Iterator를 활용
		//3-3. for-each문을 활용
		for(String name : al)
			System.out.println(name);
/*		for(int i=0; i<al.size(); i++)
			System.out.println(al.get(i));
		Iterator<String> it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next() + " ");*/
		
		//4. ArrayList에 입력된 이름 중 가장 긴 이름을 찾아 출력한다.
		int max=0;
		for(int i=0; i<al.size();i++) {
			if(al.get(max).length() < al.get(i).length())
				max=i;
		}
		System.out.println("가장 긴 이름은 :" + al.get(max));
		  /*int long_string = al.get(0).length();
			int long_index;
			for(int i=1; i<al.size(); i++)
				if(long_string < al.get(i).length())
					long_index = i; */
		


	}

}
