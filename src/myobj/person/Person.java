package myobj.person;

public class Person {
	
	public Person () {
		// 부모타입에 기본생성자가 존재한다면 super()를 생략할 수 있다 ※
		// 부모타입에 기본생성자가 없다면 부모의 생성자를 반드시 명시적으로 실행해야 한다
	}
	
	// public : 다른 패키지에서 접근할 수 있는 자원임을 알린다
	public String name;
	public int age;	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void introduce() {
		System.out.printf("안녕하세요! 제이름은 %s이고 나이는 %d입니다\n", name, age);
	}
	
	public void attack() {
		System.out.printf("'%s'가 주먹질로 공격합니다. 데미지가 약합니다.\n", name);
	}

}

