
public class C05_static {

	// static
	//	- 같은 클래스로 생성된 모든 인스턴스가 공동으로 사용하는 영역을 의미한다
	//	- static은 클래스 당 하나의 값을 지니게 된다
	//	- 클래스 당 하나이기 때문에 인스턴스명이 아닌 클래스명에 .을 찍고 참조할 수 있다
	//	- static은 인스턴스가 하나도 생성되지 않았을때도 사용할 수 있다
	//	- 인스턴스가 없을 때도 사용될 가능성이 있기 때문에 static영역 에서는 
	// 	    인스턴스 자원을 참조할 수 없다
	
	// static 변수
	//	- 모든 인스턴스가 같은 값을 지닐 수 밖에 없는 변수
	
	// static 메서드
	//	- 인스턴스 멤버 변수를 사용할 수 없는 변수 
	//	- static 멤버 변수만 사용할 수 있다
	//	- 해당 클래스의 인스턴스가 하나도 없더라도 사용할 수 있다
	
	public static void main(String[] args) {
	
		// static은 인스턴스가 존재하지 않는 시점에도 사용할 수 있다				
		Pear.info();
		
		new Pear(13, 2);
		new Pear(10, 1);
		new Pear(10, 1);
		new Pear(11, 1);
		new Pear(11, 1);
		new Pear(15, 1);
		
		TrumphCard spade10 = new TrumphCard("spade", 10);
		TrumphCard heart7 = new TrumphCard("heart", 7);
		TrumphCard clover8 = new TrumphCard("clover", 8);
		
		spade10.printCardInfo();
		heart7.printCardInfo();
		clover8.printCardInfo();
		
		// 모든 인스턴스에서 같은 값을 보고 있기 때문에 하나만 변경해도 모든 카드의 크기가 변경된다
		// System.out.println("-- heart7의 카드 크기를 변경 --");
		// heart7.changeCardSize(50, 100);
		
		// 클래스당 하나인 static자원에 접근할때는 클래스 이름을 사용하는것이 보기 좋다
		TrumphCard.changeCardSize(77, 154);
		
		spade10.printCardInfo();
		heart7.printCardInfo();
		clover8.printCardInfo();
	}
	
}

class Pear {
	int size;
	int grade;
	
	static String taste = "배맛";
	
	static int total_size = 0;
	static int total_grade = 0;
	static int pear_count = 0;
	
	static double avg_size = 0;
	static double avg_grade = 0;
	
	// ※ 생성자가 실행되는 시점이 새로운 배가 추가되는 시점이다.
	public Pear(int size, int grade) {
		this.size = size;
		this.grade = grade;
		
		System.out.println("새로운 배가 추가되었습니다.");
		
		// 새로운 배가 추가 될 때마다 static영역의 평균을 갱신함 
		++pear_count;
		total_size += size;
		total_grade += grade;
		
		avg_size = total_size / (double) pear_count;
		avg_grade = total_grade / (double) pear_count;
	
		System.out.println("평균 정보가 갱신되었습니다.");		
		info();
	}
	
	public static void changeTaste(String taste) {
		// static영역에서는 this가 존재하지 않는다		
		Pear.taste = taste;
	}
	
	// static 메서드는 인스턴스 변수가 생기지도 않은 시점에도 사용될 수 있다
	// 때문에, 인스턴스 영역의 것들은 모두 사용할 수 없다
	public static void info() {
		System.out.printf("평균 등급 : %f\n평균 크기 : %f\n", 
				avg_grade, avg_size);
	}
}

// static 변수와 static 메서드를 가진 클래스를 하나 정의해보세요 (과일 금지)
class TrumphCard {
	// 모든 카드의 높이/너비/그림들은 똑같아야 한다
	// 똑같은 값들은 static 변수를 활용한다
	static int width = 100;
	static int height = 200;
	static String image = "D:\\cardgame\\assets\\image\\card01.jpg";
	
	// 카드마다 다른 숫자와 문양은 인스턴스 변수를 활용한다
	String shape;
	int number;
	
	public TrumphCard(String shape, int number) {
		this.shape = shape;
		this.number = number;
	}
	
	// 카드의 크기를 변경하는 메서드
	static void changeCardSize(int width, int height) {
		TrumphCard.width = width;
		TrumphCard.height = height;
	}
	
	// 카드의 그림을 변경하는 메서드
	static void changeCardImage(String imgPath) {
		image = imgPath;
	}
	
	// 인스턴스 메서드에서는 static영역의 자원을 마음껏 사용할 수 있다
	// ※ 인스턴스가 생긴 시점에 static이 존재하지 않을 수는 없다
	void printCardInfo() {
		System.out.printf("[%s/%d/%dpx/%dpx]\n", 
				this.shape, this.number, width, height);
	}
}
























