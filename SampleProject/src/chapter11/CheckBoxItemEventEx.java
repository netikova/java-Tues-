package chapter11;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame{
	JCheckBox fruits[] = new JCheckBox[3];
	String names[] = {"사과", "배", "체리"};
	int sum = 0;
	JLabel sumLabel;
	
	
    public CheckBoxItemEventEx() {
    	super("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
    	c.setLayout(new FlowLayout());     	
    	
    	JCheckBox apple = new JCheckBox("사과");
    	JCheckBox pear = new JCheckBox("배"); //선택된 상태
    	JCheckBox cherry = new JCheckBox("체리");
    	
    	JLabel topLabel = new JLabel("사과100원, 배500원, 체리20000원");
    	sumLabel = new JLabel("현재 0원입니다.");    	
    	c.add(topLabel);
    	
    	MyItemListener listener = new MyItemListener();
        for(int i=0; i<fruits.length; i++)
        {
        	fruits[i] = new JCheckBox(names[i]);
        	c.add(fruits[i]);
        	fruits[i].addItemListener(listener); //클릭을 할때 해당하는 체크박스에 대해서 listener가 있어야한다.
        }	
    	c.add(sumLabel);
    	
    	setSize(250,200);
    	setVisible(true);
    	
    }
    
    class MyItemListener implements ItemListener{ //ItemListener는 클릭햇을때 이벤트 발생하는 클래스이고 밑에 메소드를 정의한다.

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
	         if(e.getItem() == fruits[0])
	        	 sum +=100;
	         else if(e.getItem() == fruits[1])
	        	 sum +=500;
	         else if(e.getItem() == fruits[2])
	        	 sum += 20000;			
			}else {
			 if(e.getItem() == fruits[0])
		        	 sum -=100;
		     else if(e.getItem() == fruits[1])
		        	 sum -=500;
		     else if(e.getItem() == fruits[2])
		        	 sum -= 20000;	  
				
			} 
			
			sumLabel.setText("현재" + sum + "원 입니다.");
		}
    	
    }
	public static void main(String[] args) {
		new CheckBoxItemEventEx();

	}

}
