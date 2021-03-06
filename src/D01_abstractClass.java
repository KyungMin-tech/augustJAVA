
import myobj.cookie.*;
import myobj.maple.*;

public class D01_abstractClass {

	// 추상 클래스 (abstract class)
	//	- 추상 메서드를 가지고 있는 클래스 
	//	- 인스턴스를 생성할 수 없다
	
	// 추상 메서드 (abstract method)
	//	- 구현을 아무것도 하지 않고 비워놓은 메서드 
	//	- 추상 클래스를 상속받은 자식 클래스에게 구현을 미루는 메서드
	
	public static void main(String[] args) {
		// abstract class는 인스턴스를 생성할 수 없지만
		// 모든 자식 타입을 보관하는 케이스의 역할을 수행할 수는 있다
		// Cookie cookie00 = new Cookie();			
		Cookie cookie01 = new AngelCookie();
		Cookie cookie02 = new PirateCookie();
		Cookie cookie03 = new BraveCookie();
		
		cookie01.levelUp();
		cookie01.levelUp();
		
		cookie02.levelUp();
		cookie02.levelUp();
		cookie02.levelUp();
		
		cookie01.special();		
		cookie02.special();
		cookie03.special();
		
		Job maple01 = new Archer("궁수");
		Job maple02 = new Thief("도적");
		Job maple03 = new Warrior("전사");
		Job maple04 = new Wizard("마법사");
		
		maple01.generationVillage();
		maple02.generationVillage();
		maple03.generationVillage();
		maple04.generationVillage();
		
		
	}
}

// myobj및에 패키를 하나 생성하고 하나의 abstract 클래스와
// 그 클래스를 상속받아 구현한 클래스들을 정의해보세요
// ex> Weapon - Sword, Knife, Gun



















