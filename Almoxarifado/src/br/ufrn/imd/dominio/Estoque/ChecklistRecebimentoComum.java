package br.ufrn.imd.dominio.Estoque;

import java.util.Date;
import java.util.List;

import br.ufrn.imd.dominio.Producao.Documento;
import br.ufrn.imd.dominio.RH.Funcionario;

/**
 * Classe que representa o checkliste do recebimento de material.
 * @author bryan
 *
 */
public class ChecklistRecebimentoComum {
	private Date dataChegada;
	private LoteMaterial lote;
	private Boolean materialConfereNF;
	private Boolean etiquetadoIdentificacao;
	private Boolean embalagemIntegra;
	private Boolean embalagemSuja;
	private Boolean embalagemUmida;
	private Boolean embalagemDeformada;
	private Boolean embalagemVazando;
	private Boolean embalagemLacreViolado;
	private String placa;
	private float temperatura;
	private int numeroConhecimento;
	private String motorista;
	private String observacoes;
	private Funcionario conferente;
	private List<Documento> anexoFotos;
	private Boolean aprovado;
	
	public ChecklistRecebimentoComum() {}

	public ChecklistRecebimentoComum(Date dataChegada, LoteMaterial lote, Boolean materialConfereNF,
			Boolean etiquetadoIdentificacao, Boolean embalagemIntegra, Boolean embalagemSuja, Boolean embalagemUmida,
			Boolean embalagemDeformada, Boolean embalagemVazando, Boolean embalagemLacreViolado, String placa,
			float temperatura, int numeroConhecimento, String motorista, String observacoes, Funcionario conferente,
			List<Documento> anexoFotos, Boolean aprovado) 
	{
		this.dataChegada = dataChegada;
		this.lote = lote;
		this.materialConfereNF = materialConfereNF;
		this.etiquetadoIdentificacao = etiquetadoIdentificacao;
		this.embalagemIntegra = embalagemIntegra;
		this.embalagemSuja = embalagemSuja;
		this.embalagemUmida = embalagemUmida;
		this.embalagemDeformada = embalagemDeformada;
		this.embalagemVazando = embalagemVazando;
		this.embalagemLacreViolado = embalagemLacreViolado;
		this.placa = placa;
		this.temperatura = temperatura;
		this.numeroConhecimento = numeroConhecimento;
		this.motorista = motorista;
		this.observacoes = observacoes;
		this.conferente = conferente;
		this.anexoFotos = anexoFotos;
		this.aprovado = aprovado;
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public Boolean getMaterialConfereNF() {
		return materialConfereNF;
	}

	public void setMaterialConfereNF(Boolean materialConfereNF) {
		this.materialConfereNF = materialConfereNF;
	}

	public Boolean getEtiquetadoIdentificacao() {
		return etiquetadoIdentificacao;
	}

	public void setEtiquetadoIdentificacao(Boolean etiquetadoIdentificacao) {
		this.etiquetadoIdentificacao = etiquetadoIdentificacao;
	}

	public Boolean getEmbalagemIntegra() {
		return embalagemIntegra;
	}

	public void setEmbalagemIntegra(Boolean embalagemIntegra) {
		this.embalagemIntegra = embalagemIntegra;
	}

	public Boolean getEmbalagemSuja() {
		return embalagemSuja;
	}

	public void setEmbalagemSuja(Boolean embalagemSuja) {
		this.embalagemSuja = embalagemSuja;
	}

	public Boolean getEmbalagemUmida() {
		return embalagemUmida;
	}

	public void setEmbalagemUmida(Boolean embalagemUmida) {
		this.embalagemUmida = embalagemUmida;
	}

	public Boolean getEmbalagemDeformada() {
		return embalagemDeformada;
	}

	public void setEmbalagemDeformada(Boolean embalagemDeformada) {
		this.embalagemDeformada = embalagemDeformada;
	}

	public Boolean getEmbalagemVazando() {
		return embalagemVazando;
	}

	public void setEmbalagemVazando(Boolean embalagemVazando) {
		this.embalagemVazando = embalagemVazando;
	}

	public Boolean getEmbalagemLacreViolado() {
		return embalagemLacreViolado;
	}

	public void setEmbalagemLacreViolado(Boolean embalagemLacreViolado) {
		this.embalagemLacreViolado = embalagemLacreViolado;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public int getNumeroConhecimento() {
		return numeroConhecimento;
	}

	public void setNumeroConhecimento(int numeroConhecimento) {
		this.numeroConhecimento = numeroConhecimento;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Funcionario getConferente() {
		return conferente;
	}

	public void setConferente(Funcionario conferente) {
		this.conferente = conferente;
	}

	public List<Documento> getAnexoFotos() {
		return anexoFotos;
	}

	public void setAnexoFotos(List<Documento> anexoFotos) {
		this.anexoFotos = anexoFotos;
	}

	public Boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}
}
