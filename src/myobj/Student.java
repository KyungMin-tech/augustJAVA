package myobj;

public class Student {

	int kor;
	int eng;
	int math;
	
	double avg;
	
	public static String[] randomNameList = {
			"ȫ�浿", "��浿", "�ڱ浿", "�̱浿", "�ֱ浿"
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
	
	// �޼��带 ���� �ʵ尪�� �������� ���� ǥ���̴�. (getter)
	public double getAvg() {
		return avg;
	}
	
	@Override
	public String toString() {	
		// Object.toString() �޼���
		//	- Object Ŭ������ �޼����̹Ƿ� ��� Ŭ������ ���� ������ �ִ� �޼���
		//	- �ش� ��ü�� ���ڿ��� ǥ���ؾ� �� �� ��� ǥ�������� ������ �� �ִ�
		//	- System.out.println()�� ��� ������ ��ü�� toString()�� 
		//    �ֿܼ� ����ϴ� ���̴�
		
		// Student �ν��Ͻ��� ���ڿ��� ��ȯ�ϸ� �̷� ����� �ǵ��� �����Ѵ� 
		// �پ��� ��� �޼������ ��ü�� toString()�� ȣ���Ѵ� 
		return String.format("%s/%.2f/%s\n", 
				name, avg, grade);
	}
}













