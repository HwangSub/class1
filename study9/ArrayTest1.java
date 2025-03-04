package study9;

/**
 *   [ 9강 ] 풀어보기
 */
public class ArrayTest1 {

	public static void main(String[] args) {

		// 풀어보기 (1)
		int age1 = 105;
		int age2 = 82;
		int age3 = 98;
		
		int maxAge = Math.max(age1, Math.max(age2, age3));
		int minAge = Math.min(age1, Math.min(age2, age3));
		System.out.println("제일 많은 나이는 "+maxAge+"세이고 "
				         + "제일 적은 나이는 "+minAge+"세 입니다.");
		System.out.println("----------------------");
		
		// 풀어보기 (2)
		int[] a1 = {50,80,-40,92,72,54,77};
		int sum = 0;
		for( int i=0; i<a1.length; i++ ) { 
			sum += Math.abs(a1[i]);
		}
		int avg = sum/a1.length;
		double avg1 = (double)(sum/a1.length);
		System.out.println("합계:"+sum+",평균:"+avg);
		System.out.println("----------------------");
		
		
		// {50,80,-40,92,72,54,77};
		// 풀어보기 (3)
		int max = 0;
		for( int i=0; i<a1.length; i++ ) {
			int number = Math.abs(a1[i]);
			max = Math.max(max, number);
			// Math.max(0, 50); ->  max = 50;
			// Math.max(50,80); ->  max = 80;
			// Math.max(80,40); ->  max = 80;
			// Math.max(80,92); ->  max = 92;
			// Math.max(92,72); ->  max = 92;
			// Math.max(92,54); ->  max = 92;
			// Math.max(92,77); ->  max = 92;
		}
		System.out.println( "최대값:"+max );

		// {50,80,-40,92,72,54,77};
		int min = 0;
		for( int i=0; i<a1.length; i++ ) {
			int number = Math.abs(a1[i]);
			if( i > 0 ) {
				min = Math.min(min, number); // 50->50->40
			} else if( i==0 ) {
				min = number;
			}
		}
		System.out.println( "최소값:"+min );
	}
}
