package Proxy_Pattern_Static;

public class CRemoPic implements IShowPic {

	public void ShowPic(String picname) {

		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
