package honux.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;

		while (true) {
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) { // -1이면 루프를 빠져나가는 것.
				break;
			}

			if (month > 12) {
				continue; // continue는 만나면 루프의 처음으로 돌아감.
			}

			cal.printCalendar(2023, month);

		}

		System.out.println("Bye~");
		scanner.close();
	}

	public static void main(String[] args) {

		// 셸 실행
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
