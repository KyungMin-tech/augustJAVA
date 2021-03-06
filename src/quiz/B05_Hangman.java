package quiz;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class B05_Hangman {

	// 행맨을 만들어보세요

	// 1. 프로그램이 시작되면 랜덤으로 한 단어를 정답으로 선택한다

	// 2. 사용자가 단어를 맞출 때 까지 10번의 기회를 준다

	// 3. 사용자는 하나의 영문자를 선택해 입력한다

	// 4. 단어를 맞추면 단어를 하나씩 보여주고 10번 틀리면 게임에 패배한다

	// ex> 정답이 apple인데 사용자가 p를 맞춘경우 => _ p p _ _

	public static void main(String[] args) {

		Scanner guess = new Scanner(System.in);
		Random ans_seed = new Random();

		String[] wordBank = { "apple", "banana" };
		String[] HANGMANPICS = {
				"  +---+\r\n" + "  |   |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
						+ "=========",
				"  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
						+ "=========",
				"  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "  |   |\r\n" + "      |\r\n" + "      |\r\n"
						+ "=========",
				"  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|   |\r\n" + "      |\r\n" + "      |\r\n"
						+ "=========",
				"  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + "      |\r\n" + "      |\r\n"
						+ "=========",
				"  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /    |\r\n" + "      |\r\n"
						+ "=========",
				"  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " / \\  |\r\n" + "      |\r\n"
						+ "=========" };

		while (true) {
			String answer = wordBank[ans_seed.nextInt(wordBank.length)];
			boolean[] check = new boolean[answer.length()];

			int picNum = 0;
			while (picNum < HANGMANPICS.length - 1) {

				System.out.println(HANGMANPICS[picNum]);

				for (int i = 0; i < check.length; ++i) {
					if (!check[i])
						System.out.print("_ ");
					else
						System.out.print(answer.charAt(i) + " ");
				}
				System.out.println();

				System.out.print("Your guess : ");

				String user = guess.nextLine().toLowerCase();

				if (answer.contains(user.subSequence(0, 1))) {
					for (int i = 0; i < check.length; ++i) {
						if (user.charAt(0) == answer.charAt(i)) {
							check[i] = true;
						}
					}
				} else {
					++picNum;
				}

				boolean success = true;
				for (int i = 0; i < check.length; ++i) {
					if (!check[i]) {
						success = false;
						break;
					}
				}

				if (success) {
					System.out.println();
					System.out.println("You made it!!!");
					System.out.print("Another word? (y/N) ");
					break;
				} else if (!success && picNum == HANGMANPICS.length - 1) {
					System.out.println();
					System.out.println("Game Over! You run out of lives!");
					System.out.printf("The word was \"%s\"\n", answer);
					System.out.print("Wanna play again? (y/N) ");
					break;
				}
			}

			char choice = guess.nextLine().charAt(0);

			if (choice == 'y' || choice == 'Y') {
				System.out.println("Starting new game ...");
			} else {
				System.out.println("Good bye!");
				break;
			}
		}
	}
}
