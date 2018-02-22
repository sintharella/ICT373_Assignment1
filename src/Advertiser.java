/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swe
 */
public class Advertiser extends Responder {
    private char genderPref;
    private int ageUpperLimit, ageLowerLimit, minIncome;
    
    public Advertiser(char accountType, String login, String password, char gender, int age, int income,
            char genderPref, int ageLowerLimit, int ageUpperLimit, int minIncome) {
        super(accountType, login, password, gender, age, income);
        this.setGenderPref(genderPref);
        this.setAgeRange(ageLowerLimit, ageUpperLimit);
        this.setMinIncome(minIncome);
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
    
}
