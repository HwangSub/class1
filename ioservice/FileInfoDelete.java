package ioservice;

import java.io.File;
import java.util.Scanner;

/**
 *  파일 삭제 실습
 */
public class FileInfoDelete {

	public static void main(String[] args) {

		String dirPath = "C:/mytemp";
		Scanner scn = new Scanner(System.in);
		
		System.out.print("(삭제)파일명>>");
		String filename = scn.next();
		String filePath = dirPath+"/"+filename;
		// 격노 -> 경로
		File file = new File(filePath);
		
		if( file.exists() ) {
			file.delete();
			System.out.println("** 삭제완료 !! **");
		} else {
			System.out.println("** 존재하지 않는 파일명 입니다. **");
		}
	}

}
