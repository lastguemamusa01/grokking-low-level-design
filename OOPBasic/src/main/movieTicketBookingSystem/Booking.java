// Enumerations

enum PaymentStatus {
    PEDING,
    CONFIRMED,
    DECLINED,
    REFUNDED
}

enum BookingStatus {
    PEDING,
    CONFIRMED,
    CANCELEED,
    DENIED,
    REFUNDED
}

enum SeatStatus {
    AVAILABLE,
    BOOKED,
    RESERVED
}

// This section contains the different people that will interact with our movie ticket systems, such as a Customer, Admins, and TicketAgents.
// All of these classes will inherit the properties of the Person class

public abstract class Person {
    private String name;
    private String address;
    private String phone;
    private String email;
}

public class Customer extends Person {
    privaet List<Booking> bookings; // List of Bookings

    // booking here refers to an instance of the Booking class
    public boolean createBooking(Booking booking);
    public boolean updateBooking(Booking booking);
    public boolean deleteBooking(Booking booking);
}

public class Admin extends Person {
    // show here referes to an instance of the ShowTime class
  public boolean addShow(Show show){}
  public boolean updateShow(Show show){}
  public boolean deleteShow(Show show){}
  public boolean addMovie(Movie movie){}
  public boolean deleteMove(Movie movie){}

}

public class TicketAgent extends Person {
  // booking here referes to an instance of the Booking Class
  public boolean createBooking(Booking booking);
}

// The Seat will be an abstract class, which serves as a parent for three different types of seats: Platinum, Gold, and Silver
public abstract class Seat {
  // data members
  private String setNo;
  private SeatStatus status; // Refers to the SeatStatus enum

  // member functions
  public boolean isAvailable(){

  }
  public abstract  void setSeat();
  public abstract void setRate();

}

public class Platinum extends Seat {
  private double rate;
  public void setSeat() {

  }

  public void setRate() {

  }

}

public class Gold extends Seat {
  private double rate;
  public void setSeat() {

  }

  public void setRate() {

  }

}

public class Silver extends Seat {
  private double rate;
  public void setSeat() {
    // definition
  }
  public void setRate() {
    // definition
  }
}

// ShowTime, Movie, and MovieTicket classes that provide the details of the movie to the customer.

public class Movie {
  private String title;
  private String genre;
  private Date releaseDate;
  private String language;
  private int duration;
  private List<ShowTime> showS;
}

public class ShowTime {
  private int showId;

  private Date startTime;
  private Date date;
  private int duration;
  private List<Seat> seats;

  // displays the list of available seats
  public void showAvailabeSeats(){

  }
}

public class MovieTicket {
  private int ticketId;
  private Seat seat;
  private Movie movie;
  private ShowTime showTime;
}

// classes like Hall, Cinema, and City that make up the infrastructure of our movie ticket system.

public class City {
  private String name;
  privaet String state;
  private int zipCode;
  private List<Cinema> cinemas;
}

public class Cinema {
  private int cinemaId;
  private Lst<Hall> halls;
  private City city;
}

public class Hall {
  private int hallId;
  private Lst<ShowTime> shows;

   // returns list of shows
    public List<ShowTime> findCurrentShows() {

    }
}

// The Payment class is another abstract class, with the Cash and CreditCard classes as its child. This takes the
// PaymentStatus enum to keep track of the payment status

public abstract class Payment {
  private double amount;

  // The Date datetype represents and deals with both date and time
  private Date timeStamp;
  private PaymentStatus status;

  public abstract boolean makePayment();
}

public class Cash extends Payment {
  public boolean makePayment() {

  }
}

public class CreditCard extends Payment {
  private String nameOnCard;
  private String cardNumber;  // need to be encrypted
  private String billingAddress;
  private int code; // need to be encrypted

  public boolean makePayment() {

  }

}

// The Notification class is an abstract class that is responsible for sending notifications via email or phone/SMS
// after actions performed by either the admin and/or customer

public abstract class Notification {
  private int notificationId;
  private Date createdOn;
  private String content;

  public abstract void sendNotifiaction(Person person);
}

public class EmailNotification extends Notififcation {
  public void sendNotifiaction(Person person) {

  }
}

public class PhoneNotification extends Notifiaction  {
  public void sendNotifiaction(Person person) {

  }
}

// The Catalog class contains the movie information and implements the Search interface class to enable the search
// functionality based on the given criteria (title, language, genre, and release date)

public interface Search {
  public List<Movie> searchMovieByTitle(String title);
  public List<Movie> searchMovieByLanguage(String language);
  public List<Movie> searchMovieByGenre(String genre);
  public List<Movie> searchMovieByReleaseDate(Date releaseDate);

}

public class Catalog implements Search {
  HashMap<String, List<Movie>> movieTitles;
  HashMap<String, List<Movie>> movieLangues;
  HashMap<String, List<Movie>> movieGenres;
  HashMap<String, List<Movie>> movieReleaseDate;

  public List<Movie> searchMovieByTitle(String title) {

  }

  public List<Movie> searchMovieByLanguage(String language) {

  }

  public List<Movie> searchMovieByReleaseDate(String genre) {

  }

  public List<Movie> searchMovieByGenre(Date releaseDate) {

  }

}



// The Booking class is the main class of our movie ticket booking system and will display the information
// relating to a particular customer's booking.

public class Booking {
  private int bookingId;
  private int amount;
  private int totalSeats;

  private Date createdOn;

  private BookingStatus status;

  private Payment payment;
  private List<MovieTicket> tickets;
  private List<Seat> setas;

}


