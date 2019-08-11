package br.ufrn.imd.dominio.Estoque;

public enum TipoEstoque {
	LOTE (0),
	MATERIAL (1);
	
	private int tipoEstoque;

	private TipoEstoque(int tipoEstoque) {
		this.tipoEstoque = tipoEstoque;
	}
}
