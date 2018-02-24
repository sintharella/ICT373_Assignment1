import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        // Option B
        login(customerList);
      
//        // Option C
//        Responder i = new Responder("Inez", 'R', "login7", "password7", 'F', 22, 1000);
//        customerList.add(i);
//        
//        // Option D
//        customerList.remove(i);
//        
//       // Option E
//       for (Responder x: customerList){
//           System.out.println(x);
//        }        
//        System.out.println("");
//        
//        // Option F
//        for (Responder x: customerList){
//           if (x.getAccountType() == 'R'){
//                System.out.println(x);
//            }
//        }        
    }

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
    
    public static void checkInbox(Advertiser a){
        for(Message x: a.getInbox()){
            System.out.println(x);
        }
    }
    
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

    
