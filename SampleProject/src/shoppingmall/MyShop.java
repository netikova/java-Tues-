package shoppingmall;

import java.util.ArrayList;
import java.util.Scanner;

import shoppingmall.User.payType;

public class MyShop implements IShop {
    //등록 회원 정보 배열
	User[] users = new User[2];
	
	//등록 상품 정보 배열
	Product[] products = new Product[4];
	
	//상품을 추가할 수 있는 장바구니
	ArrayList<Product> cart = new ArrayList<Product>();
	
	//키보드 입력으로 문자열을 입력받는 Scanner 객체 생성
	Scanner scan = new Scanner(System.in);
	
	//선택한 사용자의 index 보관
	int selUser;
	
	//쇼핑몰 이름
	String title;
public void setTitle(String title) {		
    this.title = title;
	}

public void start() {
	System.out.println(title + " : 메인 화면 = 계정 선택");
	System.out.println("============================");
	int i = 0;
	
	// 등록한 사용자 정보 출력
	for(User u : users) {
		System.out.printf("[%d]%s()%s\n", i++, u.getName(), u.getPaytype());
	}
	
	System.out.println("[x]종 료");
	System.out.println("선택 : ");
	String sel = scan.next();
	System.out.println("##" + sel + "선택 ##");
	
	switch(sel) {
	case "x": System.exit(0); break;
	default:
		selUser = Integer.parseInt(sel);
		productList();
	}
  }

public void productList() {
	System.out.println(title + " : 상품 목록 - 상품 선택");
	System.out.println("============================");
	int i = 0;
	
	//등록한 상품 정보 출력
	for(Product p : products) {
		System.out.println("[" + i + "]");
		p.printDetail();
		i++;
	}
	System.out.println("[h]메인화면");
	System.out.println("[c]체크아웃");
	System.out.println("선택 : ");
	String sel = scan.next();
	System.out.println("## " + sel + "선택 ##");
	
	//선택한 메뉴에 따라 처리
	switch(sel) {
	case "h" : start();break;
	case "c" : checkOut();break;
	default:
		int psel = Integer.parseInt(sel);
		cart.add(products[psel]);
		productList();	  
	   }
	}
public void checkOut() {
	System.out.println(title + " :체크아웃");
	System.out.println("============================");
	int total = 0;
	int i = 0;
	
	//장바구니에 등록된 상품 정보 출력
	for(Product p : cart) {
		System.out.printf("[%d]%s(%s)\n", i++, p.pname, p.price);
		total = total + p.price;
	}
	System.out.println("============================");
	
	// 선택한 사용자의 결제 방법 출력
	System.out.println("결제 방법: " + users[selUser].getPaytype());
	
	//합계 출력
	System.out.println("합계: " + total + "원 입니다.");
	System.out.println("[p]이전, [q]결제 완료");
	System.out.println("선택 : ");
	String sel = scan.next();
	
	//선택된 메뉴에 따라 처리
	switch(sel) {
	    case "q":
		    System.out.println("## 결제가 완료 되었습니다. 종료합니다 ##");
		    System.exit(0);break;
	    case "p":
	    	productList();break;
	    default:
	    	checkOut();
	}	
  }

public void genUser() {
	User user = new User("홍길동", payType.CARD);
	users[0] = user;
	user = new User("블로거", payType.CASH);
	users[1] = user;
  }

public void genProduct() {
	CellPhone cp = new CellPhone("갤럭시 노트5", 1000000, "SKT");
	products[0] = cp;
	cp = new CellPhone("애플 아이폰7", 980000, "KT");
	products[1] = cp;
	SmartTV st = new SmartTV("삼성 3D Smart TV", 500000, "4K");
    products[2] = st;
    st = new SmartTV("LG Smart TV", 250000, "Full HD");
    products[3] = st;	
  }


}
