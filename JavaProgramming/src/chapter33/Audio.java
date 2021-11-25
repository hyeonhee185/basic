package chapter33;

public class Audio implements RemoteControl {
// ctrl 1 이나 F5 누르면 구현해야할 메소드 뜸
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 켭니다");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
