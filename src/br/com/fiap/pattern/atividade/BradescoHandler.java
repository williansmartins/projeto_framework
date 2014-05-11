package br.com.fiap.pattern.atividade;

import java.math.BigDecimal;
import java.util.Calendar;

public class BradescoHandler implements ICartaoHandler {

	public static MasterCardHandler instance = null;
	
	public static MasterCardHandler getInstance(){
		if(instance == null){
			instance = new MasterCardHandler();
		}
		return instance;
	}
	
	@Override
	public Cartao gerarCartao(String nomeCliente, Calendar dataEmissao, Calendar dataVencimento, Integer pontos, BigDecimal valorLimite, String tipoCartao) {
		Cartao cartao = new Cartao(nomeCliente, dataEmissao, dataVencimento, pontos, valorLimite, tipoCartao);
		cartao.setCodigoCartao(CartaoEnum.Bradesco.getCodigo());
		cartao.setNomeCartao(CartaoEnum.Bradesco.name());
		return cartao;
	}
}