package br.ufrn.imd.dominio.Estoque;

import java.math.BigDecimal;
import java.util.Date;

import br.ufrn.imd.dominio.RH.PessoaJuridica;

/**
 * Classe que representa uma nota fiscal.
 * @author bryan
 *
 */
public class NotaFiscal {
	private int serieNF;
	private int numeroNF;
	private PessoaJuridica transportadora;
	private String motorista;
	private String placaVeiculo;
	private Date dataEmissao;
	private PessoaJuridica emitente;
	private PessoaJuridica destinatario;
	private BigDecimal valorTotal;
	
	public NotaFiscal() {}

	public NotaFiscal(int serieNF, int numeroNF, PessoaJuridica transportadora, String motorista, String placaVeiculo,
			Date dataEmissao, PessoaJuridica emitente, PessoaJuridica destinatario, BigDecimal valorTotal) 
	{
		this.serieNF = serieNF;
		this.numeroNF = numeroNF;
		this.transportadora = transportadora;
		this.motorista = motorista;
		this.placaVeiculo = placaVeiculo;
		this.dataEmissao = dataEmissao;
		this.emitente = emitente;
		this.destinatario = destinatario;
		this.valorTotal = valorTotal;
	}

	public int getSerieNF() {
		return serieNF;
	}

	public void setSerieNF(int serieNF) {
		this.serieNF = serieNF;
	}

	public int getNumeroNF() {
		return numeroNF;
	}

	public void setNumeroNF(int numeroNF) {
		this.numeroNF = numeroNF;
	}

	public PessoaJuridica getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public PessoaJuridica getEmitente() {
		return emitente;
	}

	public void setEmitente(PessoaJuridica emitente) {
		this.emitente = emitente;
	}

	public PessoaJuridica getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(PessoaJuridica destinatario) {
		this.destinatario = destinatario;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}	
}
