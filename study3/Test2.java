package study3;

/**
 * 변수의 종류 알아보기
 */
public class Test2 {

	public static void main(String[] args) {

		byte  a1 = 90;
		short a2 = 90;
		int   a3 = 90;
		long  a4 = 90;
		
		//byte  aa1 = 128; error ( -128~127 )
		short aa2 = 128;
		int   aa3 = 128;
		long  aa4 = 128;
		
		//short b1 = 32768; error(-32768~32767)
		int   b2 = 32768;
		long  b3 = 32768; // ( 기본 int )
		
		//int   bb2 = 2200000000;  error (-21억 ~ 21억)  
		long  bb3 = 2200000000L;
		
		System.out.println( bb3 );
		
		float f1 = 1.1234F;
		System.out.println( f1 );
		
		float f2 = 1.123456789f;      // 소수점 아래 7개의 유효숫자
		System.out.println( f2 );
		
		double d1 = 1.123456789;
		System.out.println( d1 );
		
		double d2 = 1.12345678912345; // 소수점 아래 15개의 유효숫자
		System.out.println( d2 );
		
		System.out.println("-------------------");
		
		// 문자타입(char) : 단 1개의 문자만 담을 수 있음
		char c1 = 'a';     // 97
		//char c2 = 'ab';  // x
		//char c3 = "a";    // x
		char c4 = 'K';
		char c5 = '가';
		//char c6 = '가나';
		System.out.println(c1 + "," + c4 + "," + c5);
		System.out.println( (int)c1 + "," + (int)c4 + "," + (int)c5);
		
		char u1 = 'a';  // 97
		System.out.println(u1);    // a
		u1++;           // 1증가  98
		System.out.println(u1);    // b
		
		// ※
		System.out.println("※");
		char c11 = '※';
		System.out.println(c11);
		System.out.println( (int)c11 );

		char c12 = 8251;
		System.out.println( "당구장 : " + c12);
		
	
		String s1 = "a";
		//String s2 = 'a';  // error
		System.out.println(s1); // a
		//s1++;  // error
		
	
		int jj = 100;
		char cc = 'a';
		String ss = "javascript oracle";
	
	}

}



