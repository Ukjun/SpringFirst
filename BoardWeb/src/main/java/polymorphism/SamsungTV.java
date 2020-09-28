package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	
	public SamsungTV() {
		System.out.println("samsungTV Create");
	}
	
	
	public SamsungTV(Speaker speaker) {
		this.speaker = speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV ---- 전원키다");
	}
	public void volumDown() {
		System.out.println("SamsungTV ---- 소리 내린다");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV ---- 전원끄다");
		
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
		
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
		
	}
}