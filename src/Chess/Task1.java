package Chess;

import static Chess.ChessPiece.ROOK_BLACK;
import static Chess.ChessPiece.PAWN_WHITE;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] board = {PAWN_WHITE, PAWN_WHITE, PAWN_WHITE, PAWN_WHITE,
                ROOK_BLACK, ROOK_BLACK, ROOK_BLACK, ROOK_BLACK,
        };
        for (ChessPiece figure: board){
            System.out.print(figure.getFigure() + " ");
        }
//        for (ChessPiece figure: ChessPiece.values()){
//            System.out.println(figure);
//        }
//        ChessPiece piece = ChessPiece.valueOf("ROOK_BLAK");
//        System.out.println(piece);
    }
}

