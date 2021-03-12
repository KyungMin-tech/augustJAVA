import java.util.Scanner;

public class A14_breakContinue {
	
	public static void main(String[] args) {
		
		// break, continue
		//	- �ݺ��� ���ο����� ����� �� �ִ� (break�� switch������ ����)
		//	- break : ���� �ִ� �ݺ����� �ٷ� Ż���Ѵ�
		//	- continue : ���� �ִ� �ݸ��� 1ȸ ��ŵ�Ѵ� (������ �ݺ����� �Ѿ��)
		
		for (int i = 0; i < 10; ++i) {
			// i���� ¦�� �� �� continue;
			if (i % 2 == 0)
				continue;
			
			System.out.print(i + " ");
			
			if (i == 7)
				break;
		}
		System.out.println();
		
		
		// # for ���� ���ѷ���
		//	- ������ ���� ������ true�� �����Ѵ�
		Scanner sc = new Scanner(System.in);
		int num = 0;
		for (;;) {
			System.out.print("77�� �Է��ؾ� Ż���� �� �ֽ��ϴ�> ");
			num = sc.nextInt();
			
			if (num == 77)
				break;
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}