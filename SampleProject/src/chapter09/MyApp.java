package chapter09;
import javax.swing.*;

class MyFrame2 extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame2() {
		setTitle("300x300스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
	}
}

public class MyApp{
	public static void main(String[] args) {		
        MyFrame2 frame = new MyFrame2();
	}
}