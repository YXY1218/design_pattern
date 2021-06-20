package Simple_factory;

public class Factory {

	// 构造一个水果工厂
	public Fruit CreateFruit(String kind) {
		if (kind.equals("A"))
			return new Apple();
		if (kind.equals("B"))
			return new Banana();
		//如果要修改必须自己增加，违反了开闭原则
		return null;
	}

}
