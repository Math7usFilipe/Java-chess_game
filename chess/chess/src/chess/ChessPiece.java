package chess;

import boardgame.Board;
import boardgame.Piece;
import chess.enums.Color;

public abstract class ChessPiece extends Piece {
		
		private Color color;
		//constructor
		public ChessPiece(Board board, Color color) {
			super(board);
			this.color = color;
		}
		//get set
		public Color getColor() {
			return color;
		}
		
		
}
