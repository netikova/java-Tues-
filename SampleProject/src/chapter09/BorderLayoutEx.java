package chapter09;

import java.awt.*;

import javax.swing.*;

public class BorderLayoutEx extends JFrame{
	
	public BorderLayoutEx() {
		super("BorderLayout Sample"); //JFrame 생성자 중에서 String 을 파라미터로 갖는 생성자 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setLayout(new BorderLayout(30, 20));//FlowLayout.LEFT 왼쪽부터 배치
		
		contentPane.add(new JButton("add"), BorderLayout.NORTH);
		contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
		contentPane.add(new JButton("mul"), BorderLayout.EAST);
		contentPane.add(new JButton("div"), BorderLayout.WEST);
		contentPane.add(new JButton("calculate"), BorderLayout.CENTER);
		
		setSize(300,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		BorderLayoutEx ex = new BorderLayoutEx();
		

	}

}
