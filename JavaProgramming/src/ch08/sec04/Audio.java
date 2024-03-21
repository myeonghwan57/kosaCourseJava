package ch08.sec04;

public class Audio implements RemoteContorl {
	private int volume;

	@Override
	public void trunOn() {
		// TODO Auto-generated method stub
		System.out.println("audio를 켭니다.");
	}

	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println("audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteContorl.MAX_VOLUME) {
			this.volume = RemoteContorl.MAX_VOLUME;
		} else if (volume < RemoteContorl.MIN_VOLUME) {
			this.volume = RemoteContorl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 audio 볼륨 : " + volume);

	}

}
