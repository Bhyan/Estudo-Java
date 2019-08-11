package br.ufrn.imd.dominio.Estoque;

import java.util.Date;

import br.ufrn.imd.dominio.RH.Usuario;

/**
 * Classe que representa o historico de requisições.
 * @author bryan
 *
 */
public class HistoricoRequisicao {
	private Date dataRegistro;
	private StatusRequisicao statusRequisicao;
	private Usuario usuario;
	private String observacao;

	public HistoricoRequisicao() {}

	public HistoricoRequisicao(Date dataRegistro, StatusRequisicao statusRequisicao, Usuario usuario,
			String observacao) {
		this.dataRegistro = dataRegistro;
		this.statusRequisicao = statusRequisicao;
		this.usuario = usuario;
		this.observacao = observacao;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public StatusRequisicao getStatusRequisicao() {
		return statusRequisicao;
	}

	public void setStatusRequisicao(StatusRequisicao statusRequisicao) {
		this.statusRequisicao = statusRequisicao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
