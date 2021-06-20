package Adapter_Pattern;

public class ClientClass {
	//适配器模式
	public static void main(String[] args) {
		MyFruit fru1 = new Apple();
		MyFruit fru2 = new Banana();
		InewJuicer newJuicer = new Adapter();
		System.out.println(newJuicer.newPort(fru1, fru2));
	}
}
