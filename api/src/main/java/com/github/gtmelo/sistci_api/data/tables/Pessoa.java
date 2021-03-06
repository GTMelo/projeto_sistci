/**
 * This class is generated by jOOQ
 */
package com.github.gtmelo.sistci_api.data.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pessoa extends org.jooq.impl.TableImpl<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord> {

	private static final long serialVersionUID = -1926598702;

	/**
	 * The singleton instance of <code>sistci.pessoa</code>
	 */
	public static final com.github.gtmelo.sistci_api.data.tables.Pessoa PESSOA = new com.github.gtmelo.sistci_api.data.tables.Pessoa();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord> getRecordType() {
		return com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord.class;
	}

	/**
	 * The column <code>sistci.pessoa.id</code>.
	 */
	public final org.jooq.TableField<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>sistci.pessoa.cpf</code>.
	 */
	public final org.jooq.TableField<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord, java.lang.String> CPF = createField("cpf", org.jooq.impl.SQLDataType.VARCHAR.length(11), this, "");

	/**
	 * The column <code>sistci.pessoa.matricula_siape</code>.
	 */
	public final org.jooq.TableField<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord, java.lang.String> MATRICULA_SIAPE = createField("matricula_siape", org.jooq.impl.SQLDataType.VARCHAR.length(7), this, "");

	/**
	 * The column <code>sistci.pessoa.nome</code>.
	 */
	public final org.jooq.TableField<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord, java.lang.String> NOME = createField("nome", org.jooq.impl.SQLDataType.VARCHAR.length(254).nullable(false), this, "");

	/**
	 * The column <code>sistci.pessoa.senhaHash</code>.
	 */
	public final org.jooq.TableField<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord, java.lang.String> SENHAHASH = createField("senhaHash", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>sistci.pessoa.emailid</code>.
	 */
	public final org.jooq.TableField<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord, java.lang.Integer> EMAILID = createField("emailid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>sistci.pessoa.cargoid</code>.
	 */
	public final org.jooq.TableField<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord, java.lang.Integer> CARGOID = createField("cargoid", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "");

	/**
	 * The column <code>sistci.pessoa.orgaoid</code>.
	 */
	public final org.jooq.TableField<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord, java.lang.Integer> ORGAOID = createField("orgaoid", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>sistci.pessoa</code> table reference
	 */
	public Pessoa() {
		this("pessoa", null);
	}

	/**
	 * Create an aliased <code>sistci.pessoa</code> table reference
	 */
	public Pessoa(java.lang.String alias) {
		this(alias, com.github.gtmelo.sistci_api.data.tables.Pessoa.PESSOA);
	}

	private Pessoa(java.lang.String alias, org.jooq.Table<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord> aliased) {
		this(alias, aliased, null);
	}

	private Pessoa(java.lang.String alias, org.jooq.Table<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.github.gtmelo.sistci_api.data.Sistci.SISTCI, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord, java.lang.Integer> getIdentity() {
		return com.github.gtmelo.sistci_api.data.Keys.IDENTITY_PESSOA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord> getPrimaryKey() {
		return com.github.gtmelo.sistci_api.data.Keys.KEY_PESSOA_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord>>asList(com.github.gtmelo.sistci_api.data.Keys.KEY_PESSOA_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord, ?>>asList(com.github.gtmelo.sistci_api.data.Keys.EMAIL_PESSOA, com.github.gtmelo.sistci_api.data.Keys.PESSOA_CARGO, com.github.gtmelo.sistci_api.data.Keys.ORGAO_PESSOA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.github.gtmelo.sistci_api.data.tables.Pessoa as(java.lang.String alias) {
		return new com.github.gtmelo.sistci_api.data.tables.Pessoa(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.github.gtmelo.sistci_api.data.tables.Pessoa rename(java.lang.String name) {
		return new com.github.gtmelo.sistci_api.data.tables.Pessoa(name, null);
	}
}
