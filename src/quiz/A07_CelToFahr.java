package quiz;

import java.util.Scanner;

public class A07_CelToFahr {
	
	// ����ڷκ��� ���� �µ��� �Է¹����� 
	// ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ����� ������
	// (��ȯ ������ ���ۿ��� ã�ƺ�����, ����� �Ҽ�  ù° �ڸ�����)
	public static void main(String[] args) {
		
		System.out.print("���� �µ��� �Է����ּ��� >>> ");
		double cel = new Scanner(System.in).nextDouble();
		
		// (27��C �� 9/5) + 32 = 80.6��F
		
		System.out.printf("���� %.1f��C�� ȭ�� %.1f���Դϴ�", cel, cel * 9/5 + 32);

	}

}
