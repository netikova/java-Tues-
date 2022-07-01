package chapter09;

import java.awt.*;

import javax.swing.*;

public class ContentPaneEx extends JFrame{
	
	public ContentPaneEx() {
		super("ContentPane과 JFrame"); //JFrame 생성자 중에서 String 을 파라미터로 갖는 생성자 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		JFrame Jframe = new JFrame(); //굳이 객체 생성안하고 사용한다.
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 10,10));//FlowLayout.LEFT 왼쪽부터 배치
		
//		contentPane.add(new JButton("OK")); //쓸일이 별로 없을때 객체에 굳이 이름을 붙혀주지않고 바로 활용한다.
//		contentPane.add(new JButton("Cancel"));
//		contentPane.add(new JButton("Ignore"));
		
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("calculate"));
		
		setSize(300,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		ContentPaneEx ex = new ContentPaneEx();
		

	}

}
