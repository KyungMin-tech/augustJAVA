package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import myobj.Student;

public class D07_sortByAvg {

	// ArrayList�� ����/����/���� ������ ������ �ִ� �л� ��ü�� 100�� �߰��ϰ�
	// ��� �л��� ������� �������� �����غ�����

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




