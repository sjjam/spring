package dl.exam01;

public class SamsungTV implements ALLTV{
	public void On() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void Off() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void Up() {
		System.out.println("SamsungTV---소리 올린다.");
	}

	public void Down() {
		System.out.println("SamsungTV---소리 내린다.");
	}
}
