import java.util.ArrayList;

/**
 * This class stores information about a post in a social network news feed.
 * The main part of the post consists of a photo and a caption.
 * Other data, such as author and time, are also stored.
 * 
 * ASSIGNMENT: CIS222 week-seven-lab
 * INSTRUCTOR: Dr. Neumann
 * 
 * @author Michael Kölling and David J. Barnes - Additions made by Isaac Blasiman
 * @version 0.2
 */
public class PhotoPost extends CommentedPost
{
    private String filename;  // the name of the image file
    private String caption;   // a one line image caption

    /**
     * Constructor for objects of class PhotoPost.
     * 
     * @param author    The username of the author of this post.
     * @param filename  The filename of the image in this post.
     * @param caption   A caption for the image.
     */
    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }

    /**
     * Return the file name of the image in this post.
     * 
     * @return The post's image file name.
     */
    public String getImageFile()
    {
        return filename;
    }

    /**
     * Return the caption of the image of this post.
     * 
     * @return The image's caption.
     */
    public String getCaption()
    {
        return caption;
    }
    
    /**
     * Overwrite of the standard toString() method that returns a formatted
     * string containing detailed information about the photo post.
     * 
     * @return  A formatted string containing details about the various elements
     *          of the photo post.
     */
    public String toString()
    {
        return (super.getUserName() + "\n" + 
                "   [" + filename + "]\n" +
                "   " + caption + " \n" + 
                super.getTimeString() + 
                super.shortToString());
    }
    
}
