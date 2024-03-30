

// enums - BookFormat, BookStatus, ReservationStatus, and AccountStatus.

enum BookFormat {
  HARDCOVER,
  PAPERBACK,
  AUDIOBOOK,
  EBOOK,
  NEWSPAPER,
  MAGAZINE,
  JOURNAL
}

enum BookStatus {
  AVAILABLE,
  RESERVED,
  LOANED,
  LOST
}

enum  ReservationStatus {
  WAITING,
  PENDING,
  CANCELED,
  NONE
}

enum AccountStatus {
  ACTIVE,
  CLOSED,
  CANCELED,
  BLACKLISTED,
  NONE
}

// address and person class

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
  private String phone;
}

// The User is an abstract class -> Librarian and Member class

public abstract class User {
  private String id;
  private String password;
  private AccountStatus status;
  private Person person;
  private LibraryCard card;

  public abstract boolean resetPassword();
}

public class Librarian extends User {
  public boolean addBookItem(BookItem bookItem);
  public boolean blockMember(Member member);
  public boolean unBlockMember(Member member);
  public boolean resetPassword() {
    // definition
  }
}

public class Member extends User {
  private Date dateOfMembership;
  private int totalBooksCheckedOut;

  public boolean reservedBookItem(BookItem bookItem);
  private void incrementTotalBooksCheckedOut();
  public boolean checkkoutBookItem(BookItem bookItem);
  private void checkForFine(String bookItemId);
  public void returnBookItem(BookItem bookItem);
  public boolean renewBookItem(BookItem bookItem);
  public boolean resetPassword() {
    // implementation
  }
}

// BookReservation, BookLending, and Fine classes.

public class BookReservation {
  private String itemId;
  private Date creationDate;
  private ReservationStatus reservationStatus;
  private String memberId;

  public static BookReservation fetchReservationDetails(String bookItemId);
}

public class BookLending {
  private String itemiD;
  private Date creationDate;
  private Date dueDate;
  private Date returnDate;
  private String memberId;
  private BookReservation bookReservation;
  private User user;

  public static boolean lendBook(String bookItemId, String memberId);
  public static BokkLending fetchLendingDetails(String bookItemId);
}

public class Fine {
  private Date creationDate;
  private String bookItemId;
  private String memberId;

  public static void collectFine(String memberId, long days);
}

// The Book is an abstract class and BookItem represents each copy of the book. and Rack class

public abstract class Book {
  private String isbn;
  private String title;
  private String subject;
  private String publisher;
  private String language;
  private int numberOfPages;
  private BookFormat bookFormat;
  private List<Author> authors;
}

public class BookItem {
  private String id;
  private boolean isReferenceOnly;
  private Date borrowed;
  private Date dueDate;
  private double price;
  private BookStatus status;
  private Date dateOfPurchase;
  private Date publicationDate;
  private Rack placedAt;
  private Book book; // Aggregation : BookItem has a reference to a book

  // Constructors, getters, and other existing methods...

  public boolean checkout(String memberId) {
    // Implementation for checkout logic
    // Update the status, set due date, etc.
    // Return true if checkout is successful, false otherwise
    return true;  // Placeholder, replace with actual logic
  }

  public void setPlacedAt(Rack rack) {
    this.placedAt = rack;
    // Additional logic if needed
  }

  public void setAddedBy(Librarian librarian) {
    // Implementation for setting the librarian who added the book item
    // This might involve updating logs or other data related to the librarian
    // No return value as it's a setter method
  }

  // Other methods...

  public Book getBook() {
    return book;
  }
}

public class Rack {
  private int number;
  private String locationIdentifier;
  private List<BookItem> bookItems;
  public void addBookItem(BookItem bookItem) {
    // implementation
  }
}

// The Notification class is another abstract class, PostalNotification and EmailNotification classes

public abstract class Notification {
  private String notificationId;
  private Date creaationDate;
  private String content;
  private BookLending bookLending;
  private BookReservation bookReservation;

  public abstract boolean sendNotification();
}

public class PostalNotification extends Notification {
  private Address address;

  public boolean sendNotification() {
    // implementation
  }
}

public class EmailNotification extends Notification {
  private String email;

  public boolean sendNotification() {
    // implementation
  }
}

// The Search is an interface, Catalog class is used to implement the search interface

public interface Search {
  // interface method (does not have a body)
  public List<Book> searchByTitle(String title);
  public List<Book> searchByAuthor(String author);
  public List<Book> searchBySubject(String subject);
  public List<Book> searchByPublicationDate(Date publishDate);
}

public class Catalog implements Search {
  private HashMap<String, List<Book>> bookTitles;
  private HashMap<String, List<Book>> bookAuthors;
  private HashMap<String, List<Book>> bookSubjects;
  private HashMap<String, List<Book>> bookPublicationDates;

  public List<Book> searchByTitle(String query) {
    // implementation
  }

  public List<Book> searchByAuthor(String query) {
    // implementation
  }

  public List<Book> searchBySubject(String query) {
    // implementation
  }

  public List<Book> searchByPublicationDate(String query) {
    // implementation
  }
}


// Library class which will be a Singleton class

public class Library {
  private String name;
  private Address address;

  // Private constructor to prevent external instantiation
  private Library() {}

  public Address getAddress();

  // The Library is a singleton class that ensures it will have only one active instance at a time
  private static Library library = null;

  // Created a static method to access the singleton instance of Library class
  public static Library getInstance () {
    if (library == null) {
      library = new Library ();
    }
    return library;
  }
}
