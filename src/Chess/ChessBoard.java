package Chess;

public class ChessBoard {
    private ChessPiece[][] b;
    public ChessBoard(ChessPiece[][] b) { this.b = b; }

    public void print (){
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j].getFigure());
            }
            System.out.println();
        }

    }
}
