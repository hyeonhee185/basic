package chapter33;

public class RemoteControlExample {
	public static void main(String[] args) {
		Television tv = new Television();
//		RemoteControl tv = new Television();
//		RemoteControl audio = new Audio();
		Audio audio = new Audio();
		audio.turnOff();
		audio.turnOn();
		
		tv.turnOff();
		tv.turnOn();
		tv.setVolume(20);
		tv.setMute(true);
		RemoteControl.changeBatter();
	}
}
