package quiz;

public class A05_information {

	public static void main(String[] args) {
		// ���� �տ� 0�� ���̸� 8����
		// ���� �տ� 0x�� ���̸� 16����

		// int tel = 010-1234-1234;
		// String tel = String.format("%03d-%d-%d", 10, 1234, 1234);		
		
		String banner = "======== ��� ��� =========";
		String name = "ȫ�浿";
		int age = 20;
		String tel = "010-1234-1234";
		double tall = 178.5;		
		// �����Դ� �Ҽ����� ���� ���� �ֱ� ������ double�� ��� �Ѵ�
		double weight = 75;		
		// �������� AB���� �����ؾ� �ϱ� ������ ���ڿ��� ����Ѵ�
		String bloodType = "AB"; 		
		boolean goonpil = false;
		boolean gisa = false;
		boolean gf = false;
		
		System.out.println(banner);
		System.out.println("�̸�\t: " + name);
		System.out.println("����\t: " + age);
		System.out.println("Tel\t: " + tel);
		System.out.println("Ű\t: " + tall);
		System.out.println("������\t: " + weight);
		System.out.println("������\t: " + bloodType);
		System.out.println("����\t: " + goonpil);
		System.out.println("�ڰ���\t: " + gisa);
		System.out.println("����ģ��\t: " + gf);
	}
	
}







