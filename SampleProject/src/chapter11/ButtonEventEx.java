package chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class ButtonEventEx extends JFrame {	
	public ButtonEventEx() {
		super("버튼 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton yellowBtn = new JButton("노란색");
		JButton pinkBtn = new JButton("핑크색");
		
	
	    yellowBtn.addActionListener(new ActionListener() {	        
	        public void actionPerformed(ActionEvent e) {
	        	c.setBackground(Color.YELLOW);	        	
	          }	    
	        });
	    pinkBtn.addActionListener(new ActionListener() {	        
	        public void actionPerformed(ActionEvent e) {
	        	c.setBackground(Color.PINK);	        	
	          }	    
	        });
		    c.add(yellowBtn);
		    c.add(pinkBtn);
            setSize(500,400);
	        setVisible(true);
	      }
			public static void main(String[] args) {
			new ButtonEventEx();
	
		
	     }
  
       }
