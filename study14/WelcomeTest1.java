package study14;

public abstract class WelcomeTest1 {

	int eng = 100;   // 멤버변수, 인스턴스변수
	int kor = 90;
	
	abstract public void welcome1();
	abstract public String welcome2();
	
	// 매개변수와 위의 멤버변수와는 같은 이름이라도 무관함
	abstract public void welcome3(int a, String b);
	
	// public String welcome3(); abstract 생략 불가능
	
	/* 일반 메소드에 abstract(키워드) 세팅 불가
	  abstract public void welcome4() {
		 System.out.println("방가방가!!");
	  }
	*/
	public void welcome5() {
		System.out.println("방가방가!!");
	}
}





