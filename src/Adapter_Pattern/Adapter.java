package Adapter_Pattern;

public class Adapter extends OldJuicer implements InewJuicer {
//  混合饮料
//	public String newPort(MyFruit fruit1, MyFruit fruit2) {
//		String str = "混合饮料֭" + onePort(fruit1);
//		str += onePort(fruit2);
//		return str;
//	}
	//对象关系
	private OldJuicer oldJuicer;
	public String newPort(MyFruit fruit1, MyFruit fruit2) {
		oldJuicer = new OldJuicer();
		String str = "混合饮料֭" + oldJuicer.onePort(fruit1);
		str += oldJuicer.onePort(fruit2);
		return str;
	}
}
