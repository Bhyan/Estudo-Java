package br.ufrn.imd.dominio.Estoque;

import java.math.BigDecimal;

import br.ufrn.imd.dominio.RH.Usuario;

/**
 * Classe que representa a reserva de materiais.
 * @author bryan
 *
 */
public class ReservaMaterial {
	private BigDecimal qtd;
	private Material material;
	private Usuario solicitante;

	public ReservaMaterial() {}

	public ReservaMaterial(BigDecimal qtd, Material material, Usuario solicitante) {
		this.qtd = qtd;
		this.material = material;
		this.solicitante = solicitante;
	}

	public BigDecimal getQtd() {
		return qtd;
	}

	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Usuario getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Usuario solicitante) {
		this.solicitante = solicitante;
	}
}
