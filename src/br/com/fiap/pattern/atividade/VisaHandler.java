package br.com.fiap.pattern.atividade;

import java.math.BigDecimal;
import java.util.Calendar;

public class VisaHandler implements ICartaoHandler {

	public static VisaHandler instance = null;
	
	public static VisaHandler getInstance(){
		if(instance == null){
			instance = new VisaHandler();
		}
		return instance;
	}
	
	@Override
	public Cartao gerarCartao(String nomeCliente, Calendar dataEmissao, Calendar dataVencimento, Integer pontos, BigDecimal valorLimite, String tipoCartao) {
		Cartao cartao = new Cartao(nomeCliente, dataEmissao, dataVencimento, pontos, valorLimite, tipoCartao);
		cartao.setCodigoCartao(CartaoEnum.VISA.getCodigo());
		cartao.setNomeCartao(CartaoEnum.VISA.name());
		return cartao;
	}
}