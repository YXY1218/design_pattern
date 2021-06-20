package Proxy_Pattern_Static;

public class CLocalPicShow implements IShowPic, Runnable {
	private IShowPic pic;
	private String picname;

	@Override
	public void ShowPic(String picname) {
		// TODO Auto-generated method stub
		pic = new CRemoPic();
		this.picname = picname;
		System.out.println("准备载入图片" + picname);
		Thread th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		pic.ShowPic(picname);
		System.out.println(picname + "图片调用完成！");
	}

}
