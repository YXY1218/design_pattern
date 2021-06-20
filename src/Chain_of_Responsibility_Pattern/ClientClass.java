package Chain_of_Responsibility_Pattern;

import java.util.Random;

public class ClientClass {
	//职责链模式
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFruitSort Bfs, Mfs, Sfs;
		Bfs = new BigFruitSorting(9);
		Mfs = new MidFruitSorting(5);
		Sfs = new SmallFruitSorting(2);

		Bfs.setNextSort(Mfs);
		Mfs.setNextSort(Sfs);

		Random rm = new Random();
		for (int i = 0; i < 1000; i++) {
			int weight = rm.nextInt(10);
			Bfs.sendFruit(weight, "橙子");
		}
		Bfs.getFruitBox();
		Mfs.getFruitBox();
		Sfs.getFruitBox();
	}

}
