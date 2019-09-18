package calendar;

import java.util.Scanner;

public class calendar1 {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31 };
	
	public int getMaxDaysOfMonth(int month) { //함수로 로직을 빼서 재사용할 수 있게 한다. int로 받아서 int로 되돌려준다
		return MAX_DAYS[month-1];
	}
	public void printSampleCalendar() {

		System.out.println("일  월  화  수  목  금  토");
		System.out.println("---------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		Scanner scanner = new Scanner(System.in); //입력받기, new Scanner 대문자.
		calendar1 cal = new calendar1();
		System.out.println("달을 입력해주세요.");
		int month = scanner.nextInt(); //변수 int month 선언, nextInt로 정수 입력받음.
		
		System.out.printf("%d월의 최대 일수는 %d입니다.\n", month, cal.getMaxDaysOfMonth(month)); //maxDays배열을 쓸 때는 [month]같이 써야 함.
		//배열은 0부터 시작하므로, month-1로 해야 정확한 값이 들어간다. 
		//getMaxDaysOfMonth 라는 함수 사용.
		cal.printSampleCalendar();
		scanner.close();
	}
}
