// Enumerations
enum PaymentStatus {
    Unpaid,
    Pending,
    Completed,
    Failed,
    Declined,
    Canceled,
    Abondoned,
    Settling,
    Refunded
}

enum TableStatus {
    Free,
    Reserved,
    Occupied,
    Other
}

enum SeatType {
    Regular,
    Kid,
    Accessible,
    Other
}

enum AccountStatus {
    Active,
    Closed,
    Canceled,
    Blacklisted
}

enum OrderStatus {
    Received,
    Preparing,
    Complete,
    Canceled,
    None
}

enum ReservationStatus {
    Requested,
    Pending,
    Confirmed,
    CheckedIn,
    Canceled,
    Abondoned
}

// Custom Address data type class
public class Address {
    private int zipCode;
    private String address;
    private String city;
    private String state;
    private String country;
}

public class Account {
    private String accountId;
    private String password;
    private Address address;
    private AccountStatus status;

    public boolean resetPassword();
}

public abstract class Person {
    private String name;
    private String email;
    private String phone;
}

public abstract class Employee extends Person {
    private int employeeID;
    private Date dateJoined;
    private Account account;
}

public class Customer extends Person {
    private Date lastVisitedDate;
}

public class Receptionist extends Employee {
    public boolean createReservation();
}

public class Manager extends Employee {
    public boolean addEmployee();
}

public class Chef extends Employee {
    public boolean prepareOrder();
}

public class Waiter extends Employee {
    public boolean takeOrder();
}

public class Table {
    private int tableID;
    private TableStatus status;
    private int maxCapacity;
    private int locationIdentifier;
    private List<TableSeat> seats;

    public boolean isTableFree();
    public boolean addReservation();
    public static List<Table> search(int capacity, Date startTime);
}

public class TableSeat {
    private int tableSeatNumber;
    private SeatType type;

    public boolean updateSeatType(SeatType type);
}

public class MealItem {
    private int mealItemID;
    private int quantity;
    private MenuItem menuItem;

    public boolean updateQuantity(int quantity);
}

public class Meal {
    private int mealID;
    private TableSeat seat;
    private List<MenuItem> menuItems;

    public boolean addMealItem(MealItem mealItem);
}

public class Menu {
    private int menuID;
    private String title;
    private String description;
    private double price;
    private List<MenuSection> menuSections;

    public boolean addMenuSection(MenuSection menuSection);
    public boolean print();
}

public class MenuSection {
    private int menuSectionID;
    private String title;
    private String description;
    private List<MenuItem> menuItems;

    public boolean addMenuItem(MenuItem menuItem);
}

public class MenuItem {
    private int menuItemID;
    private String title;
    private String description;
    private double price;

    public boolean updatePrice(double price);
}

public class Order {
    private int OrderID;
    private OrderStatus status;
    private Date creationTime;
    private Meal[] meals;
    private Table table;
    private Waiter waiter;
    private Chef chef;

    public boolean addMeal(Meal meal);
    public boolean removeMeal(Meal meal);
}

public class Kitchen {
    private String name;
    private Chef[] chefs;

    public boolean assignChef();
}

public class Reservation {
    private int reservationID;
    private Date timeOfReservation;
    private int peopleCount;
    private ReservationStatus status;
    private String notes;
    private Date checkInTime;
    private Customer customer;
    private Table[] tables;
    private List<Notification> notifications;

    public boolean updatePeopleCount(int count);
}

// Payment is an abstract class
public abstract class Payment {
    private int paymentID;
    private Date creationDate;
    private double amount;
    private PaymentStatus status;

    public abstract void initiateTransaction();
}

public class Check extends Payment {
    private String bankName;
    private String checkNumber;

    public void initiateTransaction() {
        // functionality
    }
}

public class CreditCard extends Payment {
    private String nameOnCard;
    private int zipcode;

    public void initiateTransaction() {
        // functionality
    }
}

public class Cash extends Payment {
    private double cashTendered;

    public void initiateTransaction() {
        // functionality
    }
}

public class Bill {
    private int billId;
    private float amount;
    private float tip;
    private float tax;
    private boolean isPaid;

    public boolean generateBill();
}

// Notification is an abstract class
public abstract class Notification {
    private int notificationId;
    // The Date data type represents and deals with both date and time.
    private Date createdOn;
    private String content;

    public abstract void send(Person person);
}

class SmsNotification extends Notification {
    private String phone;

    public void sendNotification(Person person) {
        // functionality
    }
}

class EmailNotification extends Notification {
    private String email;

    public void sendNotification(Person person) {
        // functionality
    }
}

public class SeatingChart {
    private int seatingChartID;
    private byte[] seatingChartImage;

    public boolean print();
}

public class Branch {
    private String name;
    private Address location;
    private Kitchen kitchen;
    private Menu menu;

    public Address addseatingChart();
}

public class Restaurant {
    private String name;
    private List<Branch> branches;

    public boolean addBranch(Branch branch);
}