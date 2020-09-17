package polymorphism;

public class LgTV implements Tv {

	@Override
	public void powerOn() {
		System.out.println("LgTV ---- 전원키다");
		
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV ---- 전원끄다");
		
	}
	@Override
	public void volumeUp() {
		System.out.println("LgTV ---- 소리올린다");
		
	}
	@Override
	public void volumeDown() {
		System.out.println("LgTV ---- 소리내린다");
		
	}
}
