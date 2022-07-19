package groupproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LottoGenerator extends JFrame{
		int index = 1;
		JLabel la;
		Container c = getContentPane();
	public LottoGenerator() {
		setTitle("로또번호생성기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		c.setLayout(null);
		c.setBackground(Color.white);
		
		JButton btn = new JButton();
		c.add(btn);
		btn.setText("GO!");
		btn.setSize(60, 30);
		btn.setLocation(350, 500);
		
		btn.addActionListener(new MyActionListener());
		
		
		setSize(750, 1200);
		setVisible(true);
		
		//끄기//
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(120, 10, 100, 50);
		getContentPane().add(btnExit);
		
		setVisible(true);

		
		
		/* 로또라벨 */
		ImageIcon no = new ImageIcon("images/lottologo.jpg");
		la = new JLabel(no);
		c.add(la);
		la.setSize(200, 100);
		la.setLocation(275, 20);
		
		
		
		
	}
	
	class MyActionListener implements ActionListener {        
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int rnd = (int)(Math.random()*45)+1;
			int lotto[] = new int[7];
			int lotto2[] = new int[7];
			for (int i=0 ;i<lotto.length; i++){
				lotto[i] = (int)(Math.random()*45+1);	
					
				for (int j=0; j<i; j++){	
					if(lotto[i]==lotto[j]) 
						i--;
			}
			}
			for (int i=0 ;i<lotto.length; i++){				
				lotto2[i] = (int)(Math.random()*45+1);		
				for (int j=0; j<i; j++){	
					if(lotto2[i]==lotto2[j]) 
						i--;
			}
			}
			for(int i=0;i<7;i++) {
				ImageIcon no1 = new ImageIcon("images/"+lotto[i]+".png");
				la = new JLabel(no1);
				c.add(la);
				la.setSize(100, 150);
				la.setLocation(50+i*90, 70);
			}
			
			for(int i=0;i<7;i++) {
				ImageIcon no1 = new ImageIcon("images/"+lotto2[i]+".png");
				la = new JLabel(no1);
				c.add(la);
				la.setSize(100, 400);
				la.setLocation(50+i*90, 70*index);
			}
			
			/* 로또 추첨 */
			int match_count=0;
			for(int i=0; i<7; i++) {
			  for(int j=0; j<7; j++) {
				if(lotto[i] == lotto2[j]) {
					match_count++;				
				  }	
			  }
			}			
			String a;
			
			JLabel label = new JLabel();
			switch(match_count) {
			case 0 : label = new JLabel("공부하세요.");
					 label.setFont(new Font("serif", Font.BOLD,20));						
					 c.add(label);
					 label.setSize(420,530);					 
					 label.setLocation(450, 250*index);
					  break;
			case 1 : label = new JLabel("커피한잔");
					 label.setFont(new Font("serif", Font.BOLD,20));						
					 c.add(label);
					 label.setSize(420,530);
					 label.setLocation(450, 250*index);
					  break;
			case 2 : label = new JLabel("밥값");
					 label.setFont(new Font("serif", Font.BOLD,20));						
					 c.add(label);
					 label.setSize(420,530);
					 label.setLocation(450, 250*index);
					  break;
			case 3 : label = new JLabel("술값");
					 label.setFont(new Font("serif", Font.BOLD,20));						
					 c.add(label);
					 label.setSize(420,530);
					 label.setLocation(450, 250*index);
					  break;
			case 4 : label = new JLabel("차값");
					 label.setFont(new Font("serif", Font.BOLD,20));						
					 c.add(label);
					 label.setSize(420,530);
					 label.setLocation(450, 250*index);
					  break;	
			case 5 : label = new JLabel("집값");
					 label.setFont(new Font("serif", Font.BOLD,20));						
					 c.add(label);
					 label.setSize(420,530);
					 label.setLocation(450, 250*index);
					  break;
			case 6 : label = new JLabel("떠나요");
					 label.setFont(new Font("serif", Font.BOLD,20));						
					 c.add(label);
					 label.setSize(420,530);
					 label.setLocation(450, 250*index);
					  break;
			}
			 System.out.println(match_count);

			 ImageIcon no1 = new ImageIcon("images/fire1.gif");
			 la = new JLabel(no1);
			 c.add(la);
			 la.setSize(700, 800);
			 la.setLocation(20, 0);
			 
			 ImageIcon no2 = new ImageIcon("images/fire2.gif");
			 la = new JLabel(no2);
			 c.add(la);
			 la.setSize(700, 800);
			 la.setLocation(20, 0);
			 
			 ImageIcon no3 = new ImageIcon("images/fire3.gif");
			 la = new JLabel(no3);
			 c.add(la);
			 la.setSize(700, 800);
			 la.setLocation(20, 0);
			 
			  if(index<12)index= index+2;
			
		
			
		}
		
	}
	
	

	public static void main(String[] args) {	  	
		new LottoGenerator();
	   

	}

}
