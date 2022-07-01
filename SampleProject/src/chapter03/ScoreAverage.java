package chapter03;

public class ScoreAverage {

	public static void main(String[] args) {
		double score[][]= {{3.3, 3.4}, //1학년 1, 2학기 평점
				           {3.5, 3.6}, //2학년 1, 2학기 평점
				           {3.7, 4.0}, //3학년 1 ,2학기 평점
			              {4.1, 4.2}}; //4학년 1, 2학기 평점
		
		
		double sum = 0;
		for(double[] grade : score)
			for(double semester : grade) sum += semester;
		
		int grade_cnt = score.length;
		int semester = score[0].length;
	    System.out.println("4년 전체 평점 평균은 " + sum/(grade_cnt * semester));
		

	}

}
