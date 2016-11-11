/**
 * This class is generated by jOOQ
 */
package com.github.gtmelo.sistci_api.data.tables.records;


import com.github.gtmelo.sistci_api.data.tables.Desclassificacao;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class DesclassificacaoRecord extends UpdatableRecordImpl<DesclassificacaoRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1978182347;

    /**
     * Setter for <code>sistci.desclassificacao.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>sistci.desclassificacao.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sistci.desclassificacao.operacaoid</code>.
     */
    public void setOperacaoid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>sistci.desclassificacao.operacaoid</code>.
     */
    public Integer getOperacaoid() {
        return (Integer) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Desclassificacao.DESCLASSIFICACAO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Desclassificacao.DESCLASSIFICACAO.OPERACAOID;
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
        return getOperacaoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DesclassificacaoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DesclassificacaoRecord value2(Integer value) {
        setOperacaoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DesclassificacaoRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DesclassificacaoRecord
     */
    public DesclassificacaoRecord() {
        super(Desclassificacao.DESCLASSIFICACAO);
    }

    /**
     * Create a detached, initialised DesclassificacaoRecord
     */
    public DesclassificacaoRecord(Integer id, Integer operacaoid) {
        super(Desclassificacao.DESCLASSIFICACAO);

        set(0, id);
        set(1, operacaoid);
    }
}