
// Enums

enum Suit {
    HEART,
    SPADE,
    CLUB,
    DIAMOND
}

enum AccountStatus {
    ACTIVE,
    CLOSED,
    CANCELLED,
    BLACKLISTED,
    NONE
}

// Custom Person data type class

public class Person {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private String country;
}


public class Card {
    private Suit suit;
    private int faceValue;

    public Card(Suit suit, int faceValue){}
}

public class Deck {
    private List<Card> cards;

    public Deck(){

    }

    public List<Card> getCards(){} 
}

public class Shoe {
    private List<Deck> decks;
    private int numberOfDecks;

    public Shoe(int numberOfDecks, List<Deck> decks) {
        // 1 createShoe();
        // 2. shuffle();
    }

    public void createShow{}
    public void shuffle(){}
    public Card dealCard(){}

}



public class BlackJackGame {
    

}
