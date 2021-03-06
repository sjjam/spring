package di.setter02;

public class ServiceImpl implements Service {
	Logic mylogic; //Setter Injection
	String name; //Constructor Injection
	String msg; //Constructor Injection
	
	public ServiceImpl() {
		
	}
	
	public ServiceImpl(String name, String msg) {
		super();
		this.name = name;
		this.msg = msg;
		System.out.println("매개변수 2개 생성자");
	}

	public ServiceImpl(Logic mylogic, String name, String msg) {
		super();
		this.mylogic = mylogic;
		this.name = name;
		this.msg = msg;
		System.out.println("ServiceImpl의 매개변수3개 생성자");
	}
	
	public void setMylogic(Logic mylogic) {
		this.mylogic = mylogic;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public void test() {
		//Logic의 메소드를 호출하는 메소드
		System.out.println(msg+","+name);
		mylogic.testLogic();
	}

}
