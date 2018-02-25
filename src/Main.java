
import java.util.ArrayList;
import java.util.Scanner;


/**
* <h1>Java Dating Program Main</h1>
* A dating program written in Java that allows you 
* to advertise, respond and send messags.
*
* @author  Swe Sin Tha
* @version 1.0
* @since   25-02-2018
*/

public class Main {
    public static void main(String[] args) {
        displayStudentDetails();
        ArrayList<Responder> customerList = new ArrayList<Responder>();
        
        Advertiser Arvin = new Advertiser ("Arvin",'A', "login1", "password1", 'M', 21, 10000, 'F', 20, 25, 5000);
        Advertiser Belinda = new Advertiser ("Belinda",'A', "login2", "password2", 'F', 36, 300000, 'M', 36, 55, 100);
        Advertiser Cat = new Advertiser ("Cat",'A', "login3", "password3", 'F', 28, 250000, 'F', 20, 25, 100000);
        Advertiser Dea = new Advertiser("Dea",'A', "login4", "password4", 'F', 40, 250000, 'M', 35, 65, 100000);
        
        Responder Emma = new Responder ("Emma",'R', "login5", "password5", 'F', 23, 1000000);
        Responder Flora = new Responder ("Flora",'R', "login6", "password6", 'F', 22, 1000000);
        Responder Greg = new Responder ("Greg",'R', "login7", "password7", 'M', 48, 1000000);
        
        // Option A
        customerList.add(Arvin);
        customerList.add(Belinda);
        customerList.add(Cat);
        customerList.add(Dea);
        customerList.add(Emma);
        customerList.add(Flora);        
        customerList.add(Greg);
        
        System.out.println("a) 7 customers were created and added to the ArrayList customerList.");
        
        System.out.println("//List of all customers//");
        for (Responder x: customerList){
           System.out.println(x);
        } 
        
        // Option C
        System.out.println("c) Add a new customer to the dating service");
        Responder Inez = new Responder("Inez", 'R', "login7", "password7", 'F', 22, 1000);
        customerList.add(Inez);
        
        System.out.println("//List of all customers//");
        for (Responder x: customerList){
           System.out.println(x);
        }
        
        // Option D
        System.out.println("d) Remove an existing customer from the dating service");
        customerList.remove(Inez);
        
        System.out.println("//List of all customers//");
        for (Responder x: customerList){
           System.out.println(x);
        }
        
       // Option E
       System.out.println("e) Display the details of all advertisers registered with the service");
       for (Responder x: customerList){
           if (x.getAccountType() == 'A'){
                System.out.println(x);
            }
        }        
        
        // Option F
        System.out.println("f) Display the details of all responders registered with the service");
        for (Responder x: customerList){
           if (x.getAccountType() == 'R'){
                System.out.println(x);
            }
        }
 
        // Option B
        System.out.println("f) Get some matches for a responder, choose one match and send the match a message, then log\n" +
"in that advertiser to get the message");
        login(customerList);        
    }
    
    public static void displayStudentDetails(){
        System.out.println("Name: Swe Sin Tha");
        System.out.println("Student number: 33101833");
        System.out.println("Mode of enrollment: Full Time");
        System.out.println("Tutor name: Dr. Loo");
        System.out.println("Tutorial attendace day and time: Wednesday 9am SGT");
        System.out.println("");
    }
    
    
   /**
   * This method is used to get matches, pick matches
   * and send messages to Advertisers matched to Responders.
   * @param r The Responder whose matches we want to find
   * @param customerList  List of customers on the site
   */
    public static void getPickSend(Responder r, ArrayList<Responder> customerList){
            // Option B
            Scanner reader = new Scanner(System.in);
            // Get some matches for a responder
            for (Responder x: customerList){            
                if(x.getAccountType() == 'A'){
                    r.addMatches((Advertiser)x);
                }
            }
            System.out.println("Your matches are...");
            r.printMatches();
            System.out.print("Send Message To: ");
            String name = reader.nextLine();
            System.out.print("Message: ");
            String msg = reader.nextLine();

            r.sendMessage(name, msg);
            System.out.println("Message Sent.");
    }
    
   /**
   * This method is used to check the inbox of Advertisers
   * @param a The Advertiser whose inbox we want to check
   */
    public static void checkInbox(Advertiser a){
        for(Message x: a.getInbox()){
            System.out.println(x);
        }
    }
    
   /**
   * This method is used to login to the site. Once logged in
   * the user will be given matches or messages depending on 
   * whether they're an Advertiser or Responder.
   * @param cusotomerList List of customers on the site
   */
    public static void login(ArrayList<Responder> customerList){
        Scanner reader = new Scanner(System.in);
        String again = "y";        
        while (again.equals("y")){
            System.out.print("login: ");
            String login = reader.nextLine();
            System.out.print("password: ");
            String password = reader.nextLine();

            for(Responder x: customerList){
                if (x.getLogin().equals(login) && x.getPassword().equals(password)){
                    System.out.println("Logged in as: " + x.getName());
                    if (x.getAccountType() == 'A'){
                        System.out.println(x.getName() + "'s Inbox");
                        checkInbox((Advertiser) x);
                    }
                    if (x.getAccountType() == 'R'){
                        getPickSend(x, customerList);
                    }
                }
            }
            System.out.println("");
            System.out.println("Login again?(y/n)");
            again = reader.nextLine();
            System.out.println("");
        }
    }
}

    
