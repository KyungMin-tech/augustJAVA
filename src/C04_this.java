
public class C04_this {
	
	// this
	//	- 현재 인스턴스 자기자신을 뜻한다
	//	- 인스턴스가 생성되지 않았다면 존재하지 않는다
	public static void main(String[] args) {
		
		// 어떤 인스턴스로 호출했느냐에 따라 this가 각가 다르게 작용하게 된다
		Peach peach01 = new Peach(3.0, "브루나이");
		Peach peach02 = new Peach(4.0, "칠레");
		Peach peach03 = new Peach(5.0, "중국");
		
		System.out.println(peach01.info());
		System.out.println(peach02.info());
		System.out.println(peach03.info());			
	}

}

class Peach {
	// 인스턴스 변수
	double sweet;
	String made_in;
	
	public Peach() {
		sweet = 5.0;
		made_in = "시골";
	}
	
	// 매개변수
	public Peach(double sweet, String made_in) {
		// 인스턴스 변수와 매개변수의 이름이 동일하다면
		// 인스턴스 변수를 선택할 때는 this를 통해 명확하게 선택해야 한다		
		this.sweet = sweet;
		this.made_in = made_in;
	}
	
	public String info() {
		String sweet = "사용하고 싶지 않은 값";
		String made_in = "사용하고 싶지 않은 값";
		
		return String.format("[%f:%s]", this.sweet, this.made_in);
	}
}
