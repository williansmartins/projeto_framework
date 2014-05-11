package br.com.fiap.pattern.atividade.bancos;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class VisaHSBC implements IHSBC {

	public static VisaHSBC instance = null;
	
	public static VisaHSBC getInstance(){
		if(instance == null){
			instance = new VisaHSBC();
		}
		return instance;
	}
	
	@Override
	public Cartao gerarCartao(String nomeCliente, Calendar dataEmissao, Calendar dataVencimento, Integer pontos, BigDecimal valorLimite, String tipoCartao) {
		System.out.println("Gerando Cart\u00e3o: ");
		System.out.println("Detalhes:");
		System.out.println("Codigo: " + CartaoEnum.VISA.getCodigo());
		System.out.println("Nome: " + CartaoEnum.VISA.name());
		System.out.println("Banco: HSBC");
		System.out.println("Nome do Cliente: " + nomeCliente);
		System.out.println("Pontos: " + pontos);
		System.out.println("Valor Limite: " + valorLimite);
		System.out.println("Tipo do Cart\u00e3o:" + tipoCartao);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data de Vencimento: " + format.format(dataVencimento.getTime()));
		System.out.println("\n");
		Cartao cartao = new Cartao(nomeCliente, dataEmissao, dataVencimento, pontos, valorLimite, tipoCartao);
		cartao.setCodigoCartao(CartaoEnum.VISA.getCodigo());
		cartao.setNomeCartao(CartaoEnum.VISA.name());
		return cartao;
	}
}