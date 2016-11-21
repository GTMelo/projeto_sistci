package com.github.gtmelo.sistci_api.services.v1;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * Created by Gustavo on 15/11/2016.
 */
public class FundamentoLegal implements Serializable {


    private static final long serialVersionUID = -1290660428902819175L;
    private int id;
    private String descricao;

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    @XmlElement(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
