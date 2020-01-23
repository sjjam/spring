package di.constructor03;

public class MysqlArticleDAO implements IArticleDAO{
	public void insert(ArticleDTO article){
		System.out.println("sqlinsert!!");
	}
}
