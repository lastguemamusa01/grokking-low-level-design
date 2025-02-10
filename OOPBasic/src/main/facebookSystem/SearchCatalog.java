public class Address {
    private int zipCode;
    private String houseNo;
    private String city;
    private String state;
    private String country;
}

enum AccountStatus {
    ACTIVE,
    BLOCKED,
    DISABLED,
    DELETED
}

enum FriendInviteStatus {
    PENDING,
    ACCEPTED,
    REJECTED,
    CANCELED
}

enum PostPrivacySettings {
    PUBLIC,
    FRIENDS_OF_FRIENDS,
    ONLY_FRIENDS,
    CUSTOM
}

public interface PageFunctionsByUser {
    public Page createPage(String name);
    public Page sharePage(Page page);
    public void likePage(Page page);
    public void followPage(Page page);
    public void unLikePage(Page page);
    public void unFollowPage(Page page);
}

public interface GroupFunctionsByUser {
    public Group createGroup(String name);
    public void joinGroup(Group group);
    public void leaveGroup(Group group);
    public void sendGroupInvite(Group group);
}

public interface PostFunctionsByUser {
    public Post createPost(String content);
    public Post sharePost(Post post);
    public void commentOnPost(Post post);
    public void likePost(Post post);
}

public interface CommentFunctionsByUser {
    public Comment createComment(Post post, String content);
    public void likeComment(Comment comment);
}

public class Account {
    private String accountId;
    private String password;
    private String username;
    private String email;
    private AccountStatus status;

    public boolean resetPassword();
}

public class Admin {
    public void blockUser(User user);
    public void unblockUser(User user);
    public void enablePage(Page page);
    public void disablePage(Page page);
    public void deleteGroup(Group group);
    public void changeGroupPrivacy(Group group);
}

// Person will be an abstract class
public abstract class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
    private Account account;
}

// Will be using only one interface example
public class User extends Person implements PageFunctionsByUser{
    private int userId;
    private String name;
    private Date dateOfJoining;
    // The following lists contain the pages and groups that a user is admin of
    private List<Pages> pagesAdmin;
    private List<Groups> groupsAdmin;

    private Profile profile;
    public boolean sendMessage(Message message);
    public boolean sendRecommendation(Page page, Group group, User user);
    public boolean sendFriendRequest(User user);
    public boolean unfriendUser(User user);
    public boolean blockUser(User user);
    public boolean followUser(User user);

    // The functions of the different interfaces will also be present here
    public Page createPage(String name) {
        // functionality
    }
    public void likePage(Page page){
        // functionality
    }
    public void followPage(Page page){
        // functionality
    }
    public void unLikePage(Page page){
        // functionality
    }
    public void unFollowPage(Page page){
        // functionality
    }
    public Page sharePage(Page page){
        // functionality
    }
}

public class Profile {
    private String gender;
    private byte[] profilePicture;
    private byte[] coverPhoto;
    private List<User> friends;

    private List<int> usersFollowed;
    private List<int> pagesFollowed;
    private List<int> groupsJoined;

    private List<Work> workExperience;
    private List<Education> educationInfo;
    private List<Place> places;

    public boolean addWorkExperience(Work work);
    public boolean addEducation(Education education);
    public boolean addPlace(Place place);
    public boolean addProfilePicture(byte[] image);
    public boolean addCoverPhoto(byte[] image);
    public boolean addGender(String gender);
}

public class Work {
    private String title;
    private String company;
    private String location;
    private String description;
    private Date startDate;
    private Date endDate;
}

public class Places {
    private String name;
}

public class Education {
    private String school;
    private String degree;
    private String description;
    private Date startDate;
    private Date endDate;
}

public class Page {
    private int pageId;
    private String name;
    private String description;
    private int likeCount;
}

public class Post {
    private int postId;
    private String content;
    private byte[] image;
    private int likeCount;
    private int shareCount;
    private User postOwner;
    private PostPrivacySettings settings;
    public changePostVisibility(Post post);
}

public class Comment {
    private int commentId;
    private String content;
    private int likeCount;
    private User commentOwner;
}

public class ProfilePrivacy {
    public void changeFriendsListVisibility(Profile profile) {}
    public void lockProfile(Profile profile) {}
    public void lockProfilePicture(Profile profile) {}
}

public interface GroupFunctions {
    public boolean addUser(User user);
    public boolean deleteUser(User user);
    public boolean notifyUser(User user);
}

public class Group implements GroupFunctions {
    private int groupId;
    private String name;
    private String description;
    private byte[] coverPhoto;
    private int totalUsers;
    private boolean isPrivate;
    private List<User> users;

    public boolean addUser(User user) {
        // functionality
    }
    public boolean deleteUser(User user) {
        // functionality
    }
    public boolean notifyUser(User user) {
        // functionality
    }
    public void updateDescription(String description) {}
    public void addCoverPhoto(byte[] image) {}
}

public class Message {
    private int messageId;
    private User sender;
    private String content;
    private List<User> recipent;
    private List<byte[]> multimedia;

    public boolean addRecipent(List<User> users);
}

public class FriendRequest {
    private User recipent;
    private User sender;
    private FriendRequestStatus status;
    private Date requestSent;
    private Date requestStatusModified;

    public boolean acceptRequest(User user);
    public boolean rejectRequest(User user);
}

public class Notification {
    private int notificationId;
    private Date createdOn;
    private String content;

    public boolean sendNotification(Account account);
}

public interface Search {
    public List<User> searchUsers(String name);
    public List<Group> searchGroups(String name);
    public List<Page> searchPages(String name);
    public List<Post> searchPosts(String keywords);
}

public class SearchCatalog implements Search {
    HashMap<String, List<User>> userNames;
    HashMap<String, List<Group>> groupNames;
    HashMap<String, List<Page>> pageTitles;
    HashMap<String, List<Post>> posts;

    public boolean addNewUser(User user) {}
    public boolean addNewGroup(Group group) {}
    public boolean addNewPage(Page page) {}
    public boolean addNewPost(Post post) {}

    public List<User> searchUsers(String name) {
        // functionality
    }

    public List<Group> searchGroups(String name) {
        // functionality
    }

    public List<Page> searchPages(String name) {
        // functionality
    }

    public List<Post> searchPosts(String keywords) {
        // functionality
    }
}


