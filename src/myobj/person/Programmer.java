package myobj.person;

public class Programmer extends Person {
	
	public Programmer() {}
	
	public Programmer(String name, int age) {
		super(name, age);
	}
	@Override
	public void attack() {
		System.out.printf("'%s'�� ��Ʈ������ �����մϴ�. �������� ���մϴ�.\n", name);		
	}
	
	public void programming(String java) {
		System.out.printf("'%s'��  ������ ���ư��� '%s'���α׷����� �մϴ�.\n", name, java);
	}
	
	public void doProject(Project project) {		
		project.progress += 5;		
	}

}
