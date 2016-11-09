package com.github.gtmelo.sistci_api.services.v1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by 02364114110 on 09/11/2016.
 */

@XmlRootElement(name = "tci")

public class Tci implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private int orgaoId;
    private int pessoaId;
    private int categoriaId;
    private int prazoId;
    private int fundamentoId;
    private int grau_sigiloId;
    private int statusId;
    private int cidicId;
    private String nup;
    private String data_producao;
    private String tipo;
    private String razaoClassificacao;

    private Tci() {
    }

    protected static Tci build() {
        return new Tci();
    }

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "orgaoId")
    public int getOrgaoId() {
        return orgaoId;
    }

    public void setOrgaoId(int orgaoId) {
        this.orgaoId = orgaoId;
    }

    @XmlElement(name = "pessoa")
    public int getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }

    @XmlElement(name = "categoriaId")
    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    @XmlElement(name = "prazoId")
    public int getPrazoId() {
        return prazoId;
    }

    public void setPrazoId(int prazoId) {
        this.prazoId = prazoId;
    }

    @XmlElement(name = "fundamentoId")
    public int getFundamentoId() {
        return fundamentoId;
    }

    public void setFundamentoId(int fundamentoId) {
        this.fundamentoId = fundamentoId;
    }

    @XmlElement(name = "grau_sigiloId")
    public int getGrau_sigiloId() {
        return grau_sigiloId;
    }

    public void setGrau_sigiloId(int grau_sigiloId) {
        this.grau_sigiloId = grau_sigiloId;
    }

    @XmlElement(name = "statusId")
    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @XmlElement(name = "cidicId")
    public int getCidicId() {
        return cidicId;
    }

    public void setCidicId(int cidicId) {
        this.cidicId = cidicId;
    }

    @XmlElement(name = "nup")
    public String getNup() {
        return nup;
    }

    public void setNup(String nup) {
        this.nup = nup;
    }

    @XmlElement(name = "data_producao")
    public String getData_producao() {
        return data_producao;
    }

    public void setData_producao(String data_producao) {
        this.data_producao = data_producao;
    }

    @XmlElement(name = "tipo")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlElement(name = "razaoClassificacao")
    public String getRazaoClassificacao() {
        return razaoClassificacao;
    }

    public void setRazaoClassificacao(String razaoClassificacao) {
        this.razaoClassificacao = razaoClassificacao;
    }
}
