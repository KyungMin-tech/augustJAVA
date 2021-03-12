
public class B04_Array {
	
	public static void main(String[] args) {
		
		// �迭
		//	- ���� Ÿ���� ������ �ѹ��� ������ �����ϰ� ������ ����Ѵ�
		//	- �� ó�� �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����
		//	- ������ �ٸ��� �ʱ�ȭ�� �ڵ�����  �Ǿ��ִ�
		
		// int�� ���� 100���� ����
		int[] num = new int[100]; 
		// num[0] ~ num[99]���� int�� ������ 100�� �����ȴ�
		// ���� ��ȣ�� index��� �Ѵ�
		
		// ������ �迭�� �� �濡 ���� ������ �� �ִ�
		num[0] = 9;
		num[1] = 123;
		num[2] = 456;
		
		// �� 100���� �����ϸ� 99������ �ִ� (n���� �����ϸ� n-1������� �ִ�)
		// num[100] = 10;
		
		
		// �� �濡 ����� ���� ���Ҷ� ������ ����� �� �ִ�.
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		// �迭�� ���� �ڵ����� �ʱ�ȭ �Ǿ��ִ� (������ �ʱ�ȭ ���� ������ ������ ������)
		// ���� : 0
		// �Ǽ� : 0.0
		// boolean : false
		// ������ (String) : null
		System.out.println("55���� : "+ num[55]);
		
		
		// �ٸ� Ÿ�� �迭�� ����� �� �ִ�
		String[] fruits = new String[10];
		fruits[0] = "���";
		fruits[1] = "������";
		
		System.out.println("fruits[0] : " + fruits[0]);
		System.out.println("fruits[1] : " + fruits[1]);
		System.out.println("fruits[2] : " + fruits[2]);
		
		// �迭�� �����ϴ� �������� ���
		// 1. Ÿ��[] ������ = new Ÿ�� [�迭ũ��];
		// 2. Ÿ��[] ������ = {��1, ��2, ��3, ...};
		// 3. Ÿ��[] ������ = new Ÿ��[] {��1, ��2, ��3, ...};
		
		String[] snacks = {
				"�����佺", "ġ�佺", "���佺", 
				"����Ĩ", "������Ĩ", "��īĨ",
		};
		
		// ũ�Ⱑ �����ؼ� �������� ���� �� �ִ� �� (�⺻��)
		// ũ�Ⱑ �������� �ʾ� �ּҸ� ���� �����ؾ� �ϴ� �� (������)
		
		// �迭Ÿ�� �������� �ش� �迭�� ���������� �ּҰ� ����Ǿ� �ִ�
		// �� �ڿ� �ε����� ���̸� �ش� ĭ��ŭ �̵��ؼ� �����͸� �о��ش�
		System.out.println(snacks); 
		System.out.println(snacks[0]);
		System.out.println(snacks[1]);
		System.out.println(snacks[2]);
		System.out.println(snacks[3]);
		System.out.println(snacks[4]);
		System.out.println(snacks[5]);
		
		boolean[] passExam = {
				true, true, true, true, true, false, true, false,
		};
		
		double[] weights = new double[] {
				99.99, 88.88, 77.77, 10, 'A', 123.123f,
		};
		
		// toCharArray(); : String�� char[]�� ��ȯ �� �� �ִ�
		char[] charArray = "Hello, world!\n".toCharArray();
		
		System.out.println(charArray[3]);
		System.out.println(charArray[4]);
		System.out.println(charArray[5]);
		
		// # �迭.length�� ���� �ش� �迭�� ���̸� ���� �� �ִ�
		System.out.println("���Ϲ迭 ���� : " + fruits.length);
		System.out.println("���ڹ迭 ���� : " + snacks.length);
		
		// # �迭�� �ݺ����� �Բ� �̿��ϸ� �ſ� ���ϴ�
		for (int i = 0; i < snacks.length; i++) {
			System.out.println(snacks[i]);
		}
		
		// # �հ��ڰ� �� ������ ���غ���
		int passCount = 0;
		for (int i = 0; i < passExam.length; ++i) {
			passCount = passExam[i] ? passCount + 1 : passCount;
		}
		System.out.printf("��ü ������ %d�� �� �հ��ڴ� %d���Դϴ�.\n", passExam.length,passCount);
		
		
		// # �迭�� ������ �ϳ��� �����鼭 �ݺ��ϱ� (forEach)
		for (String snack : snacks) {
			System.out.println("�ϳ��� ������ : " + snack);
		}
		
		for (double weight : weights) {
			System.out.println("�ϳ��� ������ : " + weight);			
		}
		
		for (String fruit : fruits) {
			System.out.println("�ϳ��� ������ : " + fruit);			
		}
		
		for (int n : num) {
			System.out.println("num : " + n);			
		}
		
	}
	

}