
/**
 * Write a description of class person here.
 * 
 * @author Michael Bila
 * @version 2015.3.2
 */

public class Person
{
    private String lastName, firstName, companyName, address, city, state;
    private int zip, phone;

    /**
     * Constructor for objects of class person
     */
    public Person(String lastName, String firstName, String companyName, String address, String city, String state, int zip, int phone)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.companyName = companyName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    public void setZip(int zip)
    {
        this.zip = zip;
    }
    
    public void setPhone(int phone)
    {
        this.phone = phone;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getCompanyName()
    {
        return companyName;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getState()
    {
        return state;
    }
    
    public int getZip()
    {
        return zip;
    }
    
    public int getPhone()
    {
        return phone;
    }
}
