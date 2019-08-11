package br.ufrn.imd.dominio.Estoque;

import java.util.List;

import br.ufrn.imd.dominio.RH.Usuario;

/**
 * Classe que representa o almoxarifado.
 * @author bryan
 *
 */
public class Almoxarifado {
	private String nome;
	private Usuario chefe;
	private List<TipoMaterial> tiposMateriais;
	private List<Usuario> usuarioAlmoxarifado;
	private Boolean enderecado;
	private List<LocalizacaoAlmoxarifado> localizacoes;

	public Almoxarifado() {}

	public Almoxarifado(String nome, Usuario chefe, List<TipoMaterial> tiposMateriais,
			List<Usuario> usuarioAlmoxarifado, Boolean enderecado, List<LocalizacaoAlmoxarifado> localizacoes) {
		this.nome = nome;
		this.chefe = chefe;
		this.tiposMateriais = tiposMateriais;
		this.usuarioAlmoxarifado = usuarioAlmoxarifado;
		this.enderecado = enderecado;
		this.localizacoes = localizacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getChefe() {
		return chefe;
	}

	public void setChefe(Usuario chefe) {
		this.chefe = chefe;
	}

	public List<TipoMaterial> getTiposMateriais() {
		return tiposMateriais;
	}

	public void setTiposMateriais(List<TipoMaterial> tiposMateriais) {
		this.tiposMateriais = tiposMateriais;
	}

	public List<Usuario> getUsuarioAlmoxarifado() {
		return usuarioAlmoxarifado;
	}

	public void setUsuarioAlmoxarifado(List<Usuario> usuarioAlmoxarifado) {
		this.usuarioAlmoxarifado = usuarioAlmoxarifado;
	}

	public Boolean getEnderecado() {
		return enderecado;
	}

	public void setEnderecado(Boolean enderecado) {
		this.enderecado = enderecado;
	}

	public List<LocalizacaoAlmoxarifado> getLocalizacoes() {
		return localizacoes;
	}

	public void setLocalizacoes(List<LocalizacaoAlmoxarifado> localizacoes) {
		this.localizacoes = localizacoes;
	}
}
