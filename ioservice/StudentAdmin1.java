package ioservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class StudentAdmin1 {

	public static String filePath = "C:\\mytemp\\student_info.txt";
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("[학생관리]\n");
		System.out.println("(메뉴1)학생목록(이름)");
		System.out.println("(메뉴2)학생목록(이름+점수)");
		System.out.print("*메뉴번호>>");
		
		int menu = 0;
		try { 
			menu = scn.nextInt();
		} catch (Exception e) {
			System.out.println("** 숫자를 입력하세요. ");
			return;
		}
		switch(menu) {
			case 1 : studentList1();
			break;
			case 2 : studentList2();
			break;
			default : System.out.println("** 없는 메뉴번호입니다. **");
		}
	}
	
	public static void studentList1() {
		try {
			FileReader file = new FileReader(filePath);
			BufferedReader buffer = new BufferedReader(file);
			int rowNumber = 0;
			while(true) {
				String str = buffer.readLine();
				if(str == null) break;
				
				rowNumber++;
				String[] array = str.split(":");  //{"홍길동","62"}
				System.out.println( rowNumber+"."+array[0] );
			}
			
		} catch (Exception e) {
			System.out.println("경로를 다시 확인 해주세요.");
		}
	}
	public static void studentList2() {
		
	}
}




