
/**
 * Write a description of class thirteen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class thirteen
{
    // instance variables - replace the example below with your own
    private int x;
    private int[] hourCounts;
    
    /**
     * Constructor for objects of class thirteen
     */
    public thirteen()
    {
        // initialise instance variables
        x = 0;
    }
    
    public int numberOfAccess(){
        int total = 0;
        for (int count : hourCounts){
            total += count;
        }
        return total;
    }
    }