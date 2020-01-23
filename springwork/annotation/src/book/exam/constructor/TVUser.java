package book.exam.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 * 스프링컨테이너에 의해 생성해서 객체를 전달 받아 사용할 수 있도록 수정하기
		 * Dependency Lookup적용
		 * 설정파일:config/bean.xml
		 * 빈 등록 :
		 *     SamsungTV => samsung
		 *     LgTV => lg
		 *     
		 * getBean으로 얻어와서 작업하도록 코드 수정하기    
		 */
		AbstractApplicationContext factory = 
			new GenericXmlApplicationContext("/config/bean.xml");
		TV tv1 = factory.getBean("samsung",TV.class);
		TV tv2 = factory.getBean("lg",TV.class);
		
		tv1.turnOn();
		tv1.soundUp();
		tv1.soundDown();
		tv1.turnOff();
		
		tv2.turnOn();
		tv2.soundUp();
		tv2.soundDown();
		tv2.turnOff();
	
	}

}
