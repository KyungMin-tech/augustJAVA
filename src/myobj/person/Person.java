package myobj.person;

public class Person {
	
	public Person () {
		// �θ�Ÿ�Կ� �⺻�����ڰ� �����Ѵٸ� super()�� ������ �� �ִ� ��
		// �θ�Ÿ�Կ� �⺻�����ڰ� ���ٸ� �θ��� �����ڸ� �ݵ�� ��������� �����ؾ� �Ѵ�
	}
	
	// public : �ٸ� ��Ű������ ������ �� �ִ� �ڿ����� �˸���
	public String name;
	public int age;	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void introduce() {
		System.out.printf("�ȳ��ϼ���! ���̸��� %s�̰� ���̴� %d�Դϴ�\n", name, age);
	}
	
	public void attack() {
		System.out.printf("'%s'�� �ָ����� �����մϴ�. �������� ���մϴ�.\n", name);
	}

}

