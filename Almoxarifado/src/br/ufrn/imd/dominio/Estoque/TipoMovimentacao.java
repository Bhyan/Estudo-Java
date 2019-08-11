package br.ufrn.imd.dominio.Estoque;

public enum TipoMovimentacao {
    ENTRADA (0),
    SAIDA (1),
    TRANSFERENCIA (2);
    
    private int tipoMovimentacao;

    private TipoMovimentacao(int tipoMovimentacao) {
	this.tipoMovimentacao = tipoMovimentacao;
    }
}
