Getting Ready: An Online Stock Brokerage System

Problem definition

An online stock brokerage system acts as as an intermediary between the buyer and seller during the trade of the stocks. The system facilitates its users to buy and sell stocks online. It enables users to monitor and carry out their transactions and displays performance graphs for the various stocks in their portfolios. It also offers protection for client transactions and notifies them when stock changes reach certain levels.

The automated online stock brokerage system uses computers and the internet to speed up and reduce the cost of traditional stock trading. Additionally, this method provides quicker access to stock information, current market trends, and current stock prices.

![img.png](img.png)

Discoverability

For an online stock brokerage system, discoverability is one of the key features. You can ask the following questions to know more about the system:

How do the members search the stock inventory?

How will the search surface result?

Visibility

To get a better understanding of how the data is visible to the different users, you may ask the following questions:

Can every member see the current levels of stock positions at any time?

Order type

You may ask the interviewer about the types of orders the system should be able to handle by simply asking the question listed below:

How many types of stock trade orders are the users able to place, for example, a market order, loss order, etc?

Multiplicity

You may ask the interviewer questions related to the multiplicity of the system. These questions are listed below:

Can the members have multiple watchlists containing multiple stock quotes?

Can a member buy multiple lots of the same stock at different times?

Design approach

We'll design this online stock brokerage system using the bottom-up design approach. For this purpose, we will follow the steps below:

Identify and design the simple components first, like the stock and stock position.

Use these small components to design bigger components, such as the order and stock inventory that can be composed of multiple stock items.

Repeat the steps above until we design the whole stock brokerage system.

Design pattern

During an interview, it is always a good practice to discuss the design patterns that an online stock brokerage system falls under. Stating the design patterns gives the interviewer a positive impression and shows that the interviewee is well-versed in the advanced concepts of object-oriented design.

Requirements for the Online Stock Brokerage System

R1: The system should allow the user to easily trade in stocks (buy or sell the stocks).

R2: Users are allowed to have numerous watchlists consisting of different stock quotes.

R3: Users may own different lots of the same stock. This implies that the system should be able to distinguish between several lots of the same stock if a user has purchased the same stock more than once.

R4: Every time a trade order is carried out, the system should be able to notify users.

R5: The system should allow the user to order the stock trade of the types given below:

- Market order: Buy or sell stocks at the current market price.
- Limit order: Buy or sell stocks at the price set by the user.
- Stop-loss order: Buy or sell stocks when they reach a certain price.
- Stop-limit order: Buy or sell stocks with a restriction on the limit price (maximum price to be paid, minimum price to be received, etc).

![img_1.png](img_1.png)

R6: The system should allow the user to make deposits and withdrawals using checks, wire transfers, or electronic bank transfers.

Use Case Diagram for the Online Stock Brokerage System

System

Our system is a "stock brokerage."

Actors

Now, we’ll define the main actors of our online stock brokerage system.

Primary actors

Member: This actor can search the stock, place an order to buy or sell stocks, create an account, start a membership, add stocks to the wishlist, add buying and selling limits as well as perform transactions in three ways. It can also create and update accounts, perform login and logout, and cancel membership.

Secondary actors

Admin: This can create and update accounts, perform login and logout, cancel membership, and block or unblock members.

System: This is responsible for notifying the member about the order status and transactions. It can also fetch stock quotes from the stock exchange.

Use cases

Member

Create account: To create a new account in the online stock brokerage system

Cancel membership: To cancel an old online stock brokerage system membership

Update account: To update account details in the online stock brokerage system

Login/Logout: To log in and out of the online stock brokerage system account

Cancel order: To cancel any buying or selling stock order in the online stock brokerage system

View stock positions: To view live positions and pricing of stocks in the stock exchange

Add stock to wishlist: To add a stock to a member's wishlist

Create/update wishlist: To add and remove stocks from the existing or new wishlist

Search stock inventory: To search for a stock in the stock inventory

Place order: To place an order to buy or sell the order

Deposit/withdraw money: To deposit or withdraw money to and from your account

Admin

Create account: To create a new account in the online stock brokerage system

Cancel membership: To cancel an old online stock brokerage system membership

Update account: To update account details in the online stock brokerage system

Login/Logout: To log in and out of the online stock brokerage system account

Block/unblock member: To block and unblock a member from the online stock brokerage system

System

Fetch stocks quotes from stock exchange: To fetch stock price from the stock inventory in the online stock brokerage system

Send order status change notification: To notify about the change in the order status in the online stock brokerage system

Send deposit/withdrawal status change notification: To notify about the deposit and withdrawal of money

Relationships

Generalization

The "Electronic bank transfer," "Wire transfer," and "Check Transfer" use cases are used for transactions. Hence, they have a generalization relationship with the "Transaction" use case.

When an order is placed, it could be the market, limit, stop-loss or stop-limit order. Therefore, the "Place market order," "Place limit order," "Place stop-limit order," and "Place stop-loss order" use cases have a generalization relationship with the "Place order" use case.

Associations

![img_2.png](img_2.png)

Include

The "Deposit/withdraw money" use case has an include relationship with the "Transaction" use case, since a money transaction takes place when money is deposited or withdrawn.

Use case diagram

![img_3.png](img_3.png)

Class Diagram for the Online Stock Brokerage System

![img_4.png](img_4.png)

![img_5.png](img_5.png)

![img_6.png](img_6.png)

![img_7.png](img_7.png)

![img_8.png](img_8.png)

![img_9.png](img_9.png)

![img_10.png](img_10.png)

![img_11.png](img_11.png)

![img_12.png](img_12.png)

![img_13.png](img_13.png)

![img_14.png](img_14.png)

Class diagram of the online stock brokerage system

![img_15.png](img_15.png)

Design pattern

In the online stock brokerage system, there is going to be only one instance of the stock exchange, which encloses all the information and relations relating to the stock exchange. Therefore, we use the Singleton design pattern to ensure that only one instance for the class is created and this instance has a global point of access.

We can also use the Observer design pattern for our online stock brokerage system. Since the user has set buying and selling limits, the system observes stock prices, and when a stock reaches the specified price it buys and sells the stock automatically. Therefore, there is a need for an observer who observes the price of stock all the time.

Sequence Diagram for the Online Stock Brokerage System

Selling a stock

![img_16.png](img_16.png)

![img_17.png](img_17.png)

Activity Diagram for the Online Stock Brokerage System

Buying a stock

The states and actions involved in this activity diagram are listed below.

States

Initial state: The member selects a stock to buy.

Final state: There are two final states present in this activity diagram, shown below:

The member successfully buys a stock from the online stock brokerage system.

Due to the unavailability of a sufficient deposit, members aren't able to buy the stocks.

Actions

The member selects the stock to buy, order type, stock quantity, time price limit, and time enforcement. Then, the system will check if the member has a sufficient deposit in the account. If available, the system then deducts funds from the account, sends order details to the stock exchange, and notifies the member about order success when it receives acknowledgment from the stock exchange.

Based on the order above, the activity diagram for buying a stock at the online stock brokerage system is provided below:

![img_18.png](img_18.png)

Code for the Online Stock Brokerage System

Enumerations and custom data type

First of all, we will define all the enumerations required in the stock brokerage system. According to the class diagram, there are three enumerations used in the system i.e. OrderStatus, TimeEnforcementType and AccountStatus.

Account

The Account class will be an abstract class, which will have the actors, Admin and Member, as child classes. 

Watchlist and stock

A Watchlist class is a list of stocks that an investor keeps an eye on, to profit from price drops. The Stock class is an equity or a security that represents a portion of the issuing company's ownership.

Search and stock inventory

The StockInventory class implements the Search interface.

Stock position and stock lot

All the stocks that the user owns will be included in the StockPosition class. A member may purchase various lots of the same stock at various dates. The StockLot class will represent these particular lots.

Order

Members can place stock trading orders when they want to sell or acquire StockPosition.

Transfer money

Members should be able to deposit and withdraw money either via Check, Wire, or ElectronicBank transfer.

Notification

The Notification class is another abstract class responsible for sending notifications to the users, with the SmsNotification and EmailNotification classes as its child.

Stock exchange

The stock brokerage system will get all the stocks and their current pricing from the StockExchange class.'








