package Memento_Pattern;

public class MementoChess {

	private String label;
	private int x, y;
	
	public MementoChess(String label, int x, int y) {
		this.label = label;
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x = x;
	}

	public void setY(int y) {
		// TODO Auto-generated method stub
		this.y = y;
	}

	public String getLable() {
		// TODO Auto-generated method stub
		return label;
	}

	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
