A meeting scheduler software allows organizations to schedule and book meetings for a group of participants. The scheduler determines a meeting time and location depending on the availability of the participants. It ensures that most of the intended participants can effectively meet on the specified date and interval. The system allows users to book and cancel meetings. The invited participants promptly receive these notifications. The organizer can also add new participants to a meeting after the meeting is scheduled.

How does the system determine available rooms?

How important is the capacity of a room when assigning a room for a meeting?

How does the system check the availability of the attendees?

How does the system access the meeting information of all attendees?

bottom-up design approach

During an interview, it is always a good practice to discuss the design patterns that the meeting scheduler falls under

Requirements

R1: There should be an n number of meeting rooms.

R2: Each meeting room should have a specific capacity to accommodate the desired number of people.

R3: If not reserved already, each meeting room should have the ability to be booked, along with setting an interval, a start time, and an end time for the meeting.

R4: A notification should be sent to all the people invited to the meeting.

R5: Users will receive an invite regardless of whether they are available at the interval or not. Users can respond to the invitation by either accepting or rejecting the invite.

R6: Each user should have access to a calendar that is used to track the date and time, as well as to schedule or cancel meetings.

Use Case Diagram

Primary actors

Scheduler: This actor can schedule and cancel meetings and book and release meeting rooms.

User: This actor can accept and reject invitations and will decide their presence for the meetings.

Secondary actors

System: This is responsible for sending out notifications regarding any new meetings or cancellations.

Associations

Scheduler

Schedule/Cancel meeting: To schedule a new meeting or cancel an existing one

Book/Release room: To book a room for a meeting or release it

User

Attend meeting: To attend a meeting

Accept/Reject meeting: To accept or reject a meeting invitation

System

Send invite notification: To send a notification of any new meeting invitations

Send cancelation notification: To send a notification of any meeting cancellations

Include

The "Schedule meeting" use case has an include relationship with "Book room," since a room also needs to be booked when a meeting is scheduled.

The "Schedule meeting" use case also has an include relationship with "Send invite notification," since, whenever a new meeting is scheduled, an invite is sent to all participant's users.

The "Cancel meeting" use case has an include relationship with the "Release room" use case, since the scheduled room needs to be set free whenever any meeting is canceled.

The "Cancel meeting" use case has an include relationship with the "Send cancelation notification" use case, since, whenever a meeting is canceled, a cancelation notice is sent to all participant's users.

The "Cancel meeting" use case also has an include relationship with the "Remove meeting from calendar" use case, since, once a meeting has been canceled, the interval time of all participant's users needs to be set free.

![alt text](image.png)

User

The User class is responsible for representing the personal information of a user such as their name, email, and can also accept or reject an invitation to a meeting.

![alt text](image-1.png)

Interval

The Interval class contains the start time and end time of a meeting. 

![alt text](image-2.png)

Meeting room

The MeetingRoom class contains the details of any particular room, such as its capacity and a status, to identify whether it is currently available. It also contains a list of intervals to keep track of when the room is booked for a meeting.

![alt text](image-3.png)


Meeting

The Meeting class displays the meeting details, such as the participants, the meeting time, and the meeting room.

![alt text](image-4.png)

Calendar

The Calendar class keeps track of all the meetings that are scheduled or being held.

![alt text](image-5.png)

Meeting scheduler

The MeetingScheduler class contains an organizer that is responsible for scheduling a meeting using the calendar. It can also cancel a meeting, check the availability of meeting rooms, and book or release a meeting room.

![alt text](image-6.png)

Notification

The Notification class will send a notification for an invitation to a user regarding any new meeting. It will also send a cancelation notification to a user as well, in case any meeting gets canceled or is postponed.

![alt text](image-7.png)

Relationship


Association

The User class has a one-way association with the Notification class and a two-way association with the Meeting class.

The MeetingScheduler class has a one-way association with the Notification and Meeting classes.

![alt text](image-8.png)

Composition

The MeetingScheduler class is composed of the Calendar class.

The Calendar class is composed of the Meeting class.

![alt text](image-9.png)

Aggregation

The MeetingScheduler class is aggregated from the User and MeetingRoom class.

The MeetingRoom class is aggregated from the Interval class.

![alt text](image-10.png)

![alt text](image-11.png)

Design pattern

In the meeting scheduler design, the entire system revolves around the scheduler which is responsible for scheduling meetings. To create a robust design, it is not possible that there can be more than one instance for the scheduler. Therefore, we use the Singleton design pattern to ensure that only one instance of the scheduler is created and that this instance has a global point of access.

sequence diagram

Schedule a meeting

![alt text](image-12.png)

Cancel meeting

![alt text](image-13.png)

Activity diagram

Schedule meeting

![alt text](image-14.png)

Respond to an invite

![alt text](image-15.png)

