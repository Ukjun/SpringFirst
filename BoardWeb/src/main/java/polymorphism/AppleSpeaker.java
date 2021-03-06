package polymorphism;

import org.springframework.stereotype.Component;

@Component("AppleSpeaker")
public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker Create");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("===> AppleSpeaker Volume Up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("===> AppleSpeaker Volume Down");
	}
}
