package quiz;


// �ڵ� import ����Ű : Ctrl + shift + O(���� O)
import java.util.Scanner;

public class A10_appleQuiz {

	// ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	// ����� ������ �Է¹����� �ʿ��� �ٱ����� ������ ����Ͽ�
	// ������ִ� ���α׷��� �ۼ��غ�����.
	
	public static void main(String[] args) {
		
		System.out.print("����� ������ �Է� >>> ");
		int appleNum = new Scanner(System.in).nextInt();
		int basketCapacity = 10;
		int basketNum1 = appleNum/basketCapacity + 1;
		int basketNum2 = appleNum/basketCapacity;
		
		// ����� ������ 10���� ������ �������� �����⸸ �ϸ� �ǰ�
		// ������ �������� ������ �ٱ��ϰ� �� �� �� �ʿ��ϴ�
		
		// �� �Է°� ����(validate)
		if (appleNum < 0) {
			System.out.println("����� ������ 0���� ���� �� �����ϴ�. " + "���α׷��� �����մϴ�.");
			System.exit(0); // ���α׷� ���� ����
		} else if ((appleNum > 0) && (appleNum %10 != 0)) {
			System.out.println("�ٱ����� ���� : " + basketNum1);
		} else if (appleNum %10 == 0) {
			System.out.println("�ٱ����� ���� : " + basketNum2);
		}
				
	}

}
