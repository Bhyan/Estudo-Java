package br.ufrn.imd.dominio.Estoque;

public enum ViaTransporte {
	RODOVIARIO (0),
	FERROVIARIO (1),
	MARITIMO (2),
	AEREO (3);
	
	private int viaTransporte;

	private ViaTransporte(int viaTransporte) {
		this.viaTransporte = viaTransporte;
	}
}