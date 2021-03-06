package quiz;

import java.util.ArrayList;

public class D04_scoreList {

	// ArrayList에 0 ~ 100점 사이의 랜덤 점수를 100개 추가한 뒤
	// 모든 점수 / 총합 / 평균을 출력 해보세요 
	
	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<>();
		final int len = 100;
		
		for (int i = 0; i < len; ++i)
			scores.add((int)(Math.random() * 101));
		
		int total_score = 0;
		
		for (int score : scores) {
			total_score += score;
			System.out.print(score + "/");
		}
		System.out.println();
		
		System.out.println("총합 : " + total_score);
		System.out.println("평균 : " + total_score / (double)len);
	}
	
}









