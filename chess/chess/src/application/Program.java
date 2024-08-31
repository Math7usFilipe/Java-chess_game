package application;

import java.util.Scanner;

import chess.ChessPiece;
import chess.chessMatch;
import chess.chessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		chessMatch chessMatch = new chess.chessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			chessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			chessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
		
	}

}
