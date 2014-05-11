package br.com.fiap.pattern.atividade.bancos;

import java.math.BigDecimal;
import java.util.Calendar;

public interface IBradesco {

	public Cartao gerarCartao(String nomeCliente, Calendar dataEmissao, Calendar dataVencimento, Integer pontos, BigDecimal valorLimite, String tipoCartao);
}