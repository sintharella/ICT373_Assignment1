
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swe
 */
public class Responder {
    private String login, password;
    private char gender, accountType;
    private int age, income;
    
    public Responder(char accountType, String login, String password, char gender, int age, int income){
        this.age = age;
        this.gender = gender;
        this.income = income;
        this.login = login;
        this.password = password;
        this.accountType = accountType;
    }
    
    public Advertiser getMatches(Advertiser a){
        if ((this.gender == a.getGenderPref())
                && (this.age >= a.getAgeLowerLimit() && this.age <= a.getAgeUpperLimit())
                && (this.income >= a.getMinIncome())){
            return a;
        }
        return null;
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
        return "Account Type: " + this.accountType + " Gender: " + this.gender +
                " Age: " + this.age;
                }
    
    
    
}
