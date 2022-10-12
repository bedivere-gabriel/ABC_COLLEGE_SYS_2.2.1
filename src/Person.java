import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class Person
{
    private int userID;
    private String userFirstName, userLastName, userGender, userAddress, userPhoneNumber;

    //set current year as prefix
    Date d = new Date();
    int year = d.getYear() + 1900;

    private static AtomicLong idCounter = new AtomicLong();

    public static String createID()
    {
        return String.valueOf(idCounter.getAndIncrement());
    }


    public Person(int Id, String fName, String lName, String address, String gender, String pNumber){
        this.userID = Id;
        this.userFirstName = fName;
        this.userLastName = lName;
        this.userAddress = address;
        this.userGender = gender;
        this.userPhoneNumber = pNumber;
    }

    /**
     * Setters
     */
    public void setUserID(int ID)
    {
        this.userID = ID;
    }

    public void setUserFirstName(String firstName)
    {
        this.userFirstName = firstName;
    }

    public void setUserLastName(String lastName)
    {
        this.userLastName = lastName;
    }

    public void setUserGender(String gender)
    {
        this.userGender = gender;
    }

    public void setUserAddress(String address)
    {
        this.userAddress = address;
    }

    public void setUserPhoneNumber(String phoneNumber)
    {
        this.userPhoneNumber = phoneNumber;
    }

    /**
     * Getters
     */
    public int getUserID() { return this.userID; }

    public String getUserFirstName()
    {
        return this.userFirstName;
    }

    public String getUserLastName()
    {
        return this.userLastName;
    }

    public String getUserGender()
    {
        return this.userGender;
    }

    public String getUserAddress()
    {
        return this.userAddress;
    }

    public String getUserPhoneNumber()
    {
        return this.userPhoneNumber;
    }

    /**
     * Generate Unique ID
     */
    public void generateID()
    {
        String prefixID = String.valueOf(year);
        String suffixID = createID();
        String generatedID = prefixID + suffixID;
        this.userID = Integer.parseInt(generatedID);
    }

    //temporary
    public void displayPersonalInfo()
    {
        System.out.println("ID: " + userID);
        System.out.println("First Name: " + userFirstName);
        System.out.println("Last Name: " + userLastName);
        System.out.println("Gender: " + userGender);
        System.out.println("Address: " + userAddress);
        System.out.println("Phone Number: " + userPhoneNumber);
    }
}
