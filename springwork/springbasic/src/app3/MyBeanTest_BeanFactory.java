package app3;
/*
 * 스프링을 이용해서 프로그램을 실행하기
 *  - new연산자를 이용해서 객체생성하는 코드를 직접 정의하지 않는다.(API제외)
 *  - 스프링 내부에서 제공하는 Factory클래스를 이용해서 객체를 전달받는다.
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//BeanFactory(컨테이너)가 객체를 관리하는 방법 - 언제 객체를 생성할까?
public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		System.out.println("************Resource생성전************");
		Resource res = new ClassPathResource("/config/bean.xml");
		
		System.out.println("************BeanFactory생성전************");
		BeanFactory factory = new XmlBeanFactory(res);
		
		System.out.println("************getBean생성전************");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean1");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean1");
		if(obj==obj2) {
			//(생성한번하고 똑같은 객체를 요청하면 같은것을 가져다 리턴(싱글톤))
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*********************");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("*********************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("=======================");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("======================");
	}
}
