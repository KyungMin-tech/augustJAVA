package quiz;

import java.util.Random;

public class B04_passExam {
	
	// 1. �л� 100���� JAVA������ �������� ������ �� �迭�� �����Ѵ� (0�� ~ 100 ��)
	
	// 2. 70�� �̻��� �л��� �հ��ڶ�� �� �� �հ��ڿ� ���հ��ڰ� ������� ����غ�����
	
	// 3. �հݷ��� ����غ�����
	public static void main(String[] args) {
		Random seed = new Random();
		
		int numOfStudent = 100;
		
		
		int[] javaScore = new int[numOfStudent];
		
		for(int i = 0; i < numOfStudent; ++i) 
			javaScore[i] = seed.nextInt(101);
		
		int passCount = 0;
		for (int score : javaScore)
			passCount = score >= 70 ? passCount + 1 : passCount;
			
		// printf���� %�� �׳� ����ϰ� ������ %%�� ����Ѵ�
		System.out.printf("��ü ������ : %d��\n�հ��� : %d��\n�հݷ� : %.2f\n",
				numOfStudent, passCount, 
				passCount / (double)numOfStudent*100);
			
		
				
	}
}