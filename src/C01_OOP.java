 
public class C01_OOP {
	
	// # 객체지향 프로그래밍 (OOP: Object Oriented Programming)
	//	- 변수와 함수를 무분별하게 사용하기 보다는 현실에 존재하는 객체로서 
	//	     보이도록 구성하는  방식
	//	- 세상에 존재히는 모든 객체를 변수와 함수로 표현하려는 프로그래밍 방법
	
	// # 객체  (Object)
	//	- 세상에 존재하는 모든 개념을 객체라고 부른다
	//	- 사물, 개념, 알고리즘 등등..
	
	// ex: 사과
	//	- 색깔, 크기, 모양, 벌레먹음 유무
	
	// ex: 시계
	//	- 테두리 색깔, 초침 색깔/굵기/모양, 분침 색깔/굵기/모양 , 시침 색깔/굵기/모양
	
	// ex: 텀블러
	// 	- 로고, 색깔, 재질, 보온가능여부, 현재 음료의 양
	
	public static void main(String[] args) {
		
		
		// 하나로 묶을 수 있는 성질들
		int apple_color;
		int apple_size;
		String aplle_shape = "동그란 모양";
		
		// 똑같은 틀(클래스)로 여러개의 사과를 마음껏 생성할 수 있다 
		Apple apple01 = new Apple();
		Apple apple02 = new Apple();
		
		
		// 이때 클래스로 찍어낸 실체를 '인스턴스(instance)'라고 부른다
		
		// 생성된 인스턴스마다 각자 다른 변수영역을 지닌다
		apple01.color = "빨간색";
		apple02.color = "초록색";		
		
		System.out.println("사과01 : " + apple01);
		System.out.println("사과02 : " + apple02);
		
		// 메서드를 통해 해당 객체의 변화 또는 동작을 구현하고 사용할 수 있다
		System.out.println("먹기 전 사과 1의 칼로리" + apple01.calorie);		
		apple01.eat(3);		
		System.out.println("먹은 후 사과 1의 칼로리" + apple01.calorie);
	}

}

// 클래스 이름은 대문자로 시작해야한다(권장)
// Apple 클래스는 사과를 찍어내는 큰 틀이라고 볼 수 있다
// 클래스를 선언하는 시점에는 실제로 존재하는 사과가 하나도 없다
class Apple {
	
		
	// 클래스 내부의 변수를 (멤버 변수, 싱태, 필드, 인스턴스 변수)
	//	- 인스턴스의 현재 상태를 저장하는 용도로 사용한다
	// 	- 인스턴스마다 다른 값을 지닐 수 있는 변수다
	//	  (사과마다 다른 값을 가질 수 있는 변수)
	String color;
	String shape;
	String madein;
	int size;
	int calorie;
	
	// 클래스 내부의 메서드
	//	- 인스턴스의 상태를 변화시키는 용도로 사용한다
	//	- 변화, 동작, 기능등을 표현하기 위해 사용한다
	
	// ex: 사과를 먹는다
	//	- 모양, 크기, 보유 칼로리, 크기 등이 변함
	
	// static
	//	- 모든 인스턴스에서 동일할 값
	// 	- 인스턴스마다 다른 값을 원한다면 static을 제거해야 한다	
	public void eat(int mouth) {
		calorie = calorie - mouth * 50;
	}
	
	// ex: 사과를 던진다
	//	- 사과의 무게에 비례한 데미지를 입힌다
	
	// ex: 사과가 썩었다
	//	- 사과의 색이 갈색 또는 검은색으로 변한다
	
}

class Clock {
	String sidecolor;
	
	String secondColor;
	int secondSize;
	String secondShape;
	
	String minuteColor;
	int minuteSize;
	String minuteShape;
	
	String hourColor;
	int hourSize;
	String hourShape;	
}

class Tumbler {
	String logo;
	String color;
	String material;
	boolean keepWarm;	
}
