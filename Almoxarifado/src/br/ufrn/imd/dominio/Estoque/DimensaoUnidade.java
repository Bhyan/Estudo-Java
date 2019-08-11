package br.ufrn.imd.dominio.Estoque;

import java.math.BigDecimal;

/**
 * Classe que representa as dimensões da unidade a ser armazenada.
 * @author bryan
 *
 */
public class DimensaoUnidade {
	private BigDecimal altura;
	private BigDecimal largura;
	private BigDecimal profundidade;

	public DimensaoUnidade() {}

	public DimensaoUnidade(BigDecimal altura, BigDecimal largura, BigDecimal profundidade) {
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getLargura() {
		return largura;
	}

	public void setLargura(BigDecimal largura) {
		this.largura = largura;
	}

	public BigDecimal getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(BigDecimal profundidade) {
		this.profundidade = profundidade;
	}
}
