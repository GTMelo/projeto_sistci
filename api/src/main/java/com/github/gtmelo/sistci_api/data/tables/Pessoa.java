/**
 * This class is generated by jOOQ
 */
package com.github.gtmelo.sistci_api.data.tables;


import com.github.gtmelo.sistci_api.data.Keys;
import com.github.gtmelo.sistci_api.data.Sistci;
import com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Pessoa extends TableImpl<PessoaRecord> {

    private static final long serialVersionUID = 1481092391;

    /**
     * The reference instance of <code>sistci.pessoa</code>
     */
    public static final Pessoa PESSOA = new Pessoa();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PessoaRecord> getRecordType() {
        return PessoaRecord.class;
    }

    /**
     * The column <code>sistci.pessoa.id</code>.
     */
    public final TableField<PessoaRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>sistci.pessoa.emailid</code>.
     */
    public final TableField<PessoaRecord, Integer> EMAILID = createField("emailid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>sistci.pessoa.orgaoid</code>.
     */
    public final TableField<PessoaRecord, Integer> ORGAOID = createField("orgaoid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sistci.pessoa.cargoid</code>.
     */
    public final TableField<PessoaRecord, Integer> CARGOID = createField("cargoid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>sistci.pessoa.matricula_siape</code>.
     */
    public final TableField<PessoaRecord, Integer> MATRICULA_SIAPE = createField("matricula_siape", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sistci.pessoa.nome</code>.
     */
    public final TableField<PessoaRecord, String> NOME = createField("nome", org.jooq.impl.SQLDataType.VARCHAR.length(254), this, "");

    /**
     * Create a <code>sistci.pessoa</code> table reference
     */
    public Pessoa() {
        this("pessoa", null);
    }

    /**
     * Create an aliased <code>sistci.pessoa</code> table reference
     */
    public Pessoa(String alias) {
        this(alias, PESSOA);
    }

    private Pessoa(String alias, Table<PessoaRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pessoa(String alias, Table<PessoaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sistci.SISTCI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PessoaRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PESSOA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PessoaRecord> getPrimaryKey() {
        return Keys.KEY_PESSOA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PessoaRecord>> getKeys() {
        return Arrays.<UniqueKey<PessoaRecord>>asList(Keys.KEY_PESSOA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PessoaRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PessoaRecord, ?>>asList(Keys.PESSOA_EMAIL, Keys.ORGAO_PESSOA, Keys.PESSOA_CARGO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pessoa as(String alias) {
        return new Pessoa(alias, this);
    }

    /**
     * Rename this table
     */
    public Pessoa rename(String name) {
        return new Pessoa(name, null);
    }
}
