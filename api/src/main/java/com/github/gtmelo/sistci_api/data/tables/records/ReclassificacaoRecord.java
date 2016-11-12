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
public class ReclassificacaoRecord extends org.jooq.impl.UpdatableRecordImpl<com.github.gtmelo.sistci_api.data.tables.records.ReclassificacaoRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 1652153698;

	/**
	 * Setter for <code>sistci.reclassificacao.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sistci.reclassificacao.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>sistci.reclassificacao.grau_sigiloid</code>.
	 */
	public void setGrauSigiloid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sistci.reclassificacao.grau_sigiloid</code>.
	 */
	public java.lang.Integer getGrauSigiloid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>sistci.reclassificacao.operacaoid</code>.
	 */
	public void setOperacaoid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sistci.reclassificacao.operacaoid</code>.
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
		return com.github.gtmelo.sistci_api.data.tables.Reclassificacao.RECLASSIFICACAO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.github.gtmelo.sistci_api.data.tables.Reclassificacao.RECLASSIFICACAO.GRAU_SIGILOID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.github.gtmelo.sistci_api.data.tables.Reclassificacao.RECLASSIFICACAO.OPERACAOID;
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
		return getGrauSigiloid();
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
	public ReclassificacaoRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReclassificacaoRecord value2(java.lang.Integer value) {
		setGrauSigiloid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReclassificacaoRecord value3(java.lang.Integer value) {
		setOperacaoid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReclassificacaoRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ReclassificacaoRecord
	 */
	public ReclassificacaoRecord() {
		super(com.github.gtmelo.sistci_api.data.tables.Reclassificacao.RECLASSIFICACAO);
	}

	/**
	 * Create a detached, initialised ReclassificacaoRecord
	 */
	public ReclassificacaoRecord(java.lang.Integer id, java.lang.Integer grauSigiloid, java.lang.Integer operacaoid) {
		super(com.github.gtmelo.sistci_api.data.tables.Reclassificacao.RECLASSIFICACAO);

		setValue(0, id);
		setValue(1, grauSigiloid);
		setValue(2, operacaoid);
	}
}
