package study10;

public class StudentInfo {
	int eng = 0;		//맴버변수,인스턴스(객체)변수
	int kor = 0;
	String name = "";
	
	// static 생략됨
	public int hap() {  // 0점
		return eng + kor;
	}
	
	public int avg() {  
		return hap()/2;
	}
}
