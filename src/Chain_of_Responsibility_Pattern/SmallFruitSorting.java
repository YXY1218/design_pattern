package Chain_of_Responsibility_Pattern;

public class SmallFruitSorting extends AbstractFruitSort {

	public SmallFruitSorting(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void pushBox(String fruit) {
		// TODO Auto-generated method stub
		fruitBox.add("打果汁:" + fruit);
	}

}
