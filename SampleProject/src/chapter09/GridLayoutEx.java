package chapter09;

import java.awt.*;

import javax.swing.*;

public class GridLayoutEx extends JFrame{
	
	public GridLayoutEx() {
		super("GridLayout Sample"); //JFrame 생성자 중에서 String 을 파라미터로 갖는 생성자 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		GridLayout layout = new GridLayout(4,2);
		layout.setVgap(5);
		
		contentPane.setLayout(layout);
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학번"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("과목"));
		contentPane.add(new JTextField(""));
		
		setSize(300,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new GridLayoutEx();
		

	}

}
