package polymorphism;

public class SamsungTV implements Tv{
	
	private TmaxSpeaker speaker;
	
	public SamsungTV() {
		System.out.println("samsungTV 객체화");
		speaker = new TmaxSpeaker();
	}
	
	
	public SamsungTV(TmaxSpeaker speaker) {
		this.speaker = speaker;
	}
	
	public SamsungTV(TmaxSpeaker speaker, int a) {
		System.out.println("speaker a 생성자");
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
