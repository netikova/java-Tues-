package chapter03;

public class ScoreAverage {

	public static void main(String[] args) {
		double score[][]= {{3.3, 3.4}, //1�г� 1, 2�б� ����
				           {3.5, 3.6}, //2�г� 1, 2�б� ����
				           {3.7, 4.0}, //3�г� 1 ,2�б� ����
			              {4.1, 4.2}}; //4�г� 1, 2�б� ����
		
		
		double sum = 0;
		for(double[] grade : score)
			for(double semester : grade) sum += semester;
		
		int grade_cnt = score.length;
		int semester = score[0].length;
	    System.out.println("4�� ��ü ���� ����� " + sum/(grade_cnt * semester));
		

	}

}
