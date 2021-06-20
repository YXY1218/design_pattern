package Chain_of_Responsibility_Pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
	private int weight;
	protected List<String> fruitBox;
	private AbstractFruitSort nextFruitSort;

	public void getFruitBox() {
		System.out.print("Weight" + weight);
		System.out.println("个数:" + fruitBox.size());
		for (String t : fruitBox) {
			System.out.print(t + ",");
		}
		System.out.println("");
	}

	public AbstractFruitSort(int weight) {
		this.weight = weight;
		fruitBox = new ArrayList<String>();
	}

	public void setNextSort(AbstractFruitSort nextFruitBox) {
		this.nextFruitSort = nextFruitBox;
	}

	public void sendFruit(int weight, String fruit) {
		if(this.weight <= weight) {
			pushBox(fruit);
		}else
		if(nextFruitSort!=null)
			nextFruitSort.sendFruit(weight, fruit);
	}

	abstract protected void pushBox(String fruit);
}
