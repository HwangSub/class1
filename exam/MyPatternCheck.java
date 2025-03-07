package exam;

public class MyPatternCheck {

	public static boolean method1(String str) {
		// [숫자]{6}-[숫자]{7} /  0,1
		String pattern = "[0-9]{6}-[1-4]{1}[0-9]{6}";
		boolean result = str.matches(pattern);
		return result;
	}
	public static boolean method2(String str) { 
		// aa.jpg ; b-b.txt ; c123c.java; a.b.c.GIF;
		// array[1]; array[3];
		String[] array = str.split("\\.");
		String ext = array[array.length-1]; // 배열개수-1
		ext = ext.toLowerCase(); // 대문자 -> 소문자
		boolean result = false;
		if(ext.equals("jpg") || ext.equals("gif") || ext.equals("png")) {
			result = true;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println( method1("801225-2012345") );
		System.out.println( method2("abc.111.jpg") );
	}
}





