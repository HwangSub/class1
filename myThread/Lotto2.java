package myThread;

import java.util.Random;
/**
 *  문자열에 로또번호를 누적하여 중복여부를 체크한다.
 *  ,11,7,23,45,41,29,
 */
public class Lotto2 {
	public static void main(String[] args) {
		Random rn = new Random();
		String lotto1 = ",";
		
		int i = 0;
		while(true) {
			int num = rn.nextInt(45)+1;
			String str = ","+num+",";
			if( lotto1.indexOf(str) == -1 ) {
				lotto1 += num+",";
				i++;
			}
			if( i == 6 ) break;
		}
		lotto1 = lotto1.replace(","," ");
		lotto1 = lotto1.trim();
		System.out.println(lotto1);
	}
}
