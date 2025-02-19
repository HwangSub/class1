package study14;


public class CarVolMake implements CarVolService {

	private int volumn; // default 0;
	private int temp;   // default 0;
	
	public int getVolumn() {
		return volumn;
	}
	
	@Override
	public void volUp(int volumn) {
		this.volumn += volumn;
	}

	@Override
	public void volDown(int volumn) {
		if( this.volumn < volumn ) {
			volOff(); 
		} else {	
			this.volumn -= volumn;
		}
	}

	@Override
	public void volOff() {
		this.volumn = 0;
	}

	@Override
	public void volPause() {  // 잠시멈춤
		this.temp = this.volumn;
		volOff(); // this.volumn = 0;
	}

	@Override
	public void volResume() { // 볼륨 재시작
		this.volumn = this.temp;
	}

}
