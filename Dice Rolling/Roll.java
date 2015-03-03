
/**
 * Write a description of class Roll here.
 * 
 * @author Michael Bila
 * @version 2015.20.02
 */

import java.util.Random;
import java.util.ArrayList;

public class Roll
{
    private int finalResult;
    private int dieType;
    private int numDice;
    private int minTarget;
    private int maxTarget;
    private int randomNum;
    private ArrayList<Integer> listOfNum;
    //OTHER CLASS CALLS THIS, ROLLS DICE, THEN OTHER OBJECT CALLS ROLL.GETRESULT FOR THE FINAL SOLUTION

    /**
     * Constructor for objects of class Roll
     */
    public Roll(int dieType, int numDice, int minTarget, int maxTarget)
    {
        this.dieType = dieType;
        this.numDice = numDice;
        this.minTarget = minTarget;
        this.maxTarget = maxTarget;
    }
    
    public void rollDice()
    {
        for (int i = 0; i < numDice; i++) {
            returnRandomNum();
            listOfNum.add(randomNum);
        }
        
        for (int j = 0; j < numDice; j++) {
            if (listOfNum[j] == dieType) {
                returnRandomNum();
                listOfNum[j] += randomNum;
            }
        }
    }
    
    public int getRandomNum(int minTarget, int maxTarget)
    {
        Random rand = new Random();
        int randomNum = rand.nextInt(dieType) + 1;
        return randomNum;
    }
    
    public int getResult()
    {
        return finalResult;
    }
    
    public int returnRandomNum() {
        int maxPossible;
        dieType * numDice = maxPossible;
        Random rand = new Random();
        randomNum = rand.nextInt(maxPossible) + 1;
        return randomNum;
    }
}