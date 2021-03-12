package quiz;

import java.util.Scanner;

public class B02_Prime {

	// ����ڷκ��� ���ڸ� �Է��� �ް� 1���� �Է��Ѽ��� ���̿� �����Ѵ�
	// �Ҽ��� ��� ����غ�����

	// 1. ��� ����� �� �ٽ� �Է¹޵��� �����
	// 2. ����ڰ� ���� 0���ϸ� �Է��ϸ� ���α׷� �����ϱ�

	// �� �Ҽ� : ����� 1�� �ڱ� �ڽŹۿ� ���� ����
	// �� ��� : � ���ڸ� ������ �� ������ �������� ��
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���ڸ� �Է�>> ");
			int user =sc.nextInt();
			
			if (user <= 0)
				break;
			
			// �Ҽ� ���ϱ� (������ �Է��� ���ڱ���)
			for(int i = 2; i <= user; ++i) {
				
				// i : �̹��� �Ҽ����� üũ�غ� ����
				// j : i���� �ݺ��ϸ鼭 ������ �غ� ����
				boolean prime =true;
				// Math.sqrt() : �������� ���ϴ� �Լ�
				// Math.pow() : ������ ���ϴ� �Լ�
				for (int j = 2; j < Math.sqrt(i); ++j) {
					if (i % j == 0)
						prime = false;
						break;
				}
				if (prime)
					System.out.printf("%d ", i);
			}
			System.out.println();

		}
		System.out.println("���α׷��� �����մϴ�");

	}
}
