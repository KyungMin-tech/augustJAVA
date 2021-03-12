
import myobj.person.*;

public class C07_extends {

	// 클래스 상속
	// - 미리 만들어 놓은 클래스를 그대로 물려받아서 사용하는 것
	// - 상속해주는 클래스를 부모 클래스 또는 super class라고 부른다
	// - 상속받는 클래스를 자식 클래스 또는 sub class라고 부른다
	// - 자식 클래스는 부모 클래스가 가진 모든 기능을 그대로 물려받는다
	// - 자식 클래스는 물려받은 기능을 마음대로 수정해서 쓸 수 있다 (오버라이드, Override)
	// - 자식 클래스는 부모에게 없는 기능을 마음대로 추가해서 쓸 수 있다
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("김철수", 25);

		p1.introduce();
		p2.introduce();

		// Police에 introduce()를 정의한적 없지만 부모의 기능을 그대로 사용하고 있다
		// 부모 클래스에 존재한느 변수와 메서드를 그대로 사용하고 있다
		Police p3 = new Police("김순경", 28);
		p3.introduce();
		
		p1.attack();
		p2.attack();
		p3.attack();
		
		p3.arrest("김강도");
		
		Programmer p4 = new Programmer("김자바", 32);
		p4.introduce();
		
		p4.attack();
		p4.programming("java");
		
		FireFighter p5 = new FireFighter("김소방", 47);
		p5.introduce();
		
		p5.attack();
		p5.fireRepress("옆 건물");
		

	}

}
