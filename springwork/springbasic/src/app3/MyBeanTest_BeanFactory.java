package app3;
/*
 * �������� �̿��ؼ� ���α׷��� �����ϱ�
 *  - new�����ڸ� �̿��ؼ� ��ü�����ϴ� �ڵ带 ���� �������� �ʴ´�.(API����)
 *  - ������ ���ο��� �����ϴ� FactoryŬ������ �̿��ؼ� ��ü�� ���޹޴´�.
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//BeanFactory(�����̳�)�� ��ü�� �����ϴ� ��� - ���� ��ü�� �����ұ�?
public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		System.out.println("************Resource������************");
		Resource res = new ClassPathResource("/config/bean.xml");
		
		System.out.println("************BeanFactory������************");
		BeanFactory factory = new XmlBeanFactory(res);
		
		System.out.println("************getBean������************");
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("myBean1");
		MyBeanStyle obj2 = (MyBeanStyle)factory.getBean("myBean1");
		if(obj==obj2) {
			//(�����ѹ��ϰ� �Ȱ��� ��ü�� ��û�ϸ� �������� ������ ����(�̱���))
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("*********************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("*********************");
	}
	public static void show(MyBeanStyle obj) {
		System.out.println("=======================");
		obj.hello("����");
		obj.hello("����");
		System.out.println("======================");
	}
}
