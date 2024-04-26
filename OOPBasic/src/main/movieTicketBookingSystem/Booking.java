
public class Booking {
    
}

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
}
