package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
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
		
		public chessPosition getChessPosition() {
			return chessPosition.fromPosition(position);
		}
		
		protected boolean isThereOpponentPiecec(Position position) {
			ChessPiece p = (ChessPiece) getBoard().piece(position);
			return p != null && p.getColor() != color;
		}
		
}
