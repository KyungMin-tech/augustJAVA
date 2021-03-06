
public class D09_throws {

	// throws 
	//	- 현재 메서드에서 발생하는 예외의 처리를 메서드를 호출한 곳으로 미룬다
	
	// ※ throws를 통해 이 메서드가 예외가 발생할 수 있는 메서드임을 알린다
	public static int div(int a, int b) throws ArithmeticException {
		return a / b;		
	} 
	
	public static void main(String[] args) {
		try {
			div(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누면 안됩니다.");
		}
		
		System.out.println("프로그램을 정상 종료 합니다.");
	}
}




