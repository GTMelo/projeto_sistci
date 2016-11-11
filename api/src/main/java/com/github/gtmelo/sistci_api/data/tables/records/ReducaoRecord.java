/**
 * This class is generated by jOOQ
 */
package com.github.gtmelo.sistci_api.data.tables.records;


import com.github.gtmelo.sistci_api.data.tables.Reducao;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class ReducaoRecord extends UpdatableRecordImpl<ReducaoRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -1911512909;

    /**
     * Setter for <code>sistci.reducao.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>sistci.reducao.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sistci.reducao.prazoid</code>.
     */
    public void setPrazoid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>sistci.reducao.prazoid</code>.
     */
    public Integer getPrazoid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>sistci.reducao.operacaoid</code>.
     */
    public void setOperacaoid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>sistci.reducao.operacaoid</code>.
     */
    public Integer getOperacaoid() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Reducao.REDUCAO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Reducao.REDUCAO.PRAZOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Reducao.REDUCAO.OPERACAOID;
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
        return getPrazoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getOperacaoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducaoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducaoRecord value2(Integer value) {
        setPrazoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducaoRecord value3(Integer value) {
        setOperacaoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReducaoRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReducaoRecord
     */
    public ReducaoRecord() {
        super(Reducao.REDUCAO);
    }

    /**
     * Create a detached, initialised ReducaoRecord
     */
    public ReducaoRecord(Integer id, Integer prazoid, Integer operacaoid) {
        super(Reducao.REDUCAO);

        set(0, id);
        set(1, prazoid);
        set(2, operacaoid);
    }
}
