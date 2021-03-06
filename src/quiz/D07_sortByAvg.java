package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import myobj.Student;

public class D07_sortByAvg {

	// ArrayList에 국어/영어/수학 점수를 가지고 있는 학생 객체를 100개 추가하고
	// 모든 학생을 평균점수 기준으로 정렬해보세요

	public static void main(String[] args) {

		ArrayList<Student> student_list = new ArrayList<>();

		for (int i = 0; i < 100; ++i)
			student_list.add(new Student());

//		System.out.println(student_list);
		
		Collections.sort(student_list, new Comparator<Student>(){
			
			
			@Override
			public int compare(Student s1, Student s2) {

				return (int)(s1.getAvg() - s2.getAvg());
			}
		});
		System.out.println(student_list);

	}

}




