package chapter03;
//ÁßÃ¸¹Ýº¹
/*
 ***** 1) row, col
 ***** 2) 
 ***** 3)
 ***** 4) 
 ***** 5)
 */
/*
public class Ex3_4 {

	public static void main(String[] args) {
		for(int row=1; row<=5; row++)
		{
			for(int col = 1; col <= row; col++)
			System.out.print("*");
			
			System.out.println("");
		}
	}

}
*/

public class Ex3_4 {

	public static void main(String[] args) {
/*		for(int row=1; row<=5; row++)
		{
			for(int col = 5; col >= row; col--)
			System.out.print("*");
			
			System.out.println("");
		}
	}
*/
	for(int row=2; row<=9; row++)
	{
		for(int col = 1; col <= 9; col++)
			System.out.println(row + "X" + col + " = " + row*col);
		
		
		System.out.println("");
	}

	
}
	}


