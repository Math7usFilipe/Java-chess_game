package chess;

import boardgame.Position;

public class chessPosition {
	
	private char column;
	private int row;
	
	//constructor
	public chessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new chessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}
	//get
	public char getColumn() {
		return column;
	}
	public int getRown() {
		return row;
	}
	//methods
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static chessPosition fromPosition(Position position) {
		return new chessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	//toString
	@Override
	public String toString() {
		return "" + column + row;
	}
}
