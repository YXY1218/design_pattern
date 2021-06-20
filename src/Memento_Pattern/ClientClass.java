package Memento_Pattern;

public class ClientClass {
	// 备忘录模式
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OriginatorChess chess = new OriginatorChess(new MementoChess("黑", 2, 2));
		play(chess);
		chess.SetX(3);
		play(chess);
		chess.SetY(6);
		play(chess);
		undo(chess, index);
		undo(chess, index);
		redo(chess, index);
		redo(chess, index);
	}

	private static int index = 0;
	private static CaretakerChess caretaker = new CaretakerChess();

	public static void play(OriginatorChess chess) {
		index++;
		caretaker.AddMem(chess.SavetoMemento());
		chess.Show();
	}

	public static void undo(OriginatorChess chess, int i) {
		System.out.println("********悔棋********");
		index--;
		chess.Rstore(caretaker.getMem(index - 1));
		chess.Show();
	}

	public static void redo(OriginatorChess chess, int i) {
		System.out.println("********撤销悔棋********");
		chess.Rstore(caretaker.getMem(index));
		index++;
		chess.Show();
	}
}
