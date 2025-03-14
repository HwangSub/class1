package ioservice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterTest1 {

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);
		String filePath = "c:/mytemp/member_db.txt";
		
		FileWriter fw = new FileWriter(filePath,true);
		BufferedWriter buffer = new BufferedWriter(fw);
		// 이름  생년월일  연락처
		while(true) {
			System.out.print("학생정보등록(중지:\".\")>>");
			String data = scn.next();
			if( data.equals(".") ) {
				System.out.println("-- 등록중지 --");
				break;
			}
			buffer.write(data);
			buffer.newLine(); // 개행
			System.out.println("-- 등록완료 --");
		}
		buffer.close();
	}
}
