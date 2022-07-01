package chapter10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamblingGameEx extends JFrame{
	 Color color=new Color(139, 0, 255);
     JLabel[] label = new JLabel[3];
     JLabel text;
     int i=(int)(Math.random()*5);
     int j=(int)(Math.random()*5);
     int k=(int)(Math.random()*5);
	
    public GamblingGameEx() {     	
    	setTitle("keyListener 예제");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	Container c = getContentPane();
    	c.addKeyListener(new MyKeyListener());
    	c.setLayout(new FlowLayout());
    	
    	label[0] = new JLabel(Integer.toString(i));
    	label[0].setOpaque(true);
    	label[0].setBackground(color);
    	label[0].setFont(new Font("Arial", Font.PLAIN,60));
    	label[0].setForeground(Color.yellow);
    	label[0].setHorizontalAlignment(JLabel.CENTER);
    	label[0].setBounds(100, 80, 100, 60);
//    	label[0].setSize(100,100);
//    	label[0].setLocation(80,60);
    	label[1] = new JLabel(Integer.toString(j));
    	label[1].setOpaque(true);
    	label[1].setBackground(color);
    	label[1].setFont(new Font("Arial", Font.PLAIN,60));
    	label[1].setForeground(Color.yellow);
    	label[1].setHorizontalAlignment(JLabel.CENTER);
    	label[1].setBounds(100, 80, 100, 60);
//    	label[1].setSize(100,100);
//    	label[1].setLocation(80,60);    	
    	label[2] = new JLabel(Integer.toString(k));
    	label[2].setOpaque(true);
    	label[2].setBackground(color);
    	label[2].setFont(new Font("Arial", Font.PLAIN,60));
    	label[2].setForeground(Color.yellow);
    	label[2].setHorizontalAlignment(JLabel.CENTER);
    	label[2].setBounds(100, 80, 100, 60);
//    	label[2].setSize(100,100);
//    	label[2].setLocation(80,60); 
    	
    	text=new JLabel("시작합니다. ");
		text.setBounds(250, 200, 100, 100); 
    	
    	for(int i=0; i < label.length; i++) {
    		add(label[i]); 			
    	}  	
    	
    	add(text);
//    	text.setSize(250,100);
//    	text.setLocation(200,100); 
    	setVisible(true);
    	
    	requestFocus();
    	
//    	c.setFocusable(true);
//    	c.requestFocus();
    }
    class MyKeyListener extends KeyAdapter{
    	public void keyPressed(KeyEvent e) {    		
    		char keyChar = e.getKeyChar();    
    		
    		if(e.getKeyChar() == '\n') {
    		
    	    i=(int)(Math.random() * 5);
 		    k=(int)(Math.random() * 5);
 		    j=(int)(Math.random() * 5);
 		    
    		label[0].setText(Character.toString(i));
    		label[1].setText(Character.toString(k));
    		label[2].setText(Character.toString(j));
    		if(i==j&&j==k) {
    			text.setText("축하합니다!");
    		}else {
    			text.setText("아쉽군요");
    		}
    		}
    	}
    }
	public static void main(String[] args) {		
		new GamblingGameEx();
	}

}
