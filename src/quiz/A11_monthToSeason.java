package quiz;

import java.util.Scanner;

public class A11_monthToSeason {
	
	// switch-case���� �̿��ؼ�
	// ����ڷκ��� ���� �Է¹����� �ش���� �ش��ϴ� ������ ����غ�����
	
	// main ���� Ctrl + space
	public static void main(String[] args) {
		
//		sysout ���� Ctrl + space
		System.out.println("���� �Է�>");
		
		int month = new Scanner(System.in).nextInt();
		
		String season;
		
		switch (month) {
		case 1: case 2:	case 12:case 11:
			season = "�ܿ�";
			break;
		case 3: case 4: case 5:		
			season = "��";
			break;
		case 6:	case 7:	case 8:		
			season = "����";
			break;
		case 9: case 10: 		
			season = "����";
			break;
		default: 
			season = "���� ��";
			break;
				
		}
		System.out.printf("%d���� %s�Դϴ�", month, season);
		
	}
}
	
		
		
