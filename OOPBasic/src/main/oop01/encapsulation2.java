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

    // getters setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String g) {
        genre = g;
    }

    void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("The Lion King", 1994, "Adventure");
        movie.printDetails();

        System.out.println("---");
        movie.setTitle("Forrest Gump");
        System.out.print("New title: " + movie.getTitle());
    }
}