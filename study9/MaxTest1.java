package study9;

public class MaxTest1 {

	public static void main(String[] args) {

		int a1 = 99;
		int a2 = 150;
		int a3 = 95;
		int a4 = 999;
		System.out.println( myMin(88,55) ); // 55

	}
	// 사용자 메소드 ;  매개변수 : 외부 데이터 값을 받는 변수
	public static int myMax3(int n1,int n2,int n3) {
		int max = Math.max(n1, Math.max(n2, n3));
		return max;
	}
	public static int myMax4(int n1,int n2,int n3,int n4) {
		int max = Math.max(n1, 
				  Math.max(n2, 
				  Math.max(n3, n4)));
		return max;
	}
	public static int myMax5(int n1,int n2,int n3,int n4,int n5) {
		int max = Math.max(n1, 
				  Math.max(n2, 
				  Math.max(n3, 
				  Math.max(n4, n5))));
		return max;
	}
	public static int myMin(int a, int b) {
		
		int min = (a < b)? a : b ;
		/*if( a > b ) {
			min = b;
		} else if( a < b) {
			min = a;
		} else {
			min = a;
		}*/
		return min;
	}
	
	
}
