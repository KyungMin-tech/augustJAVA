
public class C02_Constructor {
	
	// 클래스의 생성자 (Constructor)
	//	- 클래스의 이름과 똑같은 이름의 함수
	// 	- new와 함께 생성자를 호출하면 인스턴스가 생성된다
	//	- 생성자를 선언하지 않은 클래스는 기본 생성자를 자동으로 생성해준다
	//	  ※ 기본 생성자 - 매개변수로 아무것도 전달하지 않아도 되는 생성자
	
	public static void main(String[] args) {
		// 오렌지 클래스는 생성자를 따로 정의하지 않기 때문에 
		// 기본 생성자가 존재한다
		Orange orange01 = new Orange();
		
		System.out.println("방금막 생성된 오렌지의 당도  : " + orange01.sweet);
		System.out.println("방금막 생성된 오렌지의 색깔  : " + orange01.color);
		
		orange01.sweet = 9;
		orange01.color = "오렌지색";
		

		System.out.println("값을 직접 채운 오렌지의 당도  : " + orange01.sweet);
		System.out.println("값을 직접 채운 오렌지의 색깔  : " + orange01.color);
		
		// 체리 클래스는 기본 생성자를 이용해 값을 초기화 해주었다
		Cherry cherry01 = new Cherry();
		
		System.out.println("방금 생성된 체리의 당도  : " + cherry01.sweet);
		System.out.println("방금 생성된 체리의 색깔  : " + cherry01.color);
		
		// # 클래스 배열 사용하기
		
		// ※ 클래스 배열을 100크기로 생성했다는 것은 인스턴스를 100개 생성한 것이 아니라
		//	인스턴스가 들어갈 수 있는 배열 방을 100개 만든 것이다
		Cherry[] cherrybox = new Cherry[100];
		
		for (int i = 0; i < cherrybox.length; ++ i) {
			// 모든 방에 다른 인스턴스를 채워서 사용
			cherrybox[i] = new Cherry();
			
			System.out.printf("%d번째 체리 : %s\n", i, cherrybox[i]);
		}
		
		Snack snack01  = new Snack("프링글스", "프링글스 오리지널", "짠맛", 800);
		Snack snack02  = new Snack("오리온", "치토스", "바베큐맛", 750);
		Snack snack03 = new Snack("롯데", "칸쵸", "기본", 500);		
		// 생성자를 따로 정의한 클래스는 자동으로 생성된 기본 생성자가 없다
		// Snack snack02  = new Snack();
		
		System.out.println("스낵1의 이름 : " + snack01.name);
		System.out.println("스낵2의 제조회사 : " + snack02.brand);
		System.out.println("스낵3의 칼로리 : " + snack03.calorie + "kcal");
	}

}

class Orange {
	int sweet; // 당도
	String color;
	
	// 자동으로 생성되는 기본 생성자의 실제 모습
	// Orange() {}
}

class Cherry {
	double sweet; 
	String color;
	
	// Cherry틀래스는 기본 생성자를 직접 정의
	Cherry () {
		// 각 인스턴스가 호출되면서 동시에 가장 먼저 호출되는 것이 생성자이므로
		// 생성자에서는 주로 인스턴스 변수 값을 초기화하려는 작업을 하게 된다.
		
		// 생성자는 주로 기본값을 설정하는 역할을 한다
		sweet = 5.0;
		color = "빨간색";
		
		
	}
}

class Snack {
	String brand;
	String name;
	String taste;
	int calorie;
	
	// 생성자도 오버로딩이 가능하다
	Snack() {
		brand = "기본 브랜드";
		name = "기본 이름";
		taste = "기본맛";
		calorie = -1;
	}
	
	// 생성자에서 다른 생성자를 호출해 사용할 수 있다
	Snack(String brand, String name) {
		this.brand = brand;
		this.name = name;
		this.taste = "기본맛";
		this.calorie = -1;
		
//		this(brand, name, "기본맛", -1);
		
//		this(); // this() : 이 클래스의 다른 생성자를 호출
//		this.brand = brand;
//		this.name = name;
		
		// 예시 세가지가 모두 같기 때문에 제일 짧은걸 사용하는게 좋다 
	}
	
	// 인스턴스에 원하는 값을 매개변수로 전달받는 생성자
	Snack(String brand, String name, String taste, int calorie){
		this.brand = brand;
		this.name = name;
		this.taste = taste;
		this.calorie = calorie;
		
	}
}
