package com.github.gtmelo.sistci_api.services.v1;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * Created by Gustavo on 15/11/2016.
 */
public class Email implements Serializable{


    private static final long serialVersionUID = 6269138938657768218L;
    private int id;
    private String email;

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    @XmlElement(name = "email")
    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
