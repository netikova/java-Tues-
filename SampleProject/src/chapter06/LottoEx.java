package chapter06;

import java.util.Calendar;
import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {
		int lotto[] = new int[7];
		Random rd = new Random();
		Calendar now = Calendar.getInstance();
		//추상클래스에서 객체를 만들대 이렇게 사용한다. 못만드는것이 아니다.
		//중복을 체크해서 프로그램을 리모델링해주세요
		for(int i=0; i<lotto.length; i++) {
		    //lotto[i] = (int)(Math.random()*45 + 1);
			lotto[i] = rd.nextInt(45); //0~45
		  for(int j=0; j<i;j++) {
			  if(lotto[i] == lotto[j]) {
				  i--;
			  }
		    }
//		  System.out.println(lotto[i]);
		  }
		  for(int lo : lotto) System.out.println(lo + ",");
		  System.out.println(now.get(Calendar.YEAR));
		  System.out.println(now.get(Calendar.MONTH)+1);
		  System.out.println(now.get(Calendar.DATE));
		  now.set(2022, 2, 20);
		  System.out.println(now.get(Calendar.YEAR));
		  System.out.println(now.get(Calendar.MONTH)+1);
		  System.out.println(now.get(Calendar.DATE));
		}

	}


