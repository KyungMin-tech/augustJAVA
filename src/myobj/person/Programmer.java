package myobj.person;

public class Programmer extends Person {
	
	public Programmer() {}
	
	public Programmer(String name, int age) {
		super(name, age);
	}
	@Override
	public void attack() {
		System.out.printf("'%s'가 노트북으로 공격합니다. 데미지가 강합니다.\n", name);		
	}
	
	public void programming(String java) {
		System.out.printf("'%s'가  집으로 돌아가서 '%s'프로그래밍을 합니다.\n", name, java);
	}
	
	public void doProject(Project project) {		
		project.progress += 5;		
	}

}
