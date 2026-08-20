package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(tec);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(tec);

            ChessPiece capturedPiece = chessMatch.performMove(source, target);
        }
    }
}
