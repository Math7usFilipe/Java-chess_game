package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.enums.Color;

public class Rook extends ChessPiece{
	
	//constructor
	public Rook(Board board, Color color) {
		super(board, color);
	}
	//toString
	@Override
	public String toString() {
		return "R";
	}
	
}
