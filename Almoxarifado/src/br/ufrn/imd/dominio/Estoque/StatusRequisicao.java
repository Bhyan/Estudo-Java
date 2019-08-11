package br.ufrn.imd.dominio.Estoque;

public enum StatusRequisicao {
	CADASTRADA (0),
	EM_ANALISE (1),
	REPROVADA_CHEFE_SETOR (2),
	ENVIADA (3),
	ATENDIDA (4),
	ATENDIDA_PARCIALMENTE (5),
	NEGADA (6);
	
	private int statusRequisicao;

	private StatusRequisicao(int statusRequisicao) {
		this.statusRequisicao = statusRequisicao;
	}
}
