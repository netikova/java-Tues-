package chapter10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame{
	JLabel[] label = new JLabel[3];
	
    public KeyCodeEx() {
    	setTitle("keyListener 예제");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Container c = getContentPane();
    	c.addKeyListener(new MyKeyListener());
    	c.setLayout(new FlowLayout());
    	label[0] = new JLabel("getKeyCode()");
    	label[1] = new JLabel("getKeyChar()");
    	label[2] = new JLabel("getKeyText()");
    	
    	for(int i=0; i < label.length; i++) {
    		c.add(label[i]);
    		label[i].setOpaque(true);
    		label[i].setBackground(Color.YELLOW);
    		
    	}  	
    	
    	setSize(300,150);
    	setVisible(true);
    	
    	c.setFocusable(true);
    	c.requestFocus();
    }
    
    class MyKeyListener extends KeyAdapter{
    	public void keyPressed(KeyEvent e) {
    		int KeyCode = e.getKeyCode();
    		char keyChar = e.getKeyChar();
    		String keyText = e.getKeyText(KeyCode);    		
    		
    		label[0].setText(Integer.toString(KeyCode));
    		label[1].setText(Character.toString(keyChar));
    		label[2].setText(keyText);
    	}
    }
	public static void main(String[] args) {
		new KeyCodeEx();

	}

}
