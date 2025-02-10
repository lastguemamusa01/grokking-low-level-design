// Enumeration
enum OrderStatus {
    OPEN,
    FILLED,
    PARTIALLY_FILLED,
    CANCELED
}

enum TimeEnforcementType {
    GOOD_TILL_CANCELED,
    FILL_OR_KILL,
    IMMEDIATE_OR_CANCEL,
    ON_THE_OPEN,
    ON_THE_CLOSE
}

enum AccountStatus {
    ACTIVE,
    CLOSED,
    CANCELED,
    BLACKLISTED,
    NONE
}

// Custom Address data type class
public class Address {
    private int zipCode;
    private String address;
    private String city;
    private String state;
    private String country;
}

// Account is an abstract class
public abstract class Account {
    private String id;
    private String password;
    private String name;
    private AccountStatus status;
    private Address address;
    private String email;
    private String phone;

    public abstract boolean resetPassword();
}

public class Member extends Account {
    private double availableFundsForTrading;
    private Date dateOfMembership;
    private HashMap<string, StockPosition> stockPositions;
    private HashMap<Integer, Order> activeOrders;

    public ErrorCode placeSellLimitOrder(string stockId, float quantity, int limitPrice, TimeEnforcementType enforcementType);
    public ErrorCode placeBuyLimitOrder(string stockId, float quantity, int limitPrice, TimeEnforcementType enforcementType);
    public void callbackStockExchange(int orderId, List<OrderPart> orderParts, OrderStatus status);
    public boolean resetPassword(){
        // definition
    }
}

public class Admin extends Account {
    public boolean blockMember();
    public boolean unblockMember();
    public boolean cancelMembership();
    public boolean resetPassword(){
        // definition
    }
}

public class Watchlist {
    private String name;
    private List<Stock> stocks;

    public List<Stock> getStocks();
}

public class Stock {
    private String symbol;
    private double price;
}

public interface Search {
    // Interface method (does not have a body)
    public Stock searchSymbol(String symbol);
}

public class StockInventory implements Search {
    private String inventoryName;
    private Date lastUpdate;
    public Stock searchSymbol(String symbol) {
        // definition
    }
}

public class StockPosition {
    private String symbol;
    private double quantity;
}

public class StockLot {
    private String iotNumber;
    private Order buyingOrder;

    public double getBuyingPrice();
}

public class OrderPart {
    private double price;
    private double quantity;
    private Date executedAt;
}

// Order is an abstract class
public abstract class Order {
    private String orderNumber;
    public boolean isBuyOrder;
    private OrderStatus status;
    private TimeEnforcementType timeEnforcement;
    private Date creationTime;
    private HashMap<int, OrderPart> parts;

    public void setStatus(OrderStatus status);
    public boolean saveInDatabase();
    public void addOrderParts(OrderParts parts);
}

public class LimitOrder extends Order {
}

public class StopLimitOrder extends Order {
}

public class StopLossOrder extends Order {
}

public class MarketOrder extends Order {
}

// TransferMoney is an abstract class
public abstract class TransferMoney {
    private int id;
    private Date creationDate;
    public int fromAccount;
    private int toAccount;

    public abstract boolean initiateTransaction();
}

public class ElectronicBank extends TransferMoney {
    private String bankName;

    public boolean initiateTransaction(){
        // definition
    }
}

public class Wire extends TransferMoney {
    private int wire;

    public boolean initiateTransaction(){
        // definition
    }
}

public class Check extends TransferMoney {
    private String checkNumber;

    public boolean initiateTransaction(){
        // definition
    }
}

public class DepositMoney {
    private int transactionId;

    public boolean initiateTransaction(){
        // definition
    }
}

public class WithdrawMoney {
    private int transactionId;
}

public abstract class Notification {
    private String notificationId;
    private Date creationDate;
    private String content;

    public abstract boolean sendNotification();
}

public class SmsNotification extends Notification {
    private int phoneNumber;

    public boolean sendNotification(){
        // definition
    }
}

public class EmailNotification extends Notification {
    private String email;

    public boolean sendNotification(){
        // definition
    }
}

public class StockExchange {
    // The StockExchange is a singleton class that ensures it will have only one active instance at a time
    private static StockExchange instance = null;

    // Created a private constructor to add a restriction (due to Singleton)
    private StockExchange() {}

    // Created a static method to access the singleton instance of StockExchange
    public static StockExchange getInstance()
    {
        if(instance == null) {
            instance = new StockExchange();
        }
        return instance;
    }

    public boolean placeOrder(Order order);
}


