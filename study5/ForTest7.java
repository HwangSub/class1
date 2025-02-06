package study5;

public class ForTest7 {

	public static void main(String[] args) {

		// 무한루프(끝없는 반복)
		int a = 0;
		for(;;) {
			a++;
			//System.out.println(a);
			if( a == 100 ) {
				break; // 반복문의 종료
			}
		}

		for(int i=1; i<=100; i++) {
			//System.out.println(i);
			if( i == 50 ) {
				break; 
			}
		}
		
		for(int i=1; i<=100; i++) {
			if( i == 50 ) {
				continue;
			}
			System.out.println(i);
		}
	}
}
