package study4;

public class Test3 {

	public static void main(String[] args) {

		String name = "홍길동";
		String gender = "M";
		String address = "구리시";
		
		String msg = "";
		if( gender == "M") {
			msg = "남성";
		} else if( gender == "F") {
			msg = "여성";
		} else {
			msg = "설정안됨";
		}
		System.out.println("이름은 "+name+"이고 주소는 "+address+"이며 성별은 "+msg+"입니다.");

		System.out.println("---------------");
		
		int time1 = 11;
		int time2 = 12;
		
		if( time1 != time2 ) {
			System.out.println("점심시간 아님");
		} else {
			System.out.println("점심시간 입니다.");
		}
		System.out.println("---------------");
		
		int kor = 68;
		int eng = 40;
		String txt = "";
		// 두 과목 모두 60점 이상은 합격 그렇지 않으면 불합격
		// AND연산자 (&&)
		// ( 연산식&&연산식 ) 모두 참이어야 한다.
		if( kor >= 60 && eng >= 60 ) {
			txt = "합격";
		} else {
			txt = "불합격";
		}
		System.out.println( txt + "입니다." );
		
		// 두 과목 하나라도 60점 이상이면 합격
		// OR연산자(||) , 또는
		if( kor >= 60 || eng >= 60 ) {
			txt = "합격";
		} else {
			txt = "불합격";
		}
		System.out.println( txt + "입니다." );
	}
}
