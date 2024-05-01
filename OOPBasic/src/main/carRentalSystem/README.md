A car rental system is an application that manages the renting of automobiles for a short period of time—a few hours to a few weeks. A car rental system has a number of offices in different locations within each city. It allows the users to reserve and return a vehicle from different locations and is primarily located near airports or city areas.The car rental system keeps a list of all its clients in a database. The database includes the name, address, and contact number of each new customer.A member can reserve a car for a certain number of days, hire a car, or return the car that was rented. A member makes a reservation by supplying the pickup and drop-off locations, the kind of vehicle, and the day and time of the reservation.

Vehicle types

- What types of vehicles will that system support?

- How can we identify the specific vehicle?

Search interface

- Is it possible to search a vehicle using its name or type?

- Can we search for a vehicle by its model number?

Services

- Does a car rental system assign a driver to its customer?

- Does a car rental system provide roadside assistance to its customer?

Reservation cancelation

- Can the member be able to cancel a reservation?

- Which member is allowed to request a vehicle reservation cancelation and when?

Payment flexibility

- How can customers pay at different branch locations and by different methods (cash, credit, or cheque)?

- If there are multiple branches of the car rental system, how will the system keep track of the customer having already paid at a particular branch?

Design approach

bottom-up design approach

Design pattern

Requirements

- R1: There can be two types of users in the car rental system, i.e., customers and receptionists.

- R2: The system should handle multiple types of vehicles. Initially, the system should cater to the following vehicles: cars, trucks, vans, and motorcycles.

- R3: There can be multiple subtypes for vehicles. The car type can be economy, luxury, standard, and compact. The van type can be passenger or cargo. Moreover, the motorcycle type can be cruiser, touring, or sports.The truck type can be light, medium, or high-duty.

- R4: The system should be able to keep a record of who reserved a particular vehicle and on which date the vehicle was issued.

- R5: The system should be able to find out how many vehicles have been rented out by the specific customer.

- R6: The customers should be able to cancel their reservations.

- R7: To keep track of all events related to the vehicle, the system should maintain a vehicle log.

- R8: The system should allow the users to add equipment to the reservations like a ski rack, child seat, and navigation.

- R9: The system should allow the users to add services to the reservations like a driver, Wi-Fi, and roadside assistance.

- R10: The system should send a notification to the customer and generate a fine if the vehicle is not returned within the due date.

- R11: The system should allow the user to search the vehicles by type or model.

- R12: A system should be able to manage the multiple branches of the car rental system.

- R13: Every branch of the car rental system should have parking stalls to park the vehicles.

User Case Diagram

System

- Our system is “rent a car.”

Primary actors

- Member: This is the primary actor of the system who can reserve a vehicle, make payment, and change or cancel the reservations of the vehicle.

Secondary actors

- Receptionist: This actor acts as the system’s admin and can perform any task a “Member” can perform. This can also add, remove, or modify the vehicle or its reservations and update logs.

- Worker: This actor can update logs, return vehicles, and pay bills.

- System: This can send notifications related to reservation to members.

Use cases

Member

- Create a new account: To create a new account on the system

- Update/cancel account: To update account information or to cancel an account

- Login/Logout: To log in and out of the car rental system

- Search vehicle inventory: To search for vehicles from the inventory

- Make a reservation: To make a reservation for a vehicle

- Cancel reservation: To cancel the reservation of the vehicle

- Update reservation: To update the reservation information of the vehicle

- Return vehicle: To return the vehicle to the car rental facility

- Pickup vehicle: To pick up the vehicle from the car rental facility

- Pay bill: To pay vehicle rent

Receptionist

- Create a new account: To create a new account on the system

- Update/cancel account: To update account information or to cancel an account

- Login/Logout: To log in and out of the car rental system

- Search vehicle inventory: To search for vehicles from the inventory

- Make a reservation: To make a reservation for a vehicle

- Cancel reservation: To cancel the reservation of the vehicle

- Update reservation: To update the reservation information of the vehicle

- Add vehicle: To add a new vehicle to the car rental system

- Remove vehicle: To remove a vehicle from the car rental system

- Modify vehicle: To modify a vehicle status or information from the car rental system

- Update log: To update the vehicle log

System

- Send overdue notification: To send a notification if the date and time for vehicle return are passed

- Send reservation notification: To send a notification of the reservation made

- Send reservation canceled notification: To send a notification of any canceled reservation




