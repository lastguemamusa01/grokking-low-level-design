class Movie {
    // Data members
    private String title;
    private int year;
    private String genre;

    // Default constructor
    public Movie() {
        title = "";
        year = -1;
        genre = "";
    }

    // Parameterized constructor
    public Movie(String t, int y, String g) {
        title = t;
        year = y;
        genre = g;
    }
}