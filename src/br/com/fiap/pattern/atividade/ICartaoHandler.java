package br.com.fiap.pattern.atividade;

import java.math.BigDecimal;
import java.util.Calendar;

public interface ICartaoHandler {

	public Cartao gerarCartao(String nomeCliente, Calendar dataEmissao, Calendar dataVencimento, Integer pontos, BigDecimal valorLimite, String tipoCartao);
}