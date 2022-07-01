package chapter06;

public class StringEx {

	public static void main(String[] args) {
		String str1 = "Hello,Java";
		String str2 = "Hello                   ";		
		String str3 = str1.concat("Java");
		StringBuffer sb1 = new StringBuffer("ILOVEYOU");
	
	
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str1.equals(str3));
		System.out.println(str1.charAt(0));
		System.out.println(str1.length());
		System.out.println(str1.replace("ll", "hh"));
		System.out.println(str1.split("-"));
		System.out.println(str2.trim());
		System.out.println(sb1.delete(1, 5));
		System.out.println(sb1.reverse());
	}

}
