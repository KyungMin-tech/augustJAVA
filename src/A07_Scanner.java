// Scanner�� ����� ���� import�� �ʿ��ϴ�
import java.util.Scanner;

// JAVA���� �ٸ� ��Ű���� Ŭ������ ����ϱ� ���ؼ��� import�� �ʿ��ϴ�
//	- import ��Ű����. Ŭ������;
// import quiz.A05_information;

// JAVA���� �ٸ� ��Ű���� Ŭ������ ����ϱ� ���ؼ��� import�� �ʿ��ϴ�
//	- import ��Ű����.Ŭ������;
// import quiz.A05_information;

public class A07_Scanner {
	
	public static void main(String[] args) {		
			
		// A05_printQuiz.main(null);
		
		// Scanner 
		//	- �ܺο��� ���α׷����� �Է��� ������ ����ϴ� Ŭ����
		
		// 1. ����� ��ĳ�ʸ� ���� 
		//	 (�ַܼ� �Է��� ���� ���� System.in ������ �Ű������� �����Ѵ�)
		Scanner sc = new Scanner(System.in);
		
		// 2. ����ڿ��� �ȳ����� ������ش�
		System.out.print("input int type only > ");
		// System.out.print("input double type only > ");
		
		// 3. ���ϴ� Ÿ���� �Է��� ��ٸ��� 
		// (sc.nextInt()���� ������� �Է��� ��ٸ��� ���� ���α׷��� �����)
		int num = sc. nextInt();
		// double db1 = sc.nextDouble();
		// float flt = sc.nextFloat();
		// short srt = sc.nextShort();
		// String str = sc.nextLine(); // �� ��ü�� ���ڿ��� �о���δ�		
		
		
		// 4. ���� ���� ������� ����Ѵ�
		System.out.println("�Է¹��� ���� ' " + num +" '�Դϴ�.");
		System.out.println("�Է¹��� ���� ���� �ڸ� ���ڴ�  " + num % 10 +"�Դϴ�.");
		System.out.println("�Է¹��� ���� ���� �ڸ� ���ڴ� " + num %100 +"�Դϴ�.");
	}

}
