package br.ufrn.imd.dominio.Estoque;

/**
 * Classe para mapear a pesagem de um volume.
 * @author bryan
 *
 */
public class PesagemVolume {
	private double peso;
	
	public PesagemVolume() {
	}

	public PesagemVolume(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}