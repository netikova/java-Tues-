package Chapter05;

class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	public int getWeight() {return weight;}
	public void setWeight(int weight) {this.weight = weight;}	
}

class Student extends Person{
	public void set() {
		super.age = 30;
		super.name = "홍길동";
		super.height = 75;
		super.setWeight(99);
	
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", height=" + height + ", name=" + name + ", getWeight()=" + getWeight() + "]";
	} 	
	//todo- set을 통해 세팅된 값을 출력하는 메소드 추가
	public void print() 
	{
		System.out.println(age + " " + height + " " + name + " " + getWeight());
	}
	
}

public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		System.out.println(s.toString());
		s.print();
	}
}
