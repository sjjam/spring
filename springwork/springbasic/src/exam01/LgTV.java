package exam01;

public class LgTV implements ALLTV{
	public void On() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void Off() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void Up() {
		System.out.println("LgTV---소리 올린다.");
	}

	public void Down() {
		System.out.println("LgTV---소리 내린다.");
	}
}
