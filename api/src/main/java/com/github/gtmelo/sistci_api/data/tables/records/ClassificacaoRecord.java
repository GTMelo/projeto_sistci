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
public class ClassificacaoRecord extends org.jooq.impl.UpdatableRecordImpl<com.github.gtmelo.sistci_api.data.tables.records.ClassificacaoRecord> implements org.jooq.Record7<java.lang.Integer, java.sql.Date, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 1615171393;

	/**
	 * Setter for <code>sistci.classificacao.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sistci.classificacao.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>sistci.classificacao.data</code>.
	 */
	public void setData(java.sql.Date value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sistci.classificacao.data</code>.
	 */
	public java.sql.Date getData() {
		return (java.sql.Date) getValue(1);
	}

	/**
	 * Setter for <code>sistci.classificacao.imagem</code>.
	 */
	public void setImagem(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sistci.classificacao.imagem</code>.
	 */
	public java.lang.String getImagem() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>sistci.classificacao.pessoaid</code>.
	 */
	public void setPessoaid(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sistci.classificacao.pessoaid</code>.
	 */
	public java.lang.Integer getPessoaid() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>sistci.classificacao.autoridadeid</code>.
	 */
	public void setAutoridadeid(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sistci.classificacao.autoridadeid</code>.
	 */
	public java.lang.Integer getAutoridadeid() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>sistci.classificacao.ratificadorid</code>.
	 */
	public void setRatificadorid(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sistci.classificacao.ratificadorid</code>.
	 */
	public java.lang.Integer getRatificadorid() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>sistci.classificacao.tciid</code>.
	 */
	public void setTciid(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sistci.classificacao.tciid</code>.
	 */
	public java.lang.Integer getTciid() {
		return (java.lang.Integer) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.sql.Date, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.sql.Date, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.github.gtmelo.sistci_api.data.tables.Classificacao.CLASSIFICACAO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field2() {
		return com.github.gtmelo.sistci_api.data.tables.Classificacao.CLASSIFICACAO.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.github.gtmelo.sistci_api.data.tables.Classificacao.CLASSIFICACAO.IMAGEM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return com.github.gtmelo.sistci_api.data.tables.Classificacao.CLASSIFICACAO.PESSOAID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return com.github.gtmelo.sistci_api.data.tables.Classificacao.CLASSIFICACAO.AUTORIDADEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return com.github.gtmelo.sistci_api.data.tables.Classificacao.CLASSIFICACAO.RATIFICADORID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return com.github.gtmelo.sistci_api.data.tables.Classificacao.CLASSIFICACAO.TCIID;
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
	public java.sql.Date value2() {
		return getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getImagem();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getPessoaid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getAutoridadeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getRatificadorid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getTciid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassificacaoRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassificacaoRecord value2(java.sql.Date value) {
		setData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassificacaoRecord value3(java.lang.String value) {
		setImagem(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassificacaoRecord value4(java.lang.Integer value) {
		setPessoaid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassificacaoRecord value5(java.lang.Integer value) {
		setAutoridadeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassificacaoRecord value6(java.lang.Integer value) {
		setRatificadorid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassificacaoRecord value7(java.lang.Integer value) {
		setTciid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClassificacaoRecord values(java.lang.Integer value1, java.sql.Date value2, java.lang.String value3, java.lang.Integer value4, java.lang.Integer value5, java.lang.Integer value6, java.lang.Integer value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ClassificacaoRecord
	 */
	public ClassificacaoRecord() {
		super(com.github.gtmelo.sistci_api.data.tables.Classificacao.CLASSIFICACAO);
	}

	/**
	 * Create a detached, initialised ClassificacaoRecord
	 */
	public ClassificacaoRecord(java.lang.Integer id, java.sql.Date data, java.lang.String imagem, java.lang.Integer pessoaid, java.lang.Integer autoridadeid, java.lang.Integer ratificadorid, java.lang.Integer tciid) {
		super(com.github.gtmelo.sistci_api.data.tables.Classificacao.CLASSIFICACAO);

		setValue(0, id);
		setValue(1, data);
		setValue(2, imagem);
		setValue(3, pessoaid);
		setValue(4, autoridadeid);
		setValue(5, ratificadorid);
		setValue(6, tciid);
	}
}
