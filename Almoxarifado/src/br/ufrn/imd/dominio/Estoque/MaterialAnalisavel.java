package br.ufrn.imd.dominio.Estoque;

import java.math.BigDecimal;

import br.ufrn.imd.dominio.Producao.DenominacaoComumBrasileira;
import br.ufrn.imd.dominio.Producao.Documento;

/**
 * Classe que representa os materiais analizaveis.
 * @author bryan
 *
 */
public class MaterialAnalisavel {
	private BigDecimal teorConcentracao;
	private int prazoEntrega;
	private DenominacaoComumBrasileira dcb;
	private String apresentacaoFarmaceutica;
	private BigDecimal volumeMinimo;
	private Documento fichaSeguranca;
	private long registroAnvisa;
	private BigDecimal qtdAmostraAnalise;
	private int tempoLimiteAnalise;
	private int testeMaquina;
	private Material material;

	public MaterialAnalisavel() {}

	public MaterialAnalisavel(BigDecimal teorConcentracao, int prazoEntrega, DenominacaoComumBrasileira dcb,
			String apresentacaoFarmaceutica, BigDecimal volumeMinimo, Documento fichaSeguranca, long registroAnvisa,
			BigDecimal qtdAmostraAnalise, int tempoLimiteAnalise, int testeMaquina, Material material) {
		this.teorConcentracao = teorConcentracao;
		this.prazoEntrega = prazoEntrega;
		this.dcb = dcb;
		this.apresentacaoFarmaceutica = apresentacaoFarmaceutica;
		this.volumeMinimo = volumeMinimo;
		this.fichaSeguranca = fichaSeguranca;
		this.registroAnvisa = registroAnvisa;
		this.qtdAmostraAnalise = qtdAmostraAnalise;
		this.tempoLimiteAnalise = tempoLimiteAnalise;
		this.testeMaquina = testeMaquina;
		this.material = material;
	}

	public BigDecimal getTeorConcentracao() {
		return teorConcentracao;
	}

	public void setTeorConcentracao(BigDecimal teorConcentracao) {
		this.teorConcentracao = teorConcentracao;
	}

	public int getPrazoEntrega() {
		return prazoEntrega;
	}

	public void setPrazoEntrega(int prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}

	public DenominacaoComumBrasileira getDcb() {
		return dcb;
	}

	public void setDcb(DenominacaoComumBrasileira dcb) {
		this.dcb = dcb;
	}

	public String getApresentacaoFarmaceutica() {
		return apresentacaoFarmaceutica;
	}

	public void setApresentacaoFarmaceutica(String apresentacaoFarmaceutica) {
		this.apresentacaoFarmaceutica = apresentacaoFarmaceutica;
	}

	public BigDecimal getVolumeMinimo() {
		return volumeMinimo;
	}

	public void setVolumeMinimo(BigDecimal volumeMinimo) {
		this.volumeMinimo = volumeMinimo;
	}

	public Documento getFichaSeguranca() {
		return fichaSeguranca;
	}

	public void setFichaSeguranca(Documento fichaSeguranca) {
		this.fichaSeguranca = fichaSeguranca;
	}

	public long getRegistroAnvisa() {
		return registroAnvisa;
	}

	public void setRegistroAnvisa(long registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}

	public BigDecimal getQtdAmostraAnalise() {
		return qtdAmostraAnalise;
	}

	public void setQtdAmostraAnalise(BigDecimal qtdAmostraAnalise) {
		this.qtdAmostraAnalise = qtdAmostraAnalise;
	}

	public int getTempoLimiteAnalise() {
		return tempoLimiteAnalise;
	}

	public void setTempoLimiteAnalise(int tempoLimiteAnalise) {
		this.tempoLimiteAnalise = tempoLimiteAnalise;
	}

	public int getTesteMaquina() {
		return testeMaquina;
	}

	public void setTesteMaquina(int testeMaquina) {
		this.testeMaquina = testeMaquina;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
}
