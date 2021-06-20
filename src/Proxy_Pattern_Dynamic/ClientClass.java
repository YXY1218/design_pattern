package Proxy_Pattern_Dynamic;

public class ClientClass {
	// 动态代理
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IShowPic isp = new CRemoPic();
//		CLocalPicShow cpic = new CLocalPicShow(isp);
//		IShowPic localpic = (IShowPic) cpic.getProxyInstance();
//
//		localpic.ShowPic("AAA");

		ITestInterface ipic = new CTest();
		ITestInterface proxy = (ITestInterface) new CLocalPicShow(ipic).getProxyInstance();
		proxy.SendMessage("AAA");
	}

}
