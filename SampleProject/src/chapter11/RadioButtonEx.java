package chapter11;

import java.awt.*;
import javax.swing.*;


public class RadioButtonEx extends JFrame{
	public RadioButtonEx() {
		super("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
    	c.setLayout(new FlowLayout()); //왼쪽 정렬은 FlowLayout()은 안된다.
    	
    	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
    	ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
    	
    	ButtonGroup group = new ButtonGroup();  //그룹화를 안시켜주면 각자 다 선택이 된다.
    	JRadioButton apple = new JRadioButton("사과");
    	JRadioButton pear = new JRadioButton("배"); //선택된 상태
    	JRadioButton cherry = new JRadioButton("체리", cherryIcon, true);
    	cherry.setSelectedIcon(selectedCherryIcon);
    	
    	group.add(apple); 
    	group.add(pear);
    	group.add(cherry);
    	
    	c.add(apple);c.add(pear);c.add(cherry);
    	
    	setSize(400,600);
    	setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonEx();

	}

}
