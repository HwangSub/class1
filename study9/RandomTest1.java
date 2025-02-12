package study9;

public class RandomTest1 {

	public static void main(String[] args) {

		int a1 = (int) 0.1234;  // 소숫점 자리를 버림 -> 0
		int a2 = (int) 21.1234; // 소숫점 자리를 버림 -> 21
		rotto();
	}
	public static void rotto() {  // return 키워드가 없는 메소드
		// 1 ~ 45 사이의 랜덤 값
		int r1 = (int)(Math.random()*45) + 1;
		int r2 = (int)(Math.random()*45) + 1;
		int r3 = (int)(Math.random()*45) + 1;
		int r4 = (int)(Math.random()*45) + 1;
		int r5 = (int)(Math.random()*45) + 1;
		int r6 = (int)(Math.random()*45) + 1;
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5+" "+r6 );
	}
	public static String rotto7() { // return 키워드가 무조건 존재
		// 1 ~ 45 사이의 랜덤 값
		int r1 = (int)(Math.random()*45) + 1;
		int r2 = (int)(Math.random()*45) + 1;
		int r3 = (int)(Math.random()*45) + 1;
		int r4 = (int)(Math.random()*45) + 1;
		int r5 = (int)(Math.random()*45) + 1;
		int r6 = (int)(Math.random()*45) + 1;
		
		String rotto = r1+" "+r2+" "+r3+" "+r4+" "+r5+" "+r6;
		return rotto;
	}

}
