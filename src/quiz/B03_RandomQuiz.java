package quiz;

public class B03_RandomQuiz {
	
	// 1000���� 9999 ������ ���� ���ڸ� 100�� �����ϰ�
	// ���Դ� ���� �� ����  ū ���� ���� ���� ���� ����غ�����
	public static void main(String[] args) {
		
		int startNum = 1000, endNum = 9999;		
		int max = startNum, min = endNum;
		
		for (int i = 0; i < 100; ++i) {
			int newNum = (int)(Math.random()*(endNum - startNum + 1)) + startNum;
			
			System.out.println(i + "\t: " + newNum);
			
			// �� �ִ밪 ���ϴ� ��
			//	- ���� �ִ� ���ں��� �� ū  ���� �ִٸ� �ִ밪�� ��ü�Ѵ�
			//	- �������� ���� ���ڰ� �ִ밪�̴�
			if (max < newNum) {
				max = newNum;
				System.out.println("�ִ밪�� " + max + "�� ����Ǿ����ϴ�.");				
			}
			
			// �� �ּҰ� ���ϴ� ��
			//	- ���� �ִ� ���ں��� �� ����  ���� �ִٸ� �ּҰ��� ��ü�Ѵ�
			if (min < newNum) {
				min = newNum;
				System.out.println("�ּҰ��� " + min + "�� ����Ǿ����ϴ�.");					
			}
		}		
		System.out.printf("�ִ밪 [%d] / �ּҰ� [%d]\n", max, min);
	}
	
	

	
}
