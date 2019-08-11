package br.ufrn.imd.dominio.Estoque;

import java.util.List;

import br.ufrn.imd.dominio.RH.Setor;
import br.ufrn.imd.dominio.RH.Usuario;

/**
 * Classe que representa a saida de material por requisição interna.
 * @author bryan
 *
 */
public class SaidaRequisicaoInterna {
	private String codigo;
	private Usuario requisitante;
	private Setor setorRequisitante;
	private Usuario responsavelSetor;
	private StatusRequisicao statusRequisicao;
	private List<ItemRequisicao> itemRequisicao;
	private List<HistoricoRequisicao> historicoRequisicao;
	private SaidaEstoque saidaEstoque;

	public SaidaRequisicaoInterna() {}

	public SaidaRequisicaoInterna(String codigo, Usuario requisitante, Setor setorRequisitante,
			Usuario responsavelSetor, StatusRequisicao statusRequisicao, List<ItemRequisicao> itemRequisicao,
			List<HistoricoRequisicao> historicoRequisicao, SaidaEstoque saidaEstoque) {
		this.codigo = codigo;
		this.requisitante = requisitante;
		this.setorRequisitante = setorRequisitante;
		this.responsavelSetor = responsavelSetor;
		this.statusRequisicao = statusRequisicao;
		this.itemRequisicao = itemRequisicao;
		this.historicoRequisicao = historicoRequisicao;
		this.saidaEstoque = saidaEstoque;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Usuario getRequisitante() {
		return requisitante;
	}

	public void setRequisitante(Usuario requisitante) {
		this.requisitante = requisitante;
	}

	public Setor getSetorRequisitante() {
		return setorRequisitante;
	}

	public void setSetorRequisitante(Setor setorRequisitante) {
		this.setorRequisitante = setorRequisitante;
	}

	public Usuario getResponsavelSetor() {
		return responsavelSetor;
	}

	public void setResponsavelSetor(Usuario responsavelSetor) {
		this.responsavelSetor = responsavelSetor;
	}

	public StatusRequisicao getStatusRequisicao() {
		return statusRequisicao;
	}

	public void setStatusRequisicao(StatusRequisicao statusRequisicao) {
		this.statusRequisicao = statusRequisicao;
	}

	public List<ItemRequisicao> getItemRequisicao() {
		return itemRequisicao;
	}

	public void setItemRequisicao(List<ItemRequisicao> itemRequisicao) {
		this.itemRequisicao = itemRequisicao;
	}

	public List<HistoricoRequisicao> getHistoricoRequisicao() {
		return historicoRequisicao;
	}

	public void setHistoricoRequisicao(List<HistoricoRequisicao> historicoRequisicao) {
		this.historicoRequisicao = historicoRequisicao;
	}

	public SaidaEstoque getSaidaEstoque() {
		return saidaEstoque;
	}

	public void setSaidaEstoque(SaidaEstoque saidaEstoque) {
		this.saidaEstoque = saidaEstoque;
	}
}
