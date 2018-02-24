
import java.util.ArrayList;

public class Responder {
    private String login, password;
    private char gender, accountType;
    private int age, income;
    private ArrayList<Advertiser> matches;
    
    public Responder(char accountType, String login, String password, char gender, int age, int income){
        this.age = age;
        this.gender = gender;
        this.income = income;
        this.login = login;
        this.password = password;
        this.accountType = accountType;
        matches = new ArrayList<Advertiser>();
    }
    
    public void addMatches(Advertiser a){
        if ((this.gender == a.getGenderPref())
                && (this.age >= a.getAgeLowerLimit() && this.age <= a.getAgeUpperLimit())
                && (this.income >= a.getMinIncome())){
            this.matches.add(a);
        }
    }
    
    public void printMatches(){
        for (Advertiser x: this.matches){
            System.out.println(x);
        }
    }

    public void sendMessage(String login, String message){
        Message m = new Message(this, message);
        for (Advertiser x: this.matches){
            if(x.getLogin() == login){
                x.addToInbox(m);
            }
        }
    }
    
    public char getAccountType() {
        return accountType;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String toString() {
        return "Username: " + this.login + " Account Type: " + this.accountType + " Gender: " + this.gender +
                " Age: " + this.age + " Income: " + this.income;
                }
    
    
    
}
