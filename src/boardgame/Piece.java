package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece() {
	}

	public Piece(Position position) {
		this.position = position;
	}

	protected Position getPosition() {
		return position;
	}

}
