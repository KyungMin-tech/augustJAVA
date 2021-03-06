
import myobj.person.*;

public class C08_Upcasting {
	
	// 업캐스팅
	//	- 자식 타입의 인스턴스를 부모 타임으로 변환하는 것
	//	- 자식타입은 부모타입의 모든 것을 이미 알고 있기 때문에 
	//	  업캐스팅은 별도로 타입케스팅이 없어도 할 수 있다
	public static void main(String[] args) {
		
		Police police01 = new Police("김형사", 30);
		
		// 1. 부모타입 변수에 자식타입 인스턴스를 저장할 수 있다.
		Person person01 = police01;
		Person person02 = (Person) police01;
		Person person03 = new Police ("이경관", 40);
		
		double d2 = 10;
		double d = (double) 10;
		// ※ 문제가 생길만한 캐스팅인지 생각해보면 덜 햇갈린다
		
		
		// 2. 업캐스팅된 인스턴스는 자식 타입이던 시절의 기능을 잊어버린다
		//	- 자식 타입에만 존재하는 메서드를 사용할 수 없게 된다
		//	- 자식타입에서 오버라이드 했던 기능은 그대로 사용할 수 있다 (중요)
		person01.introduce();
		
		// attack()은 Police 클래스의 attack()을 그대로 사용하고 있다
		person01.attack();
		
		// 3. 업캐스팅을 잘 사용하면
		//	같은 소스로 모든 자식클래스의 오버라이드된 기능을 사용할 수 있다
		
		// Person클래스를 상속받은 모든 클래스는 attack()을 가지고 있는 것을 확신할 수 있다
		Person[] person = { 
				new Police("이순경",20),
				new Person("홍길동", 10),
				new Police("김순경",20),
				new Police("박순경",20),
				new Police("최순경",20),
			
		};
		
		for (int i = 0; i < person.length; ++i) {
			
			// 모든 직업이 하나의 소스로 각자의 고유한 attack()을 사용한다
			person[i].attack();
		}
		
		// 부모타입의 매개변수를 설정하면 모든 자식 타입을 인자로 전달할 수 있게 된다
		attack(new Person("홍길동", 123));
		attack(new Police("민경관", 123));
		attack(new FireFighter("이소방", 123));
		attack(new Programmer("조자바", 123));
	}	
	
	public static void attack(Person p) {
		// 업캐스팅 되었더라도 오버라이드된 메서드는 자식의 메서드를 실행한다
		p.attack();
	}
// 업캐스팅이 없다면 상속받은 클래스 개수 만큼 메서드가 필요하다

}
