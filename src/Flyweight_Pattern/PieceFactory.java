package Flyweight_Pattern;

import java.util.HashMap;

public class PieceFactory {
	private HashMap PiecePool = new HashMap();

	public APiece GetPiece(String key) {

		if (!PiecePool.containsKey(key)) {
			APiece p = new OnePiece(key);
			PiecePool.put(key, p);
			return p;
		}
		return (APiece) PiecePool.get(key);
	}

	public int GetPieceCount() {
		return PiecePool.size();
	}
}
