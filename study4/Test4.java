package study4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		String name = "홍길동";
		String address = "구리시";
		String msg = "";

		System.out.print("성별입력(M or F)>>");
		String gender = scn.next();

		if(gender.equals("M")) {
			msg = "남성";
		} else if(gender.equals("F")) {
			msg = "여성";
		} else {
			msg = "설정안됨";
		}
		System.out.println(msg+"입니다.");
	}
}
