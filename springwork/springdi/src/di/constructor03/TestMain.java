package di.constructor03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");
		IWriteArticleMgr mgr = factory.getBean("mgr",IWriteArticleMgr.class);
		//ArticleDTO dto = new ArticleDTO("dd", "ss", "aa", "ff");
		mgr.write(new ArticleDTO());
	}
}