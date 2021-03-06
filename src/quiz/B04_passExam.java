package quiz;

import java.util.Random;

public class B04_passExam {
	
	// 1. 학생 100명의 JAVA정수를 랜덤으로 생성한 뒤 배열에 저장한다 (0점 ~ 100 점)
	
	// 2. 70점 이상인 학생은 합격자라고 할 때 합격자와 불합격자가 몇명인지 출력해보세요
	
	// 3. 합격률도 출력해보세요
	public static void main(String[] args) {
		Random seed = new Random();
		
		int numOfStudent = 100;
		
		
		int[] javaScore = new int[numOfStudent];
		
		for(int i = 0; i < numOfStudent; ++i) 
			javaScore[i] = seed.nextInt(101);
		
		int passCount = 0;
		for (int score : javaScore)
			passCount = score >= 70 ? passCount + 1 : passCount;
			
		// printf에서 %를 그냥 출력하고 싶으면 %%를 사용한다
		System.out.printf("전체 응시자 : %d명\n합격자 : %d명\n합격률 : %.2f\n",
				numOfStudent, passCount, 
				passCount / (double)numOfStudent*100);
			
		
				
	}
}
