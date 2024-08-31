package chess;

import boardgame.BoardException;

public class chessException extends BoardException{
	private static final long serialVersionUID = 1L;
	
	//constructor
	public chessException(String msg) {
		super(msg);
	}
	
}
