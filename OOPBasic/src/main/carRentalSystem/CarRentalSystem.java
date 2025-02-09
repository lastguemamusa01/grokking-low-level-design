public class CarRentalBranch {
    private String name;
    private Address address;
    private List<ParkingStall> stalls;

    public Address getLocation();
}

public class CarRentalSystem {
    private String name;
    private List<CarRentalBranch> branches;

    public void addNewBranch(CarRentalBranch branch);

    // The CarRentalSystem is a singleton class that ensures it will have only one active instance at a time
    private static CarRentalSystem system = null;

    // Created a static method to access the singleton instance of CarRentalSystem class
    public static CarRentalSystem getInstance() {
        if (system == null) {
            system = new CarRentalSystem();
        }
        return system;
    }
}

public interface Search {
    public List<Vehicle> searchByType(String type);
    public List<Vehicle> searchByModel(String model);
}

public class VehicleCatalog implements Search {
    private HashMap<String, List<Vehicle>> vehicleTypes;
    private HashMap<String, List<Vehicle>> vehicleModels;

    // to return all vehicles of the given type.
    public List<Vehicle> searchByType(String type) {
        // functionality
    }

    // to return all vehicles of the given model.
    public List<Vehicle> searchByModel(String model) {
        // functionality
    }
}

public class ParkingStall {
    private int stallId;
    private String locationIdentifier;
}

public class Fine {
    private double amount;
    private String reason;
    public double calculateFine();
}

// Notification is an abstract class
public abstract class Notification {
    private int notificationId;
    // The Date data type represents and deals with both date and time.
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

public class VehicleLog {
    private int logId;
    private VehicleLogType logType;
    private String description;
    private Date creationDate;
}

public class VehicleReservation {
    private int reservationId;
    private String customerId;
    private String vehicleId;
    private Date creationDate;
    private ReservationStatus status;
    private Date dueDate;
    private Date returnDate;
    private String pickupLocation;
    private String returnLocation;

    private List<Equipment> equipments;
    private List<Service> services;

    public VehicleReservation getReservationDetails();
    public boolean addEquipment();
    public boolean addService();
}

public abstract class Payment {
    // Data members
    private double amount;

    // The Date datatype represents and deals with both date and time.
    private Date timestamp;
    private PaymentStatus status;

    public abstract boolean makePayment();
}

public class Cash extends Payment {
    public boolean makePayment() {
        // functionality
    }
}

public class CreditCard extends Payment {
    // Data members
    private String nameOnCard;
    private String cardNumber;
    private String billingAddress;
    private int code;

    public boolean makePayment() {
        // functionality
    }
}

// Service is an abstract class
public abstract class Service {
    private int serviceId;
    private int price;
}

public class DriverService extends Service {
    private int driverId;
}

public class RoadsideAssistance extends Service {
}

public class WiFi extends Service {
}

// Equipment is an abstract class
public abstract class Equipment {
    private int equipmentId;
    private int price;
}

public class Navigation extends Equipment {
}

public class ChildSeat extends Equipment {
}

public class SkiRack extends Equipment {
}

// Vehicle is an abstract class
public abstract class Vehicle {
    private String vehicleId;
    private String licenseNumber;
    private int passengerCapacity;
    private boolean hasSunroof;
    private VehicleStatus status;
    private String model;
    private int manufacturingYear;
    private int mileage;
    private List<VehicleLog> log;

    public boolean reserveVehicle();
    public boolean returnVehicle();
}

public class Car extends Vehicle {
    private CarType carType;
}

public class Van extends Vehicle {
    private VanType vanType;
}

public class Truck extends Vehicle {
    private TruckType truckType;
}

public class Motorcycle extends Vehicle {
    private MotorcycleType motorcycleType;
}

public abstract class Account extends Person {
    private String accountId;
    private String password;
    private AccountStatus status;

    public abstract boolean resetPassword();
}

public class Receptionist extends Account {
    private Date dateJoined;

    public List<Customer> searchCustomer(String name);
    public boolean addReservation();
    public boolean cancelReservation();
    public boolean resetPassword() {
        // definition
    }
}

public class Customer extends Account {
    private String licenseNumber;
    private Date licenseExpiry;

    public boolean addReservation();
    public boolean cancelReservation();
    public List<VehicleReservation> getReservations();
    public boolean resetPassword() {
        // definition
    }
}

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private String country;
}

public class Person {
    private String name;
    private Address address;
    private String email;
    private String phoneNumber;
}

public class Driver extends Person {
    private int driverId;
}

// definition of enumerations used in the car rental system
enum VehicleStatus {
    AVAILABLE,
    RESERVED,
    LOST,
    BEING_SERVICED
}

enum AccountStatus {
    ACTIVE,
    CLOSED,
    CANCELED,
    BLACKLISTED,
    BLOCKED
}

enum ReservationStatus {
    ACTIVE,
    PENDING,
    CONFIRMED,
    COMPLETED,
    CANCELED
}

enum PaymentStatus {
    UNPAID,
    PENDING,
    COMPLETED,
    CANCELED,
    REFUNDED
}

enum VanType {
    PASSENGER,
    CARGO
}

enum CarType {
    ECONOMY,
    COMPACT,
    INTERMEDIATE,
    STANDARD,
    FULL_SIZE,
    PREMIUM,
    LUXURY
}

enum MotorcycleType {
    STANDARD,
    CRUISER,
    TOURING,
    SPORTS,
    OFF_ROAD,
    DUAL_PURPOSE
}

enum TruckType {
    LIGHT_DUTY,
    MEDIUM_DUTY,
    HEAVY_DUTY
}

enum VehicleLogType {
    ACCIDENT,
    FUELING,
    CLEANING_SERVICE,
    OIL_CHANGE,
    REPAIR,
    OTHER
}
