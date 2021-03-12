import java.util.Scanner;

public class A11_switch {

	public static void main(String[] args) {

		// switch-case��
		// - ()���� ���� ����� ���� �ش��ϴ� case�� �����Ѵ�
		// - if������ �Ϻ��ϰ� ��ü�� �� �ִ�

		Scanner sc = new Scanner(System.in);

		System.out.print("1. ����\n2. ����\n3. ����\n4. ����\n> ");
		int select = sc.nextInt();

		// ()���� ���� ���� �ش��ϴ� case���� �����Ѵ�.
		// �� break�� ������� ������ break�� ���� �� ���� �ؿ� �ִ� ��� case�� �����Ѵ�.
		switch (select) {
		case 1:
			System.out.println("����ڰ� ������ �����߽��ϴ�.");
			// break;
		case 2:
			System.out.println("����ڰ� ���Ḧ �����߽��ϴ�.");
			// break;
		case 3:
			System.out.println("����ڰ� ���縦 �����߽��ϴ�.");
			break;
		case 4:
			System.out.println("����ڰ� ������ �����߽��ϴ�.");
			break;
		default:
			// �ش��ϴ� case�� �������� �ʴ� ��� default�� �����Ѵ�
			System.out.println("�߸� �����ϼ̽��ϴ�.");
			break;
		}

		// switch-case������ �پ��� Ÿ���� ����� �� �ִ�
		String cmd = new String("bye");

//		if (cmd.equals("hello"))
//			System.out.println("�ȳ��ϼ���~");
//		else if (cmd.equals("bye"))
//			System.out.println("�ȳ���������~");

		// switch�� �˾Ƽ� �ش� ��ü�� equals�� ȣ���� ���Ѵ�
		switch (cmd) {
		case "hello":
			System.out.println("�ȳ��ϼ���~");
			break;
		case "bye":
			System.out.println("�ȳ���������~");
			break;
		}
	}

}


