
public class C10_accessModifier {
	
	// 접근 제어자 (접근 지정자)
	//	- 다른 클래스가 내 클래스의 자원을 사용할려고 접근 할 때 허용 여부를 설정한다
	//	- 해당 자원에 어느 정도 거리의 클래스까지 접근할 수 있는지 성절한다
	
	// # 구분할 수 있는 거리의 종류
	//	- 같은 클래스 내부 (가장 가까운 거리)
	//	- 같은 패키지 내부
	//	- 다른 패키지 (가장 먼 거리)
	
	// # 접근제어자의 종류
	//	- Public : 다른 패키지에서도 자유롭게 접근할 수 있는 자원이 된다
	//	- protected : 상속을 받은 객체만 다른 패키지에서 접근할 수 있다
	//				같은 패키지에서는 자유롭게 접근할 수 있다
	//	- 아무것도 안씀 : 다른 패키지에서 접근이 불가능하다
	//				같은 패키지에서는 자유롭게 접근할 수 있다
	//	- private : 같은 클래스에서만 접근이 가능하다
	
	public static void main(String[] args) {
		C10_PublicClass instance01 = new C10_PublicClass();
		
		System.out.println(instance01.public_var);
		System.out.println(instance01.protected_var);
		System.out.println(instance01.default_var);
		// System.out.println(instance01.private_var);
		// System.out.println(instance01.not_existing_var);
		
		instance01.public_method();
		instance01.protected_method();
		instance01.default_method();
		// instance01.private_method();
		
		
		// 같은 패키지에 존재하는 default class 의 경우
		DefaultClass instance02 = new DefaultClass();
		
		System.out.println(instance02.public_var);
		System.out.println(instance02.protected_var);
		System.out.println(instance02.default_var);
		// System.out.println(instance01.private_var);
		
		// 다른 패키지의 public class에 접근하는 경우
		myobj.C10_PublicClass instance03 = new myobj.C10_PublicClass();
		
		// public이 붙은 자원만 보이게 된다
		// 이 클래스를 사용할 다른 프로그래머들에게 보여주고 싶은 부부만 보여줄 수 있다
		System.out.println(instance03.public_var);
		instance03.public_method();
		
		// 다른 패키지의 default class에는 접근할 수 없다
		// myobj.DefaultClass instance04 = new myobj.DefaultClass();
		
			
	}

}
