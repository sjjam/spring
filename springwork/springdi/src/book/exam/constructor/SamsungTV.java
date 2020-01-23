package book.exam.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SamsungTV implements ALLTV{
	//���� Ŭ���� ���ο��� ����ϴ� ��ü - �����������̳ʸ� ���� ���޹��� �� �ֵ��� �غ�
	Speaker speaker;
	
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public void On() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void Off() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void Up() {
		System.out.println("SamsungTV---�Ҹ� �ø���.");
		speaker.soundUp();
	}

	public void Down() {
		System.out.println("SamsungTV---�Ҹ� ������.");
		speaker.soundDown();
	}
	
}
