
import java.util.ArrayList;


public class Advertiser extends Responder {
    private char genderPref;
    private int ageUpperLimit, ageLowerLimit, minIncome;
    private ArrayList<Message> inbox;
    
    public Advertiser(char accountType, String login, String password, char gender, int age, int income,
            char genderPref, int ageLowerLimit, int ageUpperLimit, int minIncome) {
        super(accountType, login, password, gender, age, income);
        this.setGenderPref(genderPref);
        this.setAgeRange(ageLowerLimit, ageUpperLimit);
        this.setMinIncome(minIncome);
        inbox = new ArrayList<Message>();
        this.inbox = inbox;
    }
    
    public void addToInbox(Message m){
        this.inbox.add(m);
    }
    
    public void receiveMail(Message m){
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
