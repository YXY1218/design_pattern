package Flyweight_Pattern;

public abstract class APiece {
	protected String inKind;

	public APiece(String inKind) {
		this.inKind = inKind;
	}

	// 下棋落子的位置
	public abstract void Play(int x, int y);
}
