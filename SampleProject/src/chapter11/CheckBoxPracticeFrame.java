package chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class CheckBoxPracticeFrame extends JFrame {
	private JButton btn = new JButton("test button");
	public CheckBoxPracticeFrame() {
		super("CheckBox Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout()); //왼쪽 정렬은 FlowLayout()은 안된다.
		
		JCheckBox a = new JCheckBox("버튼 비활성화");
		JCheckBox b = new JCheckBox("버튼 감추기");
		c.add(a);
		c.add(b);
		c.add(btn);
	
	    a.addItemListener(new ItemListener() {
	        @Override 	
	        public void itemStateChanged(ItemEvent e) {
	        	if(e.getStateChange() == ItemEvent.SELECTED)	        		
	        		  btn.setEnabled(false); //버튼 비활성화 	      		
	             	  
	        	else if(e.getStateChange() ==ItemEvent.DESELECTED) 	            	
	        	      btn.setEnabled(true);             	
	          }	    
	        });
	    b.addItemListener(new ItemListener() {
	    @Override 	
	    public void itemStateChanged(ItemEvent e) {
	      	if(e.getStateChange() == ItemEvent.SELECTED)	        			
	           	  btn.setVisible(false);
	       	else if(e.getStateChange() ==ItemEvent.DESELECTED) 	            	         	
	              btn.setVisible(true);    	
	          }	    
	        });
	        setSize(500,400);
	        setVisible(true);
	      }
		public static void main(String[] args) {
		      new CheckBoxPracticeFrame();		
	     }  
        }
