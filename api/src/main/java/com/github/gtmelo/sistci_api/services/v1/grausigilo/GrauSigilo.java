package com.github.gtmelo.sistci_api.services.v1;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * Created by Gustavo on 15/11/2016.
 */
public class GrauSigilo implements Serializable{


    private static final long serialVersionUID = 3090807193322065669L;
    private int id;
    private String abreviacao;
    private String descricao;
    private boolean permite_prorrogacao;

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    @XmlElement(name = "abreviacao")
    public String getAbreviacao() {
        return abreviacao;
    }

    @XmlElement(name = "descricao")
    public String getDescricao() {
        return descricao;
    }

    @XmlElement(name = "permite_prorrogacao")
    public boolean isPermite_prorrogacao() {
        return permite_prorrogacao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPermite_prorrogacao(boolean permite_prorrogacao) {
        this.permite_prorrogacao = permite_prorrogacao;
    }
}
