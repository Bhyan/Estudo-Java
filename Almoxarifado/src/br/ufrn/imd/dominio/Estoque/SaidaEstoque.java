package br.ufrn.imd.dominio.Estoque;

import java.util.Date;
import java.util.List;

import br.ufrn.imd.dominio.Producao.Documento;
import br.ufrn.imd.dominio.Producao.MovimentacaoSaida;
import br.ufrn.imd.dominio.RH.PessoaJuridica;
import br.ufrn.imd.dominio.RH.Usuario;

/**
 * Classe que representa a saida de material do estoque.
 * @author bryan
 *
 */
public class SaidaEstoque {
	private Usuario responsavel;
	private Date dataEnvio;
	private Date dataCriacao;
	private List<MovimentacaoSaida> item;
	private StatusMovimentacao status;
	private String observacao;
	private PessoaJuridica transpotadora;
	private List<Documento> anexos;
	private GuiaRemessa guiaRemessa;
	private PessoaJuridica pjDestinatario;
	private String justificativa;

	public SaidaEstoque() { }

	public SaidaEstoque(Usuario responsavel, Date dataEnvio, Date dataCriacao, List<MovimentacaoSaida> item,
			StatusMovimentacao status, String observacao, PessoaJuridica transpotadora, List<Documento> anexos,
			GuiaRemessa guiaRemessa, PessoaJuridica pjDestinatario, String justificativa) {
		this.responsavel = responsavel;
		this.dataEnvio = dataEnvio;
		this.dataCriacao = dataCriacao;
		this.item = item;
		this.status = status;
		this.observacao = observacao;
		this.transpotadora = transpotadora;
		this.anexos = anexos;
		this.guiaRemessa = guiaRemessa;
		this.pjDestinatario = pjDestinatario;
		this.justificativa = justificativa;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<MovimentacaoSaida> getItem() {
		return item;
	}

	public void setItem(List<MovimentacaoSaida> item) {
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

	public PessoaJuridica getTranspotadora() {
		return transpotadora;
	}

	public void setTranspotadora(PessoaJuridica transpotadora) {
		this.transpotadora = transpotadora;
	}

	public List<Documento> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Documento> anexos) {
		this.anexos = anexos;
	}

	public GuiaRemessa getGuiaRemessa() {
		return guiaRemessa;
	}

	public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
		this.guiaRemessa = guiaRemessa;
	}

	public PessoaJuridica getPjDestinatario() {
		return pjDestinatario;
	}

	public void setPjDestinatario(PessoaJuridica pjDestinatario) {
		this.pjDestinatario = pjDestinatario;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

}