package myobj.person;

// Person�� ����� ��� �Ȱ��� ����ϰ� ������ ����� ������ ���ϴ�
public class Police extends Person{
	
	public Police() {}
	
	// �ڽ� Ŭ������ �ν��Ͻ��� �����Ҷ��� �ݵ�� �θ��� �����ڸ� ���� ���� ȣ���ؾ��Ѵ�
	public Police(String name, int age) {
		// super() : �θ�(super) Ŭ������ �����ڸ� ȣ��
		// this() : ���� Ŭ������ �ٸ� �����ڸ� ȣ��
		super(name, age);
	}
	
	@Override
	public void attack() {
		// this : ���� �ν��Ͻ�
		// super : ���� �ν��Ͻ� �� �θ� Ŭ���� �κ�
		
		// super.attack() : �θ��� attack() �޼��带 �״�� ���
		
		System.out.printf("'%s'��(��) ������ �߻��մϴ�. ���� �׾����ϴ�.\n", name);
		
	}
	
	public void arrest(String suspect) {
		System.out.printf("'%s'��(��) ������ '%s'�� ü���߽��ϴ�.\n", name, suspect);
	}

}

/*
 * PersonŬ������ ��� ���� �ٸ� ���� Ŭ������ �����غ�����
 * 
 * 		1. Programmer
 * 		2. FireFighter
 * 
 * 	�� �������̵�, ���ο� �޼��尡 �־�� ��	
 * 
 */



