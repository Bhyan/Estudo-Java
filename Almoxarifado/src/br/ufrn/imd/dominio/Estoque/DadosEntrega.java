package br.ufrn.imd.dominio.Estoque;

import br.ufrn.imd.dominio.RH.Contato;
import br.ufrn.imd.dominio.RH.Endereco;

/**
 * Classe que representa os dados da entrega do material.
 * @author bryan
 *
 */
public class DadosEntrega {
	private Endereco endereco;
	private String local;
	private Contato contato;

	public DadosEntrega() {	}

	public DadosEntrega(Endereco endereco, String local, Contato contato) {
		this.endereco = endereco;
		this.local = local;
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
}
