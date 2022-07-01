package chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//명품자바 635페이지 3,4번
public class MoneyChangerEx extends JFrame{
	JTextField money[] = new JTextField[8];
	String text[] = {"50000원","10000원","1000원","500원","100원","50원","10원","1원"};
	int money_unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	JTextField totalMoney = new JTextField();
	
	public MoneyChangerEx(){
		super("Money Changer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("금액");
		JButton calBtn = new JButton("계산");
		MyListener listener = new MyListener();
		calBtn.addActionListener(listener);
		c.add(label);
		c.add(totalMoney);
		c.add(calBtn);
		for(int i=0; i<money.length;i++) {
			c.add(new JLabel(text[i]));
			money[i] = new JTextField(30);
			c.add(money[i]);
			}		
		setSize(350, 500);
		setVisible(true);
	}
	
	private class MyListener implements ActionListener{			
		public void actionPerformed(ActionEvent e) {
			int sum = 0
	           if(e.getSource() == calBtn) {
	        	   for(int i=0; i<money.length;i++)
	        	   {
	        		   
	        	   }
	           }else if(e.getSource() == button2) {
	        	   
	           }
	        	        	
	          }	    
	        }
	
	public static void main(String[] args) {
		new MoneyChangerEx();

	}

}
