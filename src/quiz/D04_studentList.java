package quiz;

import java.util.ArrayList;

import myobj.Student;

public class D04_studentList {

	// 1. ArrayList�� �л��� 100�� �߰��غ����� 
	
	// 2. �л��� ����/����/���� ������ �̸�/�г��� ���� ��ü�Դϴ�
	//	  (�ν��Ͻ� ������ ��� ���� ������ ���������� �ʱ�ȭ �ǵ��� �� ��)
	
	// 3. ����Ʈ�� ����� ��� �л��� �̸�/��� ����/�г��� ����غ�����  
	
	// �� �л� Ŭ������ �ٸ� ��Ű���� �����ؼ� ����غ�����
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		// �л� 100�� ����
		for (int i = 0; i < 100; ++i)
			students.add(new Student());
		
		// ����Ʈ�� ��� �л� ���
		for (Student s : students) 
			System.out.println(s);
		
	}
}









