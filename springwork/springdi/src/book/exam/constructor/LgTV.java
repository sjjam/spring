package book.exam.constructor;

public class LgTV implements ALLTV{
	Speaker speaker;
	
	public LgTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public void On() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void Off() {
		System.out.println("LgTV---���� ����.");
	}

	public void Up() {
		System.out.println("LgTV---�Ҹ� �ø���.");
		speaker.soundUp();
	}

	public void Down() {
		System.out.println("LgTV---�Ҹ� ������.");
		speaker.soundDown();
	}
}
