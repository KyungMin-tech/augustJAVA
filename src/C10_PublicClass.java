
// 다른 패키지에서도 접근 가능한 Public class
public class C10_PublicClass {
	
	// public :  다른 패키지에서도 보인다
	// protected : 다른 패키지/ 같은 패키지
	// default : 같은 패키지
	// private : 같은 클래스
	
	
	public int public_var = 10;
	protected int protected_var = 10;
	int default_var = 10;
	private int private_var = 10;
	
	public void public_method() {}
	protected void protected_method() {}
	void default_method() {}
	private void private_method() {}

}

// 접근제어자가 붙지 않은 기본 설정의 클래스
class DefaultClass {
	
	public int public_var = 10;
	protected int protected_var = 10;
	int default_var = 10;
	private int private_var = 10;
	
	public void public_method() {}
	protected void protected_method() {}
	void default_method() {}
	private void private_method() {}
	
}



