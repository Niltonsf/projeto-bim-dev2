package br.com.up.projetobimestral.model;
import java.io.Serializable;

public class Message implements Serializable  {
    private String user;
    private String message;

    public Message(String user, String message) {
        this.user = user;
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
