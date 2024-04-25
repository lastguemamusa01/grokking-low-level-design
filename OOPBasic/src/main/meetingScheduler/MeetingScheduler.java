/*
 * The MeetingScheduler class is the main class of the meeting scheduler and contains the organizer, which is responsible for scheduling 
 * and canceling a meeting as well as booking or releasing a room. It also checks if any meeting rooms are available for a meeting. 
 * In addition, there will be only one instance of the scheduler in the meeting scheduler. Therefore, the MeetingScheduler class will 
 * be a Singleton class to ensure that only one instance for the scheduler is created in the entire system.
 * 
 */

 public class MeetingScheduler {
    private User organizer;
    private Calendar calendar;
    private List<MeetingRoom> rooms;

    private static MeetingScheduler scheduler = null;

    public static MeetingScheduler getInstance() {
        if(scheduler == null) {
            scheduler = new MeetingScheduler();
        }
        return scheduler;
    }

    public boolean scheduleMetting(List<User> user, Interval interval){}
    public boolean cancelMeeting(List<User> user, Interval interval){}
    public boolean bookRoom(MeetingRoom room, int numberOfPersons, Interval interval){}
    public boolean releaseRoom(MeetingRoom room, Interval interval){}
    public MeetingRoom checkRoomsAvailability(int numberOfPersons, Interval interval){}
    
}



// The User class refers to a participant taking part in a meeting. A user can either accept or reject an invitation.

public class User {
    private String name;
    private String email;
    
    private void respondeInvitation(Notifiaction invite){

    }
}

// The Interval class denotes the meeting interval (the start and end time).

public class Interval {
    private Date startTime;
    private Date endTime;
}

// The MeetingRoom class will represent the meeting rooms, each having a specific capacity, a boolean to check if a room is available, and a list of intervals for which the room is booked

public class MeetingRoom {
    private int id;
    private int capacity;
    private boolean isAvailable;
    private List<Interval> bookedIntervals;
}

// The Calendar class contains a list of meetings to keep track of all the scheduled meetings.

public class Calendar {
    private List<Meeting> meetings;
}

// The Meeting class outlines the meeting details such as the number and list of participants, meeting time interval, and meeting room. It also has the option to add more participants.

public class Meeting {
    private int id;
    private int participantsCount;
    private List<User> participants;
    private Interval interval;
    private MeetingRoom room;
    private String subject;

    public void addParticipants(List<User> participants) {

    }
}


// The Notification class is responsible for sending notifications to users about any new meetings or cancelations.

public class Notification {
    private int notificationId;
    private String content;
    private Date creationDtae;

    public boolean sendNotification(User user){}
    public boolean cancelNotifiaction(User user){}

}

