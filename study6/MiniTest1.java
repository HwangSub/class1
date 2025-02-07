package study6;

import java.util.Scanner;

public class MiniTest1 {

	public static void main(String[] args) {

		// 1번 작업공간 위치 설명
		/*
		 *  이클립스의 ~~
		 */
		
		// 2번  (100%)
		String nickname = "뻐꾸기";
		int point = 1000;
		point += 300;
		point -= 20;
		
		System.out.println("현재 "+nickname+"님의 보유 포인트는 "+point+"P 입니다.");
		System.out.println();

		// 3번
		int yy = 1998;
		int mm = 10;
		int dd = 21;
		
		String zero = (mm < 10)?"0":"";
		//String zero = "0";
		//String zero = "";
		
		String birthday = yy+"/"+zero+mm+"/"+dd; // 10,11,12
		int age = 2025 - yy;
		String str = "";
		
		if(mm >= 3 && mm <= 5)  str = "봄";
		else if(mm>=6 && mm<=8) str = "여름";
		else if(mm>=9 && mm<=11)str = "가을";
		else str = "겨울";

		System.out.println("회원님의 생일은 "+birthday+"로 올해 "+age+"세이고 "+str+"에 태어났습니다.");
		System.out.println();
		
		// 4번
		for ( int i=0; i<=23; i++ ) {
			String zero4 = (i<10)?"0":"";
			System.out.print( zero4+i+"시, " );
		}
		System.out.println();
		System.out.println();
		
		// 5번
		for ( int i=10; i<=50; i+=10 ) { // 10 20 30 40 50
			System.out.print(i+"대");
			if( i < 50 ) System.out.print(",");
		}
		System.out.println();
		System.out.println();
		
		// 6번
		for( int i=3; i<=9; i+=3 ) { // 3 6 9
			System.out.print(i + " ");
			for( int j=1; j<=i; j++) {
				System.out.print("*");                             
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		// 7번
		Scanner scn = new Scanner(System.in);
		System.out.print("끝번호 입력>>");
		int end = scn.nextInt();
		
		System.out.print("알아볼 배수 값 입력>>");
		int num = scn.nextInt();
		
		int cnt = 0;
		for(int i=1; i<=end; i++) {
			int ret = i%num; // 배수
			if( ret == 0 ) {
				cnt++;
				//System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println( num+"의 배수의 개수는 " + cnt);
	}
}




