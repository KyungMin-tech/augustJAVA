package myobj.person;

public class FireFighter extends Person {
	
	public FireFighter() {}
	
	public FireFighter(String name, int age) {
		super(name, age);
	}
	@Override
	public void attack() {
		System.out.printf("'%s'가 물대포를 쏩니다. 데미지가 강합니다. 상대는 죽었습니다\n", name);		
	}
	public void fireRepress(String building) {
		System.out.printf("%s에 불이나서 '%s'이(가) 화재 진압하러 갑니다. 화재진압은 성공적입니다.\n", building, name);
	}

}
