package chapter09;


import java.awt.*;
import java.awt.event.*;

//3키를 클릭됫을때 수식입력 textfield에 new text로 들어가는 것
//계산결과가 textfield2번에 결과값이 나오게 한다.
//+를 누르면 계산결과에 합산결과를 리턴한다.
//ce버튼을 누르면 초기화
import javax.swing.*;
public class CalculatorFrame extends JFrame{
	
      public CalculatorFrame() {
		super("계산기 프로그램"); //JFrame 생성자 중에서 String 을 파라미터로 갖는 생성자 호출
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();	
		
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new NorthPanel(), BorderLayout.NORTH);	
		setSize(300,300);
		setVisible(true);

	}
      public static void main(String[] args) {
  		new CalculatorFrame();
  	}
}

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		if(button.getText().equals("CE"))
			button.setText("종료");
		else
			button.setText("CE");
	}
	
}
class SouthPanel extends JPanel{
	public SouthPanel() {
		setBackground(Color.YELLOW);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel("계산결과"));
		add(new JTextField(15));
	}
}

class CenterPanel extends JPanel{
	public CenterPanel() {
		setLayout(new GridLayout(4,4,5,5));
		setBackground(Color.WHITE);
		for(int i=0; i<=9; i++) {
			JButton button = new JButton(Integer.toString(i));
			add(button);
		}
		
		JButton delete_button = new JButton("CE");
		add(delete_button);
		add(new JButton("계산"));
		
		MyActionListener action = new MyActionListener();
		delete_button.addActionListener(action);
//		delete_button.addActionListener(new MyActionListener());
		
		JButton buttons[] = {new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/")};
		
		for(int i=0; i<buttons.length; i++) {
			buttons[i].setBackground(Color.CYAN);
			add(buttons[i]);
		}
		
  }
}
class NorthPanel extends JPanel{
	public NorthPanel() {
	setBackground(Color.LIGHT_GRAY);
	setOpaque(true);
	setLayout(new FlowLayout());
	add(new JLabel("수식입력"));
	add(new JTextField(16));
	}
}
