package Proxy_Pattern_Dynamic;

public class CTest implements ITestInterface {

	public void SendMessage(String mes) {
		// TODO Auto-generated method stub
		for (int i = 5; i > 0; i--) {
			System.out.println(mes + "怪物的出现还有" + i + "秒");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(mes + "怪物出来了！");
	}

}
