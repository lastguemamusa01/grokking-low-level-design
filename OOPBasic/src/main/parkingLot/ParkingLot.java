

// Enumeration
enum PaymentStatus {
  COMPLETED,
  FAILED,
  PENDING,
  UNPAID,
  REFUNDED
}

enum AccountStatus {
  ACTIVE,
  CLOSED,
  CANCELED,
  BALCKLISTED,
  NONE
}

// custom person data type class
public class Person {
  private String name;
  private Address address;
  private String phone;
  private String email;
}

public class Address {
  private int zipCode;
  private String address;
  private String city;
  private String state;
  private String country;
}

// ParkingSpot abstract class
public abstract class ParkingSpot {
  private int id;
  private boolean isFree;
  private Vehicle vehicle;

  public boolean getIsFree();
  public abstract boolean assignVehicle(Vehicle vehicle);
  public boolean removeVehicle() {
    // definition
  }
}

public class Handicapped extends ParkingSpot {
  public boolean assignVehicle(Vehicle vehicle) {
    // definition
  }
}

public class Compact extends ParkingSpot {
  public boolean assignVehicle(Vehicle vehicle) {
    // definition
  }
}

public class Large extends ParkingSpot {
  public boolean assignVehicle(Vehicle vehicle) {
    // definition
  }
}

public class Motorcycle extends ParkingSpot {
  public boolean assignVehicle(Vehicle vehicle) {
    // definition
  }
}

// Vehicle is abstract class

public abstract class Vehicle {
  private int licenseNo;
  public abstract void assignTicket(ParkingTicket ticket);

}

public class Car extends Vehicle {
  public void assignTicket(ParkingTicket ticket) {
    // definition
  }
}

public class Van extends Vehicle {
  public void assignTicket(ParkingTicket ticket) {
    // definition
  }
}

public class Truck extends Vehicle {
  public void assignTicket(ParkingTicket ticket) {
    // definition
  }
}

public class Motocycle extends Vehicle {
  public void assignTicket(ParkingTicket ticket) {
    // definition
  }
}

// Account - abstract class

public abstract class Account {
  // Date members
  private String userName;
  private String password;
  private Person person; // Refers to an instance of the Person Class
  private AccountStatus status; // Refers to AccountStatus Enum

  public abstract boolean resetPassword();
}

public class Admin extends Account {

  // spot here refers to an instance of the ParkingSpot class
  public boolean addParkingSpot(ParkingSpot spot);

  // displayBoard here refers to an instance of the DisplayBoard class
  public boolean addDispolayBoard(DisplayBoard displayBoard);

  // entrance here refers to an instance of the Entrance class
  public boolean addEntrance(Entrance entrance);

  // exit here refers to an instance of the Exit class
  public boolean addExit(Exit exit);


  public boolean resetPassowrd() {
    // definition
  }
}

public class ParkingAttendant extends Account {
  public boolean processTicket(String ticketNumber);

  public boolean resetPassword() {
    // definition
  }
}

public class DisplayBoard {
  // data members
  private int id;
  private Map<String, List<ParkingSpot>> parkingSpots;

  // contructor

  public DisplayBoard(int id) {
    this.id = id;
    this.parkingSpots = new HashMap<>();
  }

  // Member functions
  public void addParkingSpot(String spotType, List<ParkingSpot> spots);
  public void showSlot();
}

public class ParkingRate {
  // data members
  private double hours;
  private double rate;

  public void calculate();
}

public class Entrance {
  // data members
  private int id;

  //member functions
  public ParkingTicket getTicket();
}

public class Exit {
  // data members
  private int id;

  // member funcion
  public void validateTicket(ParkingTicket ticket) {
    // perform validation logic for the parking ticket
    // calculate parking charges, if necessary
    // handle the exit process
  }
}

public class ParkingTicket {
  private int ticketNo;
  private Date timestamp;
  private Date exit;
  private double amount;
  private boolean status;

  // following are the instances of their respective classes
  privaet Vehicle vehicle;
  private Paymet paytment;
  private Entrance entrance;
  private Exit exit;
}

// Payment is abstract class

public abstract class Payment {
  private double amount;
  private PaymentStatus status;
  private Date timestamp;

  public abstract boolean initiateTransaction();
}

public class Cash extends Payment {
  public boolean initiateTransaction() {
    //definition
  }
}

public class CreditCard extends Payment {
  public boolean initiateTransaction() {
    //definition
  }
}

public class ParkingLot {
  private int id;
  private String name;
  private Address address;
  private ParkingRate parkingRate;

  private HashMap<String, Entrance> entrance;
  private HashMap<String, Exit> exit;

  // create a hasmap that identifies all currently generated tickets using their ticket number
  private HashMap<String, ParkingTicket> tickets;

  // The ParkingLot is a singleton class that ensures it will have only one active instance at a time
  // Both the Entrance and Exit classes use this class to create and close parking tickets
  private static ParkingLot parkingLot = null;

  // Created a private constructor to add a restriction (due to Singleton)
  private ParkingLot() {
    // call the name, address and parking rate
    // create initial entrance and exit hashmaps respectively
  }

  // created a static method to access the singleton instance of ParkingLot
  public static ParkingLot getInstance() {
    if(parkingLot == null) {
      parkingLot = new ParkingLot();
    }
    return parkingLot;
  }

  public boolean addEntrace(Entrance entrance){}
  public boolean addExit(Exit exit){}

  // this function allows parking tickets to be available at multiple entraces
  public ParkingTicket getParkingTicket(Vehicle vehicle){}

  public boolean isFull(ParkingSpot type){}


}
