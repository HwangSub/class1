package study11;

public class MySchool1 {

	static void test() {
		
	}
	
	public static void main(String[] args) {

		
		// String 변수의 값 "aa"은 보조메모리에 올라감
		// String 변수의 이름과 기본값(위치정보)은 주메모리에 올라감
		// 참조클래스
		String str1 = "aaa";   
		String str2 = new String("aa");
		
		MySubject1 java   = new MySubject1();
		MySubject1 oracle = new MySubject1();
		
		//java = "study11.MySubject1@7e6cbb7a";
		
		
		java.title = "자바의 첫걸음";
		java.price = 10000;
		
		oracle.title = "오라클 고급";
		oracle.price = 20000;

		System.out.println( java + "," + oracle );
		// 오라클의 위치정보를 자바로 전달
		// 결과적으로 자바의 위치정보는 상실되고  오라클의 위치정보가 들어감
		java = oracle; 
		System.out.println( java + "," + oracle );
		
		System.out.println( java.title + ":" + java.price );
		System.out.println( oracle.title + ":" + oracle.price );
		
	}

}
