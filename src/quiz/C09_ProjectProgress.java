package quiz;

import myobj.person.*;

public class C09_ProjectProgress {

	// 소방관 / 경찰관 / 프로그래머
	
	// 0. 인스턴스 생성시 이름과 나이를 입력할 필요가 없도록 고쳐보세요  
	
	// 1. 크기 20의 Person 배열에 사람을 20명 생성 해보세요 (직업을 랜덤으로 선택) 
	
	// 2. 생성한 Person배열에 존재하는 프로그래머 한명당  
	//    프로젝트 진행도를 5씩 증가시킨 뒤 출력해보세요 
	//	  (진행도는 0부터 시작, 인스턴스 생성과 동시에 몇명인지 세는 것은 금지)
	
	public static void main(String[] args) {
		
		// Person타입 인스턴스를 여러개 저장할 수 있는 배열을 선언
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
		
		System.out.printf("프로그래머들이 프로젝트를 %d%% 진행시켰습니다.\n", 
				project_a.progress);
	}
	
}
















