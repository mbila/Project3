/**
 * Write a description of class purchaseDesign here.
 * 
 * @author Michael Bila
 * @version 2015.14.02
 */

import java.util.ArrayList;

public class purchaseDesign
{
    // instance variables - replace the example below with your own
    private ArrayList<Person> person;
    private int finalCost, featureNum;
    private int designType;
    private int[][] priceArray;

    /**
     * Constructor for objects of class purchaseDesign
     */
    public purchaseDesign()
    {
        priceArray = new int[5][4];
    }
    
    public void fillArray()
    {
        priceArray[0][0] = 300;
        priceArray[0][1] = 350;
        priceArray[0][2] = 375;
        priceArray[0][3] = 400;
        priceArray[0][4] = 500;
        priceArray[1][0] = 10;
        priceArray[1][1] = 20;
        priceArray[1][2] = 30;
        priceArray[1][3] = 85;
        priceArray[1][4] = 100;
        priceArray[2][0] = 15;
        priceArray[2][1] = 30;
        priceArray[2][2] = 40;
        priceArray[2][3] = 95;
        priceArray[2][4] = 200;
        priceArray[3][0] = 20;
        priceArray[3][1] = 40;
        priceArray[3][2] = 50;
        priceArray[3][3] = 110;
        priceArray[3][4] = 300;
        priceArray[4][0] = 25;
        priceArray[4][1] = 50;
        priceArray[4][2] = 60;
        priceArray[4][3] = 130;
        priceArray[4][4] = 400;
        priceArray[5][0] = 30;
        priceArray[5][1] = 60;
        priceArray[5][2] = 70;
        priceArray[5][3] = 210;
        priceArray[5][4] = 500;
    }

    public void createPerson(String lastName, String firstName, String companyName, String address, String city, String state, int zip, int phone)
    {
        person.add(new Person(lastName, firstName, companyName, address, city, state, zip, phone));
    }
    
    public void chooseDesign(int designType)
    {
        if (designType == 0) {
            designType = 0;
        } else if (designType == 1) {
            designType = 1;
        } else if (designType == 2) {
            designType = 2;
        } else if (designType == 3) {
            designType = 3;
        } else {
            designType = 4;
        }
    }
    
    public void chooseFeatures(int featureNum)
    {
        if (featureNum == 1) {
            featureNum = 0;
        } else if (featureNum == 2) {
            featureNum = 1;
        } else if (featureNum == 3) {
            featureNum = 2;
        } else if (featureNum == 4) {
            featureNum = 3;
        } else {
            featureNum = 4;
        }
    }
    
    public void calculateBill()
    {
        finalCost = priceArray[designType][0] + priceArray[designType][featureNum];
        //                 Base Cost                       Added features
    }
    
    public void printBill()
    {
        System.out.println("Your total cost is " + finalCost);
    }
            
}
