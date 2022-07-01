package Chapter05;

interface PhoneInterface{  //대장 인터페이스
	 final int TIMEOUT = 10000;
	 public void sendCall();
	 public void receivecall();
	 default void printLogo() {
		 System.out.println("** Phone **");
	 }
	
} 
interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface{
	void play();
	void stop();
}
class PDA{
	int calculator(int x, int y) {return x+y;}
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface
{
   @Override	
   public void sendCall() {System.out.println("sendcall");}
   @Override
   public void receivecall() {System.out.println("receivecall");}
   @Override
   public void sendSMS() {System.out.println("sendsms");}
   @Override
   public void receiveSMS() {System.out.println("receiveSMS");}
   @Override
   public void play() {System.out.println("play");}
   @Override
   public void stop() {System.out.println("stop");}   
   public void schedule() {System.out.println("schedule");}
}
public class InterfaceEx {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("10과 10을 더하면" + phone.calculator(10, 10));
		}
}
