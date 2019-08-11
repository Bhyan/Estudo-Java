package br.ufrn.imd.dominio.Estoque;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.dominio.Producao.OrdemProducao;
import br.ufrn.imd.dominio.RH.PessoaJuridica;

/**
 * Classe que representa o lote de material.
 * @author bryan
 *
 */
public class LoteMaterial {
	private Material material;
	private Date dataValidade;
	private Date dataFabricacao;
	private EstadoLote estado;
	private String numeroLoteFabricante;
	private String numeroLoteInterno;
	private String numeroLoteFornecedor;
	private int volume;
	private OrdemProducao ordemProducao;
	private PessoaJuridica fabricante;
	private PessoaJuridica fornecedor;
	private int qtdCaixaEmbarque;
	private BigDecimal pesoBrutoTotal;
	private BigDecimal pesoLiquidoTotal;
	private BigDecimal tara;
	private double valorUnitario;

	public LoteMaterial() {}

	public LoteMaterial(Material material, Date dataValidade, Date dataFabricacao, EstadoLote estado,
			String numeroLoteFabricante, String numeroLoteInterno, String numeroLoteFornecedor, int volume,
			OrdemProducao ordemProducao, PessoaJuridica fabricante, PessoaJuridica fornecedor, int qtdCaixaEmbarque,
			BigDecimal pesoBrutoTotal, BigDecimal pesoLiquidoTotal, BigDecimal tara, double valorUnitario) {
		this.material = material;
		this.dataValidade = dataValidade;
		this.dataFabricacao = dataFabricacao;
		this.estado = estado;
		this.numeroLoteFabricante = numeroLoteFabricante;
		this.numeroLoteInterno = numeroLoteInterno;
		this.numeroLoteFornecedor = numeroLoteFornecedor;
		this.volume = volume;
		this.ordemProducao = ordemProducao;
		this.fabricante = fabricante;
		this.fornecedor = fornecedor;
		this.qtdCaixaEmbarque = qtdCaixaEmbarque;
		this.pesoBrutoTotal = pesoBrutoTotal;
		this.pesoLiquidoTotal = pesoLiquidoTotal;
		this.tara = tara;
		this.valorUnitario = valorUnitario;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public EstadoLote getEstado() {
		return estado;
	}

	public void setEstado(EstadoLote estado) {
		this.estado = estado;
	}

	public String getNumeroLoteFabricante() {
		return numeroLoteFabricante;
	}

	public void setNumeroLoteFabricante(String numeroLoteFabricante) {
		this.numeroLoteFabricante = numeroLoteFabricante;
	}

	public String getNumeroLoteInterno() {
		return numeroLoteInterno;
	}

	public void setNumeroLoteInterno(String numeroLoteInterno) {
		this.numeroLoteInterno = numeroLoteInterno;
	}

	public String getNumeroLoteFornecedor() {
		return numeroLoteFornecedor;
	}

	public void setNumeroLoteFornecedor(String numeroLoteFornecedor) {
		this.numeroLoteFornecedor = numeroLoteFornecedor;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public OrdemProducao getOrdemProducao() {
		return ordemProducao;
	}

	public void setOrdemProducao(OrdemProducao ordemProducao) {
		this.ordemProducao = ordemProducao;
	}

	public PessoaJuridica getFabricante() {
		return fabricante;
	}

	public void setFabricante(PessoaJuridica fabricante) {
		this.fabricante = fabricante;
	}

	public PessoaJuridica getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getQtdCaixaEmbarque() {
		return qtdCaixaEmbarque;
	}

	public void setQtdCaixaEmbarque(int qtdCaixaEmbarque) {
		this.qtdCaixaEmbarque = qtdCaixaEmbarque;
	}

	public BigDecimal getPesoBrutoTotal() {
		return pesoBrutoTotal;
	}

	public void setPesoBrutoTotal(BigDecimal pesoBrutoTotal) {
		this.pesoBrutoTotal = pesoBrutoTotal;
	}

	public BigDecimal getPesoLiquidoTotal() {
		return pesoLiquidoTotal;
	}

	public void setPesoLiquidoTotal(BigDecimal pesoLiquidoTotal) {
		this.pesoLiquidoTotal = pesoLiquidoTotal;
	}

	public BigDecimal getTara() {
		return tara;
	}

	public void setTara(BigDecimal tara) {
		this.tara = tara;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
}
