package chapter10;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame{
	JLabel label = new JLabel("Hello");

	public MouseListenerEx() {
		setTitle("Mouse Evenet 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); /* 팬생성 */
		//c.addMouseListener(new MyMouseListener());
		c.addMouseListener(new MyMouseAdapter());
		
		//1.레이아웃 셋탕
		c.setLayout(null);
		label.setSize(50,20);
		label.setLocation(30, 30);
		c.add(label);
		
		//2.화면에 프레임이 보이도록 세팅
		setSize(250,250);
		setVisible(true);	
	}
	
	//MouserListener를 활용하는 방법
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x,y);
			
			
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		
	}
	
	//MouseAdapter를 활용하는 방법
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x,y);		
		}
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();

	}

}
