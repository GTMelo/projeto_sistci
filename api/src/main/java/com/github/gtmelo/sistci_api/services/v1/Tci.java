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

    private String id;
    private String orgaoId;
    private String pessoaId;
    private String categoriaId;
    private String prazoId;
    private String fundamentoId;
    private String grau_sigiloId;
    private String statusId;
    private String cidicId;
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
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "orgaoId")
    public String getOrgaoId() {
        return orgaoId;
    }

    public void setOrgaoId(String orgaoId) {
        this.orgaoId = orgaoId;
    }

    @XmlElement(name = "pessoa")
    public String getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(String pessoaId) {
        this.pessoaId = pessoaId;
    }

    @XmlElement(name = "categoriaId")
    public String getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(String categoriaId) {
        this.categoriaId = categoriaId;
    }

    @XmlElement(name = "prazoId")
    public String getPrazoId() {
        return prazoId;
    }

    public void setPrazoId(String prazoId) {
        this.prazoId = prazoId;
    }

    @XmlElement(name = "fundamentoId")
    public String getFundamentoId() {
        return fundamentoId;
    }

    public void setFundamentoId(String fundamentoId) {
        this.fundamentoId = fundamentoId;
    }

    @XmlElement(name = "grau_sigiloId")
    public String getGrau_sigiloId() {
        return grau_sigiloId;
    }

    public void setGrau_sigiloId(String grau_sigiloId) {
        this.grau_sigiloId = grau_sigiloId;
    }

    @XmlElement(name = "statusId")
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    @XmlElement(name = "cidicId")
    public String getCidicId() {
        return cidicId;
    }

    public void setCidicId(String cidicId) {
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

    @Override
    public String toString() {
        return "Tci{" +
                "id=" + id +
                ", orgaoId=" + orgaoId +
                ", pessoaId=" + pessoaId +
                ", categoriaId=" + categoriaId +
                ", prazoId=" + prazoId +
                ", fundamentoId=" + fundamentoId +
                ", grau_sigiloId=" + grau_sigiloId +
                ", statusId=" + statusId +
                ", cidicId=" + cidicId +
                ", nup='" + nup + '\'' +
                ", data_producao='" + data_producao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", razaoClassificacao='" + razaoClassificacao + '\'' +
                '}';
    }
}
