package quiz;

import java.util.Scanner;

public class B02_Fibonacci {
	
	// ����ڷκ��� ���ڸ� �Է¹ް� �ش� ��°�� �Ǻ���ġ ���� ���غ�����
	
	// �� �Ǻ���ġ ���� (���� �� ���� ���ϸ� ���� ���ڰ� ������ ����)
	// 1 1 2 3 5 8 13 21 34 55 ... 
	public static void main(String[] args) {
		
		
		System.out.print("���ڸ� �Է� > ");		
		int user = new Scanner(System.in).nextInt();	
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		for (int i = 0; i < user; ++i) {
			if (i == 0)
				System.out.println(1);
			else if (i == 1) {
				System.out.println(1);
			} else {
				num3 = num1 + num2;
				System.out.println(num3);
				
				num1 = num2;
				num2 = num3;
			}
		}
		
	}		

}
