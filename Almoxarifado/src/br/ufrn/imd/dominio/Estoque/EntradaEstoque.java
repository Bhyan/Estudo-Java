package br.ufrn.imd.dominio.Estoque;

import java.util.Date;
import java.util.List;

import br.ufrn.imd.dominio.Producao.Documento;
import br.ufrn.imd.dominio.Producao.MovimentacaoEntrada;
import br.ufrn.imd.dominio.RH.Usuario;

/**
 * Classe que representa a entrada no estoque de materiais.
 * @author bryan
 *
 */
public class EntradaEstoque {
	private String codigo;
	private List<MovimentacaoEntrada> item;
	private StatusMovimentacao status;
	private String observacao;
	private Usuario responsavel;
	private Date dataCriacao;
	private Date dataEntrada;
	private List<Documento> anexos;
	private Boolean precisaConferenciaEstado;
	private Boolean precisaPesagem;
	private Boolean precisaAnalise;
	private NotaFiscal notafiscal;
	private ChecklistRecebimentoComum checklistRecebimentoComum;
	private ConferenciaPesagem conferenciaPesagem;
	private ChecklistTransferencia checklistTransferencia;
	private String justificativa;
	private TipoEntrada tipoEntrada;

	public EntradaEstoque() {}

	public EntradaEstoque(String codigo, List<MovimentacaoEntrada> item, StatusMovimentacao status, String observacao,
			Usuario responsavel, Date dataCriacao, Date dataEntrada, List<Documento> anexos,
			Boolean precisaConferenciaEstado, Boolean precisaPesagem, Boolean precisaAnalise, NotaFiscal notafiscal,
			ChecklistRecebimentoComum checklistRecebimentoComum, ChecklistTransferencia checklistTransferencia,
			String justificativa, TipoEntrada tipoEntrada) 
	{
		this.codigo = codigo;
		this.item = item;
		this.status = status;
		this.observacao = observacao;
		this.responsavel = responsavel;
		this.dataCriacao = dataCriacao;
		this.dataEntrada = dataEntrada;
		this.anexos = anexos;
		this.precisaConferenciaEstado = precisaConferenciaEstado;
		this.precisaPesagem = precisaPesagem;
		this.precisaAnalise = precisaAnalise;
		this.notafiscal = notafiscal;
		this.checklistRecebimentoComum = checklistRecebimentoComum;
		this.checklistTransferencia = checklistTransferencia;
		this.justificativa = justificativa;
		this.tipoEntrada = tipoEntrada;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<MovimentacaoEntrada> getItem() {
		return item;
	}

	public void setItem(List<MovimentacaoEntrada> item) {
		this.item = item;
	}

	public StatusMovimentacao getStatus() {
		return status;
	}

	public void setStatus(StatusMovimentacao status) {
		this.status = status;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public List<Documento> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Documento> anexos) {
		this.anexos = anexos;
	}

	public Boolean getPrecisaConferenciaEstado() {
		return precisaConferenciaEstado;
	}

	public void setPrecisaConferenciaEstado(Boolean precisaConferenciaEstado) {
		this.precisaConferenciaEstado = precisaConferenciaEstado;
	}

	public Boolean getPrecisaPesagem() {
		return precisaPesagem;
	}

	public void setPrecisaPesagem(Boolean precisaPesagem) {
		this.precisaPesagem = precisaPesagem;
	}

	public Boolean getPrecisaAnalise() {
		return precisaAnalise;
	}

	public void setPrecisaAnalise(Boolean precisaAnalise) {
		this.precisaAnalise = precisaAnalise;
	}

	public NotaFiscal getNotafiscal() {
		return notafiscal;
	}

	public void setNotafiscal(NotaFiscal notafiscal) {
		this.notafiscal = notafiscal;
	}

	public ChecklistRecebimentoComum getChecklistRecebimentoComum() {
		return checklistRecebimentoComum;
	}

	public void setChecklistRecebimentoComum(ChecklistRecebimentoComum checklistRecebimentoComum) {
		this.checklistRecebimentoComum = checklistRecebimentoComum;
	}

	public ChecklistTransferencia getChecklistTransferencia() {
		return checklistTransferencia;
	}

	public void setChecklistTransferencia(ChecklistTransferencia checklistTransferencia) {
		this.checklistTransferencia = checklistTransferencia;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public TipoEntrada getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(TipoEntrada tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public ConferenciaPesagem getConferenciaPesagem() {
		return conferenciaPesagem;
	}

	public void setConferenciaPesagem(ConferenciaPesagem conferenciaPesagem) {
		this.conferenciaPesagem = conferenciaPesagem;
	}
}
