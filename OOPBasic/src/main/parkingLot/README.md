Requirement to ask and annote :

A parking lot is a designated area for parking vehicles and is a feature found in almost all popular venues
such as shopping malls, sports stadiums, offices, etc. In a parking lot, there are a fixed number of parking
spots available for different types of vehicles. Each of these spots is charged according to the time
the vehicle has been parked in the parking lot. The parking time is tracked with a parking ticket issued
to the vehicle at the entrance of the parking lot. Once the vehicle is ready to exit, it can either pay
at the automated exit panel or to the parking agent at the exit using a card or cash payment method.

![img_10.png](img_10.png)

Expectations from the interviewee

In a typical parking lot system, there are several components each with specific constraints and requirements. The following section provides an overview of some major expectations the interviewer will want an interviewee to discuss in more detail during the interview.



parking lot

fixed number of spots available
each spot is charged by time
different types of vehicles -> spot size -> handicapped, car, motocycles, van/truck
time is tracked by parking ticket issued at the entrance of the parking lot
exit
- pay at the automated exit panel
- or parking agent
  payment card or cash payment
  multiple entrance and exit

discussions to get requirements - questions to ask to get your requirements

several components each with specific constraints and requirements.

1 - payment flexibility -
- How are customers able to pay at different exit points (i.e., either at the automated exit panel or to the
parking agent) and by different methods (cash, credit, coupon)?
- If there are multiple floors in the parking lot, how will the system keep track of the customer having
already paid on a particular floor rather than at the exit?

2 - parking spot type
- How will the parking capacity of each lot be considered?
- What happens when a lot becomes full?
- How can one keep track of the free parking spots on each floor if there are multiple floors in the parking lot?
- How will the division of the parking spots be carried out among the four different parking spot types in the lot?
- (handicapped, compact, large, and motorcycle)

3 - vehicle types
- How will capacity be allocated for different vehicle types ?
- If the parking spot of any vehicle type is booked, can a vehicle of another type park in the designated parking spot?
- (car, truck, van, motorcycle)

4 - Pricing
- How will pricing be handled? Should we accommodate having different rates for each hour? For example, customers
will have to pay $4 for the first hour, $3.5 for the second and third hours, and  $2.5 for all the subsequent hours.
- Will the pricing be the same for the different vehicle types?

5 - Design Approach -> bottom-up design approach
- Identify and design the smallest components first, like, the vehicle and parking spot types.
- Use these small components to design bigger components, for example, the payment system at the exit.
- Repeat the steps above until we design the whole system like the parking lot.

6 - Design pattern
- Singleton design pattern
- Abstract Factory design pattern
- Factory design pattern

Design pattern

During an interview, it is always a good practice to discuss the design patterns that a parking lot system falls under. Stating the design patterns gives the interviewer a positive impression and shows that the interviewee is well-versed in the advanced concepts of object-oriented design.


Requirements

requirements define the scope of a problem


- The parking lot should have the capacity to park 40,000 vehicles
- The four different types of parking spots are handicapped, compact, large, and motorcycle.
- The parking lot should have multiple entrance and exit points.
- Four types of vehicles should be allowed to park in the parking lot, which are as follows:

  - Car
  - Truck
  - Van
  - Motorcycle

- The parking lot should have a display board that shows free parking spots for each parking spot type.
- The system should not allow more vehicles in the parking lot if the maximum capacity (40,000) is reached
- If the parking lot is completely occupied, the system should show a message on the entrance and on the parking lot display board.
- Customers should be able to collect a parking ticket from the entrance and pay at the exit.
- The customer can pay for the ticket either with an automated exit panel or pay the parking agent at the exit
- The payment should be calculated at an hourly rate.
- Payment can be made using either a credit/debit card or cash.


Use Case

System 

parking lot

actors

primary actors :

- Customer: This actor can park the vehicle in the allocated parking space according to the vehicle type and pay for the parking before exit.

- Parking agent: The parking agent will assist the customer and perform all the tasks that a customer can do, such as paying the parking ticket on behalf of the customer.


secondary actors : 

- Admin: This can add, remove, or update a spot, agent, entry/exit panels, and view/update accounts.

- System: This is responsible for giving details of parking spot availability and assigning a parking spot to a vehicle.


Admin

- Add spot: To add a parking spot
- Add agent: To add a new agent
- Add/modify rate: To add/modify hourly rate
- Add entry/exit panel: To add and update exit/entry panel at each entry/exit
- Update account: To update account details and payment information
- Login/Logout: To login/logout to/from agent or admin account
- View account: To view account details like payment status or unpaid amount

Customer

- Take ticket: To take a ticket at the entrance, that contains information regarding the vehicle and its entrance time
- Scan ticket: To scan the ticket at the exit and get the parking fee
- Pay ticket: To pay the parking fee at the exit panel via cash or a credit card
- Cash: To pay the parking fee via cash
- Credit card: To pay the parking fee via credit card
- Park vehicle: To park the vehicle at the assigned destination

Parking agent

- Update account: To update account details and payment information
- Login/Logout: To log in/log out to/from the agent or admin account
- View account: To view account details like payment status or unpaid amount
- Take ticket: To take a ticket at the entrance, that contains information regarding the vehicle and its entrance time
- Scan ticket: To scan the ticket at the exit and get the parking fee
- Pay ticket: To pay the parking fee at the exit panel via cash or a credit card
- Cash: To pay the parking fee via cash
- Credit card: To pay the parking fee via credit card
- Park vehicle: To park the vehicle at the assigned destination

System

- Assigning parking spots to vehicles: To check the vehicle type and associate a free spot according to it
- Remove spot: To remove a parking spot if it is not available for parking
- Show full: To display the status of the parking lot as full
- Show available: To show the details of available parking spots


Generalization

- The “Parking agent” has a generalization relationship with the “Customer” since the parking agent can perform all those tasks that a customer can perform.
- “Cash” and “Credit card” use cases are used for payments. Hence, both have a generalization relationship with the “Pay ticket” use case.

Associations

The table below shows the association relationship between actors and their use cases.

![img_11.png](img_11.png)

Include

The “Scan ticket” has an include relationship with the “Pay ticket” since it is necessary to scan a ticket and
get the total payable fee of parking a vehicle before the actual payment.

use case diagram

![img.png](img.png)

class diagram

design classes, abstract classes, and interfaces based on the requirements we have previously gathered from the interviewer in our parking lot system

bottom-up approach

In this lesson, we will identify and design classes, abstract classes, and interfaces based on the requirements we have previously gathered from the interviewer in our parking lot system.

Components of a parking lot system

As mentioned earlier, we should design the parking lot system using a bottom-up approach. Therefore, we will first identify and design the classes of the smaller components like vehicles and parking spots. Then, we will create the class of the entire parking lot system, including these smaller components.

classes

1 - Vehicle (abstract class) - a car, a truck, a van, and a motorcycle(class) -> 2 ways to represent vehicle
 
Our parking lot system should have a vehicle object according to the requirements. The vehicle can be a car, a truck, a van, and a motorcycle

- Enumeration
- Abstract class

Enumeration vs. abstract class#

The enumeration class creates a user-defined data type that has the four vehicle types as values.

This approach is not proficient for object-oriented design because if we want to add one more vehicle type later in our
system, then we would need to update the code in multiple places in our code, and this would violate the Open
Closed principle of the SOLID design principle. This is because the Open Closed principle states that classes can
be extended but not modified. Therefore, it is recommended not to use the enumeration data type as it is not a scalable approach.

Using enums isn’t prohibited, but just not recommended. Later, we will use the PaymentStatus enum in our parking lot
design as it won’t require further modifications.

An abstract class cannot instantiate the object and can only be used as a base class. The abstract class for Vehicle
is the best approach. It allows us to create derived child classes for the Vehicle class. It can be extended easily
in case the vehicle type changes in the future.

![img_12.png](img_12.png)


2 - Parking spot (abstract class) -> handicapped, compact, large, and motorcycle (class)

Similar to the Vehicle class, the ParkingSpot should also be an abstract class
handicapped, compact, large, and motorcycle

![img_13.png](img_13.png)

3 - Account (abstract class) -> Admin, Parking Agent (class)

Similar to the Vehicle and ParkingSpot classes, Account should also be an abstract class

![img_14.png](img_14.png)

4 - Display board(class)

This class represents the free parking spot types and the number of empty slots.

![img_15.png](img_15.png)

5 - Entrance(class) and exit(class)

The Entrance class is responsible for returning the parking ticket whenever a vehicle arrives.
It contains the ID attribute, since there are multiple entrances to the parking lot. It also has the getTicket() method.

The Exit class is responsible for validating the parking ticket’s payment status before allowing the vehicle to exit the
parking lot. It contains the ID attribute, since there are multiple exits to the parking lot. It also has the validateTicket() method.

![img_16.png](img_16.png)

6 - Parking ticket(class)

The ParkingTicket class is one of the central classes of the system. It keeps track of the entrance and exit times of the
vehicles, the amount, and the payment status

![img_17.png](img_17.png)

7 - Payment(abstract class) -> card, cash(class)

The Payment class will be an abstract class and will have two child classes, card and cash, since these are two payment methods of the parking lot system.

![img_18.png](img_18.png)

8 - Parking rate(class)

The ParkingRate class is responsible for calculating the final payment based on the time spent in the parking lot.

![img_19.png](img_19.png)

9 - Parking lot (class)

Now, we will discuss the design of the whole ParkingLot system class. This parking lot system is composed of smaller
objects we have already designed, like entrance/exit, parking spots, parking rates, etc.

![img_20.png](img_20.png)

The enumerations and custom data types#

Enums

- PaymentStatus: We need to create an enumeration to keep track of the payment status of the parking ticket, whether it is
paid, unpaid, canceled, refunded, and so on.

- AccountStatus: We need to create an enumeration to keep track of the status of the account, whether it is active,
canceled, closed, and so on.

![img_21.png](img_21.png)

Address (class -> custom data type )

We also need to create a custom data type, Address, that will store the location of the parking lot.

![img_22.png](img_22.png)

Person (class -> custom data type)

The Person class is used to store information related to a person like a name, street address, country, etc.

![img_23.png](img_23.png)

Relationship between the classes

Association

The class diagram has the following association relationships:

- The ParkingSpot has a one-way association with Vehicle.
- The Vehicle has a one-way association with ParkingTicket.
- The Payment has a two-way association with ParkingTicket.

![img_24.png](img_24.png)

Composition

The class diagram has the following composition relationships.

- The ParkingLot class includes Entrance, Exit, ParkingRate, DisplayBoard, ParkingTicket, and ParkingSpot.

- The ParkingTicket class includes Payment object.

![img_25.png](img_25.png)

Inheritance

The following classes show an inheritance relationship:

- The Vehicle class includes Car, Truck, Van, and MotorCycle subclasses.
- The ParkingSpot class includes handicapped, compact, large, and motorcycle subclasses.
- The Payment class includes the Cash and CreditCard subclasses.

Note: We have already discussed the inheritance relationship between classes in the component section above.

Class diagram of the parking lot system

![img_1.png](img_1.png)

Design pattern

The system itself will have a ParkingLot class. It will use the Singleton design pattern, because there will only be
a single instance of the parking lot system.

This parking lot system is also composed of smaller objects that we have already designed, like entrance,
exit, parking spots, parking rates, etc. Therefore, it will be a good practice to use the
Abstract Factory and Factory design pattern to instantiate all those objects.

Additional requirements

The interviewer can introduce some additional requirements in the parking lot system, or they can ask some follow-up questions.
Let’s see some examples of additional requirements:

Parking floor: The parking lot should have multiple floors where customers can park their cars. The class diagram
provided below shows the relationship of ParkingFloor with other classes:

![img_4.png](img_4.png)

Electric: The parking lot should have some parking spots specified for electric cars. These spots should have an
electric panel through which customers can pay and charge their vehicles. The class diagram provided below shows
the relationship of Electric and ElectricPanel with other classes:

![img_5.png](img_5.png)

Let’s say that the interviewer asks you that the parking lot should assign a parking spot closest to the entrance. How do you go about solving this requirement?

This requirement is more about how you implement this parking assignment strategy rather than designing it. The interviewer is really looking at your data structures and algorithms skills in this requirement.

In this scenario, let’s say we have four entrances and would like to return to the parking spot which is nearest to the entrance from where the customer is entering the parking lot. The best approach is to implement it using a min-heap.

We will declare four min-heaps. We will add all parking spots to these min-heaps, so there will be a min-heap for each entrance. These min-heaps will store the parking spots in the order of the shortest distance from the entrance.

We will also declare the following two sets of parking spots:
- A set of available parking spots
- A set of reserved parking spots

We have a map of min-heaps where the key is the entrance ID, and the value is a min-heap. When the user calls the getParkingSpot method, we get the entrance ID which gives us the min-heap for that entrance and allows us to pop the top element to get the parking spot.

We mark the parking spot as reserved and remove it from the available set. We also remove it from the min-heaps of other entrances.

Sequence Diagram

A sequence diagram is a great way to understand the interactions between different entities and objects in the system. There can be different sequence diagrams that we can create for our parking lot system. For the sake of this lesson, we will create sequence diagrams for the following two interactions:

- Card payment: This performs a payment using the card.
- Sequence challenge: This is for payment verification.

Card payment

The sequence diagram for the card payment should have the following actors and objects that will interact with each other:

- Actor: Customer
- Object: CardReader, Payment, and ExitPanel

Here are the steps in the card payment interaction:

1 - The customer inserts the card into the card reader.
2 -The card reader initiates a payment for the required parking fee.
3 - The payment processes the payment and returns the payment status.
4 - The card reader ejects the card.
5 - If the payment is successful:
5.1 - The customer requests a receipt for the transaction.
5.2 - The exit panel prints a receipt for the customer.
6 - If the payment is unsuccessful:
6.1 - The customer sees an error message for an unsuccessful Payment.

Note: The Payment object is created when a vehicle enters the parking lot.

![img_6.png](img_6.png)

Sequence challenge: Payment verification

In this section, you will help us in completing a sequence diagram for the payment verification of a customer at the exit panel.

![img_7.png](img_7.png)

An activity diagram is a great way to visualize the flow of messages from one activity to the other in the system.
There can be different activity diagrams that we can create for our parking lot system. For this lesson, we will create activity diagrams for the following two activities:

- The vehicle entering the parking lot
- Activity challenge: Customer pays the parking ticket

The vehicle entering the parking lot

states

Initial state: The customer enters the parking lot.

Final state: There are two final states present in this activity diagram, shown below:

- The customer receives the parking ticket through the system.
- There is no parking slot vacant, so the customer is denied access to the parking lot.

Actions

The customer arrives at the parking lot entrance and selects their vehicle type. They are assigned their dedicated
parking spot according to their select vehicle type. The parking lot then informs us about the availability of that
parking spot and allows access accordingly

![img_8.png](img_8.png)

Activity challenge: Customer pays the parking ticket

![img_9.png](img_9.png)

Code for the Parking Lot

For simplicity, we aren’t defining getter and setter functions. The reader can assume that all class attributes are
private and accessed through their respective public getter methods and modified only through their public method functions.

Parking lot classes

In this section, we will provide the skeleton code of the classes designed in the class diagram lesson.

Enumerations and custom data type

First of all, we will define all the enumerations required in the parking lot. According to the class diagram, there are two enumerations used in the system i.e., PaymentStatus and AccountStatus.

Parking spots

The first section of the parking lot system that we will work on is the ParkingSpot class, which will act as a base class for four different types of parking spots: handicapped, compact, large, and motorcycle. This will have an instance of the Vehicle class.

Vehicle

Vehicle will be another abstract class, which serves as a parent for four different types of vehicles: car, truck, van, and motor cycle. 

Account

The Account class will be an abstract class, which will have the actors, Admin and ParkingAttendant, as child classes.

Display board and parking rate

This section contains the DisplayBoard and ParkingRate classes that only have the composition class with the ParkingLot class.

Entrance and exit

This section contains the Entrance and Exit classes, both of which are associated with the ParkingTicket class.

Parking ticket

The definition of the ParkingTicket class can be found below. This contains instancesof the Vehicle, Payment, Entrance and Exit classes

Payment

The Payment class is another abstract class, with the Cash and CreditCard classes as its child. This takes the PaymentStatus enumeration and the dateTime data type to keep track of the payment status and time.

Parking lot

The final class of the parking lot system is the ParkingLot class which will be a Singleton class, meaning the entire system will only have one instance of this class.

