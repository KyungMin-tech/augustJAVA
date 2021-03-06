package quiz;

import java.util.ArrayList;

import myobj.Student;

public class D04_studentList {

	// 1. ArrayList에 학생을 100명 추가해보세요 
	
	// 2. 학생은 국어/영어/수학 점수와 이름/학년을 가진 객체입니다
	//	  (인스턴스 생성시 모든 값이 적절한 랜덤값으로 초기화 되도록 할 것)
	
	// 3. 리스트에 저장된 모든 학생의 이름/평균 점수/학년을 출력해보세요  
	
	// ※ 학생 클래스는 다른 패키지에 선언해서 사용해보세요
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		// 학생 100명 생성
		for (int i = 0; i < 100; ++i)
			students.add(new Student());
		
		// 리스트의 모든 학생 출력
		for (Student s : students) 
			System.out.println(s);
		
	}
}










