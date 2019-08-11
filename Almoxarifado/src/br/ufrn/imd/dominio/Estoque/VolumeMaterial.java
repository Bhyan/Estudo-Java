package br.ufrn.imd.dominio.Estoque;

import java.math.BigDecimal;

public class VolumeMaterial {
	private String codigo;
	private Material material;
	private BigDecimal qtdInicial;
	private BigDecimal qtdAtual;
	private DimensaoUnidade dimensao;
	private LocalizacaoAlmoxarifado localizacao;
	private LoteMaterial lote;
	private VolumeMaterial volumeOriginal;

	public VolumeMaterial() {}

	public VolumeMaterial(String codigo, Material material, BigDecimal qtdInicial, BigDecimal qtdAtual,
			DimensaoUnidade dimensao, LocalizacaoAlmoxarifado localizacao, LoteMaterial lote, VolumeMaterial volumeOriginal) {
		this.codigo = codigo;
		this.material = material;
		this.qtdInicial = qtdInicial;
		this.qtdAtual = qtdAtual;
		this.dimensao = dimensao;
		this.localizacao = localizacao;
		this.lote = lote;
		this.volumeOriginal = volumeOriginal;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtdInicial() {
		return qtdInicial;
	}

	public void setQtdInicial(BigDecimal qtdInicial) {
		this.qtdInicial = qtdInicial;
	}

	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public DimensaoUnidade getDimensao() {
		return dimensao;
	}

	public void setDimensao(DimensaoUnidade dimensao) {
		this.dimensao = dimensao;
	}

	public LocalizacaoAlmoxarifado getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(LocalizacaoAlmoxarifado localizacao) {
		this.localizacao = localizacao;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public VolumeMaterial getVolumeOriginal() {
		return volumeOriginal;
	}

	public void setVolumeOriginal(VolumeMaterial volumeOriginal) {
		this.volumeOriginal = volumeOriginal;
	}
}
