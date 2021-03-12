
public class A05_print {
	
	public static void main(String[] args) {
		// ��¿� �̿�Ǵ� �������� �޼���
		
		// println() : ���ϴ� ������ ����� �ڿ� ���� �ڵ����� �ٲ��ش�.
		//				(�� �ڿ� \n�� �ڵ����� �߰����ش�)
		// print() : ���� �ڵ����� �ٲ����� �ʴ´�.
		int apple = 10;
		System.out.print("��� : ");
		System.out.println(apple);		
		System.out.println(); // println()�� �ƹ��͵� ���� ������ ���� �ٲ۴�
		System.out.println(apple);
		// System.out.print(); // print()�� �ƹ��͵� ���� �� �� ����
		
		
		// printf() 
		// - ���Ĺ��ڸ� �̿��� ����Ѵ�
		// - printf()�� ���� �ڵ����� �ٲ����� �����Ƿ� \n�� ������ �۵��� ���� ����
		
		// # printf()�� �̿�Ǵ� ���� ���ڵ�
		// %d : ���� 
		// %f : �Ǽ�
		// %s : ���ڿ�
		// %c : ����
		// %o : 8���� ����
		//%x, %X : 16���� ����
		System.out.printf("%d�� %d�� %d���� ��/�޷� ȯ�� : %.2f\n", 2020, 8, 13, 1200.33);
		System.out.printf("%s���� �ſ����� '%c'����Դϴ�\n", "ȫ�浿", 'A');
		
		int num =13;
		
		System.out.printf("10���� %d�� 8������ %o, 16�����δ� %x�Դϴ�.\n", num, num, num);
		
		// # ���빮���� �ɼǵ�
		
		// %����d : ���ڸ�ŭ ĭ�� Ȯ���� �� ������ ����Ѵ�
		System.out.printf("���� ���� : %d��\n", 9);
		System.out.printf("���� ���� : %5d��\n", 9);
		System.out.printf("���� ���� : %10d��\n", 9);
		
		System.out.printf("���� ���� : %15d��\n", 9);
		
		// %-����d : ���ڸ�ŭ  ĭ�� Ȯ���� �� ���� ���� �����Ͽ� ����Ѵ�
		System.out.printf("%s : 10��\n", "����");
		System.out.printf("%-10s : 10��\n", "����");
		System.out.printf("%-15s : 10��\n", "����");
		System.out.printf("%-20s : 10��\n", "����");
		
		// %0����d : ���ڸ�ŭ ĭ�� Ȯ���� �� �� ĭ�� 0���� ä�� ����Ѵ�
		System.out.printf("2 x 1 = %05d\n", 2*1);
		System.out.printf("2 x 5 = %02d\n", 2*5);
		
		// %.����f : �Ҽ��� �Ʒ� �ڸ����� �����Ѵ�
		System.out.printf("��� ���� : %.3f\n", 99.87654321);
		
		// ������ �̿��� ���ϴ� ���ڿ��� ���� ���� �� �� �ִ�
		
		// String.format() : ������ �̿��� ���ϴ� ���ڿ��� ���� ������ �� �ִ�
		
		String format = "%d�� %d�� %d���� ��/�޷� ȯ�� : %.2f\n";
		String todayCurrency = String.format(format, 2020, 5, 13, 999.85);
		
		System.out.print(todayCurrency);
	}

}
