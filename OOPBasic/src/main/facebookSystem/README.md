Getting Ready: The Facebook System

Problem definition

Facebook is a social media platform for users to connect with people and engage with different types of media and content. Users can connect with other users by sending friend requests or using the direct messaging feature. Each user has a profile where they can create posts to share with their friends. Facebook also allows its users to create pages regarding a topic of interest and groups to form a community of similar people. Facebook generates a personalized feed for its users based on their friends, liked pages, groups, and the content they engage with to ensure the best experience.

![img.png](img.png)

Discoverability

It is important to develop a better understanding of how Facebook’s discoverability works. The interviewer would expect you to ask the questions listed below:

How are users able to search other users’ profiles?

Can users search other users using their phone numbers and email addresses?

Friends and following

The “Add friend” feature of Facebook is its most renowned feature. Make sure to ask the interviewer the questions provided below:

How are users able to add other users as friends?

How are users able to follow or unfollow other users without becoming a direct connection?

Groups and pages

Groups and pages on Facebook create a space for like-minded individuals. Make sure to define your requirements. You may ask the interviewer the questions listed below:

How are users able to create both groups and pages in addition to their user profiles?

What are the criteria for joining a group? Can a user join a group if they are not friends with the creator of the group?

Privacy

You can ask the following questions to learn about the privacy feature in your design:

How will the system handle privacy lists with certain content to be displayed only to specified connections?

How do users set the privacy of groups? How does this change the way members and non-members interact with the group?

Alerts

Notifications and alerts allow users to stay updated with the activity in their circle. Therefore, you may want to understand how alerts will work in your system. You may ask the questions listed below:

How will users be notified of pre-selected events?

How much control do users have in choosing what notifications they can receive?

Design approach

We’ll design Facebook using the bottom-up design approach. For this purpose, we will follow the steps below:

Identify and design the smallest components first, like, a post and comment.

Use these small components to design bigger components, for example, pages, groups, and profiles.

Repeat the steps above until we design the complete Facebook platform.

Design pattern

During an interview, it is always a good practice to discuss the design patterns that the Facebook falls under. Stating the design patterns gives the interviewer a positive impression and shows that the interviewee is well-versed in the advanced concepts of object-oriented design.

Requirements for Facebook

R1: Users should be able to set the privacy of their profile page. They should also be able to create their profile page and add information such as work experience, education, and place of living.

R2: Users of our system should be able to search for groups, pages, and other users.

R3: Users should be able to write a new post and set its privacy.

R4: Users should be able to send as well as respond to the friend requests of other users. Users should also be able to unfriend or block other users.

R5: Users should be able to follow other users without adding them to their friend list.

R6: Users should be able to like, share, and comment on a post. They should also be able to like or comment on an existing comment.

R7: The system should send the user a notification whenever there has been an interaction with them, such as receiving a message, a friend request, or a comment on their post.

R8: A user should be able to send messages and receive messages from other users.

R9: Users should be able to follow existing pages and join existing groups. They should also be able to unfollow or leave joined groups or followed pages.

R10: Users should be able to create their own groups and pages. Users can later set privacy or delete the groups or pages they own.

Use Case Diagram for Facebook

System

Our system is "Facebook."

Actors

Now, we’ll define the main actors of Facebook.

Primary actors

User: This actor can create a profile of themselves containing their personal information. They can create posts, pages, and groups, and add various sorts of multimedia like images or videos. They can also interact with other users by sending them friend requests and messages, commenting on their posts, etc.

Secondary actors

Page/Group Admin: The admin is in charge of performing numerous operations, including blocking or unblocking users from groups or pages, deleting an existing group, changing the group’s privacy, etc.

System: This is responsible for sending out notifications for new friend requests, messages, comments, etc.

Use cases

User

Add/update profile: To add information like work, education, and places of visit details or to update an existing profile

Follow/unfollow user: To follow or unfollow other users

Send message: To send a message to other users

Send friend request: To send a friend request to other users

Create/like/follow/share page: To either create a new page or perform actions including liking, following, or sharing an existing page.

Create/join/leave group: To either create a new group or perform actions like joining or leaving an existing group

Invite users to group: To invite other users to an existing group.

Add/update/delete post: To add a new post, update the content of the post, or delete an existing post

Like/comment/share post: To like a post, comment on a post, or share a post

Add/update/delete/like comment: To add a new comment, update the content of the comment, like a particular comment, or delete a comment

Accept/reject friend request: To accept or reject a friend request from another user

Update privacy: To update the privacy settings of the profile

Search users/groups/pages/posts: To search for other users, any existing groups or pages, or any posts made by users

Accept/Reject friend request: To accept or reject a friend request from another Facebook user

Accept/Reject group join invitation: To accept or reject a group joining invitation from another Facebook user

Like/Comment/Share Post: To like, comment, or share any post visible to users on Facebook

Page/Group Admin

Block/unblock user: To block or unblock a user from a group or page

Enable/disable page: To enable or disable a page

Delete group: To delete an existing group

Change a group's privacy: To change the privacy settings of a group (from public to private and vice versa)

System

Send new friend request notification: To send a notification of any friend request sent by another user

Send message notification: To send a notification of any new messages

Send new post notification: To send a notification of any new posts

Send comment notification: To send a notification of any comments on your or others' posts

Relationships

Generalization

The “Page/Group Admin” has a generalization relationship with the “User” as the admin can perform all those tasks that a normal user can perform.

We can search for other users, groups, pages, or even posts. This shows that the “Search” use case has a generalization relationship with the “users,” “groups,” “pages,” and “posts” use cases.

Associations

![img_1.png](img_1.png)

Include

The “Send friend request” use case also has an include relationship with the “Send new friend request notification,” because whenever a user receives a friend request, the user is notified.

The “Send message” use case has an include relationship with the “Send message notification” use case, because whenever a user receives a message, the user is notified.

The “Add post” use case has an include relationship with the “Send new post notification” use case. Whenever a new post is created by a user being followed by the default user, the default user is notified.

The “Add comment” use case has an include relationship with the “Send new comment notification” use case. Whenever a new comment is made by another user on a post either created by the default user or followed by the default user, the default user is notified.

use case diagram

![img_2.png](img_2.png)

Class Diagram for Facebook

![img_3.png](img_3.png)

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

![img_15.png](img_15.png)

![img_16.png](img_16.png)

![img_17.png](img_17.png)

Class diagram of Facebook

![img_18.png](img_18.png)

Design pattern

We know that Facebook has a group feature that allows multiple users to join a group. By default, when a user joins a group, they get notified of any new posts in the group. To effectively map this behavior in our design, we can use the Observer design pattern.

On Facebook, all members of the group are set as subscribers by default. Whenever there is a new activity in the group, the subscribers are notified. The members also have the option to opt out of these notifications, which will remove them from the subscriber list.

Additional requirements

The interviewer can introduce some additional requirements in the Facebook social network system, or they can ask some follow-up questions. Let's see some examples of additional requirements:

Recommendations: Users can send recommendations of pages and groups to other users. The class diagram provided below shows the relationship of Recommendation with the other classes:

![img_19.png](img_19.png)

Sequence Diagram for Facebook

Send a friend request

![img_20.png](img_20.png)

![img_21.png](img_21.png)

Activity Diagram for Facebook

Creating a new post

The states and actions that will be involved in this activity diagram are provided below.

States

Initial state: The user selects the new post option.

Final state: The post is published.

Actions

The user selects the new post option, selects the privacy option, adds any attachments, and publishes the post.

![img_22.png](img_22.png)

![img_23.png](img_23.png)

Code for Facebook

Constants

The following code provides the definition of the various enums and custom data types being used in the Facebook design:

Interfaces implemented by user

Facebook will have several interfaces that will be implemented by users and are described below:

PageFunctionsByUser: This will define the functions that a user will perform while interacting with pages.

GroupFunctionsByUser: This will define the functions that a user will perform while interacting with groups.

PostFunctionsByUser: This will define the functions that a user will perform while interacting with posts.

CommentFunctionsByUser: This will define the functions that a user will perform while interacting with comments.

Account

The Account class refers to an account of a user on Facebook and is responsible for containing their personal details, such as username, password, etc. It also allows users to reset their existing passwords.

Person, user, and admin

The Person class will be an abstract class that represents a normal Facebook user. A User can also be an Admin

Profile, education, places, and work

The Work, Education, and Places classes will provide a user's personal information and will make up the Profile class.

Page, post, and comment

Facebook users can create and like pages, posts, and comments.

Profile privacy

Each profile will have its own privacy settings where users can change the visibility settings of their friends' list, and lock their profile and profile picture.

Group and the group functions interface

Facebook users can also create and join groups as well as add new and delete new users. In addition, users that initially join groups will be notified of all new activities in the groups.

Message and friend request

Each Facebook user can send messages and friend requests to other users.

Notification

The Notification class is responsible for sending notifications to users about any new messages, comments, posts, or friend requests via the built-in notification option. 

Search catalog and interface

The SearchCatalog class contains information on members, groups, pages, and various posts. It also implements the Search interface class to enable the search functionality based on the given criteria (member, group, page names, and post keywords)







