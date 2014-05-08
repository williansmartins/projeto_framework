package br.com.fiap.pattern.atividade.exe;

import java.math.BigDecimal;
import java.util.Calendar;

import br.com.fiap.pattern.atividade.CartaoHandlerFactory;
import br.com.fiap.pattern.atividade.ICartaoHandler;

public class TesteCartao {

	public static void main(String[] args) throws Exception {
		String codigoCartao = "002";
		
		if(CartaoHandlerFactory.isCartaoSuportado(codigoCartao)){
			ICartaoHandler cartao = CartaoHandlerFactory.get(CartaoHandlerFactory.valueOfByCodigo(codigoCartao));
			System.out.println(cartao.gerarCartao("Alberto Cerqueira", Calendar.getInstance(), Calendar.getInstance(), 1000, new BigDecimal(100), "Debito"));
		}
	}
}