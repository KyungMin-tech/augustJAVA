package quiz;

import java.util.Random;
import java.util.Arrays;

public class B04_LottoQuiz {

	// int�� �迭�� �ߺ����� ���� 6���� ���� ����(1 ~45)�� �����ϰ� ����غ�����
	public static void main(String[] args) {
		Random seed = new Random();

		int[] lotto = new int[6];		
		
		for (int i = 0; i < lotto.length; ) {
			lotto[i] = seed.nextInt(45) +1;	
			
			boolean duple = false;			
			
			// i : ��� ���� ������ �ε���
			// j : ��� ���� ���ڹٷ� ������ �ݺ��� �ε���
			for (int j = 0; j < i; ++j) {
				if (lotto[i] == lotto[j]) {
					duple = true;
					break; // break�� ���ָ� �� �ʿ���  ������ �پ���
				}
			}
			
			if (!duple)
				++i;
		}
		
		// Arrays.toString() : �迭�� ����� ���� ���� ���� ���ڿ��� ��ȯ�ϱ�
		System.out.println("���� ��" + Arrays.toString(lotto));
		
		// Arrays.sort() : �迭�������� �� �ִ�
		// (��, �迭�� ���� ������ Ű�� �񱳰� ������ ��츸)
		// �����������θ�
		Arrays.sort(lotto);
		
		System.out.println("���� �� : " + Arrays.toString(lotto));
		
		// �� ���ڿ��� ũ�� �񱳰� �����ϴ� (ABC, �����ټ�)
		String[] animals = {"�ڳ���", "����", "��", "���걸", "����"};
		Arrays.sort(animals);
		System.out.println(Arrays.toString(animals));
			
	}
}
