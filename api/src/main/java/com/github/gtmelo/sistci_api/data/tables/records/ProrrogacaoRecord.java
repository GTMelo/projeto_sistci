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
public class ProrrogacaoRecord extends org.jooq.impl.UpdatableRecordImpl<com.github.gtmelo.sistci_api.data.tables.records.ProrrogacaoRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 83802617;

	/**
	 * Setter for <code>sistci.prorrogacao.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sistci.prorrogacao.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>sistci.prorrogacao.prazoid</code>.
	 */
	public void setPrazoid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sistci.prorrogacao.prazoid</code>.
	 */
	public java.lang.Integer getPrazoid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>sistci.prorrogacao.operacaoid</code>.
	 */
	public void setOperacaoid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sistci.prorrogacao.operacaoid</code>.
	 */
	public java.lang.Integer getOperacaoid() {
		return (java.lang.Integer) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.github.gtmelo.sistci_api.data.tables.Prorrogacao.PRORROGACAO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.github.gtmelo.sistci_api.data.tables.Prorrogacao.PRORROGACAO.PRAZOID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.github.gtmelo.sistci_api.data.tables.Prorrogacao.PRORROGACAO.OPERACAOID;
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
		return getPrazoid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getOperacaoid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProrrogacaoRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProrrogacaoRecord value2(java.lang.Integer value) {
		setPrazoid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProrrogacaoRecord value3(java.lang.Integer value) {
		setOperacaoid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProrrogacaoRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProrrogacaoRecord
	 */
	public ProrrogacaoRecord() {
		super(com.github.gtmelo.sistci_api.data.tables.Prorrogacao.PRORROGACAO);
	}

	/**
	 * Create a detached, initialised ProrrogacaoRecord
	 */
	public ProrrogacaoRecord(java.lang.Integer id, java.lang.Integer prazoid, java.lang.Integer operacaoid) {
		super(com.github.gtmelo.sistci_api.data.tables.Prorrogacao.PRORROGACAO);

		setValue(0, id);
		setValue(1, prazoid);
		setValue(2, operacaoid);
	}
}
