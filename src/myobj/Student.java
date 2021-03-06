package myobj;

public class Student {

	int kor;
	int eng;
	int math;
	
	double avg;
	
	public static String[] randomNameList = {
			"홍길동", "김길동", "박길동", "이길동", "최길동"
	};
	public static String[] randomGradeList = {
			"A+", "A0", "A-", "B+", "B0", "B-", "C-", "C0", "C-",
			"D+", "D0", "D-", "F"		
	};
	String name;
	String grade;
	
	public Student() {
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		math = (int)(Math.random() * 101);
		
		avg = calcAvg();
		
		name = randomNameList[(int)(Math.random() * randomNameList.length)];
		grade = randomGradeList[(int)(Math.random() * randomGradeList.length)];
	}
	
	public double calcAvg() {
		return (kor + eng + math) / 3.0;
	}
	
	// 메서드를 통해 필드값을 가져가는 것이 표준이다. (getter)
	public double getAvg() {
		return avg;
	}
	
	@Override
	public String toString() {	
		// Object.toString() 메서드
		//	- Object 클래스의 메서드이므로 모든 클래스가 전부 가지고 있는 메서드
		//	- 해당 객체를 문자열로 표현해야 할 때 어떻게 표현할지를 결정할 수 있다
		//	- System.out.println()은 사실 전달한 객체의 toString()을 
		//    콘솔에 출력하는 것이다
		
		// Student 인스턴스를 문자열로 변환하면 이런 모양이 되도록 설정한다 
		// 다양한 출력 메서드들이 객체의 toString()을 호출한다 
		return String.format("%s/%.2f/%s\n", 
				name, avg, grade);
	}
}













