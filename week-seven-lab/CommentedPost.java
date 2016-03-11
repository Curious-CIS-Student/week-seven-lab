import java.util.ArrayList;

/**
 * This class stores information associated with commentable posts in a social
 * network news feed. It is a superclass to more specific types of posts.
 * 
 * @author Isaac Blasiman
 * @version 3.8.2016
 */
public class CommentedPost extends Post
{
    private int likes;
    private ArrayList<String> comments;
    
    /**
     * Constructor for objects of class CommentedPost
     */
    public CommentedPost(String author)
    {
        super(author);
        likes = 0;
        comments = new ArrayList<String>();
    }
    
    /**
     * Record one more 'Like' indication from a user.
     */
    public void like()
    {
        ++likes;
    }
    
    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike()
    {
        if (likes > 0) {
            --likes;
        }
    }
    
    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    /**
     * Overwrite of the standard toString() method.
     * 
     * @return  A formatted string consisting of the toString() output of the
     *          superclass and like and comment information.
     */
    public String toString()
    {
        String text = super.toString();
        text+= shortToString();
        return text;
    }

    /**
     * Helper method to allow the like and comment information to be returned
     * as a formatted string separate from all other information.
     * 
     * @return  A formatted string containing like and comment information.
     */
    protected String shortToString()
    {
        String text = "";
        if(likes > 0) {
            text += " - " + likes + " people like this.\n";
        }
        else {
            text+= "\n";
        }
        if(comments.isEmpty()) {
            text+= "   No comments.";
        }
        else {
            text+= "   " + comments.size() + " comment(s). Click here to view.";
        }
        return text;
    }
    
}
