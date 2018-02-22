
public class Message {
    private String body;
    private Advertiser to;
    private Responder from;
    
    public Message (Responder from, Advertiser to, String body){
        this.body = body;
        this.to = to;
        this.from = from;
    }

    public Advertiser getTo() {
        return to;
    }

    public String getBody() {
        return body;
    }

    public void setTo(Advertiser to) {
        this.to = to;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
}
