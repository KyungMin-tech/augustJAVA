import java.util.Random;

public class C03_method {
	
	// �޼��� (method)
	//	- Ŭ���� ���ο� �ִ� �Լ��� �޼����� �Ѵ�
	//	- �ڹٿ����� �ݵ�� Ŭ���� ���ο��� �Լ��� ������ �� �ִ�
	//	- �Ȱ��� ����̴��� �� �ν��Ͻ��� ���¿� ���� ����� �޶�����
	
	public static void main(String[] args) {
		
		Student[] stuArr = new Student[10];
		
		for (int i = 0; i < stuArr.length; ++i) {
			stuArr[i] = new Student();
			
			stuArr[i].viewInfo();
			stuArr[i].checkPass();
		}
		
	}

}

class Student {
	String name;
	int java;
	int python;
	int c;
	
	Student() {
		// ���ο� �л� �ν��Ͻ��� ������ �� 
		// �� ������ ������ 0 ~ 100���� ���� ������ �ʱ�ȭ �ǵ��� ��������
		Random ran = new Random();
		
		name = "ȫ�浿";
		java = ran.nextInt(101);
		python = ran.nextInt(101);
		c = ran.nextInt(101);	
		
	}
	
	public void viewInfo() {
		System.out.printf("%s - [�ڹ�:%-2d /���̽�:%-2d /C���:%-2d]\n",name, java, python, c);
//		if ((java >=70) && (python >= 70)) {
//			System.out.println("�հ��Դϴ�");
//		} else if ((c >=70) && (python >= 70)) {
//			System.out.println("�հ��Դϴ�");
//		} else if ((c >=70) && (java >= 70)) {
//			System.out.println("�հ��Դϴ�");
//		} else {
//			System.out.println("���հ��Դϴ�");
//		}
		
	}
	// 70�� �̻��� ������ �� ���� �̻��� �л��� �հ��Դϴ� ��� ������ְ�
	// �׷��� ���� �л��� ���հ��Դϴ� ��� ������ִ� �޼��带 �����ϰ� �׽�Ʈ�غ�����
	public void checkPass() {
		int pass = 0;
		
		if (java >= 70)
			++pass;
		if (python >= 70)
			++pass;
		if (c >= 70)
			++pass;
		
		System.out.println(pass >= 2 ? "�հ��Դϴ�." : "���հ��Դϴ�.");
	}
}