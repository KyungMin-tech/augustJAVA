

public class B06_function {
	
	// ���� (variable)
	//	- ���� �̸� �����صΰ� ���Ҷ����� ���� ���� ��
	
	// �Լ� (function)
	//	- ����� �̸� ������ �ΰ� ���߿� ���Ҷ����� ������ ����ϴ� ��
	//	- ������ ���� ��ɾ���� �̸��� �ٿ� ���� �װ��� �ϳ��� ������� ���� �ϴ� ��
	//	- ���߿� �����ϰ� �� ����� �̸� ���������ν� �۾��� ȿ���� ���� �� �ִ�
	
	// # �Լ� �����ε�	
	//	- JAVA������ �Ȱ��� �̸��� �Լ��� ������ ����� �� �ִ�
	//	- �Ű������� ���� Ȥ�� Ÿ���� �ٸ��� ������ �����ϱ� ������
	//	- ���� �̸��� ����ص� ������ �߻����� �ʴ´�
	public static void printRabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >��");	
	}
	
	// �Լ����� ���ڸ� ���޹޴� ������ �Ű�������� �θ���
	public static void printRabbit(String message) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >��");	
		System.out.println("Rabbit : " + message);
	}
	public static void printRabbit(String message, String item) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.printf("(  >%s\n", item);	
		System.out.println("Rabbit : " + message);		
	}
	
	// �̹� �Ű����� 1���� String�� ����ϴ� �����ε��� �����ϹǷ� ����� �� ����
//	public static void printRabbit(String item) {
//		System.out.println(" /)/)");
//		System.out.println("(  ..)");
//		System.out.printf("(  >%s\n", item);			
//	}
	
	// �������� : ���ؿ� �¾ �ظ� �Ű������� �ѱ��
	//			�ѱ��� ���̸� ������ִ� �Լ��� ����� ������
	public static void printKoreanAge (int thisYear, int birthYear) {
		System.out.printf("�ѱ��� ���� : %d��\n", thisYear - birthYear + 1);			
	}
	
	// ��������2 : ���� �ϳ��� �Ű������� �����ϸ� 
	//			�ش� ������ �ؿ� 2���� �Ϸ� �� �ִ��� 
	//			�Ǻ����ִ� �Լ��� ����� ���� �غ�����
	public static void printLeapYear (int leapYear) {
		if (leapYear % 400 == 0 || 
				(leapYear % 4 == 0 && leapYear % 100 != 0)) {
			System.out.printf("%d���� �����Դϴ�\n", leapYear);			
		} else {
			System.out.printf("%d���� ������ �ƴմϴ�\n", leapYear);			
		}
	}
	
	public static void main(String[] args) {
		String str = "I'm your father";
		
		// �Լ��� ����ϱ� �����Լ��� �����ϴ� ���� ���ڶ�� �θ���
		printRabbit(str);
		printRabbit("I like ����ݸ�", "��");
		
		// built-in function : �� ���� ������� ����� ���� �Լ�
		// System.out.println("Hello, world!");
		
		printKoreanAge(2020,1993);
		printKoreanAge(2021,1990);
		printKoreanAge(2030,1980);
		
		printLeapYear(2020);
		printLeapYear(2021);		
		
	}

}
