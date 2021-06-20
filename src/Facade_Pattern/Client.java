package Facade_Pattern;

public class Client {
	// 外观模式
	public static void main(String args[]) {
		GeneralSwitchFacade gsf = new GeneralSwitchFacade();
		gsf.on();
		System.out.println("-------------");
		gsf.off();
	}
}
