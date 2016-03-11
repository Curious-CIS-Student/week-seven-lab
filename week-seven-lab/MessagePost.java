import java.util.ArrayList;

/**
 * This class stores information about a post in a social network news feed. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 * 
 * ASSIGNMENT: CIS222 week-seven-lab
 * INSTRUCTOR: Dr. Neumann
 * 
 * @author Michael Kölling and David J. Barnes - Additions made by Isaac Blasiman
 * @version 0.2
 */
public class MessagePost extends CommentedPost
{
    private String message;  // an arbitrarily long, multi-line message

    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The text of this post.
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
    }

    /**
     * Return the text of this post.
     * 
     * @return The post's message text.
     */
    public String getText()
    {
        return message;
    }
    
    /**
     * Overwrite of the standard toString() method that returns a formatted string
     * containing detailed information about the message post.
     * 
     * @return  A formatted string containing the various elements of the message post.
     */
    public String toString()
    {
        return super.getUserName() + "\n" +
               message + "\n" + 
               super.getTimeString() + super.shortToString();
    }
    
}
