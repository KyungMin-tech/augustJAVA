
public class B07_function2 {
	
	// �Լ��� ����(return)
	//	- �Լ� ������ ����� �Լ��� ȣ���� ���� �����ִ� �� 
	//	- �Լ� �̸� �տ� ���� ����� Ÿ���� ����� �Ѵ�
	//	- ���� Ÿ���� void�� �Լ��� ������  ���� �ʴ´ٴ� ���̴�
	
	// �� �ѱ��� ���̸� ȭ�鿡 ������ִ� �Լ� (���ϰ��� ����)
	public static void printKoreanAge (int thisYear, int birthYear) {
		System.out.printf("�ѱ��� ���� : %d��\n", thisYear - birthYear + 1);			
	}
	
	// �� �� �Լ��� ȣ���ϸ� �ѱ� ���̸� ����ѵ� �����ִ� �Լ� (����Ÿ�� int)
	public static int getKoreanAge (int thisYear, int birthYear) {
		int age = thisYear - birthYear + 1;
		
		// return
		//	- ������ ������ �Լ��� ��� �����Ѵ�.
		//	- �Լ��� �����ϸ鼭 �� �Լ��� ȣ���� ���� ���ϴ� ���� ��ȯ�Ѵ�.
		//	- ��ȯ�� ���� Ÿ���� �Լ��� �տ� ���� ���� Ÿ�԰� �ݵ�� ��ġ�ؾ��Ѵ�.
		return age;
	}
	
	// ��������1. ���ĺ��� �����ϸ� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ�
	//			�������ش� �Լ��� ����� ����� �׽�Ʈ �غ�����
	public static String chageCase (String text) {
		// ����� ������ ���ڿ��� �̸� �����صΰ� ��ȯ���� ���� ���Ѱ��� ���
		String result = "";
		
		for (int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z')
				result += (char)(ch - 32);
			else if (ch >= 'A' && ch <= 'Z')
				result += (char)(ch + 32);
			else
				result += ch;
		}
		return result;

	}
	
	// ��������2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴѸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean checkDivBy3 (int num) {
		// ����Ÿ���� boolean�� �Լ��� ���������� ����� �����ϸ� ���ϴ�
		return num % 3 == 0;
	}
	
	// ��������3. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean checkAlpha (char ch) {		
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	}
	
	// ��������4. ���ڸ� �� �� �����ϸ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	public static String checkEvenOdd(int num) {
		return num % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
	}
	
	
	
	public static void main(String[] args) {		
		// ���� Ÿ���� �ִ� �Լ��� ���� �޾Ƽ� ����ؾ� �Ѵ�
		int age = getKoreanAge(2020, 2010);
		
		// ���� Ÿ���� void�� �Լ��� �ƹ��� ���� ��ȯ���� �ʴ´�
		// age = printKoreanAge(2020, 2020);
		
		System.out.println("�Լ� ���� ��� : "  + age);
	}

}
