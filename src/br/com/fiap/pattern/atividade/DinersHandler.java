package br.com.fiap.pattern.atividade;

import java.math.BigDecimal;
import java.util.Calendar;

public class DinersHandler implements ICartaoHandler {

	public static DinersHandler instance = null;
	
	public static DinersHandler getInstance(){
		if(instance == null){
			instance = new DinersHandler();
		}
		return instance;
	}
	
	@Override
	public Cartao gerarCartao(String nomeCliente, Calendar dataEmissao, Calendar dataVencimento, Integer pontos, BigDecimal valorLimite, String tipoCartao) {
		Cartao cartao = new Cartao(nomeCliente, dataEmissao, dataVencimento, pontos, valorLimite, tipoCartao);
		cartao.setCodigoCartao(CartaoEnum.Diners.getCodigo());
		cartao.setNomeCartao(CartaoEnum.Diners.name());
		return cartao;
	}
}