package br.ufrn.imd.dominio.Estoque;

/**
 * Classe que representa os dados do pagamento do material.
 * @author bryan
 *
 */
public class DadosPagamento {
	private String banco;
	private String agenda;
	private String conta;
	private String codigoIndentificadorDV;

	public DadosPagamento() {}

	public DadosPagamento(String banco, String agenda, String conta, String codigoIndentificadorDV) {
		this.banco = banco;
		this.agenda = agenda;
		this.conta = conta;
		this.codigoIndentificadorDV = codigoIndentificadorDV;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getCodigoIndentificadorDV() {
		return codigoIndentificadorDV;
	}

	public void setCodigoIndentificadorDV(String codigoIndentificadorDV) {
		this.codigoIndentificadorDV = codigoIndentificadorDV;
	}
}