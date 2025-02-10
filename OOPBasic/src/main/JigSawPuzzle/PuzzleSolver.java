enum Edge {
    INDENTATION,
    EXTRUSION,
    FLAT
}

public class Side {
    private Edge edge;
}

public class Piece {
    private List<Side> sides = Arrays.asList(new Side[4]);
    public boolean checkCorner() {}
    public boolean checkEdge() {}
    public boolean checkMiddle() {}
}

public class Puzzle {
    private List<List<Piece>> board;
    private List<Piece> free; // represents the currently free pieces (yet to be inserted in board)
    public void insertPiece(Piece piece, int row, int column) {};

    // Puzzle is a singleton class that ensures it will have only one active instance at a time
    private static Puzzle puzzle = null;

    // Created a static method to access the singleton instance of Puzzle class
    public static Puzzle getInstance() {
        if (puzzle == null) {
            puzzle = new Puzzle();
        }
        return puzzle;
    }
}

public class PuzzleSolver {
    public Puzzle matchPieces(Puzzle board) {}
}

