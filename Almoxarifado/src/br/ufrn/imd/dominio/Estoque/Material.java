package br.ufrn.imd.dominio.Estoque;

import java.math.BigDecimal;

/**
 * Classe que representa o material.
 * @author bryan
 *
 */
public class Material {
	private int codigo;
	private String nome;
	private String especificacoes;
	private GrupoMaterial grupoMaterial;
	private int estoqueMinimo;
	private int pontoPedido;
	private UnidadeMedida unidadeEstoque;
	private UnidadeMedida unidadeEntrada;
	private BigDecimal fatorConversaoEntrada;
	private UnidadeMedida unidadeSaida;
	private BigDecimal fatorConversaoSaida;
	private String dadosAdicionais;
	private ClassificacaoMaterial classificacao;
	private int catmat;
	private String codigoArmazenagem;
	private StatusMaterial status;

	public Material() {}

	public Material(int codigo, String nome, String especificacoes, GrupoMaterial grupoMaterial, int estoqueMinimo,
			int pontoPedido, UnidadeMedida unidadeEstoque, UnidadeMedida unidadeEntrada,
			BigDecimal fatorConversaoEntrada, UnidadeMedida unidadeSaida, BigDecimal fatorConversaoSaida,
			String dadosAdicionais, ClassificacaoMaterial classificacao, int catmat, String codigoArmazenagem,
			StatusMaterial status) {
		this.codigo = codigo;
		this.nome = nome;
		this.especificacoes = especificacoes;
		this.grupoMaterial = grupoMaterial;
		this.estoqueMinimo = estoqueMinimo;
		this.pontoPedido = pontoPedido;
		this.unidadeEstoque = unidadeEstoque;
		this.unidadeEntrada = unidadeEntrada;
		this.fatorConversaoEntrada = fatorConversaoEntrada;
		this.unidadeSaida = unidadeSaida;
		this.fatorConversaoSaida = fatorConversaoSaida;
		this.dadosAdicionais = dadosAdicionais;
		this.classificacao = classificacao;
		this.catmat = catmat;
		this.codigoArmazenagem = codigoArmazenagem;
		this.status = status;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecificacoes() {
		return especificacoes;
	}

	public void setEspecificacoes(String especificacoes) {
		this.especificacoes = especificacoes;
	}

	public GrupoMaterial getGrupoMaterial() {
		return grupoMaterial;
	}

	public void setGrupoMaterial(GrupoMaterial grupoMaterial) {
		this.grupoMaterial = grupoMaterial;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getPontoPedido() {
		return pontoPedido;
	}

	public void setPontoPedido(int pontoPedido) {
		this.pontoPedido = pontoPedido;
	}

	public UnidadeMedida getUnidadeEstoque() {
		return unidadeEstoque;
	}

	public void setUnidadeEstoque(UnidadeMedida unidadeEstoque) {
		this.unidadeEstoque = unidadeEstoque;
	}

	public UnidadeMedida getUnidadeEntrada() {
		return unidadeEntrada;
	}

	public void setUnidadeEntrada(UnidadeMedida unidadeEntrada) {
		this.unidadeEntrada = unidadeEntrada;
	}

	public BigDecimal getFatorConversaoEntrada() {
		return fatorConversaoEntrada;
	}

	public void setFatorConversaoEntrada(BigDecimal fatorConversaoEntrada) {
		this.fatorConversaoEntrada = fatorConversaoEntrada;
	}

	public UnidadeMedida getUnidadeSaida() {
		return unidadeSaida;
	}

	public void setUnidadeSaida(UnidadeMedida unidadeSaida) {
		this.unidadeSaida = unidadeSaida;
	}

	public BigDecimal getFatorConversaoSaida() {
		return fatorConversaoSaida;
	}

	public void setFatorConversaoSaida(BigDecimal fatorConversaoSaida) {
		this.fatorConversaoSaida = fatorConversaoSaida;
	}

	public String getDadosAdicionais() {
		return dadosAdicionais;
	}

	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}

	public ClassificacaoMaterial getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(ClassificacaoMaterial classificacao) {
		this.classificacao = classificacao;
	}

	public int getCatmat() {
		return catmat;
	}

	public void setCatmat(int catmat) {
		this.catmat = catmat;
	}

	public String getCodigoArmazenagem() {
		return codigoArmazenagem;
	}

	public void setCodigoArmazenagem(String codigoArmazenagem) {
		this.codigoArmazenagem = codigoArmazenagem;
	}

	public StatusMaterial getStatus() {
		return status;
	}

	public void setStatus(StatusMaterial status) {
		this.status = status;
	}
}
