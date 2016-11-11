/**
 * This class is generated by jOOQ
 */
package com.github.gtmelo.sistci_api.data.tables.records;


import com.github.gtmelo.sistci_api.data.tables.GrauSigilo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GrauSigiloRecord extends UpdatableRecordImpl<GrauSigiloRecord> implements Record4<Integer, String, String, Integer> {

    private static final long serialVersionUID = -628137223;

    /**
     * Setter for <code>sistci.grau_sigilo.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>sistci.grau_sigilo.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sistci.grau_sigilo.abreviacao</code>.
     */
    public void setAbreviacao(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sistci.grau_sigilo.abreviacao</code>.
     */
    public String getAbreviacao() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sistci.grau_sigilo.descricao</code>.
     */
    public void setDescricao(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sistci.grau_sigilo.descricao</code>.
     */
    public String getDescricao() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sistci.grau_sigilo.permite_prorrogacao</code>.
     */
    public void setPermiteProrrogacao(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>sistci.grau_sigilo.permite_prorrogacao</code>.
     */
    public Integer getPermiteProrrogacao() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return GrauSigilo.GRAU_SIGILO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GrauSigilo.GRAU_SIGILO.ABREVIACAO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GrauSigilo.GRAU_SIGILO.DESCRICAO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return GrauSigilo.GRAU_SIGILO.PERMITE_PRORROGACAO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAbreviacao();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescricao();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPermiteProrrogacao();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GrauSigiloRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GrauSigiloRecord value2(String value) {
        setAbreviacao(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GrauSigiloRecord value3(String value) {
        setDescricao(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GrauSigiloRecord value4(Integer value) {
        setPermiteProrrogacao(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GrauSigiloRecord values(Integer value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GrauSigiloRecord
     */
    public GrauSigiloRecord() {
        super(GrauSigilo.GRAU_SIGILO);
    }

    /**
     * Create a detached, initialised GrauSigiloRecord
     */
    public GrauSigiloRecord(Integer id, String abreviacao, String descricao, Integer permiteProrrogacao) {
        super(GrauSigilo.GRAU_SIGILO);

        set(0, id);
        set(1, abreviacao);
        set(2, descricao);
        set(3, permiteProrrogacao);
    }
}