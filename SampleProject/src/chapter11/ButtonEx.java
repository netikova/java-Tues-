package chapter11;

import java.awt.*;
import javax.swing.*;


public class ButtonEx extends JFrame {

	public ButtonEx() {
		super("버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
    	c.setLayout(new BorderLayout()); //왼쪽 정렬은 FlowLayout()은 안된다.
    	
    	ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
    	ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
    	ImageIcon pressendIcon = new ImageIcon("images/pressendIcon.gif");
    	
    	JButton btn = new JButton("call~", normalIcon);
    	btn.setHorizontalAlignment(SwingConstants.LEFT);    	
    	btn.setVerticalAlignment(SwingConstants.BOTTOM);
    	btn.setPressedIcon(pressendIcon);
    	btn.setRolloverIcon(rolloverIcon);
    	
    	
    	c.add(btn);
    	
    	setSize(400,400);
    	setVisible(true);
	}
	public static void main(String[] args) {
          new ButtonEx();		

	}

}
