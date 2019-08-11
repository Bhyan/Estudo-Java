package br.ufrn.imd.dominio.Estoque;

public enum TipoMaterial {
	MEDICAMENTO (0),
	MATERIA_PRIMA (1),
	EMBALAGEM (2),
	REAGENTE (3),
	EQUIPAMENTO (4),
	EXPEDIENTE (5),
	OUTROS (6);
	
	private int tipoMaterial;

	private TipoMaterial(int tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
}
