
import java.util.ArrayList;

/**
* <h1>Java Dating Program Advertiser Class</h1>
* Advertiser class manages customers that are 
* available as matches to objects of the Resonder class.
* It is also the child of the Advertiser class.
*
* @author  Swe Sin Tha
* @version 1.0
* @since   25-02-2018
*/


public class Advertiser extends Responder {
    private char genderPref;
    private int ageUpperLimit;
    private int ageLowerLimit;
    private int minIncome;
    private ArrayList<Message> inbox;
    
    public Advertiser(String name, char accountType, String login, String password, char gender, int age, int income,
            char genderPref, int ageLowerLimit, int ageUpperLimit, int minIncome) {
        super(name, accountType, login, password, gender, age, income);
        this.setGenderPref(genderPref);
        this.setAgeRange(ageLowerLimit, ageUpperLimit);
        this.setMinIncome(minIncome);
        inbox = new ArrayList<Message>();
        this.inbox = inbox;
    }

    public ArrayList<Message> getInbox() {
        return inbox;
    }
    
    public void addToInbox(Message m){
        this.inbox.add(m);
    }
    
    public void setGenderPref (char gender){
        this.genderPref = gender;
    }
    
    public void setAgeRange(int lowerLimit, int upperLimit){
        if (this.ageUpperLimit >= this.ageLowerLimit){
            this.ageLowerLimit = lowerLimit;
            this.ageUpperLimit = upperLimit;
        }else System.out.println("upper limit must be more than or equal to lower limit.");
        
    }
    
    public void setMinIncome(int minIncome){
        this.minIncome = minIncome;
    }

    public char getGenderPref() {
        return genderPref;
    }

    public int getAgeLowerLimit() {
        return ageLowerLimit;
    }

    public int getAgeUpperLimit() {
        return ageUpperLimit;
    }

    public int getMinIncome() {
        return minIncome;
    }

}
