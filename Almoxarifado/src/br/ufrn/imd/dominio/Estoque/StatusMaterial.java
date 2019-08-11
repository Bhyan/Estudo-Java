package br.ufrn.imd.dominio.Estoque;

public enum StatusMaterial {
	ATIVO(0),
	INATIVO(1);

	private int statusMaterial;

	private StatusMaterial(int statusMaterial) {
		this.statusMaterial = statusMaterial;
	}
}
