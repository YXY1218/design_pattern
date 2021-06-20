package Proxy_Pattern_Static;

public class ClientClass {
	// 静态代理
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CLocalPicShow cls = new CLocalPicShow(); //本地线程图片
		IShowPic cls = new CLocalPicShow();
		cls.ShowPic("photo");
	}

}
