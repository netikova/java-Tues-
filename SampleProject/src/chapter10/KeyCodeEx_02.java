package chapter10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx_02 extends JFrame{
	JLabel label = new JLabel();
	Container c = getContentPane();
	
    public KeyCodeEx_02() {
    	setTitle("keyListener 예제");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	c.addKeyListener(new MyKeyListener()); 	
       	c.setLayout(null);
       	label.setSize(100,100);
       	label.setLocation(50,50);
       	c.add(label);
		
    	
    	setSize(300,150);
    	setVisible(true);
    	
    	c.setFocusable(true);
    	c.requestFocus();
    }
    
    class MyKeyListener extends KeyAdapter{
    	public void keyPressed(KeyEvent e) {
    		int keyCode = e.getKeyCode();
    		char keyChar = e.getKeyChar();
    		String keyText = e.getKeyText(KeyCode);
    		
    		label.setText(keyText + "키가 눌러졌음");
//    		label.setText(e.getKeyText(e.getKeyCode()));   		
    		
    		if(e.getKeyChar() == '%')
    		{
    		   c.setBackground(Color.YELLOW);
    		}else if(e.getKeyCode() == KeyEvent.VK_F1)
    		{
    		   c.setBackground(Color.GREEN);
    		}
    	}
    }
	public static void main(String[] args) {
		new KeyCodeEx_02();

	}

}
