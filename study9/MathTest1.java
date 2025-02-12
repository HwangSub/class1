package study9;

public class MathTest1 {

	public static void main(String[] args) {

		double d1 = 98.7;
		double d2 = 98.4;
		
		// 1. ceil() 메소드 : 소숫점 자리 아래를 올림
		System.out.println( Math.ceil(d1) );     // 99.0
		System.out.println( Math.ceil(d2) );     // 99.0
		System.out.println( Math.ceil(77.123) ); // 78.0
		
		// 2. floor() 메소드 : 소숫점 자리 아래를 내림(버림)
		System.out.println( Math.floor(d1) );     // 98.0
		System.out.println( Math.floor(d2) );     // 98.0
		System.out.println( Math.floor(77.123) ); // 77.0
		
		// 3. round() 메소드 : 반올림 ( .5기준으로 올림)
		System.out.println( Math.round(98.2) ); // 98
		System.out.println( Math.round(98.4) ); // 98
		System.out.println( Math.round(98.5) ); // 99
		System.out.println( Math.round(98.6) ); // 99
		System.out.println( Math.round(98.9) ); // 99
		
		// 4. rint() 메소드 : 반올림 ( .6기준으로 올림)
		System.out.println( Math.rint(98.2) ); // 98.0
		System.out.println( Math.rint(98.4) ); // 98.0
		System.out.println( Math.rint(98.5) ); // 98.0
		System.out.println( Math.rint(98.6) ); // 99.0
		System.out.println( Math.rint(98.9) ); // 99.0
		
		// 5. abs() 메소드 :  절대값(), 음수를 양수로 바꾸는 메소드
		System.out.println( Math.abs(-50) );   // 50
		System.out.println( Math.abs(70) );    // 70   
		System.out.println( Math.abs(-50.7) ); // 50.7
		
		// 6. pow() 메소드 : 제곱, 3제곱
		System.out.println( Math.pow(10,2) ); // 10*10 -> 100.0
		System.out.println( Math.pow(10,3) ); // 10*10*10 -> 1000.0
		System.out.println( Math.pow(5,2) );  // 5*5 => 25.0
		
		// 7. sqrt() 메소드 : 제곱근
		System.out.println( Math.sqrt(100) ); // 10.0
		System.out.println( Math.sqrt(25) );  // 5.0
		
		// 8. max() : 큰값반환  / min() : 작은값을 반환 
		System.out.println( Math.max(100,90) ); // 100
		System.out.println( Math.min(100,90) ); // 90
		
		// 9. 싸인 ~
		System.out.println( Math.sin(1.1234) );
		System.out.println( Math.cos(1.1234) );
		System.out.println( Math.tan(1.1234) );
		
		System.out.println("-----------------");
		
		// 10. 난수발생
		//  0 보다 크고 1 보다 작은 실수 타입의 값
		//  0.0000000000001 ~ 0.999999999999
		double rn = Math.random();
		System.out.println( rn );
		//  0 ~ 99
		System.out.println( rn*100 );
		
	    //  0.0000000000001 ~ 0.999999999999
		
		//  0 ~  (int) 99.999999999 -> 99
		System.out.println( (int)(rn*100) );
		// 1 ~ 100
		System.out.println( (int)(rn*100) + 1 );
		
		// 0 ~ 44
		// 0.000001 * 45 -> (int)0.00045 -> 0
		// 0.999999 * 45 -> (int)44.9999 -> 44
		System.out.println( (int)(rn*45) );
		
		// 1 ~ 45
		System.out.println( (int)(rn*45) + 1 );
	
	}

}
