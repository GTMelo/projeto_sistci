package com.github.gtmelo.sistci_api.services.v1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Gustavo on 15/11/2016.
 */

@XmlRootElement(name = "viewtci")

public class ViewTci implements Serializable {

    private int    tciid;
    private Date   data_producao;
    private String tipo_documento;
    private String razao_classificacao;
    private String nup;
    private String cidic;
    private String orgao_sigla;
    private String orgao_nome;
    private String categoria_codigo;
    private String categoria_descricao;
    private Date   prazo_data;
    private String prazo_evento;
    private String fundamento_legal_descricao;
    private String sigilo_descricao;
    private String status;

    @XmlElement(name = "tciid")
    public int getTciid() {
        return tciid;
    }

    @XmlElement(name = "data_producao")
    public Date getData_producao() {
        return data_producao;
    }

    @XmlElement(name = "tipo_documento")
    public String getTipo_documento() {
        return tipo_documento;
    }

    @XmlElement(name = "razao_classificacao")
    public String getRazao_classificacao() {
        return razao_classificacao;
    }

    @XmlElement(name = "nup")
    public String getNup() {
        return nup;
    }

    @XmlElement(name = "cidic")
    public String getCidic() {
        return cidic;
    }

    @XmlElement(name = "orgao_sigla")
    public String getOrgao_sigla() {
        return orgao_sigla;
    }

    @XmlElement(name = "orgao_nome")
    public String getOrgao_nome() {
        return orgao_nome;
    }

    @XmlElement(name = "categoria_codigo")
    public String getCategoria_codigo() {
        return categoria_codigo;
    }

    @XmlElement(name = "categoria_descricao")
    public String getCategoria_descricao() {
        return categoria_descricao;
    }

    @XmlElement(name = "prazo_data")
    public Date getPrazo_data() {
        return prazo_data;
    }

    @XmlElement(name = "prazo_evento")
    public String getPrazo_evento() {
        return prazo_evento;
    }

    @XmlElement(name = "fundamento_legal_descricao")
    public String getFundamento_legal_descricao() {
        return fundamento_legal_descricao;
    }

    @XmlElement(name = "sigilo")
    public String getSigilo_descricao() {
        return sigilo_descricao;
    }

    @XmlElement(name = "status")
    public String getStatus() {
        return status;
    }

    public void setTciid(int tciid) {
        this.tciid = tciid;
    }

    public void setData_producao(Date data_producao) {
        this.data_producao = data_producao;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public void setRazao_classificacao(String razao_classificacao) {
        this.razao_classificacao = razao_classificacao;
    }

    public void setNup(String nup) {
        this.nup = nup;
    }

    public void setCidic(String cidic) {
        this.cidic = cidic;
    }

    public void setOrgao_sigla(String orgao_sigla) {
        this.orgao_sigla = orgao_sigla;
    }

    public void setOrgao_nome(String orgao_nome) {
        this.orgao_nome = orgao_nome;
    }

    public void setCategoria_codigo(String categoria_codigo) {
        this.categoria_codigo = categoria_codigo;
    }

    public void setCategoria_descricao(String categoria_descricao) {
        this.categoria_descricao = categoria_descricao;
    }

    public void setPrazo_data(Date prazo_data) {
        this.prazo_data = prazo_data;
    }

    public void setPrazo_evento(String prazo_evento) {
        this.prazo_evento = prazo_evento;
    }

    public void setFundamento_legal_descricao(String fundamento_legal_descricao) {
        this.fundamento_legal_descricao = fundamento_legal_descricao;
    }

    public void setSigilo_descricao(String sigilo_descricao) {
        this.sigilo_descricao = sigilo_descricao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ViewTci{" +
                "tciid=" + tciid +
                ", data_producao=" + data_producao +
                ", tipo_documento='" + tipo_documento + '\'' +
                ", razao_classificacao='" + razao_classificacao + '\'' +
                ", nup='" + nup + '\'' +
                ", cidic='" + cidic + '\'' +
                ", orgao_sigla='" + orgao_sigla + '\'' +
                ", orgao_nome='" + orgao_nome + '\'' +
                ", categoria_codigo='" + categoria_codigo + '\'' +
                ", categoria_descricao='" + categoria_descricao + '\'' +
                ", prazo_data=" + prazo_data +
                ", prazo_evento='" + prazo_evento + '\'' +
                ", fundamento_legal_descricao='" + fundamento_legal_descricao + '\'' +
                ", sigilo_descricao='" + sigilo_descricao + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
