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
public class DesclassificacaoRecord extends org.jooq.impl.UpdatableRecordImpl<com.github.gtmelo.sistci_api.data.tables.records.DesclassificacaoRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 1366065674;

	/**
	 * Setter for <code>sistci.desclassificacao.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sistci.desclassificacao.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>sistci.desclassificacao.operacaoid</code>.
	 */
	public void setOperacaoid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sistci.desclassificacao.operacaoid</code>.
	 */
	public java.lang.Integer getOperacaoid() {
		return (java.lang.Integer) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.github.gtmelo.sistci_api.data.tables.Desclassificacao.DESCLASSIFICACAO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.github.gtmelo.sistci_api.data.tables.Desclassificacao.DESCLASSIFICACAO.OPERACAOID;
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
		return getOperacaoid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DesclassificacaoRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DesclassificacaoRecord value2(java.lang.Integer value) {
		setOperacaoid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DesclassificacaoRecord values(java.lang.Integer value1, java.lang.Integer value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DesclassificacaoRecord
	 */
	public DesclassificacaoRecord() {
		super(com.github.gtmelo.sistci_api.data.tables.Desclassificacao.DESCLASSIFICACAO);
	}

	/**
	 * Create a detached, initialised DesclassificacaoRecord
	 */
	public DesclassificacaoRecord(java.lang.Integer id, java.lang.Integer operacaoid) {
		super(com.github.gtmelo.sistci_api.data.tables.Desclassificacao.DESCLASSIFICACAO);

		setValue(0, id);
		setValue(1, operacaoid);
	}
}
