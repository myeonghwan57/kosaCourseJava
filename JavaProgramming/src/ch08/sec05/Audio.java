package ch08.sec05;

public class Audio implements RemoteControl {
	private int volume;
	private int memoryVolume;

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
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 audio 볼륨 : " + volume);

	}

	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = volume;
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
			setVolume(memoryVolume);
		}
	}

}
