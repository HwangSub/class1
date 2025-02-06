package study5;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("구구단 숫자>>");
		int dan = scn.nextInt();
		
		for( int i=1; i<=9; i++ ) {
			System.out.println( dan+"x"+i+"="+(dan*i) );
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("별 출력 개수 입력>>");
		int nn = scn.nextInt();
		for( int i=1; i<=nn; i++ ) {
			System.out.print("*");
		}
		
		System.out.println();
		System.out.println();
		
		// 달력형식 ( 1 ~ 31 ) 한 출에 7개씩 
		for( int d=1; d<=31; d++ ) {
			if( d < 10 ) {
				System.out.print("0");
			}
			System.out.print( d + " " );
			if(d%7 == 0) {
				System.out.println();
			}	
		}

		System.out.println();
		System.out.println();
	}
}
