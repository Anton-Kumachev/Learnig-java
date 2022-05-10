package day17.Task1;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] piece = { //Массив из шахматных фигур
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK
        };

        for (ChessPiece chessPiece : piece) {
            System.out.print(chessPiece.getRepresentation() + " ");
        }
    }
}
