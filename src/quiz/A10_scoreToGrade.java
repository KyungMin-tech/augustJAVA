
package quiz;

import java.util.Scanner;

public class A10_scoreToGrade {
	
	// ������ �Է¹����� �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����
	
	// 90�� �̻�	: A
	// 80�� �̻�	: B
	// 70�� �̻�	: C
	// 60�� �̻�	: D
	// 50�� �̻�	: E
	// �� ��		: F
	
	// �� ������ 0������ 100������ �ֽ��ϴ�
public static void main(String[] args) {
		
		System.out.print("���� > ");
		int score = new Scanner(System.in).nextInt();
		
		// �� �Է°� ���� - ����ڰ� �Է��� ���� �׻� �����ؾ� �Ѵ�
		if (score < 0 || score > 100) {
			System.out.println("�߸��� ���� �Է��ϼż� ������ 0��ó�� �ϰڽ��ϴ�.");
			score = 0;
		}		
		
		// �� {}������ ����� �� �� ���̶�� {}�� ������ �� �ִ�
		String msg = "F���";
		
		if (score >= 90) 
			msg = "A���";
		else if (score >= 80) 
			msg = "B���";
		else if (score >= 70)
			msg = "C���";
		else if (score >= 60)
			msg = "D���";
				
		System.out.printf("���� %d������ %s�Դϴ�.\n", score, msg);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �Է¶� >>> ");
//		int num = sc. nextInt();
//		
//		if (num > 100 || num < 0) {
//			System.out.println("�߸� �Է��߽��ϴ�");
//		} else if ((100 >= num) && (num >= 90)) {
//			System.out.println("A");
//		} else if ((90 > num) && (num >= 80)) {
//			System.out.println("B");
//		} else if ((80 > num) && (num >= 70)) {
//			System.out.println("C");
//		} else if ((70 > num) && (num >= 60)) {
//			System.out.println("D");
//		} else if ((60 > num) && (num >= 50)) {
//			System.out.println("E");
//		} else if ((50 > num) && (num >= 0)) {
//			System.out.println("F");
//		} 
		
	}
		

}
