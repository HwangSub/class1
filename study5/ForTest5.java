package study5;

public class ForTest5 {

	public static void main(String[] args) {

		// ex1) -5 ~ 5
		for( int i=-5; i<=5; i++ ) {
			System.out.print(i + " ");
		}
		System.out.print("\n\n");
		
		// ex2) 101 ~ 109
		for( int i=101; i<=109; i++ ) {
			System.out.print(i + " ");
			if( i==103 || i==106 ) {
				System.out.println();
			}
		}
		System.out.print("\n\n");
		
		int cnt = 0;
		for( int i=101; i<=200; i++ ) {
			cnt++;
			System.out.print(i + " ");
			if( cnt%3 == 0 ) {
				System.out.println();
			}
		}
		System.out.print("\n\n");
		
		// ex3)
		for( int i=2; i<=4; i++ ) {
			System.out.println("<font size='"+i+"'>java</font>");
		}
		System.out.print("\n\n");
		
		// ex4) 시간
		for( int i=0; i<=23; i++ ) {
			String msg = "";
			
			if( i>=0 && i<=5 )       msg = "새벽";
			else if( i>=6 && i<=11 ) msg = "아침";
			else if( i>=12 && i<=18 )msg = "오후";
			else msg = "저녁";
			
			System.out.println(msg +" "+ i + "시");
		}	
	}
}
