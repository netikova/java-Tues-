package chapter04;

import java.util.InputMismatchException;
import java.util.Scanner;

class ConcertSystem{  
/*	private static String S[] = new String[10]; //S좌석
	private static String A[] = new String[10]; //A좌석
	private static String B[] = new String[10]; //B좌석
	
	
	public static String[] getS() {
		return S;
	}
	public static void setS(String[] s) {
		S = s;
	}
	public static String[] getA() {
		return A;
	}
	public static void setA(String[] a) {
		A = a;
	}
	public static String[] getB() {
		return B;
	}
	public static void setB(String[] b) {
		B = b;
	}
*/
	static String S[] = {"--- ","--- ","--- ","--- ","--- ","--- ","--- ","--- ","--- ","--- "};
	static String A[] = {"--- ","--- ","--- ","--- ","--- ","--- ","--- ","--- ","--- ","--- "};
	static String B[] = {"--- ","--- ","--- ","--- ","--- ","--- ","--- ","--- ","--- ","--- "};
	
	public static void reservate(int seat, String name, int seat_n)
	{
	     switch(seat) {
	       case 1:
			//System.out.println(S);	    	
	    	   S[seat_n-1] = name;
	    	   
	    	   break;	    	  

	       case 2:
	    	//System.out.println(A);
	    	   A[seat_n-1] = name;
	    	   
	    	   break;	 
	    	   
	       case 3:		
	    	//System.out.println(B);
	    	   B[seat_n-1] = name;
	    	   
	    	   break;	 
	    	   
	    	   
	     }
	}
	public static void print(int[] a) 
	{
	   for(int aa : a) System.out.print(aa);	
	}
}

public class Concert {

	public static void main(String[] args) {

	    boolean program = true;
//		String S[] = new String[10]; //S좌석
//		String A[] = new String[10]; //A좌석
//		String B[] = new String[10]; //B좌석
	while(program) {
		try {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4>>");		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	
		
		if(num>0 && num<5) {
		
		switch(num) {
		 case 1:			 
			    System.out.println("좌석구분 S(1), A(2), B(3)>>");
				int seat = sc.nextInt();
             //좌석 출력 구간
			    if(seat > 0 && seat < 4 ) {
				switch(seat) {
			       case 1:		
			    	for(int i = 0; i < ConcertSystem.S.length; i++)
					System.out.print(ConcertSystem.S[i]);
			    	 
			       case 2:
			    	for(int i = 0; i < ConcertSystem.A.length; i++)
					System.out.print(ConcertSystem.A[i]);
			    	  
			       case 3:		
			    	for(int i = 0; i < ConcertSystem.B.length; i++)
					System.out.print(ConcertSystem.B[i]);		    	 
			    	   
			     }
				System.out.println(); 
				boolean nname = true;
				
			  while(nname) {
				  boolean nname2= true;
				System.out.println("이름>>");
				String name = sc.next();
				System.out.println("번호>>");
				int seat_num = sc.nextInt();	
			    for(int i = 0; i < ConcertSystem.S.length; i++) 
		    	   {
		    		   if(name.equals(ConcertSystem.S[i]) || name.equals(ConcertSystem.A[i]) || name.equals(ConcertSystem.B[i]))
		    		   {
		    			   System.out.println("중복된 이름입니다."); 	
		    			   nname2 = false;
		    			   break;
		    			  
		    		   }    		   
		    		
		    	   }			
			    if(nname2 == true) 
			    {
			    ConcertSystem.reservate(seat, name, seat_num);		
			    nname = false;
			    }
			  }
			    }
				
				break;
				

		 case 2:
			    for(int i = 0; i < ConcertSystem.S.length; i++)
					System.out.print(ConcertSystem.S[i]);
			        System.out.println();  
			    for(int i = 0; i < ConcertSystem.A.length; i++)
					System.out.print(ConcertSystem.A[i]);
			        System.out.println();  
			    for(int i = 0; i < ConcertSystem.B.length; i++)
					System.out.print(ConcertSystem.B[i]);	
			        System.out.println();  
			    break;
			 
		 case 3:
			    System.out.println("좌석구분 S(1), A(2), B(3)>>");
			    int seat2 = sc.nextInt();
			    System.out.println("삭제할 이름을 입력하십시오.");
			    String cancel = sc.next();
			    boolean c = false;
			   
			    switch(seat2) {
			       case 1:		
			    	   for(int i = 0; i < ConcertSystem.S.length; i++) 
			    	   {
			    	       if(cancel.equals(ConcertSystem.S[i]))
			    	       {	
			    	    	   ConcertSystem.S[i] = "--- ";			    	    	 
			    	           c = true;
			    	       }			    	        	       
			    	       
			    	   }
			    	   if(c == false)		    	    	
		    	         	System.out.println("없는 이름입니다."); 
			    	   for(int i = 0; i < ConcertSystem.S.length; i++)
			    	   {
			    		   System.out.print(ConcertSystem.S[i]);
			    	   }
			    	   c = false;
			    	   break;
					
			    	 
			       case 2:
			    	   for(int i = 0; i < ConcertSystem.A.length; i++) 
			    	   {
			    	       if(cancel.equals(ConcertSystem.A[i]))
			    	       {	
			    	    	   ConcertSystem.A[i] = "--- ";			    	    	 
			    	           c = true;
			    	       }
			    	       
			    	   }
			    	   if(c == false)		    	    	
		    	         	System.out.println("없는 이름입니다."); 
			    	   for(int i = 0; i < ConcertSystem.A.length; i++)
			    	   {
			    		   System.out.print(ConcertSystem.A[i]);			    		   
			    	   }
			    	   c = false;
			    	   break;
			    	  
			       case 3:		
			    	   for(int i = 0; i < ConcertSystem.B.length; i++) 
			    	   {
			    	       if(cancel.equals(ConcertSystem.B[i]))
			    	       {	
			    	    	   ConcertSystem.B[i] = "--- ";			    	    	 
			    	           c = true;
			    	       }
			    	       
			    	   }
			    	   if(c == false)		    	    	
		    	         	System.out.println("없는 이름입니다."); 
			    	   for(int i = 0; i < ConcertSystem.B.length; i++) 
			    	   {
			    		   System.out.print(ConcertSystem.B[i]);
			    		 
			    	   }
			    	   c = false;
			    	   
			    	   break;
			    	   
			     }
			    break;
		 case 4:
			 sc.close();
			 System.exit(0);
			 program = false;
			 break;
		}
	}else 
	{
		System.out.println("없는 메뉴입니다.");
	} 
		
	} catch (InputMismatchException ime) {
	      System.err.println("실수 또는 문자를 입력하셨습니다: " + ime);
	     
    }
   }
		
 }

}
