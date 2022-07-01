package chapter11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{

	public JComponentEx(){	
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		
	
		
		
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton("getX(),getY()");
		
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.magenta);
		b1.setFont(new Font("Arial", Font.PLAIN,60));
	 	
	    b2.setEnabled(false); //버튼 비활성화
	    b3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		JButton b = (JButton)e.getSource();
	    		JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
	    		frame.setTitle(b.getX() + "," + b.getY());
	    	}
	    });
	    
	    c.add(b1); c.add(b2); c:add(b3);
	    setSize(260,200);
	    setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new JComponentEx();

	}

}
