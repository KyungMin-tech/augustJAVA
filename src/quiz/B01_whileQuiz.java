package quiz;

public class B01_whileQuiz {
	
	// while���� �̿��Ͽ�
	
	// 1. 200���� 37���� ����غ�����
	
	// 2. 1���� 1386���� �� 7�� ����� ��� ����غ�����
	//	  (���η� ����ϵ�, 5�� ����ҋ����� �ٹٲٱ�, �� �����)
	
	// 3. (1) + (1 + 2)  + (1 + 2 + 3) + ... (1 + 2 + ... + 10)
	// �� ����� ���غ�����
	
	public static void main(String[] args) {
		
		int num = 200;
		while (num > 36) { 			
			System.out.print(num-- + " ");			
		}
		System.out.println();
		
		num = 1;
		
		while (num < 1387) {
			if(num % 7 == 0)
				System.out.print(num + "\t");
				if (num % 35 == 0)
					System.out.println();
				++num;
			
		}
		System.out.println();
		
		num = 1;
		int sum = 0;
		int sum2 = 0;
		while (num < 11) {
			sum += num++;
			sum2 += sum;
		}
		System.out.println(sum2);
		
		num = 1;
		
		while (num < 11) {
//			System.out.println(num);
			
			int num2 = 1;
			sum = 0;
			while(num2 <= num) {
				System.out.print(num2 + " ");				
				sum += num2++;
			}
			System.out.println(": " + sum);
			
			++num;
		}
			
			
		
	}

}
