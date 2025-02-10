public class Address {
    private int zipCode;
    private String address;
    private String city;
    private String state;
    private String country;
}

enum OrderStatus {
    UNSHIPPED,
    PENDING,
    SHIPPED,
    CONFIRMED,
    CANCELED,
    REFUNDED
}

enum AccountStatus {
    ACTIVE,
    INACTIVE,
    BLOCKED
}

enum ShipmentStatus {
    PENDING,
    SHIPPED,
    DELIVERED,
    ON_HOLD
}

enum PaymentStatus {
    CONFIRMED,
    DECLINED,
    PENDING,
    REFUNDED
}

public class Account {
    private String userName;
    private String password;
    private String name;
    private List<Address> shippingAddress;
    private AccountStatus status;
    private String email;
    private String phone;

    private List<CreditCard> creditCards;
    private List<ElectronicBankTransfer> bankAccounts;

    public Address getShippingAddress();
    public boolean addProduct(Product product);
    public boolean addProductReview(ProductReview review, Product product);
    public boolean deleteProduct(Product product);
    public boolean deleteProductReview(ProductReview review, Product product);
    public boolean resetPassword();
}

public class Admin {
    private Account account;
    public boolean blockUser(Account account);
    public boolean addNewProductCategory(ProductCategory category);
    public boolean modifyProductCategory(ProductCategory category);
    public boolean deleteProductCategory(ProductCategory category);
}

// Customer is an abstract class
public abstract class Customer {
    private ShoppingCart cart;
    public abstract ShoppingCart getShoppingCart();
}

public class Guest extends Customer {
    public boolean registerAccount();

    public ShoppingCart getShoppingCart() {
        // functionality
    }
}

public class AuthenticatedUser extends Customer {
    private Account account;
    private Order order;
    public OrderStatus placeOrder(Order order);

    public ShoppingCart getShoppingCart() {
        // functionality
    }
}

public class Product {
    private String productId;
    private String name;
    private String description;
    private byte[] image;
    private double price;
    private ProductCategory category;
    private List<ProductReview> reviews;
    private int availableItemCount;
    private Account account;

    public int getAvailableCount();
    public int updateAvailableCount();
    public boolean updatePrice(double newPrice);
}

public class ProductCategory {
    private String name;
    private String description;
    private List<Product> products;
}

public class ProductReview {
    private int rating;
    private String review;
    private byte[] image;
    private AuthenticatedUser user;
}

public class CartItem {
    private int quantity;
    private double price;
    public boolean updateQuantity(int quantity);
}

public class ShoppingCart {
    private int totalPrice;
    private List<Items> items;

    public boolean addItem(Item item);
    public boolean removeItem(Item item);
    public List<Item> getItems();
    public boolean checkout();
}

public class Order {
    private String orderNumber;
    private OrderStatus status;
    private Date orderDate;
    private List<OrderLog> orderLog;
    private ShoppingCart shoppingCart;

    public boolean sendForShipment();
    public boolean makePayment(Payment payment);
    public boolean addOrderLog(OrderLog orderLog);
}

public class OrderLog {
    private String orderNumber;
    private Date creationDate;
    private OrderStatus status;
}

public class Shipment {
    private String shipmentNumber;
    private Date shipmentDate;
    private Date estimatedArrival;
    private String shipmentMethod;
    private List<ShipmentLog> shipmentLogs;

    public boolean addShipmentLog(ShipmentLog shipmentLog);
}

public class ShipmentLog {
    private String shipmentNumber;
    private Date creationDate;
    private ShipmentStatus status;
}

// Payment is an abstract class
public abstract class Payment {
    private double amount;
    private Date timestamp;
    private PaymentStatus status;
    public abstract PaymentStatus makePayment();
}

public class CreditCard extends Payment {
    private String nameOnCard;
    private String cardNumber;
    private String billingAddress;
    private int code;
    public PaymentStatus makePayment() {
        // functionality
    }
}

public class ElectronicBankTransfer extends Payment {
    private String bankName;
    private String routingNumber;
    private String accountNumber;
    private String billingAddress;
    public PaymentStatus makePayment() {
        // functionality
    }
}

public class Cash extends Payment {
    private String billingAddress;
    public PaymentStatus makePayment() {
        // functionality
    }
}

// Notification is an abstract class
public abstract class Notification {
    private int notificationId;
    private Date createdOn;
    private String content;

    public abstract boolean sendNotification(Account account);
}

public class EmailNotification extends Notification {
    public boolean sendNotification(Account account) {
        // functionality
    }
}

public class PhoneNotification extends Notification {
    public boolean sendNotification(Account account) {
        // functionality
    }
}

public interface Search {
    public List<Product> searchProductsByName(String name);
    public List<Product> searchProductsByCategory(String category);
}

public class Catalog implements Search {
    private HashMap<String, List<Product>> products;

    public List<Product> searchProductsByName(String name) {
        // functionality
    }

    public List<Product> searchProductsByCategory(String category) {
        // functionality
    }
}



