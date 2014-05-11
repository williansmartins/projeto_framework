package br.com.fiap.pattern.atividade.bancos;

import java.math.BigDecimal;
import java.util.Calendar;

public class TesteCartaoAbstractFactory {

	public static void main(String[] args) throws Exception {
		AbstractFactory af = new CartaoFactory();
		IBradesco cartaoHandler = af.getIBradesco("001");
		Calendar dataVencimento = Calendar.getInstance();
		dataVencimento.add(Calendar.YEAR, 2);
		Cartao cartao = cartaoHandler.gerarCartao("Alberto", Calendar.getInstance(), dataVencimento, 100, new BigDecimal(5000), "Credito");
		System.out.println("Cart\u00e3o Gerado com Sucesso: " + cartao.toString());
	}
}