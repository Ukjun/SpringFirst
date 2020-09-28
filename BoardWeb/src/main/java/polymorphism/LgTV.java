package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
// <bean class="ploymorphism....">과 동일의미
public class LgTV implements TV {
	@Autowired // 자동으로 연결해주는 명령어 (여기에 들어갈수 있는 Bean이 존재하면 자동으로 넣어준다)
	@Qualifier("AppleSpeaker")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LGTV Create");
	}
	public LgTV(Speaker speaker) {
		this.speaker = speaker;
	}
	
 
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LGTV ---- Turn On");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LGTV ---- Turn OFF");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		speaker.volumeDown();
	}

}
