package study6;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int number = 0;
		while(true) {
			if( number != 0 && number%10 == 0 ) {
				System.out.print("계속출력('Y'),종료('N') >>");
				String str = scn.next();
				if( str.equals("N") ) {
					System.out.println("종료하겠습니다.");
					break;
				} else if( !str.equals("Y") ) {
					continue;
				}
			}
			number++;
			System.out.println(number);
		}	
	}
}
