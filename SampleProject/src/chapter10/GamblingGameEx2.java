import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamblingGameEx2 extends JFrame{
	Color c=new Color(139, 0, 255);
	JLabel num1,num2,num3;
	JLabel text;
	int x1=(int)(Math.random()*5);
	int x2=(int)(Math.random()*5);
	int x3=(int)(Math.random()*5);
	
	Font f=new Font("arain", Font.ITALIC, 60);//글자 폰트, 크기 설정
	
	public GamblingGameEx2(){
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GamePanel1");
		setLayout(null);
		addKeyListener(new MyKeyAdapter());//엔터키 인식 위해
		
		num1=new JLabel(Integer.toString(x1));//첫번째 네모
		num1.setOpaque(true);//배경색 투명하지 않게 해주기
		num1.setBounds(100, 80, 100, 60);//라벨 위치와 크기 설정
		num1.setBackground(c);//배경색 지정
		num1.setForeground(Color.yellow);//글자 색 지정
		num1.setHorizontalAlignment(JLabel.CENTER);
		num1.setFont(f);
		
		num2=new JLabel(Integer.toString(x2));//두번째 네모
		num2.setOpaque(true);//배경색 투명하지 않게 해주기
		num2.setBounds(250, 80, 100, 60);//라벨 위치와 크기 설정
		num2.setBackground(c);//배경색 지정
		num2.setForeground(Color.yellow);//글자 색 지정
		num2.setHorizontalAlignment(JLabel.CENTER);
		num2.setFont(f);
		
		num3=new JLabel(Integer.toString(x3));//세번째 네모
		num3.setOpaque(true);//배경색 투명하지 않게 해주기
		num3.setBounds(400, 80, 100, 60);//라벨 위치와 크기 설정
		num3.setBackground(c);//배경색 지정
		num3.setForeground(Color.yellow);//글자 색 지정
		num3.setHorizontalAlignment(JLabel.CENTER);
		num3.setFont(f);
		
		text=new JLabel("시작합니다.");
		text.setBounds(250, 200, 100, 100);
		
		add(num1);
		add(num2);
		add(num3);
		add(text);
		
		setVisible(true);//지금껏 한 작업 창에 띄우게 함
		
		requestFocus();
	}
	

	public static void main(String[] args) {
	new GamblingGameEx2();
	}
	
	class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar()=='\n') {//엔터 치면
				x1=(int)(Math.random()*5);//0~4까지의 정수 랜덤으로 지정
				x2=(int)(Math.random()*5);
				x3=(int)(Math.random()*5);
				num1.setText(Integer.toString(x1));//랜덤으로 지정한 정수 Label에 세팅
				num2.setText(Integer.toString(x2));
				num3.setText(Integer.toString(x3));
				if(x1==x2&&x1==x3) {
					text.setText("축하합니다!");
				}else {
					text.setText("아쉽군요");
				}
			}
		}
	}

}
