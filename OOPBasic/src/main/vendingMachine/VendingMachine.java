// enums

enum ProductType {
  CHOCOLATE,
  SNACK,
  BEVERAGE,
  OTHER
}

// State is an interface and the NoMoneyInsertedState, MoneyInsertedState, and DispenseState classes implement the State interface.

// State Desing Pattern
public interface State {
  // Inteface method
  public void insertMoney(VendingMachine machine, double amount);
  public void pressButton(VendingMachin machine, int rackNumber);
  public void returnChange(double amount);
  public void updateInventory(VnedingMachine machine, int rackNumber);
  public void dispenseProduct(VendingMachine machine, int rackNumber);
}

public class NoMoneyInsertedState implements State {
  @override
  public void insertMoney(VendingMachine machine, double amount) {
    // changes state to MoneyInsertedState
  }
  public void pressButton(VendingMachine machine, int rackNumber) {}
  public void returnChange(double amount) {}
  public void updateInventory(VendingMachine machine, int rackNumber) {}
  public void dispenseProduct(VendingMachine machine, int rackNumber) {}
}

public class MoneyInsertedState implements State {
  @override
  public void insertMoney(VendingMachine machine, double amount) {}
  public void pressButton(VendingMachine machine, int rackNumber) {
    // check if product item is available
    // validate money
    // change state to DispenseState
  }
  public void returnChange(double amount) {}
  public void updateInventory(VendingMachine machine, int rackNumber) {}
  public void dispenseProduct(VendingMachine machine, int rackNumber) {}
}

public class DispenseState implements State {
  @override
  public void insertMoney(VendingMachine machine, double amount) {}
  public void pressButton(VendingMachine machine, int rackNumber) {}
  public void returnChange(double amount){}
  public void updateInventory(VendingMachine machine, int rackNumber) {}
  public void dispenseProduct(VendingMachine machine, int rackNumber) {
    // dispense product
    // change state to NoMoneyInsertedState
  }
}

// We will explore the Product, Rack, and Inventory classes that provide the details of the items available as well as their positions inside the vending machine.

public class Product {
  private String name;
  private int id;
  private double price;
  private ProductType productType;
}

public class Rack {
  private int ProductId;
  private int rackNumber;

  public boolean isEmpty(){}
}

public class Inventory {
  private int noOfProducts;
  private List<Product> products;

  public void addProduct(int productId, int rackId){}

  public void removeProduct(int productId, int rackId) {}
}

// The VendingMachine class is the final class of the system, and it will also be a Singleton class so that there will only be a single instance of this class in the whole system

public class VendingMachine {
  private State currentState;
  private double amount;
  private int noOfRacks;
  private List<Rack> racks;
  private Lst<int> availableRacks;

  // The VendingMachine is a Singleton class that ensures it will have only one active instance at a time
  private static VendingMachine vendingMachine = null;

  // Created a private constructor to add a restriction (due to Singleton)
  private VendingMachine();

  // Created a static method to access the singleton instance of VendingMachine
  public static VendinMachine getInstance() {
    if(vendingMachine == null) {
      vendingMachine = new VendingMachine();
    }
    return vendingMachine;
  }

  public void insertMoney(double amount) {}
  public void pressButton(int rackNumber) {}
  public void returnChange(double amount) {}
  public void dispenseProduct(int rackNumber) {}
  public void updateInventory(int rackNumber) {}
  public int getProductIdAtRack(int rackNumber) {}


}
