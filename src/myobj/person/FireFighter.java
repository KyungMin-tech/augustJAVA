package myobj.person;

public class FireFighter extends Person {
	
	public FireFighter() {}
	
	public FireFighter(String name, int age) {
		super(name, age);
	}
	@Override
	public void attack() {
		System.out.printf("'%s'�� �������� ���ϴ�. �������� ���մϴ�. ���� �׾����ϴ�\n", name);		
	}
	public void fireRepress(String building) {
		System.out.printf("%s�� ���̳��� '%s'��(��) ȭ�� �����Ϸ� ���ϴ�. ȭ�������� �������Դϴ�.\n", building, name);
	}

}
