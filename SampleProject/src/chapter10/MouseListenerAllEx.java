package chapter10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame{
	JLabel label = new JLabel("Hello");
	Container c = getContentPane(); /* 팬생성 */
	
	public MouseListenerAllEx() {
		setTitle("Mouse Evenet 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);					
		c.addMouseListener(new MyMouseListener());
		c.addMouseMotionListener(new MyMouseListener());
		c.setLayout(new FlowLayout());
		
	
		c.add(label);
		setSize(50,20);		
		setSize(300,300);
		setVisible(true);	
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{
		public void mouseEntered(MouseEvent e) {
			//c.setBackground(Color.CYAN);
		    int r=(int)(Math.random() * 255);
		    int g=(int)(Math.random() * 255);
		    int b=(int)(Math.random() * 255);
		    c.setBackground(new Color(r,g,b));		    
		}
		public void mousePressed(MouseEvent e) {		
	    	label.setText("mousePressed(" + e.getX()+","+e.getY()+ ")");
		}
		public void mouseReleased(MouseEvent e) {
	    	label.setText("mouseReleased(" + e.getX()+","+e.getY()+ ")");	
		}
		public void mouseClicked(MouseEvent e) {
			label.setText("mouseClicked(" + e.getX()+","+e.getY()+ ")");	
		}
		public void mouseExited(MouseEvent e) {
			label.setText("mouseExited(" + e.getX()+","+e.getY()+ ")");
		}
		public void mouseDragged(MouseEvent e) {
			label.setText("mouseDragged(" + e.getX()+","+e.getY()+ ")");
		}
		public void mouseMoved(MouseEvent e) {
			label.setText("mouseMoved(" + e.getX()+","+e.getY()+ ")");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new MouseListenerAllEx();
		

	}

}
