
public class A12_operateor03 {
	
	public static void main(String[] args) {
		
		// # ���Կ���
		//	- ���ʿ� �ִ� ������ �������� ���� �ִ´�
		//	- �����ϸ� ������ ���� ����ִ� ���� �������
		//	- ���Կ����� ������ �켱������ ���� ���� ������ 
		//	    �������� ����� ��� ���� �� ���Եȴ�
		
		int a = 10 + 15;
		boolean b = 10 < 15;
		
		
		// ���Կ����� ���ؼ� ���� ������Ű��
		int c =10;
		c = c + 20; // ������ c�� ���� 30�� �ȴ�, �ȿ� �ִ� ���� �����Ѵ�
		
		// ���Կ����� ����� �ٷ� ����ϱ�
		System.out.println("c = c + 20�� ��� : " + (c = c + 20)); // �̷���� ���ʰ��� 50
		
		// # ������Ű�� ���Կ����� ����ؼ� ����ϱ� (���� ���Կ���)
		int num = 10;
		num += 5; // num = num + 5�� �ٿ��� ǥ���Ѱ�
		num -= 8;
		num *= 2;
		num /= 3;
		num %= 16; // �̰� �� ������ ����
		System.out.println("num�� ������ : " + num);
		
		// # ���׿���
		num = 10;
		num++; // num = num + 1��  �ٿ��� ǥ���� ��
		System.out.println("num++ : " + num);
		num--; // num = num - 1��  �ٿ��� ǥ���� ��
		System.out.println("num-- : " + num);
		
		// # ���� �����ڴ� ��ġ�� ���� ����� �޶�����
		num = 10;
		System.out.println("num++ ��� : " + num++);
		System.out.println(num);
		
		num = 10;
		System.out.println("++num ��� : " + ++num);
		System.out.println(num);
		
		
		// # ���׿���
		//	- ��? �� : �ƴϿ�;
		String answer = num % 2 == 0 ?
				String.format("%d�� ¦���Դϴ�.", num) : String.format("%d�� Ȧ���Դϴ�.", num);
				
		System.out.println(answer);
		
		int apple =15;
		int size = 10;
		
		int basket = apple % size >0 ? apple / size + 1 : apple/size;
		System.out.printf(" ����� %d���̰� �ٱ����� ũ�Ⱑ %d �� �� \n" + "�ʿ��� �ٱ��� ������ %d�� �Դϴ�\n", apple, size, basket);
			
	}

}
