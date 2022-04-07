package chapter04;

public class Person {
	//속성
    private String name;
    int sex;
    int age;
    //생성자
    //Source의 Generate to String 이용
    Person(){
    	System.out.println("Person()생성자 호출");
    }
    @Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}   
	Person(String name){
		this();           //아무것도 없는 생성자를 불러준다
    	this.name = name;
    } 
    Person(String name, int age){
    	this("");
    	this.age = age;    	
    }
    //행위
    int eat(int rice, int side){
    	return rice+side;    	
    }
    int eat(int rice) {return rice;}
    void eat() {
    	System.out.println("뭘 좀 먹어봐!");
    }

//main 행위
	public static void main(String[] args) {
/*	Person student; //객체명 선언
	student = new Person(); //객체 생성 */
	Person student = new Person();
	Person student1 = new Person("엄남경"); //객체 생성 및 선언
	Person student2 = new Person("엄남경", 20);// 객체 생성 및 선언
	System.out.println(student2.name + "," +student2.age);

	/*
	System.out.println(student1.name);
	System.out.println(student2.name);
	System.out.println(student2.age);
	System.out.println(student1.eat(100));
	System.out.println(student1.eat(300, 200));
	student.eat();
	*/
	
	
	}	
}
	

