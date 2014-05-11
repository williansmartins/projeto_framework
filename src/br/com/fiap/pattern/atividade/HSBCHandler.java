package br.com.fiap.pattern.atividade;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HSBCHandler implements ICartaoHandler {

	public static MasterCardHandler instance = null;
	
	public static MasterCardHandler getInstance(){
		if(instance == null){
			instance = new MasterCardHandler();
		}
		return instance;
	}
	
	@Override
	public Cartao gerarCartao(String nomeCliente, Calendar dataEmissao, Calendar dataVencimento, Integer pontos, BigDecimal valorLimite, String tipoCartao) {
		System.out.println("Gerando Cart\u00e3o: ");
		System.out.println("Detalhes:");
		System.out.println("Codigo: " + CartaoEnum.HSBC.getCodigo());
		System.out.println("Nome: " + CartaoEnum.HSBC.name());
		System.out.println("Nome do Cliente: " + nomeCliente);
		System.out.println("Pontos: " + pontos);
		System.out.println("Valor Limite: " + valorLimite);
		System.out.println("Tipo do Cart\u00e3o:" + tipoCartao);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data de Vencimento: " + format.format(dataVencimento.getTime()));
		Cartao cartao = new Cartao(nomeCliente, dataEmissao, dataVencimento, pontos, valorLimite, tipoCartao);
		cartao.setCodigoCartao(CartaoEnum.HSBC.getCodigo());
		cartao.setNomeCartao(CartaoEnum.HSBC.name());
		return cartao;
	}
}