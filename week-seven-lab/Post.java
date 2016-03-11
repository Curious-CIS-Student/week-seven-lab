
/**
 * This class stores information about a news feed post in a 
 * social network. Posts can be stored and displayed. This class
 * serves as a superclass for more specific post types.
 * 
 * ASSIGNMENT: CIS222 week-seven-lab
 * INSTRUCTOR: Dr. Neumann
 * 
 * @author Michael Kölling and David J. Barnes - Additions made by Isaac Blasiman
 * @version 0.2
 */
public class Post 
{ 
    private String username;  // username of the post's author
    private long timestamp;
    
    /**
     * Constructor for objects of class Post.
     * 
     * @param author    The username of the author of this post.
     */
    public Post(String author)
    {
        username = author;
        timestamp = System.currentTimeMillis();
    }

    /**
     * Return the username associated with this post.
     * 
     * @return  The post's username, as a string.
     */
    protected String getUserName()
    {
        return username;
    }
    
    /**
     * Return the time of creation of this post.
     * 
     * @return The post's creation time, as a system time value.
     */
    protected long getTimeStamp()
    {
        return timestamp;
    }

    /**
     * Return the timeString indicating how long ago the post was created.
     * 
     * @return  The difference between the post's creation time and
     *          current system time.
     */
    protected String getTimeString()
    {
        return timeString(timestamp);
    }
    
    /**
     * Overwrite of the toString() method that returns the username and
     * time since the post was created, formatted in a string.
     * 
     * @return  The username associated with the post and the time since
     *          the post was created, as a formatted string.
     */
    public String toString()
    {
        return username + "\n" + timeString(timestamp);
    }
    
    /**
     * Create a string describing a time point in the past in terms 
     * relative to current time, such as "30 seconds ago" or "7 minutes ago".
     * Currently, only seconds and minutes are used for the string.
     * 
     * @param time  The time value to convert (in system milliseconds)
     * @return      A relative time string for the given time
     */
    
    private String timeString(long time)
    {
        long current = System.currentTimeMillis();
        long pastMillis = current - time;      // time passed in milliseconds
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        if(minutes > 0) {
            return minutes + " minutes ago";
        }
        else {
            return seconds + " seconds ago";
        }
    }
    
}
