/**
 * This class is generated by jOOQ
 */
package com.github.gtmelo.sistci_api.data.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PessoaRecord extends org.jooq.impl.UpdatableRecordImpl<com.github.gtmelo.sistci_api.data.tables.records.PessoaRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -498571075;

	/**
	 * Setter for <code>sistci.pessoa.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sistci.pessoa.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>sistci.pessoa.emailid</code>.
	 */
	public void setEmailid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sistci.pessoa.emailid</code>.
	 */
	public java.lang.Integer getEmailid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>sistci.pessoa.orgaoid</code>.
	 */
	public void setOrgaoid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sistci.pessoa.orgaoid</code>.
	 */
	public java.lang.Integer getOrgaoid() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>sistci.pessoa.cargoid</code>.
	 */
	public void setCargoid(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sistci.pessoa.cargoid</code>.
	 */
	public java.lang.Integer getCargoid() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>sistci.pessoa.matricula_siape</code>.
	 */
	public void setMatriculaSiape(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sistci.pessoa.matricula_siape</code>.
	 */
	public java.lang.Integer getMatriculaSiape() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>sistci.pessoa.nome</code>.
	 */
	public void setNome(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sistci.pessoa.nome</code>.
	 */
	public java.lang.String getNome() {
		return (java.lang.String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.github.gtmelo.sistci_api.data.tables.Pessoa.PESSOA.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.github.gtmelo.sistci_api.data.tables.Pessoa.PESSOA.EMAILID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.github.gtmelo.sistci_api.data.tables.Pessoa.PESSOA.ORGAOID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return com.github.gtmelo.sistci_api.data.tables.Pessoa.PESSOA.CARGOID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return com.github.gtmelo.sistci_api.data.tables.Pessoa.PESSOA.MATRICULA_SIAPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.github.gtmelo.sistci_api.data.tables.Pessoa.PESSOA.NOME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getEmailid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getOrgaoid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getCargoid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getMatriculaSiape();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getNome();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PessoaRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PessoaRecord value2(java.lang.Integer value) {
		setEmailid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PessoaRecord value3(java.lang.Integer value) {
		setOrgaoid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PessoaRecord value4(java.lang.Integer value) {
		setCargoid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PessoaRecord value5(java.lang.Integer value) {
		setMatriculaSiape(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PessoaRecord value6(java.lang.String value) {
		setNome(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PessoaRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4, java.lang.Integer value5, java.lang.String value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PessoaRecord
	 */
	public PessoaRecord() {
		super(com.github.gtmelo.sistci_api.data.tables.Pessoa.PESSOA);
	}

	/**
	 * Create a detached, initialised PessoaRecord
	 */
	public PessoaRecord(java.lang.Integer id, java.lang.Integer emailid, java.lang.Integer orgaoid, java.lang.Integer cargoid, java.lang.Integer matriculaSiape, java.lang.String nome) {
		super(com.github.gtmelo.sistci_api.data.tables.Pessoa.PESSOA);

		setValue(0, id);
		setValue(1, emailid);
		setValue(2, orgaoid);
		setValue(3, cargoid);
		setValue(4, matriculaSiape);
		setValue(5, nome);
	}
}
