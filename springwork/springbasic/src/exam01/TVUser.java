package exam01;

public class TVUser {
	public static void main(String[] args) {
		ALLTV stv = new SamsungTV();
		stv.On();
		stv.Up();
		stv.Down();
		stv.Off();
		
		ALLTV ltv = new LgTV();
		ltv.On();
		ltv.Up();
		ltv.Down();
		ltv.Off();
	}

}
