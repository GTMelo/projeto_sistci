package com.github.gtmelo.sistci_api.services.v1;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * Created by Gustavo on 15/11/2016.
 */
public class Orgao implements Serializable{


    private static final long serialVersionUID = 4454429705783939073L;
    private int id;
    private String sigla;
    private String nome;
    private String telefone;
    private String endereco;
    private int email;
    private int orgao_superior;

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    @XmlElement(name = "sigla")
    public String getSigla() {
        return sigla;
    }

    @XmlElement(name = "nome")
    public String getNome() {
        return nome;
    }

    @XmlElement(name = "telefone")
    public String getTelefone() {
        return telefone;
    }

    @XmlElement(name = "endereco")
    public String getEndereco() {
        return endereco;
    }

    @XmlElement(name = "email")
    public int getEmail() {
        return email;
    }

    @XmlElement(name = "orgao_superior")
    public int getOrgao_superiorid() {

        return orgao_superior;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public void setOrgao_superior(int orgao_superior) {
        this.orgao_superior = orgao_superior;
    }
}
