
import myobj.person.*;

public class C09_Downcasting {
	
	// �ٿ�ĳ����
	//	- �θ�Ÿ���� �ڽ�Ÿ������ ĳ�����ϴ� ��
	//	- Ư���� ��� �ܿ��� ������� �ʴ´�
	
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 10);
		
		// �θ� Ÿ���� �𸣴� �ڽ� Ÿ���� ����� ���� ������ �ڽ� Ÿ���� �� �� ����
//		Police police = (Police) p1;		
//		police.arrest("������");
		
		// ���� �ڽ� Ÿ���̾��� �ν��Ͻ��� ��ĳ���� �� ���,
		// �ٽ� �ڽ� Ÿ������ �ٿ�ĳ���� �� ��  �ִ�
		Person p2 = new Police("�����", 20);
		
		// ��ĳ���õ� �ν��Ͻ��� �ڽ� Ÿ���� ����� ����� �� ����
		// p2.arrest(); �� ��� �Ұ���
		
		// �ٽ� �ٿ� ĳ������ �ϸ� Police���� �����ϴ� arrest()�� ����� �� �ִ�
		Police police = (Police) p2;
		police.arrest("�赵��");
		
		// ���� �ڱ� Ŭ�����θ� �ٿ�ĳ������ �� �� �ִ�
		// Programmer programmer = (Programmer) p2;
		
		Person person01 = new Programmer("��븮", 30);
		Person person02 = new FireFighter("���⵿", 30);
		Person person03 = new Police("��ü��", 30);
		
		// A  instanceof B �����ڸ� ���� ��� Ŭ�������� ������ �� �ִ�
		System.out.println("person01�� ���α׷����� �ν��Ͻ� �Դϱ�? " + 
		(person01 instanceof Programmer));
		System.out.println("person01�� �ҹ���� �ν��Ͻ� �Դϱ�? " + 
				(person01 instanceof FireFighter));
		System.out.println("person01�� �������� �ν��Ͻ� �Դϱ�? " + 
				(person01 instanceof Police));
		System.out.println("person01�� ��� �ν��Ͻ� �Դϱ�? " + 
				(person01 instanceof Person));
		
		// �� instanceof �����ڸ� ���� �����ϰ� �ٿ� ĳ������ ������ �� �ִ�
		
		Person[] persons = { person01, person02, person03 };
		
		for (int i = 0; i < persons.length; ++i) {
			
			if (persons[i] instanceof Programmer) {
				System.out.println(i + "��° ����� '���α׷���' �Դϴ�.");
			} else if (persons[i] instanceof Police) {
				System.out.println(i + "��° ����� '������' �Դϴ�.");
			} else if (persons[i] instanceof FireFighter) {
				System.out.println(i + "��° ����� '�ҹ��' �Դϴ�.");
			}
		}
		
	}

}