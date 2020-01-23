package book.exam.constructor;

import org.springframework.cglib.reflect.FastConstructor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * �����������̳ʿ� ���� �����ؼ� ��ü�� ���� �޾� ����� �� �ֵ��� �����ϱ�
		 * Dependency Lookup����
		 * �������� : config/bean.xml
		 * �� ��� : 
		 *    SamsumTV => samsung
		 *    LgTV => lg
		 *    
		 * getBean���� ���ͼ� �۾��ϵ��� �ڵ� �����ϱ�
		 */
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		
		ALLTV tv = factory.getBean("tv",ALLTV.class);

		tv.On();
		tv.Up();
		tv.Down();
		tv.Off();
		
	}

}
