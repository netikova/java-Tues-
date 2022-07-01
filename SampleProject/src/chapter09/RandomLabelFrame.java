package chapter09;

import java.awt.*;

import javax.swing.*;

public class RandomLabelFrame extends JFrame{
	
	public RandomLabelFrame() {
		super("Random Labels"); //JFrame 생성자 중에서 String 을 파라미터로 갖는 생성자 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null); //배치관리자가 없는 컨테이너(절대좌표로 쓸거임)
		
		
		
		//label.setBounds(130,50,200,20);
		
		
		for(int i = 1; i <= 20; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			int x = (int)(Math.random()*200)+50; //50~250
			int y = (int)(Math.random()*200)+50; //50~250
			label.setLocation(x,y);
			label.setSize(10, 10);
			label.setOpaque(true); //라벨의 배경색상이 판넬 위에 보이도록
			label.setBackground(Color.blue);
			contentPane.add(label);
		}		
		setSize(300,300);
		setVisible(true);		
	}

	public static void main(String[] args) {
		new RandomLabelFrame();
		

	}

}
