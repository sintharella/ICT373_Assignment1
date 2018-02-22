
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

//(char accountType, String login, String password, char gender, int age, int income,
            //char genderPref, int ageLowerLimit, int ageUpperLimit, int minIncome)
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Responder> customerList = new ArrayList<Responder>();
        
        Advertiser a = new Advertiser ('A', "login1", "password1", 'M', 21, 10000, 'F', 20, 25, 5000);
        Advertiser b = new Advertiser ('A', "login2", "password2", 'F', 36, 300000, 'M', 36, 55, 500000);
        Advertiser c = new Advertiser ('A', "login3", "password3", 'F', 28, 250000, 'F', 20, 25, 100000);
        
        Responder d = new Responder ('R', "login4", "password4", 'F', 23, 1000000);
        Responder e = new Responder ('R', "login5", "password5", 'F', 22, 1000000);
        Responder f = new Responder ('R', "login6", "password6", 'M', 48, 1000000);
        
        customerList.add(a);
        customerList.add(b);
        customerList.add(c);
        customerList.add(d);
        customerList.add(e);
        customerList.add(f);
        
        for (Responder r: customerList){
            System.out.println(r);
        }
    }
    
}
