package study4;

public class Test7 {

	public static void main(String[] args) {

		String name = "김철수";
		int kor = 20;
		String str = "";
		if( kor<=100 && kor>=90 ) {
			str = "A학점";
		} else if( kor<90 && kor>=80 ) {
			str = "B학점";
		} else if( kor<80 && kor>=70 ) {
			str = "C학점";
		} else if( kor<70 && kor>=60 ) {
			str = "D학점";
		} else if( kor<60 && kor>=0 ) {
			str = "F학점";
		} else {
			str = "잘못된 점수";
		}
		System.out.println( name+"의 점수는 "+kor+"점으로 "+str+" 입니다.");
	}
}
