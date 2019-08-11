package br.ufrn.imd.dominio.Estoque;

public enum StatusMovimentacao {
	ABERTO (0),
	FECHADO (1);
	
	private int status;
	
	StatusMovimentacao(int status){
		this.status = status;
	}
}