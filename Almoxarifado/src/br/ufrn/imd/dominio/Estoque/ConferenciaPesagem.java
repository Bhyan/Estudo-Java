package br.ufrn.imd.dominio.Estoque;

import java.util.Date;
import java.util.List;

/**
 * Classe que representa a conferencia pois pesagem do material. 
 * @author bryan
 *
 */
public class ConferenciaPesagem {
	private Date data;
	private LoteMaterial lote;
	private int numeroVolumes;
	private double taraKg;
	private int pesoVolumes;
	private boolean executado;
	private boolean conferido;
	private List<PesagemVolume> passagemVolume;

	public ConferenciaPesagem() {}
	
	public ConferenciaPesagem(Date data, LoteMaterial lote, int numeroVolumes, double taraKg, int pesoVolumes,
			boolean executado, boolean conferido, List<PesagemVolume> passagemVolume) 
	{
		this.data = data;
		this.lote = lote;
		this.numeroVolumes = numeroVolumes;
		this.taraKg = taraKg;
		this.pesoVolumes = pesoVolumes;
		this.executado = executado;
		this.conferido = conferido;
		this.passagemVolume = passagemVolume;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getNumeroVolumes() {
		return numeroVolumes;
	}

	public void setNumeroVolumes(int numeroVolumes) {
		this.numeroVolumes = numeroVolumes;
	}

	public double getTaraKg() {
		return taraKg;
	}

	public void setTaraKg(double taraKg) {
		this.taraKg = taraKg;
	}

	public int getPesoVolumes() {
		return pesoVolumes;
	}

	public void setPesoVolumes(int pesoVolumes) {
		this.pesoVolumes = pesoVolumes;
	}

	public boolean isExecutado() {
		return executado;
	}

	public void setExecutado(boolean executado) {
		this.executado = executado;
	}

	public boolean isConferido() {
		return conferido;
	}

	public void setConferido(boolean conferido) {
		this.conferido = conferido;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public List<PesagemVolume> getPassagemVolume() {
		return passagemVolume;
	}

	public void setPassagemVolume(List<PesagemVolume> passagemVolume) {
		this.passagemVolume = passagemVolume;
	}
}