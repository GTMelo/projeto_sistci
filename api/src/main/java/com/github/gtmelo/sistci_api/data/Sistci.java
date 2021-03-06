/**
 * This class is generated by jOOQ
 */
package com.github.gtmelo.sistci_api.data;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sistci extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1004612207;

	/**
	 * The singleton instance of <code>sistci</code>
	 */
	public static final Sistci SISTCI = new Sistci();

	/**
	 * No further instances allowed
	 */
	private Sistci() {
		super("sistci");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			com.github.gtmelo.sistci_api.data.tables.AlteracaoPrazo.ALTERACAO_PRAZO,
			com.github.gtmelo.sistci_api.data.tables.AlteracaoPrazoTci.ALTERACAO_PRAZO_TCI,
			com.github.gtmelo.sistci_api.data.tables.Cargo.CARGO,
			com.github.gtmelo.sistci_api.data.tables.Categoria.CATEGORIA,
			com.github.gtmelo.sistci_api.data.tables.Classificacao.CLASSIFICACAO,
			com.github.gtmelo.sistci_api.data.tables.Cpads.CPADS,
			com.github.gtmelo.sistci_api.data.tables.CpadsPessoa.CPADS_PESSOA,
			com.github.gtmelo.sistci_api.data.tables.Desclassificacao.DESCLASSIFICACAO,
			com.github.gtmelo.sistci_api.data.tables.Email.EMAIL,
			com.github.gtmelo.sistci_api.data.tables.FundamentoLegal.FUNDAMENTO_LEGAL,
			com.github.gtmelo.sistci_api.data.tables.GrauSigilo.GRAU_SIGILO,
			com.github.gtmelo.sistci_api.data.tables.Minuta.MINUTA,
			com.github.gtmelo.sistci_api.data.tables.Orgao.ORGAO,
			com.github.gtmelo.sistci_api.data.tables.Pessoa.PESSOA,
			com.github.gtmelo.sistci_api.data.tables.Prazo.PRAZO,
			com.github.gtmelo.sistci_api.data.tables.Reclassificacao.RECLASSIFICACAO,
			com.github.gtmelo.sistci_api.data.tables.Status.STATUS,
			com.github.gtmelo.sistci_api.data.tables.Tci.TCI,
			com.github.gtmelo.sistci_api.data.tables.ViewClassificacao.VIEW_CLASSIFICACAO,
			com.github.gtmelo.sistci_api.data.tables.ViewTci.VIEW_TCI);
	}
}
