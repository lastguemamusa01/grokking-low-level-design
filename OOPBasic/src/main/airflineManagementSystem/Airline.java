public class Address {
    private int zipCode;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
}

enum AccountStatus {
    ACTIVE,
    DISABLED,
    CLOSED,
    BLOCKED
}

enum SeatStatus {
    AVAILABLE,
    BOOKED,
    CHANCE
}

enum SeatType {
    REGULAR,
    ACCESSIBLE,
    EMERGENCY_EXIT,
    EXTRA_LEG_ROOM
}

enum SeatClass {
    ECONOMY,
    ECONOMY_PLUS,
    BUSINESS,
    FIRST_CLASS
}

enum FlightStatus {
    ACTIVE,
    SCHEDULED,
    DELAYED,
    LANDED,
    DEPARTED,
    CANCELED,
    DIVERTED,
    UNKNOWN
}

enum ReservationStatus {
    REQUESTED,
    PENDING,
    CONFIRMED,
    CHECKED_IN,
    CANCELED
}

enum PaymentStatus {
    PENDING,
    COMPLETED,
    FAILED,
    DECLINED,
    CANCELED,
    REFUNDED
}

public class Account {
    private AccountStatus status;
    private int accountId;
    private String username;
    private String password;

    public boolean resetPassword();
}

public class Passenger {
    private int passengerId;
    private String name;
    private String gender;
    private Date dateOfBirth;
    private String passportNumber;
}

public abstract class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
    private Account account;
}

public class Admin extends Person {
    public boolean addAircraft(Aircraft aircraft);
    public boolean addFlight(Flight flight);
    public boolean cancelFlight(Flight flight);
    public boolean assignCrew(Flight flight);
    public boolean blockUser(User user);
    public boolean unblockUser(User user);
}

public class Crew extends Person {
    public List<FlightInstance> viewSchedule();
}

public class FrontDeskOfficer extends Person {
    public List<Itinerary> viewItinerary();
    public boolean createItinerary();
    public boolean createReservation();
    public boolean assignSeat();
    public boolean makePayment();
}

public class Customer extends Person {
    private int customerId;

    public List<Itinerary> viewItinerary();
    public boolean createItinerary();
    public boolean createReservation();
    public boolean assignSeat();
    public boolean makePayment();
}

public class Seat {
    private String seatNumber;
    private SeatType type;
    private SeatClass _class;
}

public class FlightSeat extends Seat {
    private double fare;
    private SeatStatus status;
    private String reservationNumber;
}

public class Flight {
    private String flightNo;
    private int durationMin;
    private Airport departure;
    private Airport arrival;
    private List<FlightInstance> instances;
}

public class FlightInstance {
    private Flight flight;
    private Date departureTime;
    private String gate;
    private FlightStatus status;
    private Aircraft aircraft;
    private List<FlightSeat> seats;
}

public class Itinerary {
    private Airport startingAirport;
    private Airport finalAirport;
    private Date creationDate;
    private List<FlightReservation> reservations;
    private List<Passenger> passengers;

    public boolean makeReservation();
    public boolean makePayment();
}

public class FlightReservation {
    private String reservationNumber;
    private FlightInstance flight;
    private HashMap<Passenger, FlightSeat> seatMap;
    private ReservationStatus status;
    private Date creationDate;

    public static FlightReservation fetchReservationDetails(String reservationNumber);
    public List<Passenger> getPassengers();
}

public abstract class Payment {
    private int paymentId;
    private double amount;
    private PaymentStatus status;
    private Date timestamp;

    public abstract boolean makePayment();
}

public class Cash extends Payment {
    public boolean makePayment() {
        // functionality
    }
}

public class CreditCard extends Payment {
    private String nameOnCard;
    private String cardNumber;

    public boolean makePayment() {
        // functionality
    }
}

public abstract class Notification {
    private int notificationId;
    private Date createdOn;
    private String content;

    public abstract void sendNotification(Account account);
}

class SmsNotification extends Notification {
    public void sendNotification(Account account) {
        // functionality
    }
}

class EmailNotification extends Notification {
    public void sendNotification(Account account) {
        // functionality
    }
}

public interface Search {
    // Interface method (does not have a body)
    public List<FlightInstance> searchFlight(Airport source, Airport dest, Date arrival, Date departure);
}

public class SearchCatalog implements Search {
    private HashMap<Quartet<Airport, Airport, Date, Date>, List<FlightInstance>> flights;

    public List<FlightInstance> searchFlight(Airport source, Airport dest, Date arrival, Date departure) {
        // functionality
    }
}

public class Airport {
    private String name;
    private String code;
    private Address address;
    private List<Flight> flights;
}

public class Aircraft {
    private String name;
    private String code;
    private String model;
    private int seatCapacity;
    private List<Seat> seats;
}

public class Airline {
    private String name;
    private String code;
    private List<Flight> flights;
    private List<Aircraft> aircrafts;
    private List<Crew> crew;

    // The Airline is a singleton class that ensures it will have only one active instance at a time
    private static Airline airline = null;

    // Created a static method to access the singleton instance of Airline class
    public static Airline getInstance() {
        if (airline == null) {
            airline = new Airline();
        }
        return airline;
    }
}





