package chapter13;

import java.awt.*;
import javax.swing.*;

class RunnableTimer implements Runnable{
	int n = 0;
	JLabel timerLabel;

	public RunnableTimer(JLabel timerLabel) {
      this.timerLabel = timerLabel;
      
		
	}
	//Thread의 run 메소드를 오버라이딩, 스레드 작성코드
    @Override
    public void run() {
    	while(true) {
    		timerLabel.setText(Integer.toString(n));
    		n++;
    		try {Thread.sleep(1000);} //sleep은 항상 예외처리를 해준다. sleep이 돌아가지 않는 상황이 있기 때문이다.
    		catch(InterruptedException e) {return;}  //null을 실행한다.
    	}   		
    }   
}

public class RunableTimerEx extends JFrame{
	public RunableTimerEx() {
		setTitle("스레드 timer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		RunnableTimer runnable = new RunnableTimer(timerLabel);	
		Thread th = new Thread(runnable);
		
		setSize(300, 170);
		setVisible(true);
		th.start();
	}
	public static void main(String[] args) {
		RunableTimerEx th = new RunableTimerEx();
		

	}
}