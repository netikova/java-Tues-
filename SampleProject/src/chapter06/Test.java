package chapter06;

public class Test {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(10);
		Integer b = Integer.valueOf(10);
		System.out.println(i.hashCode());
		System.out.println(b.hashCode());
	}
}
