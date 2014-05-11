package br.com.fiap.pattern.atividade.exe;

import java.math.BigDecimal;
import java.util.Calendar;

import br.com.fiap.pattern.atividade.AbstractFactory;
import br.com.fiap.pattern.atividade.Cartao;
import br.com.fiap.pattern.atividade.CartaoFactory;
import br.com.fiap.pattern.atividade.ICartaoHandler;

public class TesteCartaoAbstractFactory {

	public static void main(String[] args) throws Exception {
		AbstractFactory af = new CartaoFactory();
		ICartaoHandler cartaoHandler = af.getICartaoHandler("001");
		Calendar dataVencimento = Calendar.getInstance();
		dataVencimento.add(Calendar.YEAR, 2);
		Cartao cartao = cartaoHandler.gerarCartao("Alberto", Calendar.getInstance(), dataVencimento, 100, new BigDecimal(5000), "Credito");
		System.out.println("Cart\u00e3o Gerado com Sucesso: " + cartao.toString());
	}
}