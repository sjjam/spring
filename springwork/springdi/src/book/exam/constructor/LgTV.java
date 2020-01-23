package book.exam.constructor;

public class LgTV implements ALLTV{
	Speaker speaker;
	
	public LgTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public void On() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void Off() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void Up() {
		System.out.println("LgTV---소리 올린다.");
		speaker.soundUp();
	}

	public void Down() {
		System.out.println("LgTV---소리 내린다.");
		speaker.soundDown();
	}
}
