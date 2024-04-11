// enums

public enum LockerSize {
    EXTRA_SMALL,
    SMALL,
    MEDIUM,
    LARGE,
    EXTRA_LARGE,
    DOUBLE_EXTRA_LARGE
}

public enum LockerState {
    CLOSED,
    BOOKED,
    AVAILABLE
}

// The Item class represents the single item while the Order represents the order placed by the customer and can contain the list of items

public class Item {
    private String itemId;
    private int quantity;
}

public class Order {
    private String orderId;
    private List<Item> items;
    private String deliveryLocalation;
}

// When an order is packed, it is represented by the Package , and the package which is contained in the locker is represented by the LockerPackage class.

public class Package {
    private String packageId;
    private double packageSize;
    private Order order;

    public void pack(){
        // implementation
    }
}

public class LockerPackage extends Package {
    private int codeValidDays;
    private String lockerId;
    private String packageId;
    private String code;
    private Date packageDeliveryTime;

    public boolean isValidCode(){
        // implmentation
    }
    public boolean verifyCode(String code){
        // implementation
    }
}

// The Locker is the most important class of the system and a LockerLocation can contain multiple Locker instances

public class Locker {
    private String lockerId;
    private LockerSize lockerSize;
    private String locationId;
    private LockerState lockerState;

    public boolean addPackage(){
         // implementation
    }
    public boolean removePackage(){
         // implementation
    }
}

public class LockerLocation {
    private String name;
    private List<Locker> lockers;
    private double longitude;
    private double latitude;
    private Date openTime;
    private Date closeTime;
}

//  LockerService class which will be singleton class and notification class

public class Notification {
    private String customerId;
    private String orderId;
    private String lockerId;
    private String code;

    public void send(){

    }
}


public class LockerService {
    private List<LockerLocation> locations;

    private static LockerService lockerService = null;

    public static LockerService getInstance() {
        if(lockerService == null) {
            lockerService = new lockerService();
        }
        return lockerService;
    }
}



