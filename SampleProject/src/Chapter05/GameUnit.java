package Chapter05;

import java.util.Scanner;

interface Weapon{
	public void fire(int power); //현재 curPower에서 power값을 제거한다.
	public int getRestPower(); //현재 curPower값을 리턴한다.
	public int charge(int power); //현재 curPower에서 power만큼 더하고 curPower값을 리턴한다.
	}
//todo1 : weapon의 메소드를 오버라이딩 하라!
class MyWeapon implements Weapon{
	int curPower;
	@Override
	public void fire(int power) {
		this.curPower -= power;
	}; //현재 curPower에서 power값을 제거한다.
	@Override
	public int getRestPower() {return this.curPower;}; //현재 curPower값을 리턴한다.
	@Override
	public int charge(int power) {return this.curPower += power;}; //현재 curPower에서 power만큼 더하고 curPower값을 리턴한다.
}
//todo2 : GameUnit 2개를 만들고 각 GameUnit은 MyWeapon을 사용할 수 있도록 하라.
public class GameUnit {
    //todo3 : GameUnit이 가질 속성을 정의하라.
	public static int bossPower = 10000;
	public static int superPower = 10;
	private int unitPower = 100;
	private MyWeapon weapon;
	private String name;
	//todo4 : GameUnit이 초기에 가질 생성자를 정의하라.
	
	GameUnit(String name){
    	 this.name = name;
    	 weapon = new MyWeapon();
    	 weapon.charge(unitPower);
    }
	//todo5 : attack(int power) 메소드를 정의하라.
	//void attack(int power)을 하면 bossPower에서 power만큼 제거하고
    //bossPower가 0이하가 되면 게임 승리하고 System.exit(0) 프로그램 종료함
	public void attack(int power) {
		bossPower = bossPower - power;		
		if(bossPower <= 0) {
			System.out.println("게임승리");
			System.exit(0);	
		}
	}
	public void boss_attack(int superPower) {
		
	}
	
	public static void main(String[] args) {
    //todo6 : GameUnit들이 서로 경기할 수 있도록 시나리오를 만든다.
		
	  int num=1;
	  boolean GameStart = true;
	  GameUnit unit1 = new GameUnit("유저1");
	  GameUnit unit2 = new GameUnit("유저2");
	  int user_recover;
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("유저1 이름을 입력하세요:");
	  sc.next();
	  System.out.println("유저2 이름을 입력하세요:");
	  sc.next();
	  
	  MyWeapon my = new MyWeapon();
	  my.getRestPower();
	  
	  
	  System.out.println("보스와 싸움이 시작됩니다:");
	  
	  while(GameStart)
	  {
		  System.out.println("1:공격, 2:방어, 3:회피, 4:회복, 5:탈출");
		  num = sc.nextInt();
		  switch(num) 
		  {
		  case 1:
			  System.out.println("gkgkgk");
			  unit1.attack(unit1.weapon.curPower);
			  unit1.weapon.fire(10);
			  System.out.println("보스의 파워는 " +bossPower + "입니다.");	
			  System.out.println("유저1의 파워는 " + unit1.weapon.getRestPower() + "입니다.");			  
			  unit2.attack(unit2.weapon.curPower);
			  System.out.println("보스의 파워는 " +bossPower + "입니다.");	
			  System.out.println("유저2의 파워는 " + unit2.weapon.getRestPower() + "입니다.");
			  unit2.weapon.fire(5);
			  if(unit1.weapon.curPower<0)
				  System.out.println("유저1이 죽었습니다.");
			  else if(unit2.weapon.curPower<0)
				  System.out.println("유저2이 죽었습니다.");
			  break;
		  case 2: System.out.println("방어를 하였습니다.");
		          unit1.weapon.charge(20); 
		          unit2.weapon.charge(10); 
		          System.out.println("유저1의 파워는 " + unit1.weapon.getRestPower() + "입니다.");
		          System.out.println("유저2의 파워는 " + unit2.weapon.getRestPower() + "입니다.");
		          break;
		  case 3: System.out.println("회피하였습니다.");
		          unit1.weapon.charge(10);
		          unit2.weapon.charge(5);
		          System.out.println("유저1의 파워는 " + unit1.weapon.getRestPower() + "입니다.");
		          System.out.println("유저2의 파워는 " + unit2.weapon.getRestPower() + "입니다.");
			      break;
		  case 4: System.out.println("누구를 회복시키겠습니까? 유저1 또는 유저2");
		          user_recover = sc.nextInt();
		          if(user_recover == 1)
		          {	  unit1.weapon.charge(30);
		          System.out.println("유저1의 파워는 " + unit1.weapon.getRestPower() + "입니다.");
		          }
		          else if(user_recover == 2)
		          {	  unit2.weapon.charge(20);
		          System.out.println("유저2의 파워는 " + unit2.weapon.getRestPower() + "입니다.");
		          }
		          break;
		  case 5: System.out.println("다음기회에");
		          System.exit(0);		  
		  
		  }			
	  } 
		
	}

}
