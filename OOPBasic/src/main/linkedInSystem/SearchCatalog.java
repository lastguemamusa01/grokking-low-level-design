public class Address {
    private int zipCode;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
}

enum AccountStatus {
    ACTIVE,
    DEACTIVATED,
    BLOCKED,
    DELETED
}

enum ConnectionInviteStatus {
    PENDING,
    ACCEPTED,
    IGNORED
}

enum JobStatus {
    OPEN,
    ON_HOLD,
    CLOSED
}

public class Account {
    private String accountId;
    private String password;
    private String username;
    private String email;
    private AccountStatus status;

    public boolean resetPassword();
}

// Person will be an abstract class
public abstract class Person {
    private String name;
    private Address address;
    private String phone;
    private Account account;
}

public class Admin extends Person {
    public boolean blockUser(User user);
    public boolean unblockUser(User user);
    public boolean disablePage(CompanyPage page);
    public boolean enablePage(CompanyPage page);
    public boolean deleteGroup(Group group);
}

public class User extends Person {
    private int userId;
    private Date dateOfJoining;
    private Profile profile;
    private List<User> connections;
    private List<User> followsUsers;
    private List<CompanyPage> followCompanies;
    private List<Group> joinedGroups;
    private List<CompanyPage> createdPages;
    private List<Group> createdGroups;

    public boolean sendMessage(Message message);
    public boolean sendInvite(ConnectionInvitation invite);
    public boolean cancelInvite(ConnectionInvitation invite);
    public boolean createPage(CompanyPage page);
    public boolean deletePage(CompanyPage page);
    public boolean createGroup(Group group);
    public boolean deleteGroup(Group group);
    public boolean createPost(Post post);
    public boolean deletePost(Post post);
    public boolean createComment(Comment comment);
    public boolean deleteComment(Comment comment);
    public boolean react(Post post);
    public boolean requestRecommendation(User user);
    public boolean acceptRecommendation(User user);
    public boolean applyForJob(Job job);
}

public class Recommendation {
    private int userId;
    private Date createdOn;
    private String description;
    private boolean isAccepted;
}

public class Achievement {
    private String title;
    private Date dateAwarded;
    private String description;
}

public class Analytics {
    private int searchAppearances;
    private int profileViews;
    private int postImpressions;
    private int totalConnections;
}

public class Experience {
    private String title;
    private String company;
    private Address location;
    private Date startDate;
    private Date endDate;
    private String description;
}

public class Education {
    private String school;
    private String degree;
    private Date startDate;
    private Date endDate;
    private String description;
}

public class Skill {
    private string name;
}

public class Profile {
    private String headline;
    private String about;
    private String gender;
    private List<byte> profilePicture;
    private List<byte> coverPhoto;

    private List<Experience> experiences;
    private List<Education> educations;
    private List<Skill> skills;
    private List<Achievement> achievements;
    private List<Recommendation> recommendations;
    private Analytics analytics;

    public boolean addExperience(Experience experience);
    public boolean addEducation(Education education);
    public boolean addSkill(Skill skill);
    public boolean addAchievement(Achievement achievement);
}

public class Job {
    private int jobId;
    private String jobTitle;
    private Date dateOfPosting;
    private String description;
    private CompanyPage company;
    private String employmentType;
    private Address location;
    private JobStatus status;
}

public class CompanyPage {
    private int pageId;
    private String name;
    private String description;
    private String type;
    private int companySize;
    private User createdBy;
    private List<Job> jobs;

    public boolean createJobPosting();
    public boolean deleteJobPosting(Job job);
}

public class Group {
    private int groupId;
    private String name;
    private String description;
    private int totalMembers;
    private List<User> members;

    public boolean updateDescription();
}

public class Post {
    private int postId;
    private User postOwner;
    private String text;
    private List<byte> media;
    private int totalReacts;
    private int totalShares;
    private List<Comment> comments;

    public boolean updateText();
}

public class Comment {
    private int commentId;
    private User commentOwner;
    private String text;
    private int totalReacts;
    private List<Comment> comments;

    public boolean updateText();
}

public class Message {
    private int messageId;
    private User sender;
    private List<User> recipients;
    private String text;
    private List<byte> media;

    public boolean addRecipients(List<User> recipients);
}

public class ConnectionInvitation {
    private User sender;
    private User recipients;
    private Date dateCreated;
    private ConnectionInviteStatus status;

    public boolean acceptConnection();
    public boolean rejectConnection();
}

public interface Search {
    // Interface method (does not have a body)
    public List<User> searchUser(String name);
    public List<CompanyPage> searchCompany(String name);
    public List<Group> searchGroup(String name);
    public List<Job> searchJob(String title);
}

public class SearchCatalog implements Search {
    private HashMap<String, List<User>> users;
    private HashMap<String, List<CompanyPage>> companies;
    private HashMap<String, List<Group>> groups;
    private HashMap<String, List<Job>> jobs;

    public void addNewUser(User user);
    public void addNewCompany(CompanyPage company);
    public void addNewGroup(Group group);
    public void addNewJob(Job job);

    public List<User> searchUser(String name) {
        // functionality
    }

    public List<CompanyPage> searchCompany(String name) {
        // functionality
    }

    public List<Job> searchJobs(String title) {
        // functionality
    }

    public List<Group> searchGroups(String name) {
        // functionality
    }
}

public class Notification {
    private int notificationId;
    private Date createdOn;
    private String content;

    public boolean sendNotification(Account account);
}