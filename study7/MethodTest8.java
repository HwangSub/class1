package study7;

public class MethodTest8 {
	
	public static void main(String[] args) {
		//System.out.println(  args[0]  );
		//System.out.println(  args[1]  );
		int number = 62;
		
		System.out.println( getGender("F") );
		System.out.println("--------------");
		
		numberGubun(number);  // 양수 출력
		System.out.println("--------------");
		
		System.out.println( getGrade(number) +"학점" ); // D학점
		System.out.println("--------------");
		
		System.out.println( getGrade2(number) +"학점" ); //D0학점
		System.out.println("--------------");
		
		gugudan(number);  // 62단 출력
	}
	
	// 남성 또는 여성 이라는 값이 리턴
	public static String getGender(String gender) {
		String value;
		if( gender.equals("M") ) value = "남성";
		else if( gender.equals("F") ) value = "여성";
		else value = "설정안됨";	
		return value;
	}
	
	public static void numberGubun(int number) {
		String str = "";
		if( number > 0 ) str = "양수";
		else if( number < 0 ) str = "음수";
		else str = "0";
		System.out.println( str + "입니다." );
	}
	
	public static String getGrade(int score) {
		String str = "";
		if(score<=100 && score>=90)     str = "A";
		else if(score<=89 && score>=80) str = "B";
		else if(score<=79 && score>=70) str = "C";
		else if(score<=69 && score>=60) str = "D";
		else if(score<=59 && score>=0)  str = "F";
		else str = "error";
		return str;
	}
	// A+(95~100),A0 / B+(85~89),B0(80~84)
	public static String getGrade2(int score) {
		String str = "";
		if(score<=100 && score>=95)     str = "A+";
		else if(score<=94 && score>=90) str = "A0";
		else if(score<=89 && score>=85) str = "B+";
		else if(score<=84 && score>=80) str = "B0";
		else if(score<=79 && score>=75) str = "C+";
		else if(score<=74 && score>=70) str = "C0";
		else if(score<=69 && score>=65) str = "D+";
		else if(score<=64 && score>=60) str = "D0";
		else if(score<=59 && score>=0)  str = "F";
		else str = "error";
		return str;
	}
	
	public static void gugudan(int number) {
		for(int i=1; i<=9; i++) {
			// 3x1=3 , 3x2=6
			System.out.println( number+"x"+i+"="+(number*i) );
		}
	}

}





