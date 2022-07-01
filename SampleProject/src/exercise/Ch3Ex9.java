package exercise;

public class Ch3Ex9 {

	public static void main(String[] args) {
		int num[][] = new int[4][4];	
		int row, col;
				
		
		//배열의 모든 원소를 0으로 초기화
		for(row=0; row<num.length; row++) 
			for(col=0; col<num[row].length; col++) 
		       num[row][col] = 0;
		
		int n=0;
		//임의의 행과 열을 10개 생성하고(중복제외) 거기에 1~10까지의 임의의 수를 채운다.
	    while(n < 10) {		
		row =(int)(Math.random()*4); //0~3까지의 정수 생성
	    col =(int)(Math.random()*4); //0~3까지의 정수 생성
	    if(num[row][col] != 0) continue; //해당 인덱스에 이미 값이 채워져 있다면
	     num[row][col] = (int)(Math.random()*10)+1;  //1~10 사이의 수를 채운다.
	     n++;   
		}
	    
	    //화면에 출력한다.
		for(row=0; row<num.length; row++) {
			for(col=0; col<num[row].length; col++) {				
		        System.out.print(num[row][col] + "\t");
			}
		     System.out.println();
		}
		

	}

}
