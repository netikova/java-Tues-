package exercise;

public class Ch3Ex10 {

	public static void main(String[] args) {
		int num[][] = new int[4][4];		
		
		for(int row=0; row<num.length; row++) {
			for(int col=0; col<num[row].length; col++) {
				num[row][col]=(int)(Math.random()*10)+1;
//		        System.out.print(num[row][col] + "\t");
			}
		     System.out.println();
		}
		
//		for(int row=0; row<4; row++) {
//			for(int col=0; col<4; col++) {
//				System.out.print(num[row][col]); 
//			}
//			System.out.println();
//		}
	}

}
