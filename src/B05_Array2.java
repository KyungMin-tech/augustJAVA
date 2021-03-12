import java.util.Arrays;

public class B05_Array2 {
	
	public static void main(String[] args) {
		
		// �迭���ο� �迭�� ����ϱ�
		
		// int[] : ��ҷ� int�� ������ �ִ� �迭
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		// int[][] : ��ҷ�int[]�� ������ �ִ� �迭
		// (���� �迭�� ���̴� �������� �ʾƵ� �ȴ�)
		int[][] num2 = {
				{1, 2, 3}, 
				{1, 2, 3, 4, 5}, 
				{9, 99, 999},
				num,
				num,
				num,
		}; // �� ��� ���̴�3
		
		// 2���� �迭�� �� ����ϱ�		
		System.out.println(num2[0][2]); // 0��° �迭�� 2��° ���
		System.out.println(num2[2][2]); // 2��° �迭�� 2��° ���
		System.out.println(num2[1]); // 1��° �迭�� �ּҰ�
		System.out.println(num2[1]. length); // 1��° �迭�� ����
		
		// int[][]�� int[]�� ��(�ּҰ�)�� ��ҷ� ������ �ִ� �迭�̴�
		System.out.println(num2[3]);
		System.out.println(num2[4]);
		System.out.println(num2[5]);
		
		// num2[3]��  num2[5]�� �����δ� ���� �迭�� ����Ű�� �ֱ� ������
		// �ϳ��� �����ص� ��� �����ȴ� ��ó�� ���δ�
		System.out.println(num2[3][5]);
		System.out.println(num2[5][5]);
		
		num2[3][5] = 555;
		System.out.println(num2[3][5]);
		System.out.println(num2[5][5]);
		
		
		// int[][][] : ��ҷ� int[][]�� ������ �ִ� �迭
		int[][][] num3 = {
				{{1, 2}, {2, 3}, {4, 5}},
				{{5, 5, 5}, {6, 6, 6}},
				num2, num2, num2, num2,
		};
		
		// ������ �迭�� ���� ������ ������ ���� �� ������
		// ���� �ſ��� ���̱��� ���� ���� ���� (���� �迭�� ���̴� ������ �����ϴ�)		
		String[][] stores = new String[3][1];
		
		// ���� ���̸� 1�� �����Ͽ� ������ �ƹ����Գ� ���� �� �ִ�
		stores[0] = new String[] {"����", "����", "��", "����", "����", "�ް�", "ġ��"};
		stores[1] = new String[] {"��", "���", "��", "������"};
		stores[2] = new String[] {"��", "�͸�", "����"};
		
		// �迭�� ������ 3���� �����ؼ� 3������ ����� �� ����
		// stores[3] = new String[] {};
		
		System.out.println(stores[0][6]);
		
				
		// n���� �迭�� n�� �ݺ������� ��� ���� �� �� �ִ�
		for (int i = 0; i < stores.length; ++i)
			System.out.println(Arrays.toString(stores[i]));
		
		for (int i = 0; i < stores.length; ++i) {
			
			for (int j = 0; j < stores.length; ++j) {
				
				System.out.printf("stores[%d][%d] : %s\n", i, j, stores[i][j]);
			}
		}
		
		
	}

}