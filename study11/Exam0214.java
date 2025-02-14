package study11;

public class Exam0214 {

	public static void main(String[] args) {

		method1();
		System.out.println();
		System.out.println("---------------");
		
		double ret1 = method2(30,50);
		System.out.println(ret1);
		System.out.println("---------------");
		
		String jumin = "880201-1023154";
		
		method3(jumin);
		System.out.println("---------------");
		
		System.out.println( "나이:" + method4(jumin) ); 
		
		
	}
	public static void method1() {
		// 0 ~ 9까지 출력
		int a=0;
		while(a<10) { // a<=9
			System.out.print(a+" ");
			a++;
		}
	}
	
	public static double method2(int a, int b) {
		int hap = a+b;
		double avg = (double)hap/2;  // 32.121212
		return avg;
	}
	// 회원가입 화면 -> 저장 -> DB에 저장
	public static void method3(String jumin) {
	
		String[] array = jumin.split("-");
		//String[] array = {"890503","1234567"};
		
		String s1 = "정상";
		String s2 = "정상";
		String s3 = "정상";
		
		if( array[0].length() != 6 ) {
			s1 = "비정상";
		}
		if( array[1].length() != 7 ) {
			s2 = "비정상";
		}
		// 1 ~ 4  :: "1234567"
		String gender = array[1].substring(0,1); // 1개의 글자
		
		if( Integer.parseInt(gender) < 1 || 
			Integer.parseInt(gender) > 4 ) {
			s3 = "비정상";
		}
		System.out.println("1. 앞번호 "+s1);
		System.out.println("2. 뒷번호 "+s2);
		System.out.println("3. 성별부 "+s3);
	}
	
	public static int method4(String jumin) {
		//"880201-1023154"
		String str1   = jumin.substring(0,2); // 0~1 ,, ex(88)
		String gender = jumin.substring(7,8); // 1개
		
		String str2 = "";
		if(gender.equals("1") || gender.equals("2")) {
			str2 = "19"+str1;
		} else if(gender.equals("3") || gender.equals("4")) {
			str2 = "20"+str1;
		}
		int year =  Integer.parseInt(str2);
		int age = 2025 - year;
		return age;
	}
	
	public static boolean method5(String jumin) {
		
		return true;
	}
	
	public static String method6(String datas) {
		
		return "";
	}
	
	
	

}
