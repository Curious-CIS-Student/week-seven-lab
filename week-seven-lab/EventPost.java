
/**
 * This class stores information about an event post in a social network
 * news feed.
 * ASSIGNMENT: CIS222 week-seven-lab
 * INSTRUCTOR: Dr. Neumann
 * 
 * @author Isaac Blasiman 
 * @version 3.8.2016
 */
public class EventPost extends Post
{
    private String eventType;

    /**
     * Constructor for objects of class EventPost.
     * 
     * @param username  The username that's connected to the event.
     * @param eventType  The type of event that we are creating, such
     *                   as a "friend" or "update profile" event.
     */
    public EventPost(String username, String eventType)
    {
        super(username);
        this.eventType = eventType;
    }

    /**
     * Return the event type of this post.
     * 
     * @return  The post's event type.
     */
    public String getEventType()
    {
        return eventType;
    }
    
    /**
     * Overwrite of the standart toString() method that returns a
     * formatted string describing the event post in detail.
     * 
     * @return  A formatted string describing all of the elements
     *          of the event post.
     */
    public String toString()
    {
        return super.getUserName() + "\n Event: " + eventType + "\n" +
               super.getTimeString();
    }
    
}
