package quiz;

public class B02_Gugudan {
	public static void main(String[] args) {
// 1. 구구단을 다음과 같이 가로로 출력해보세요

// 2단: 2X1=2 2X2=4 2x3=6 ...
// 3단: 3X1=3 3X2=6 3x3=9 ...
// ...

		for (int dan = 2; dan <= 9; ++dan) {
			// 한 줄의 시작
			System.out.printf("%d단: ", dan);
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);

			}
			System.out.println();
			// 한 줄의 마지막

		}
		System.out.println();
// 2. 구구단을 다음과 같이 세로로 출력해보세요

// 2단		3단 		4단 ...
// 2X1=2	3X1=3	4X1=4 ...
// 2X2=4	3X2=6	4X2=8 ...
// ...
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("%d단 \t", dan);
		}
		System.out.println();

		for (int gop = 1; gop <= 9; gop++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%dX%d=%d\t", dan, gop, dan * gop);
			}
			System.out.println();
		}
		for (int line = 0; line < 12; ++line) {
			for (int dan = 2; dan <= 9; ++dan) {
				if (line == 0)
					System.out.printf("%d단\t\t", dan);
				else if (line == 1)
					System.out.print("┌───────────┐\t");
				else if (line == 11)
					System.out.print("└───────────┘\t");
				else
					System.out.printf("│%d x %d = %-3d│\t", dan, line - 1, dan * (line - 1));
			}
			System.out.println();

		}

	}
}
