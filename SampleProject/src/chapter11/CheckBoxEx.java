package chapter11;

import java.awt.*;
import javax.swing.*;


public class CheckBoxEx extends JFrame{
	public CheckBoxEx() {
		super("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
    	c.setLayout(new BorderLayout()); //왼쪽 정렬은 FlowLayout()은 안된다.
    	
    	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
    	ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
    	
    	JCheckBox apple = new JCheckBox("사과");
    	JCheckBox pear = new JCheckBox("배"); //선택된 상태
    	JCheckBox cherry = new JCheckBox("체리", cherryIcon, true);
    	cherry.setSelectedIcon(selectedCherryIcon);
    	
    	c.add(apple);c.add(pear);c.add(cherry);
    	
    	setSize(400,600);
    	setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();

	}

}
