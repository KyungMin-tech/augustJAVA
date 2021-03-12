package myobj.person;

// Person의 기능을 모두 똑같이 사용하고 싶을때 상속을 받으면 편하다
public class Police extends Person{
	
	public Police() {}
	
	// 자식 클래스의 인스턴스를 생성할때는 반드시 부모의 생성자를 가장 먼저 호출해야한다
	public Police(String name, int age) {
		// super() : 부모(super) 클래스의 생성자를 호출
		// this() : 현재 클래스의 다른 생성자를 호출
		super(name, age);
	}
	
	@Override
	public void attack() {
		// this : 현재 인스턴스
		// super : 현재 인스턴스 중 부모 클래스 부분
		
		// super.attack() : 부모의 attack() 메서드를 그대로 사용
		
		System.out.printf("'%s'이(가) 권총을 발사합니다. 상대는 죽었습니다.\n", name);
		
	}
	
	public void arrest(String suspect) {
		System.out.printf("'%s'이(가) 용의자 '%s'를 체포했습니다.\n", name, suspect);
	}

}

/*
 * Person클래스를 상속 받은 다른 직업 클래스를 생성해보세요
 * 
 * 		1. Programmer
 * 		2. FireFighter
 * 
 * 	※ 오버라이드, 새로운 메서드가 있어야 함	
 * 
 */



