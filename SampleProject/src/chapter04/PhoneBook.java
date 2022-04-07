package chapter04;

import java.util.Scanner;

class Phone{
	//속성
	private String name;
	private String tel;
	//생성자
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	//getters & setters
	//p.name -> p.getName() 으로 접근하도록 getters, setters 이용 (private으로 접근 제한)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	// toString은 클래스 안에 있는 필드 값을 출력
	@Override
	public String toString() {
		return "Phone [name=" + name + ", tel=" + tel + "]";
	}

	
	
}
//이름(name), 전화번호(tel)필드와 생성자 등을 가진 Phone클래스를 작성하라.
//getters * setters 메소드

//실행예시처럼 이름으로 전화번호를 검색하라.
//인원수>>3
//이름과 전화번호 >>> 엄남겸 000-0000
//이름과 전화번호 >>> 홍길동 012-0123
//이름과 전화번호 >>> 김영희 123-1234
//저장되었습니다.
//검색할 이름 >>> 홍길동
//012-0123
//검색할 이름 >>> 나길순
//검색할 내용이 없습니다.

// 인원수를 받고, 인원 수 만큼 배열을 만들어 초기화 합니다.
// 인원수 만큼 이름과 전화번호를 입력받아 생성하고 값을 초기화 합니다.
// 입력이 끝나면 "저장되었습니다" 라고 출력합니다. 그 후,
// 검색할 이름을 입력 받습니다.
// 검색어가 있다면 전화번호를 출력하고, 없다면 "없습니다" 라고 출력합니다.
// 검색은 사용자가 검색할 이름에 "그만" 이라고 입력할 때까지 반복합니다.
public class PhoneBook {

	public static void main(String[] args) {
		//Phone ph[];
		//Phone ph = new Phone("엄남경", "000-0000");
		Scanner scan = new Scanner(System.in);
		System.out.println("인원수 >>> ");
		int num = scan.nextInt();
		Phone ph[] = new Phone[num];
		boolean success = false;
		//String stop = "그만";
		
		
		for(int i = 0; i < ph.length; i++ )
		{
			System.out.print("이름과 전화번호(,없이) >>> ");
			String name = scan.next();
			String tel = scan.next();			
			ph[i] = new Phone(name, tel);
			//System.out.println(ph[i].getName() + ", "+ph[i].getTel());
		}
		System.out.println("저장되었습니다.");
		System.out.println("검색할 이름을 입력하세요.");
		String search = scan.next();
		

				
//		}
//		for(Phone p : ph)
//			if(search.equals(p.getName()))
//				p.toString();
//			else 
//				System.out.println("없어");
//			
//		for(int j = 0; j<ph.length; j++) {
//			System.out.println(ph[j].toString());
//		}		
		
//		for(Phone p : ph) 
//			System.out.println(p.toString());
//		System.out.println("검색할 이름 >>> ");
//		String search = scan.next();
	while(true)
	{
		if(search.equals("그만")) 
		{
			System.out.println("그만");
			break;
		}
	 for(int i = 0 ; i < ph.length; i++)
	   {
		if(search.equals(ph[i].getName())) 
		{
			System.out.println(ph[i].getTel());	
	 	    success = true;
		}
		    
		
		
	  }
		if(success == false)
			System.out.println("없습니다.");
		break;
    }
		
	
}

}
