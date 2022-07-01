package chapter07;

import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
//		var v = new Vector<>();
		Iterator<Integer> it = v.iterator();
		
		
		

		v.add(5);
		v.add(4);
		v.add(-1);
		
		while(it.hasNext()) {
			System.out.println(it);
		}
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());		
		System.out.println(v.get(0));
        System.out.println(v);
        v.remove(0);
        System.out.println(v);
//        v.removeAllElements();
//        System.out.println(v);
//        System.out.println(v.capacity());
        
        v.clear();
        System.out.println(v);
        System.out.println(v.capacity());
        
	}

}
