package shoppingmall;

//프로그램의 시나리오
public class ShopLauncher {
	public static void main(String[] args) {
/*     String name;
     System.out.println("MyShop : 메인화면 - 계정 선택");
     System.out.println("---------------------");
     
     System.out.println("계정 이름을 입력하십시오:");
     System.out.println("결제 방법을 선택하세요: CASH, CARD");
     Scanner sc = new Scanner(System.in);
     name = sc.next();
     User user = new User();
*/
	    IShop shop = new MyShop();
	    shop.setTitle("MyShop");
	    shop.genUser();
	    shop.genProduct();
	    shop.start();
     
     
	}
}
