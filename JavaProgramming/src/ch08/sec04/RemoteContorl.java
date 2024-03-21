package ch08.sec04;

public interface RemoteContorl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	void trunOn();

	void trunOff();

	void setVolume(int volume);
}
