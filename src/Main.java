
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Responder> customerList = new ArrayList<Responder>();
        
        Advertiser a = new Advertiser ('A', "login1", "password1", 'M', 21, 10000, 'F', 20, 25, 5000);
        Advertiser b = new Advertiser ('A', "login2", "password2", 'F', 36, 300000, 'M', 36, 55, 500000);
        Advertiser c = new Advertiser ('A', "login3", "password3", 'F', 28, 250000, 'F', 20, 25, 100000);
        
        Responder d = new Responder ('R', "login4", "password4", 'F', 23, 1000000);
        Responder e = new Responder ('R', "login5", "password5", 'F', 22, 1000000);
        Responder f = new Responder ('R', "login6", "password6", 'M', 48, 1000000);
        
        // Option A
        customerList.add(a);
        customerList.add(b);
        customerList.add(c);
        customerList.add(d);
        customerList.add(e);
        customerList.add(f);
        
        /* 
        // Option E
        for (Responder x: customerList){
            System.out.println(x);
        }*/
        
        // Option B 
        ArrayList<Advertiser> matches = new ArrayList<Advertiser>();
        for (Responder x: customerList){            
            if(x.getAccountType() == 'A'){
                matches = d.getMatches((Advertiser) x);
            }
        }
        
        for (Advertiser x: matches){
            System.out.println(x);
        }
    }
    
}
