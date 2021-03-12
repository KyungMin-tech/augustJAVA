package quiz;

import myobj.person.*;

public class C09_ProjectProgress {

	// �ҹ�� / ������ / ���α׷���
	
	// 0. �ν��Ͻ� ������ �̸��� ���̸� �Է��� �ʿ䰡 ������ ���ĺ�����  
	
	// 1. ũ�� 20�� Person �迭�� ����� 20�� ���� �غ����� (������ �������� ����) 
	
	// 2. ������ Person�迭�� �����ϴ� ���α׷��� �Ѹ���  
	//    ������Ʈ ���൵�� 5�� ������Ų �� ����غ����� 
	//	  (���൵�� 0���� ����, �ν��Ͻ� ������ ���ÿ� ������� ���� ���� ����)
	
	public static void main(String[] args) {
		
		// PersonŸ�� �ν��Ͻ��� ������ ������ �� �ִ� �迭�� ����
		Person[] ps = new Person[20];
		
		for (int i = 0; i < ps.length; ++i) {			
			
			switch ((int)(Math.random() * 3)) {
			case 0:
				ps[i] = new Police();
				break;
			case 1:
				ps[i] = new Programmer();
				break;
			case 2:		
				ps[i] = new FireFighter();
				break;
			}						
			
		}
		
		
		// int progress = 0;
		
		Project project_a = new Project();
		
		for (Person p : ps) {
			
			if (p instanceof Programmer) {
				((Programmer) p).doProject(project_a);
			}
			
		}
		
		System.out.printf("���α׷��ӵ��� ������Ʈ�� %d%% ������׽��ϴ�.\n", 
				project_a.progress);
	}
	
}















