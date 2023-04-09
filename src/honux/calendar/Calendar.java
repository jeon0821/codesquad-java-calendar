package honux.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printCalendar(int year, int month) {
		System.out.printf("  <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		int maxDay = getMaxDaysOfMonth(month);
		
		for(int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == 0)
				System.out.println();
		}
		
		System.out.println();
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		String PROMPT="cal>";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		
		while(true) {
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if(month == -1) { // -1이면 루프를 빠져나가는 것.
				break;
			}
			
			if(month > 12) {
				continue; // continue는 만나면 루프의 처음으로 돌아감.
			}
			
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month)); // 배열의 인덱스는 0부터 시작이라서

		}
		
		System.out.println("Bye~");
		scanner.close();
	}

}
