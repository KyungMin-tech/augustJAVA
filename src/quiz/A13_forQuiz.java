package quiz;

public class A13_forQuiz {
	
	//  ����ڰ� ���ڸ� �Է��ϸ�
	//	1. 1���� �Է��� ���ڱ��� �� 3�� ����� ������ ���غ�����
	//	2. 1���� �Է��� ���ڱ��� �� 7�� ����� �� ���ִ��� ���غ�����
	//	3. 1���� �Է��� ���� �� 2 �Ǵ� 3�� ����� �ƴ� ������ ������ ���غ�����
	
	public static void main(String[] args) {
		
		int input = 100;
		
		int sum3 = 0;
		int count7 = 0;
		int sum23 = 0;
		
		
		for (int num = 1; num <= input; ++num) {
		// �� ����(sum)�� ���� ���� ���� ������Ű��
		//   ����(count)�� ���� ���� 1�� ������Ų�� 
			if (num % 3 == 0)
				sum3 += num;
			
			if (num % 7 == 0)
				count7 += 1;
			
			if (!(num % 2 == 0 || num % 3 ==0))
				sum23 += num;
		}
		
		System.out.printf("1���� %d������ ���� ��\n" 
				+ "3�� ����� ���� : %d\n" 
				+ "7�� �����  ���� : %d\n" 
				+ "2�Ǵ� 3�� ����� �ƴ� ���� ���� : %d\n",
				input, sum3, count7, sum23);
		
		}

}
