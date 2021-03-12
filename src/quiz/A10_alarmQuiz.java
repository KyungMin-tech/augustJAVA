package quiz;

import java.util.Scanner;

public class A10_alarmQuiz {
	
	// �ǳ� �����ϴ� ������� ����, ����ڰ� �˶��� �����ϸ�
	// �����ϰ��� �� �ð����� 45�� �̸� �ð����� �˶��� �������ִ� 
	// ���α׷��� ������� �Ѵ�.
	
	// �ð��� �Է��ϸ�, �� �ð����� 45�� �̸� �ð��� ����غ�����
	// �� �ð��� 0 ~ 23��, ���� 0 ~ 59�� ���� �Է� ����
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int earlier = 20;
		
		System.out.print("�ð�, �� �Է� > ");		
		int hour = sc.nextInt();
		int minute = sc.nextInt();

		if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
			System.out.println("�ùٸ��� ���� �ð��Դϴ�. �˶� ������ ����մϴ�.");
			System.exit(0);
		}
		
		System.out.printf("�˶� (1) : %d:%d\n", hour, minute);
		
		if (minute < earlier) {			
			// ���� ������
			//	- �� ? �� : ����;
			hour =  hour == 0 ? 23 : hour - 1;			
			minute = minute - earlier + 60;			
			
		} else {
			minute = minute - earlier;
		}
		
		System.out.printf("�˶� (2) : %d:%d\n", hour, minute);
		
		
//		Ctrl + / : Eclipse �ּ�ó�� ����Ű
//		System.out.println("��ĳ�ʿ� �����ִ� �����͵� : " + sc.nextLine();
		
//		int hour = new Scanner(System.in).nextInt();
//		int minute = new Scanner(System.in).nextInt();
		
		
		
	}


}
