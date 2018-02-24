
public class Message {
    private String body;
    private Responder owner;
    
    public Message (Responder owner, String body){
        this.body = body;
        this.owner = owner;
    }

    public String toString() {
        return "From:\n" + owner + "\nMessage:\n" + body + "\n";
    }
    
}
