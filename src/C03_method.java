import java.util.Random;

public class C03_method {
	
	// 메서드 (method)
	//	- 클래스 내부에 있는 함수를 메서드라고 한다
	//	- 자바에서는 반드시 클래스 내부에만 함수를 생성할 수 있다
	//	- 똑같은 기능이더라도 각 인스턴스의 상태에 따라 결과가 달라진다
	
	public static void main(String[] args) {
		
		Student[] stuArr = new Student[10];
		
		for (int i = 0; i < stuArr.length; ++i) {
			stuArr[i] = new Student();
			
			stuArr[i].viewInfo();
			stuArr[i].checkPass();
		}
		
	}

}

class Student {
	String name;
	int java;
	int python;
	int c;
	
	Student() {
		// 새로운 학생 인스턴스를 생성할 때 
		// 각 과목의 점수가 0 ~ 100점의 랜덤 점수로 초기화 되도록 만들어보세요
		Random ran = new Random();
		
		name = "홍길동";
		java = ran.nextInt(101);
		python = ran.nextInt(101);
		c = ran.nextInt(101);	
		
	}
	
	public void viewInfo() {
		System.out.printf("%s - [자바:%-2d /파이썬:%-2d /C언어:%-2d]\n",name, java, python, c);
//		if ((java >=70) && (python >= 70)) {
//			System.out.println("합격입니다");
//		} else if ((c >=70) && (python >= 70)) {
//			System.out.println("합격입니다");
//		} else if ((c >=70) && (java >= 70)) {
//			System.out.println("합격입니다");
//		} else {
//			System.out.println("불합격입니다");
//		}
		
	}
	// 70점 이상인 과목이 두 과목 이상인 학생은 합격입니다 라고 출력해주고
	// 그렇지 않은 학생은 불합격입니다 라고 출력해주는 메서드를 정의하고 테스트해보세요
	public void checkPass() {
		int pass = 0;
		
		if (java >= 70)
			++pass;
		if (python >= 70)
			++pass;
		if (c >= 70)
			++pass;
		
		System.out.println(pass >= 2 ? "합격입니다." : "불합격입니다.");
	}
}
