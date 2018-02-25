/**
* <h1>Java Dating Program Message Class</h1>
* The Message class handles messages sent by Respondres
* to their Advertiser matches
*
* @author  Swe Sin Tha
* @version 1.0
* @since   25-02-2018
*/

public class Message {
    private String body;
    private Responder owner;
    
    public Message (Responder owner, String body){
        this.body = body;
        this.owner = owner;
    }

    public String toString() {
        return "\nFrom: " + owner.getName() + "\nMessage: " + body + "\n";
    }
    
}
