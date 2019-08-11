package br.ufrn.imd.dominio.Estoque;

import java.math.BigDecimal;
import java.util.List;

/**
 * Classe que representa o estoque.
 * @author bryan
 *
 */
public class Estoque {
	private BigDecimal qtdAtual;
	private Almoxarifado almoxarifado;
	private LoteMaterial lote;
	private Material material;
	private BigDecimal qtdMaxima;
	private List<MovimentacaoEstoque> historicoMovimentacoes;

	public Estoque() {}

	public Estoque(BigDecimal qtdAtual, Almoxarifado almoxarifado, LoteMaterial lote, Material material,
			BigDecimal qtdMaxima, List<MovimentacaoEstoque> historicoMovimentacoes) {
		this.qtdAtual = qtdAtual;
		this.almoxarifado = almoxarifado;
		this.lote = lote;
		this.material = material;
		this.qtdMaxima = qtdMaxima;
		this.historicoMovimentacoes = historicoMovimentacoes;
	}

	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public Almoxarifado getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(Almoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtdMaxima() {
		return qtdMaxima;
	}

	public void setQtdMaxima(BigDecimal qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}

	public List<MovimentacaoEstoque> getHistoricoMovimentacoes() {
		return historicoMovimentacoes;
	}

	public void setHistoricoMovimentacoes(List<MovimentacaoEstoque> historicoMovimentacoes) {
		this.historicoMovimentacoes = historicoMovimentacoes;
	}
}
