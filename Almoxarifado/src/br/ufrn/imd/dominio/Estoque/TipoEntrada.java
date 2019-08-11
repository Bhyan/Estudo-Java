package br.ufrn.imd.dominio.Estoque;

public enum TipoEntrada {
	ENTRADA_NOTA_FISCAL (0),
	ENTRADA_TRANSFERENCIA (1),
	ENTRADA_AVULSA (3);
	
	private int entrada;

	TipoEntrada(int entrada) {
		this.entrada = entrada;
	}
}