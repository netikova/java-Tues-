package chapter10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MouseWheelEx extends JFrame {
	JLabel label = new JLabel("Love Java");
	Container c = getContentPane(); /* 팬생성 */	
	
	public MouseWheelEx() {
		label.setFont(new Font("Arial", Font.PLAIN,10));
		setTitle("Mouse Wheel Evenet 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);					
		//c.addMouseListener(new MyMouseListener());
		//c.addMouseMotionListener(new MyMouseListener());
		c.setLayout(new FlowLayout());
			
		c.add(label);			
		setSize(600,300);		
		setVisible(true);		
	label.addMouseWheelListener(new MouseWheelListener(){		
	
	public void mouseWheelMoved(MouseWheelEvent e) {
		
		int n = e.getWheelRotation();
		if(n<0) { //up direction. 폰트 5픽셀 작게
			JLabel la = (JLabel)e.getSource();
			Font f = la.getFont();
			int size = f.getSize();
			if(size <=5 )
				return;
			la.setFont(new Font("Ariel", Font.PLAIN,size-5));			
		}
		else { //down direction. 폰트 5픽셀 크게
			JLabel la = (JLabel)e.getSource();
			Font f = la.getFont();
			int size = f.getSize();
			la.setFont(new Font("Ariel", Font.PLAIN,size+5));		
		}
	}	
	});
	label.setFocusable(true);
	label.requestFocus();
	}
	
	
	public static void main(String[] args) {
		new MouseWheelEx();

	}

}
