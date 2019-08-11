package br.ufrn.imd.dominio.Estoque;

/**
 * Enum que representa os status de um novo lote.
 * @author bryan
 *
 */
public enum EstadoLote {
	QUARENTENA (0),
	APROVADO (1),
	REPROVADO (2),
	PENDENTE (3);
	
	private int estadoLote;

	private EstadoLote(int estadoLote) {
		this.estadoLote = estadoLote;
	}
}
