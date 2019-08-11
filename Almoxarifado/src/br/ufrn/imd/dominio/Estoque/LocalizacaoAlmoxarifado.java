package br.ufrn.imd.dominio.Estoque;

/**
 * Classe que representa a localização do almoxarifado.
 * @author bryan
 *
 */
public class LocalizacaoAlmoxarifado {
	private String localizacao;

	public LocalizacaoAlmoxarifado() {}

	public LocalizacaoAlmoxarifado(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
}
