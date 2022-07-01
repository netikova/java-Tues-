package chapter10;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import chapter10.KeyCodeEx_02.MyKeyListener;

public class FlyingTestEx extends JFrame{
	JLabel label = new JLabel("Hello");
	Container c = getContentPane();
	final int FLYING_UNIT = 5;

	public FlyingTestEx() {
		setTitle("상하좌우키를 활용한 예제");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    	
    	c.addKeyListener(new MyKeyListener()); 	
       	c.setLayout(null);
       	label.setSize(100,100);
       	label.setLocation(50,50);
       	c.add(label);
		
    	
    	setSize(300,300);
    	setVisible(true);
    	
    	c.setFocusable(true);
    	c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
    	public void keyPressed(KeyEvent e) {
    		int keyCode = e.getKeyCode();
    		//char keyChar = e.getKeyChar();
    		//String keyText = e.getKeyText(KeyCode);  		
   
    		switch(keyCode) {
    		case KeyEvent.VK_UP : 
    			label.setLocation(label.getX(), label.getY() - FLYING_UNIT);
    			break;
    		case KeyEvent.VK_DOWN : 
    			label.setLocation(label.getX(), label.getY() + FLYING_UNIT);
    			break;
    		case KeyEvent.VK_LEFT : 
    			label.setLocation(label.getX() - FLYING_UNIT, label.getY());
    			break;
    		case KeyEvent.VK_RIGHT : 
    			label.setLocation(label.getX()+ FLYING_UNIT, label.getY());
    			break;
    		}
    		
    	}
    }

	public static void main(String[] args) {		
       new FlyingTestEx();
	}

}
