package calendar;

import java.util.Scanner;

public class calendar1 {
	public static void main(String[] args) {
		
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("---------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		Scanner scanner = new Scanner(System.in); //입력받기, new Scanner 대문자.
		System.out.println("달을 입력해주세요.");
		int month = scanner.nextInt();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31 }; //maxDays라는 int[]배열 타입을 생성한다.
		
		System.out.printf("%d의 최대 일수는 %d입니다.\n", month, maxDays[month-1]); //maxDays배열을 쓸 때는 [month]같이 써야 함.
		//배열은 0부터 시작하므로, month-1로 해야 정확한 값이 들어간다.
		scanner.close();
	}
}
