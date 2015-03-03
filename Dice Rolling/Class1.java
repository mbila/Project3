
/**
 * Write a description of class Class1 here.
 * 
 * @author Michael Bila
 * @version 2015.20.02
 */
public class Class1
{
    // instance variables - replace the example below with your own
    private int dieType;
    private int numDice;
    private int minTarget;
    private int maxTarget;

    /**
     * Constructor for objects of class Class1
     */
    public Class1()
    {
    }

    public void setDieType(int dieType)
    {
        this.dieType = dieType;
    }
    
    public void setNumDice(int numDice)
    {
        this.numDice = numDice;
    }
    
    public void setMinTarget(int minTarget)
    {
        this.minTarget = minTarget;
    }
    
    public void setMaxTarget(int maxTarget)
    {
        this.maxTarget = maxTarget;
    }
    
    public void roll()
    {
        new Roll(dieType, numDice, minTarget, maxTarget);
    }
}