package chapter04;

public class Person2 {
	//private의 직접 접근이 불가능 하니 메소드로 접근이 가능하다
	// Source메뉴에 Getters and Setters를 이용
    private String name;
    private int sex;
    private int age;
    // Source메뉴에 Constructor using field 를 이용하여 생성자 자동 생성
	public Person2(String name) {
		super();
		this.name = name;
	}
	public Person2(String name, int sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	public Person2(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
    
	

}
