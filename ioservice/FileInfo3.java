package ioservice;

import java.io.File;
import java.util.Scanner;

/**
 *  파일 생성 관련 실습
 */
public class FileInfo3 {

	public static void main(String[] args) {
		// 디렉토리(리눅스용어) 경로
		String dirPath = "C:/mytemp";
		Scanner scn = new Scanner(System.in);
		
		System.out.print("(new)파일명>>");
		String filename = scn.next();
		
		String filePath = dirPath+"/"+filename;

		File file = new File(filePath);// 인스턴스처리
		
		if( file.exists() ) {
			System.out.println("** 이미 존재함 **");
		} else {
			try {
				file.createNewFile();
				System.out.println("** 생성완료 ^^ **");
			} catch(Exception e) {
				// 부정확한 경로(특히 폴더명) 설정 시 발생
				System.out.println("** 생성실패 !! **");
			}
		}
	}

}
