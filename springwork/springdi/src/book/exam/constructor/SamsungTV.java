package book.exam.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SamsungTV implements ALLTV{
	//현재 클래스 내부에서 사용하는 객체 - 스프링컨테이너를 통해 전달받을 수 있도록 준비
	Speaker speaker;
	
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public void On() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void Off() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void Up() {
		System.out.println("SamsungTV---소리 올린다.");
		speaker.soundUp();
	}

	public void Down() {
		System.out.println("SamsungTV---소리 내린다.");
		speaker.soundDown();
	}
	
}
