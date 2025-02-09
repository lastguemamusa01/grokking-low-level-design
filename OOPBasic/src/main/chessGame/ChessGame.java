public class ChessGame {
    private Player[] players;
    private Chessboard board;
    private Player currentTurn;
    private GameStatus status;
    private List<Move> movesPlayed;

    public boolean isOver();
    public boolean playerMove(Player player, int startX, int startY, int endX, int endY) {
    /* 1. start box
       2. end box
       3. move
       4. call makeMove() method
    */
    }
    private boolean makeMove(Move move, Player player) {
    /* 1. Validation of source piece
       2. Check whether or not the color of the piece is white
       3. Check if it is a valid move or not
       4. Check whether it is a castling move or not
       5. Store the move
    */
    }
}

public class ChessMoveController {
    public boolean validateMove();
}

public class ChessGameView {
    public void playMove();
}

public class Account {
    private int id;
    private String password;
    private AccountStatus status;

    public boolean resetPassword();
}

public class Player extends Account {
    private Person person;
    private boolean whiteSide = false;
    private int totalGamesPlayed;

    public boolean isWhiteSide();
    public boolean isChecked();
}

public Admin extends Account {
    public boolean blockUser();
}

public class Move {
    private Box start;
    private Box end;
    private Piece pieceKilled;
    private Piece pieceMoved;
    private Player player;
    private boolean castlingMove = false;

    public boolean isCastlingMove();
}

public abstract class Piece {
    private boolean killed = false;
    private boolean white = false;

    public boolean isWhite();
    public boolean isKilled();
    public abstract boolean canMove(Chessboard board, Box start, Box end);
}

public class King extends Piece {
    private boolean castlingDone = false;

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        // definition
    }
}

public class Queen extends Piece {

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        // definition
    }
}

public class Knight extends Piece {

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        // definition
    }
}

public class Bishop extends Piece {

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        // definition
    }
}

public class Rook extends Piece {

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        // definition
    }
}

public class Pawn extends Piece {

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        // definition
    }
}

public class Box {
    private Piece piece;
    private int x;
    private int y;
}

public class Chessboard {
    private Box[][] boxes;
    private Date creationDate;

    public List<Piece> getPieces()
    public void resetBoard()
    public void updateBoard()
}

// Enumerations
enum GameStatus {
    Active,
    BlackWin,
    WhiteWin,
    Forfeit,
    Stalemate,
    Resignation
}

enum AccountStatus {
    ACTIVE,
    CLOSED,
    CANCELED,
    BLACKLISTED,
    NONE
}

// Custom Person data type class
public class Person {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private String country;
}