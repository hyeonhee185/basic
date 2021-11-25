package chapter33;
// 	abstract class => interface
public interface RemoteControl {
//	필드(변수)는 불가능하지만 상수는 가능
//	public static final => 생략
		int MAX_VOLUME = 100;
	public static final int MIN_VOLUME =0;
	
//	public abstract => 생략
	void turnOn();	
	public abstract void turnOff();
	void setVolume(int volume);
 //	JDK 1.8부터 추상메소드가 아닌 일반 메소드도 선언 가능
//	default 추가 해야함
	default	void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 모드");
		}else {
			System.out.println("음소거 해제");
		}
	}
	static void changeBatter() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
