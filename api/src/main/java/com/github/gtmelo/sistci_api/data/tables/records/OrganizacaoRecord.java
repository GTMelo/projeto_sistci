/**
 * This class is generated by jOOQ
 */
package com.github.gtmelo.sistci_api.data.tables.records;


import com.github.gtmelo.sistci_api.data.tables.Organizacao;

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
public class OrganizacaoRecord extends UpdatableRecordImpl<OrganizacaoRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -8764913;

    /**
     * Setter for <code>sistci.organizacao.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>sistci.organizacao.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sistci.organizacao.sigla</code>.
     */
    public void setSigla(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sistci.organizacao.sigla</code>.
     */
    public String getSigla() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sistci.organizacao.nome</code>.
     */
    public void setNome(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sistci.organizacao.nome</code>.
     */
    public String getNome() {
        return (String) get(2);
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
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Organizacao.ORGANIZACAO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Organizacao.ORGANIZACAO.SIGLA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Organizacao.ORGANIZACAO.NOME;
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
        return getSigla();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNome();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizacaoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizacaoRecord value2(String value) {
        setSigla(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizacaoRecord value3(String value) {
        setNome(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrganizacaoRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrganizacaoRecord
     */
    public OrganizacaoRecord() {
        super(Organizacao.ORGANIZACAO);
    }

    /**
     * Create a detached, initialised OrganizacaoRecord
     */
    public OrganizacaoRecord(Integer id, String sigla, String nome) {
        super(Organizacao.ORGANIZACAO);

        set(0, id);
        set(1, sigla);
        set(2, nome);
    }
}