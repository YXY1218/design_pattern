package Chain_of_Responsibility_Pattern;

public class MidFruitSorting extends AbstractFruitSort {

	public MidFruitSorting(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void pushBox(String fruit) {
		// TODO Auto-generated method stub
		fruitBox.add("水果罐头:" + fruit);
	}

}
