/**
 * This class is generated by jOOQ
 */
package com.github.gtmelo.sistci_api.data.tables.records;


import com.github.gtmelo.sistci_api.data.tables.Cpads;

import java.sql.Date;

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
public class CpadsRecord extends UpdatableRecordImpl<CpadsRecord> implements Record4<Integer, Integer, String, Date> {

    private static final long serialVersionUID = -1401334666;

    /**
     * Setter for <code>sistci.cpads.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>sistci.cpads.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sistci.cpads.orgaoid</code>.
     */
    public void setOrgaoid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>sistci.cpads.orgaoid</code>.
     */
    public Integer getOrgaoid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>sistci.cpads.portaria_nomeacao</code>.
     */
    public void setPortariaNomeacao(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sistci.cpads.portaria_nomeacao</code>.
     */
    public String getPortariaNomeacao() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sistci.cpads.data_formacao</code>.
     */
    public void setDataFormacao(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>sistci.cpads.data_formacao</code>.
     */
    public Date getDataFormacao() {
        return (Date) get(3);
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
    public Row4<Integer, Integer, String, Date> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, String, Date> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Cpads.CPADS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Cpads.CPADS.ORGAOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Cpads.CPADS.PORTARIA_NOMEACAO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Cpads.CPADS.DATA_FORMACAO;
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
    public Integer value2() {
        return getOrgaoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPortariaNomeacao();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getDataFormacao();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CpadsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CpadsRecord value2(Integer value) {
        setOrgaoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CpadsRecord value3(String value) {
        setPortariaNomeacao(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CpadsRecord value4(Date value) {
        setDataFormacao(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CpadsRecord values(Integer value1, Integer value2, String value3, Date value4) {
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
     * Create a detached CpadsRecord
     */
    public CpadsRecord() {
        super(Cpads.CPADS);
    }

    /**
     * Create a detached, initialised CpadsRecord
     */
    public CpadsRecord(Integer id, Integer orgaoid, String portariaNomeacao, Date dataFormacao) {
        super(Cpads.CPADS);

        set(0, id);
        set(1, orgaoid);
        set(2, portariaNomeacao);
        set(3, dataFormacao);
    }
}