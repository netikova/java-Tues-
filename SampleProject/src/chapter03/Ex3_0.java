package chapter03;
//1~100������ �������� �ݺ������ ¥����

public class Ex3_0 {

	public static void main(String[] args) {
		int num, sum=0;

		
		//1. while��
//		num = 1;
//		while(num <= 100) {
//			sum+=num;
//			num++;
//		}
		//2. do-while��
//		do {
//			sum+=num;
//			num++;
//		}while(num <= 100);
		//3. for��
		for(num = 1; num <= 100; num++)
		{
			sum+=num;
		}
		//4. ���� ��¹�
		System.out.println("������ = " + sum);

	}

}
