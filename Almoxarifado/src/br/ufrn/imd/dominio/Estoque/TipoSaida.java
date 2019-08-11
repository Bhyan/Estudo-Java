package br.ufrn.imd.dominio.Estoque;

public enum TipoSaida {
	SAIDA_GUIA_REMESSA(0),
	SAIDA_AVULSA(1),
	SAIDA_REQUISICAO_INTERNA(2);

	private int tipoSaida;

	private TipoSaida(int tipoSaida) {
		this.tipoSaida = tipoSaida;
	}
}
