package quiz;


import java.util.Scanner;

public class A07_GuessAge {
	
	// ����ڷκ��� �¾ �⵵�� �Է¹����� 
	// �ѱ��� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ����� ������
	public static void main(String[] args) {
		int year = 2020;
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ �⵵�� �Է����ּ��� >>> ");
		int num = sc. nextInt();
		System.out.println("�ѱ��� ���̴� " + (year + 1 - num) +"�� �Դϴ�.");
		
		// �Է��� �̷��� ������ �� �ٿ� ���� ������ ��������
		// ������ ��ĳ�ʰ� ������ �������� �ʱ� ������ �ش� ��ĳ�ʸ� �ٽ� ����� �� ����
		int thisYear = 2020;
		
		System.out.print("�¾ �⵵? ");
		int birthYear = new Scanner(System.in).nextInt();
		
		System.out.printf("����� ���̴� %d�� �Դϴ�.\n", thisYear - birthYear +1);
		
	}

}
