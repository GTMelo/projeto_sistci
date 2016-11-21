package com.github.gtmelo.sistci_api.services.v1;

import javax.persistence.Column;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by 02364114110 on 09/11/2016.
 */

@XmlRootElement(name = "tci")

public class Tci implements Serializable {

    private static final long serialVersionUID = -4643274244715253313L;
    @Column(name = "id")
    private int    id;
    @Column(name = "data_producao")
    private Date   data_producao;
    @Column(name = "tipo_documento")
    private String tipo_documento;
    @Column(name = "razao_classificacao")
    private String razao_classificacao;
    @Column(name = "nup")
    private String nup;
    @Column(name = "cidic")
    private String cidic;
    @Column(name = "orgao")
    private int    orgao;
    @Column(name = "categoria")
    private int    categoria;
    @Column(name = "prazo")
    private int    prazo;
    @Column(name = "fundamento_legal")
    private int    fundamentoLegal;
    @Column(name = "grau_sigilo")
    private int    grauSigilo;
    @Column(name = "status")
    private int    status;

    Tci() {
    }

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "data_producao")
    public Date getData_producao() {
        return data_producao;
    }

    public void setData_producao(Date data_producao) {
        this.data_producao = data_producao;
    }

    @XmlElement(name = "tipo_documento")
    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    @XmlElement(name = "razao_classificacao")
    public String getRazao_classificacao() {
        return razao_classificacao;
    }

    public void setRazao_classificacao(String razao_classificacao) {
        this.razao_classificacao = razao_classificacao;
    }

    @XmlElement(name = "nup")
    public String getNup() {
        return nup;
    }

    public void setNup(String nup) {
        this.nup = nup;
    }

    @XmlElement(name = "cidic")
    public String getCidic() {
        return cidic;
    }

    public void setCidic(String cidic) {
        this.cidic = cidic;
    }

    @XmlElement(name = "orgao")
    public int getOrgao() {
        return orgao;
    }

    public void setOrgao(int orgao) {
        this.orgao = orgao;
    }

    @XmlElement(name = "categoria")
    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @XmlElement(name = "prazo")
    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    @XmlElement(name = "fundamento_legal")
    public int getFundamentoLegal() {
        return fundamentoLegal;
    }

    public void setFundamentoLegal(int fundamentoLegal) {
        this.fundamentoLegal = fundamentoLegal;
    }

    @XmlElement(name = "grau_sigilo")
    public int getGrauSigilo() {
        return grauSigilo;
    }

    public void setGrauSigilo(int grauSigilo) {
        this.grauSigilo = grauSigilo;
    }

    @XmlElement(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tci{" +
                "id=" + id +
                ", data_producao=" + data_producao +
                ", tipo_documento='" + tipo_documento + '\'' +
                ", razao_classificacao='" + razao_classificacao + '\'' +
                ", nup='" + nup + '\'' +
                ", cidic='" + cidic + '\'' +
                ", orgao=" + orgao +
                ", categoria=" + categoria +
                ", prazo=" + prazo +
                ", fundamentoLegal=" + fundamentoLegal +
                ", grauSigilo=" + grauSigilo +
                ", status=" + status +
                '}';
    }
}
