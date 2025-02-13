package study10;

/**
   [ 난방/에어컨 리모컨 ]
	1.전원 - 운전/정지
	2.운전선택 - 난방/냉방/송풍/제습
	3.바람세기 - 약풍/중풍/강풍
	4.온도조절 - 0 ~ 30
	5.실내온도 - 25
 */
public class MyRemocon3 {
	// 전원
	boolean pow = false;
	// 온도
	int temp = 20;
	
	// 바람세기 ( A:약풍, B:중풍, C:강풍 )
	char wind = 'A'; //  
	
	// 운전선택 ( A:난방, B:냉방, C:송풍, D:제습)
	char drive = 'A';
	
	public void pow() {
		pow = !pow;
	}
	public void tempUp() {
		if( temp < 30 ) {
			temp++;
		}
	}
	public void tempDown() {
		if( temp > 10 ) {
			temp--;
		}
	}
	public void setWind() {
		// 바람세기 ( A:약풍, B:중풍, C:강풍 )
		wind++;
		if(wind == 'D') wind = 'A';
	}
	public void setDrive() {
		// 운전선택 ( A:난방, B:냉방, C:송풍, D:제습)
		drive++;
		if(drive == 'E') drive = 'A';
	}
	public void setTemp25() {
		temp = 25;
		drive = 'C';
	}
}
