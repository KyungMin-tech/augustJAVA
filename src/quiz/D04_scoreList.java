package quiz;

import java.util.ArrayList;

public class D04_scoreList {

	// ArrayList�� 0 ~ 100�� ������ ���� ������ 100�� �߰��� ��
	// ��� ���� / ���� / ����� ��� �غ����� 
	
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
		
		System.out.println("���� : " + total_score);
		System.out.println("��� : " + total_score / (double)len);
	}
	
}








