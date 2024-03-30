// definition of enums
enum ElevatorState {
  IDLE,
  UP,
  DOWN
}

enum Direction {
  UP,
  DOWN
}

enum DoorState {
  OPEN,
  CLOSE
}

// Button Abstract Class -> DoorButton, ElevatorButton and HallButton classes

public abstract class Button {
  private boolean status;

  public pressDown();
  public abstract boolean isPressed();
}

public class DoorButton extends Button {

  public boolean isPressed() {
    //Definition
  }
}

public class HallButton extends Button {
  private Direction buttonSign;

  public boolean isPressed() {
    // definition
  }
}

public class ElevatorButton extends Button {
  private int destinationFloorNumber;

  public boolean isPressed() {
    // definition
  }
}

// ElevatorPanel and HallPanel sue the instance of ElevatorButton and HallButton


public class ElevatorPanel {
  private List<ElevatorButton> floorButtons;
  private DoorButton openButton;
  private DoorButton closeButton;
}

public class HallPanel {
  private HallButton up;
  private HallButton down;
}


// Display class - responsible for showing the display inside and outside of elevator cars

public class Display {
  private int floor;
  private int capacity;
  private Direction direction;

  public void showElevatorDisplay();
  public void showHallDisplay();
}

// ElevatorCar class - contains the instance of Door, Display and ElevatorPanel.

public class ElevatorCar {
  private int id;
  private Door door;
  private ElevatorState state;
  private Display display;
  private ElevatorPanel panel;

  public void move();

  public void stop();

  public void openDoor();

  public void closeDoor();
}


// Door and Floor Classes. Door classes use DoorState enum, and Floor clss contains the instances of Display and HallPanel

public class Door {
  private DoorState state;
  public boolean isOpen();
}

public class Floor {
  private List<Display> display;
  private List<HallPanel> panel;

  public boolean isBottomMost();
  public boolean isTopMost();
}


// ElevatorSystem class -> singleton class,
// Building class contains instances of Floor, and ElevatorCar.  -> singleton class

public class ElevatorSystem {
  private Bulding building;
  public void monitoring();
  public void dispatcher();

  // private constructor to prevent direct instantiation
  private ElevatorSystem() {
    // Initialize the Elevator System
  }

  // The elevatorSystem is a singleton class that ensures it will have only oone active instance at a time
  private static ElevatorSystem system = null;

  // created a static method to access the singleton instance of ElevatorSystem class
  public static ElevatorSystem getInstace() {
    if(system == null) {
      system = new ElevatorSystem();
    }
    return system;
  }
}

public class Building {
  private List<Floor> floor;
  private List<ElevatorCar> elevator;

  // private constructor to prevent direct instantiation
  private Building();

  private static Building building = null;

  public static Building getInstance() {
    if (building == null) {
      building = new Building();
    }
    return building;
  }

}
