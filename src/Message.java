/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swe
 */
public class Message {
    private String body, from, to;

    public String getBody() {
        return body;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
