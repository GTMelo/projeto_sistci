package com.github.gtmelo.sistci_api.services.v1;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Gustavo on 15/11/2016.
 */
public class Prazo implements Serializable{


    private static final long serialVersionUID = 424109966081278123L;
    private int id;
    private Date data;
    private String evento;

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    @XmlElement(name = "data")
    public Date getData() {
        return data;
    }

    @XmlElement(name = "evento")
    public String getEvento() {
        return evento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
}
