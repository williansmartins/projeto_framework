package br.com.fiap.pattern.atividade.bancos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Cartao implements Serializable {

	private static final long serialVersionUID = -3392513954330652776L;
	private Long id;
	private String nomeCliente;
	private Calendar dataEmissao;
	private Calendar dataVencimento;
	private Integer pontos;
	private BigDecimal valorLimite;
	private String nomeCartao;
	private String codigoCartao;
	private String tipoCartao;
	
	public Cartao(){}
	public Cartao(String nomeCliente, Calendar dataEmissao, Calendar dataVencimento, Integer pontos, BigDecimal valorLimite, String tipoCartao){
		this.nomeCliente = nomeCliente;
		this.dataEmissao = dataEmissao;
		this.dataVencimento = dataVencimento;
		this.pontos = pontos;
		this.valorLimite = valorLimite;
		this.tipoCartao = tipoCartao;
	}
	public Cartao(String nomeCliente, Calendar dataEmissao, Calendar dataVencimento, Integer pontos, BigDecimal valorLimite, String nomeCartao, String codigoCartao, String tipoCartao){
		this.nomeCliente = nomeCliente;
		this.dataEmissao = dataEmissao;
		this.dataEmissao = dataEmissao;
		this.dataVencimento = dataVencimento;
		this.pontos = pontos;
		this.valorLimite = valorLimite;
		this.nomeCartao = nomeCartao;
		this.codigoCartao = codigoCartao;
		this.tipoCartao = tipoCartao;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Calendar getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getDataEmissaoFormatada(){
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt", "BR"));
        return format.format(dataEmissao.getTime());
	}
	public Calendar getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getDataVencimentoFormatada(){
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt", "BR"));
        return format.format(dataVencimento.getTime());
	}
	public Integer getPontos() {
		return pontos;
	}
	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
	public BigDecimal getValorLimite() {
		return valorLimite;
	}
	public void setValorLimite(BigDecimal valorLimite) {
		this.valorLimite = valorLimite;
	}
	public String getNomeCartao() {
		return nomeCartao;
	}
	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}
	public String getCodigoCartao() {
		return codigoCartao;
	}
	public void setCodigoCartao(String codigoCartao) {
		this.codigoCartao = codigoCartao;
	}
	public String getTipoCartao() {
		return tipoCartao;
	}
	public void setTipoCartao(String tipoCartao) {
		this.tipoCartao = tipoCartao;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Cartao [id=" + id + ", nomeCliente=" + nomeCliente + ", dataEmissao=" + getDataEmissaoFormatada() + ", dataVencimento=" + getDataVencimentoFormatada() + ", pontos=" + pontos + ", valorLimite=" + valorLimite + ", nomeCartao=" + nomeCartao + ", codigoCartao=" + codigoCartao + ", tipoCartao=" + tipoCartao + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartao other = (Cartao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}