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
public class CargoRecord extends org.jooq.impl.UpdatableRecordImpl<com.github.gtmelo.sistci_api.data.tables.records.CargoRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 629761240;

	/**
	 * Setter for <code>sistci.cargo.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sistci.cargo.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>sistci.cargo.descricao</code>.
	 */
	public void setDescricao(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sistci.cargo.descricao</code>.
	 */
	public java.lang.String getDescricao() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>sistci.cargo.orgaoid</code>.
	 */
	public void setOrgaoid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sistci.cargo.orgaoid</code>.
	 */
	public java.lang.Integer getOrgaoid() {
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
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.github.gtmelo.sistci_api.data.tables.Cargo.CARGO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.github.gtmelo.sistci_api.data.tables.Cargo.CARGO.DESCRICAO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.github.gtmelo.sistci_api.data.tables.Cargo.CARGO.ORGAOID;
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
	public java.lang.String value2() {
		return getDescricao();
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
	public CargoRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CargoRecord value2(java.lang.String value) {
		setDescricao(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CargoRecord value3(java.lang.Integer value) {
		setOrgaoid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CargoRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CargoRecord
	 */
	public CargoRecord() {
		super(com.github.gtmelo.sistci_api.data.tables.Cargo.CARGO);
	}

	/**
	 * Create a detached, initialised CargoRecord
	 */
	public CargoRecord(java.lang.Integer id, java.lang.String descricao, java.lang.Integer orgaoid) {
		super(com.github.gtmelo.sistci_api.data.tables.Cargo.CARGO);

		setValue(0, id);
		setValue(1, descricao);
		setValue(2, orgaoid);
	}
}
