package br.com.fiap.pattern.atividade.bancos;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AmericanExpressHSBC implements IHSBC {

	public static AmericanExpressHSBC instance = null;
	
	public static AmericanExpressHSBC getInstance(){
		if(instance == null){
			instance = new AmericanExpressHSBC();
		}
		return instance;
	}
	
	@Override
	public Cartao gerarCartao(String nomeCliente, Calendar dataEmissao, Calendar dataVencimento, Integer pontos, BigDecimal valorLimite, String tipoCartao) {
		System.out.println("Gerando Cart\u00e3o: ");
		System.out.println("Detalhes:");
		System.out.println("Codigo: " + CartaoEnum.AmericanExpress.getCodigo());
		System.out.println("Nome: " + CartaoEnum.AmericanExpress.name());
		System.out.println("Banco: HSBC");
		System.out.println("Nome do Cliente: " + nomeCliente);
		System.out.println("Pontos: " + pontos);
		System.out.println("Valor Limite: " + valorLimite);
		System.out.println("Tipo do Cart\u00e3o:" + tipoCartao);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data de Vencimento: " + format.format(dataVencimento.getTime()));
		Cartao cartao = new Cartao(nomeCliente, dataEmissao, dataVencimento, pontos, valorLimite, tipoCartao);
		cartao.setCodigoCartao(CartaoEnum.AmericanExpress.getCodigo());
		cartao.setNomeCartao(CartaoEnum.AmericanExpress.name());
		return cartao;
	}
}