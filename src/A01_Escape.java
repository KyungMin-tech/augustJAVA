
public class A01_Escape {
	// # Escape ����
	//  - Ư���� ����� ���� ����
	//  - �տ� \(��������)�� �ٷ� ���� ���ڿ� ������ Ư���� ����� �Ѵ�
	//  - �� ���ڸ� ���ļ� �ϳ��� ���ڷ� �ν��Ѵ�
	
	//main()�Լ��� ��Ÿ�� ������ ���� �ֱٿ� �����ߴ� main()�� �����Ѵ�
	public static void main(String[] args) {
		
		// \n : �ٹٲ��� ����� ���� Ư�� ����
		System.out.println("��\n��\n�ϼ���, �ݰ����ϴ�.");
		
		// \t : TabŰ�� ����� ���� Ư�� ����
		System.out.println("��\t��\t�ϼ���, �ݰ����ϴ�.\n");
		
		// �� TabŰ�� �ؽ�Ʈ�� ���� ������ ���� �� �����ϴ�
		System.out.println("�̸�\t���� \t����");
		System.out.println("����\t8,000\t4.5");
		System.out.println("����\t9,000\t4.3");
		
		// \\ : �׳� �������ø� ����ϰ� ������ ����Ѵ�
		// ex> C:\Users\Admin\My games\�� ����ϰ� ���� ���
		System.out.println("C:\\Users\\Admin\\My games\\");
		
		// \" : �׳� ū ����ǥ�� ����ϰ� ���� ��쿡 ����
		// \' : �׳� ���� ����ǥ�� ����ϰ� ���� ��쿡 ����Ѵ�
		System.out.println("ö���� \"����\"�� �԰� �ʹ�");
		System.out.println("ö���� \'����\'�� �԰� �ʹ�");
		System.out.println("ö���� '����'�� �԰� �ʹ�");
		System.out.println('\'');
	}

}