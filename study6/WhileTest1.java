package study6;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		int c = 1;
		if( c <= 10) {
		//	System.out.println(c+" ");
		}
		/*for(;;) {
			System.out.println("b");
		}*/
		
		/*while(true) {
			System.out.println("b");
		}*/
		
		int a = 1;
		while(a<=10) {
			System.out.print(a+" ");
			++a;
		}
		System.out.println();
		System.out.println();

		// 10 ~ 1
		int b = 10;
		while( b>=1 ) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println();
		System.out.println();
		
		// 10 ~ 100 (10씩 증가)
		int d = 10;
		while( d <= 100 ) {
			System.out.print(d+" ");
			d+=10;
		}
		System.out.println();
		System.out.println();
		
		// 1 2 3 4 5 6 7 9 10 11 ~~
		// 20
		// 30
		
		Scanner scn = new Scanner(System.in);
		int cnt = 1;
		while(true) { // 무한루프
			System.out.print(cnt + " ");
			if( cnt%10==0 ) {
				System.out.print("계속실행?('Y')>>");
				String str = scn.next();
				if( !str.equals("Y") ) {
					System.out.println("종료됐습니다.");
					break;
				}
			}
			cnt++;
		}	
	}
}




