package study14;

// 캡슐화,상속(implements),다형성(오버레이딩),추상화(interface)
public class VolMake implements VolService {
	// 맴버변수, 인스턴스변수
	private int volumn; // 기본 값 0 이 자동 세팅됨
	
	public VolMake() {
		volumn = 1;
	}
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	@Override
	public void volUp(int volumn) {
		this.volumn += volumn;
	}

	@Override
	public void volDown(int volumn) {
		this.volumn -= volumn;
	}
}
