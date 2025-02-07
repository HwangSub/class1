package study6;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열: 하나의 이름으로 여러 값을 가지는 변수
		int[] scores = {90,70,88};
		
		int sum = 0;
		for( int i=0; i<scores.length; i++ ) {  // 0 1 2
			System.out.println( scores[i] );
			sum += scores[i];
		}
		int avg = sum/scores.length;
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
		
		//int hap2 = 0;
		//hap2 += scores[0];
		//hap2 += scores[1];
		//hap2 += scores[2];
		
		// 1.java
		String[] subject = {"java","react","oracle"};
		for( int i=0; i<subject.length; i++ ) {  // 0 1 2
			System.out.println( (i+1)+"."+subject[i] );
		}
		System.out.println();
		System.out.println();
		
		// (풀어보기1)
		for(int i=1; i<=17; i++) {
			System.out.print(i);
			if( i%5 == 0 ) {
				System.out.print("**");
			}
			System.out.print(" ");
		}
		System.out.println();
		System.out.println();	
		
		// (풀어보기2)
		int[] mm = {1,3,10};
		for( int i=0; i<mm.length; i++ ) {	
			String str = "";
			if(mm[i] >= 3 && mm[i] <= 5)       str = "봄";
			else if(mm[i] >= 6 && mm[i] <= 8)  str = "여름";
			else if(mm[i] >= 9 && mm[i] <= 11) str = "가을";
			else str = "겨울";
			
			String zero = (mm[i] < 10)?"0":"";
			//String zero = "0";
			//String zero = "";
			System.out.print(zero+mm[i]+"월:"+str);
			System.out.println();
		}
		
		
		
	}

}



