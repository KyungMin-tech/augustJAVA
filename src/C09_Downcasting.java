
import myobj.person.*;

public class C09_Downcasting {
	
	// 다운캐스팅
	//	- 부모타입이 자식타입으로 캐스팅하는 것
	//	- 특수한 경우 외에는 허용하지 않는다
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 10);
		
		// 부모 타입은 모르는 자식 타입의 기능이 많기 때문에 자식 타입이 될 수 없다
//		Police police = (Police) p1;		
//		police.arrest("강도박");
		
		// 원래 자식 타입이었던 인스턴스가 업캐스팅 된 경우,
		// 다시 자식 타입으로 다운캐스팅 될 수  있다
		Person p2 = new Police("김순경", 20);
		
		// 업캐스팅된 인스턴스는 자식 타입의 기능을 사용할 수 없다
		// p2.arrest(); 는 사용 불가능
		
		// 다시 다운 캐스팅을 하면 Police에만 존재하는 arrest()를 사용할 수 있다
		Police police = (Police) p2;
		police.arrest("김도박");
		
		// 원래 자기 클래스로만 다운캐스팅이 될 수 있다
		// Programmer programmer = (Programmer) p2;
		
		Person person01 = new Programmer("김대리", 30);
		Person person02 = new FireFighter("김출동", 30);
		Person person03 = new Police("김체포", 30);
		
		// A  instanceof B 연산자를 통해 어느 클래스인지 구분할 수 있다
		System.out.println("person01이 프로그래머의 인스턴스 입니까? " + 
		(person01 instanceof Programmer));
		System.out.println("person01이 소방관의 인스턴스 입니까? " + 
				(person01 instanceof FireFighter));
		System.out.println("person01이 경찰관의 인스턴스 입니까? " + 
				(person01 instanceof Police));
		System.out.println("person01이 사람 인스턴스 입니까? " + 
				(person01 instanceof Person));
		
		// ※ instanceof 연산자를 통해 안전하게 다운 캐스팅을 진행할 수 있다
		
		Person[] persons = { person01, person02, person03 };
		
		for (int i = 0; i < persons.length; ++i) {
			
			if (persons[i] instanceof Programmer) {
				System.out.println(i + "번째 사람은 '프로그래머' 입니다.");
			} else if (persons[i] instanceof Police) {
				System.out.println(i + "번째 사람은 '경찰관' 입니다.");
			} else if (persons[i] instanceof FireFighter) {
				System.out.println(i + "번째 사람은 '소방관' 입니다.");
			}
		}
		
	}

}
