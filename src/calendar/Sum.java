package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 입력: 키보드로 두 수를 입력받음
		// 출력: 화면에 두 수의 값을 출력
		int a,b; //변수 선언
		Scanner scanner = new Scanner(System.in); //scanner 사용
		String s1, s2;
		System.out.println("두 수를 입력해주세요.");
		s1 = scanner.next(); //next()는 입력받은 값이 반드시 스트링이어야 함. 문자열
		s2 = scanner.next();
		a = Integer.parseInt(s1); // a에 형변환해서 정수형으로 저장
				//정수형 클래스 Integer를 활용해서 
		b = Integer.parseInt(s2);
//		System.out.println(a + ", " + b);
		
//		int c = a+b;
//		System.out.println("두 수의 합은 "+ (a+b) + "입니다.");
		System.out.printf("두 수의 합은 %d입니다.", a+b);
		scanner.close();
	}
}
