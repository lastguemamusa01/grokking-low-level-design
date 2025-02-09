public class HotelBranch {
    private String name;
    private Address location;

    public List<Room> getRooms();
}

public class Hotel {
    private String name;
    private List<HotelBranch> locations;

    public boolean addLocation(HotelBranch location);
}

public interface Search {
    public static List<Room> search(RoomStyle style, Date date, int duration);
}

public class Catalog implements Search {
    private List<Room> rooms;

    public List<Room> search(RoomStyle style, Date date, int duration);
}

public class Room {
    private String roomNumber;
    private RoomStyle style;
    private RoomStatus status;
    private double bookingPrice;
    private boolean isSmoking;
    private List<RoomKey> keys;
    private List<RoomHousekeeping> housekeepingLog;

    public boolean isRoomAvailable();
    public boolean checkin();
    public boolean checkout();
}

public class RoomKey {
    private String keyId;
    private String barcode;
    private Date issuedAt;
    private boolean isActive;
    private boolean isMaster;

    public boolean assignRoom(Room room);
}

public class RoomHousekeeping
{
    private String description;
    private Date startDatetime;
    private int duration;
    private Housekeeper housekeeper;

    public boolean addHousekeeping(Room room);
}

// Notification is an abstract class
public abstract class Notification {
    private int notificationId;
    // The Date data type represents and deals with both date and time.
    private Date createdOn;
    private String content;

    public abstract void sendNotification(Person person);
}

class SMSNotification extends Notification {

    public void sendNotification(Person person) {
        // functionality
    }
}

class EmailNotification extends Notification {

    public void sendNotification(Person person) {
        // functionality
    }
}

// BillTransaction is an abstract class
public abstract class BillTransaction {
    private Date creationDate;
    private double amount;
    private PaymentStatus status;

    public abstract void initiateTransaction();
}

class CheckTransaction extends BillTransaction {
    private String bankName;
    private String checkNumber;

    public void initiateTransaction() {
        // functionality
    }
}

class CreditCardTransaction extends BillTransaction {
    private String nameOnCard;
    private int zipcode;

    public void initiateTransaction() {
        // functionality
    }
}

class CashTransaction extends BillTransaction {
    private double cashTendered;

    public void initiateTransaction() {
        // functionality
    }
}

public class RoomBooking {
    private String reservationNumber;
    private Date startDate;
    private int durationInDays;
    private BookingStatus status;
    private Date checkin;
    private Date checkout;

    private int guestId;
    private Room room;
    private Invoice invoice;
    private List<Notification> notifications;

    public static RoomBooking fectchDetails(String reservationNumber);
}

public class Invoice {
    private double amount;

    public boolean createBill();
}

public abstract class Service {
    private Date issueAt;

    public boolean addInvoiceItem(Invoice invoice);
}

public class Amenity extends Service {
    private String name;
    private String description;
}

public class RoomService extends Service {
    private boolean isChargeable;
    private Date requestTime;
}

public class KitchenService extends Service {
    private String description;
}

public abstract class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
    private Account account;
}

public class Guest extends Person {
    private int totalRoomsCheckedIn;

    public List<RoomBooking> getBookings();
}

public class Receptionist extends Person {
    public List<Member> searchMember(String name);
    public boolean createBooking();
}

public class Housekeeper extends Person {
    public boolean assignToRoom();
}

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private String country;
}

public class Account {
    private String id;
    private String password;
    private AccountStatus status;

    public boolean resetPassword();
}

// definition of enumerations used in hotel management system
enum RoomStyle {
    STANDARD,
    DELUXE,
    FAMILY_SUITE,
    BUSINESS_SUITE
}

enum RoomStatus {
    AVAILABLE,
    RESERVED,
    OCCUPIED,
    NOT_AVAILABLE,
    BEING_SERVICED,
    OTHER
}

enum BookingStatus {
    REQUESTED,
    PENDING,
    CONFIRMED,
    CANCELLED,
    ABANDONED
}

enum AccountStatus {
    ACTIVE,
    CLOSED,
    CANCELED,
    BLACKLISTED,
    BLOCKED
}

enum AccountType {
    MEMBER,
    GUEST,
    MANAGER,
    RECEPTIONIST
}

enum PaymentStatus {
    UNPAID,
    PENDING,
    COMPLETED,
    FILLED,
    DECLINED,
    CANCELLED,
    ABANDONED,
    SETTLING,
    SETTLED,
    REFUNDED
}