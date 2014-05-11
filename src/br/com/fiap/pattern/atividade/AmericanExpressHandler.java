package br.com.fiap.pattern.atividade;

import java.math.BigDecimal;
import java.util.Calendar;

public class AmericanExpressHandler implements ICartaoHandler {

	public static AmericanExpressHandler instance = null;
	
	public static AmericanExpressHandler getInstance(){
		if(instance == null){
			instance = new AmericanExpressHandler();
		}
		return instance;
	}
	
	@Override
	public Cartao gerarCartao(String nomeCliente, Calendar dataEmissao, Calendar dataVencimento, Integer pontos, BigDecimal valorLimite, String tipoCartao) {
		Cartao cartao = new Cartao(nomeCliente, dataEmissao, dataVencimento, pontos, valorLimite, tipoCartao);
		cartao.setCodigoCartao(CartaoEnum.AmericanExpress.getCodigo());
		cartao.setNomeCartao(CartaoEnum.AmericanExpress.name());
		return cartao;
	}
}