package br.ufrn.imd.dominio.Estoque;

/**
 * Classe que representa os grupos de materiais.
 * @author bryan
 *
 */
public class GrupoMaterial {
	private String nome;
	private String descricao;
	private String codigo;
	private TipoMaterial tipo;

	public GrupoMaterial() {}

	public GrupoMaterial(String nome, String descricao, String codigo, TipoMaterial tipo) {
		this.nome = nome;
		this.descricao = descricao;
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public TipoMaterial getTipo() {
		return tipo;
	}

	public void setTipo(TipoMaterial tipo) {
		this.tipo = tipo;
	}
}
