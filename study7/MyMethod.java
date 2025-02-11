package study7;

import java.util.Scanner;

public class MyMethod {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("크기입력(제곱미터단위)>>");
		int size = scn.nextInt();
		roomSize(size);
		
		myCalc(10,20,"*");
		
	}
	public static void roomSize(int size) {
		double result = size * 0.3025;
		System.out.println("입력하신 "+size+"평방미터는 "+ result +"평입니다.");
		System.out.println("입력하신 "+size+"평방미터는 "+ (size*0.3025) +"평입니다.");
	}
	
	public static void myCalc(int a, int b, String c) { // 매개변수
		int result = 0;
		switch(c) {
			case "+" : result = a+b;
			break;
			case "-" : result = a-b;
			break;
			case "*" : result = a*b;
			break;
			case "/" : result = a/b;
			break;
		}
		System.out.println( a+c+b+"="+result ); // 10+20=30
	}
	
	// 합격(두 과목 모두60이상),불합격(두과목 모두 60점미만),재시험(둘중 하나만 60점 이상)
	public static String examResult(int score1, int score2) {
		
		String result = "";
		if( score1 >= 60 && score2 >= 60 ) {
			result = "합격";
		} else if( score1 < 60 && score2 < 60 ) {
			result = "불합격";
		} else {
			result = "재시험";
		}
		
		// 
		if( score1 >= 60 && score2 >= 60 ) {
			result = "합격";
		} else if( score1 >= 60 || score2 >= 60 ) {
			result = "재시험";
		} else {
			result = "불합격";
		}
		
		// 재시험의 잘못된 세팅
		if( score1 >= 60 && score2 >= 60 ) {
			result = "합격";
		} else if( score1 < 60 || score2 < 60 ) {
			result = "재시험";
		} else {
			result = "불합격";
		}
	
		return result;
	}
	

}





