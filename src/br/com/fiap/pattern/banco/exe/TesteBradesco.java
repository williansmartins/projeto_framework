package br.com.fiap.pattern.banco.exe;

import br.com.fiap.pattern.banco.BancoHandlerFactory;
import br.com.fiap.pattern.banco.IBancoHandler;

public class TesteBradesco {

	public static void main(String[] args) throws Exception {
		String codigoBanco = "237";
		
		if(BancoHandlerFactory.isBancoSuportado(codigoBanco)){
			IBancoHandler banco = BancoHandlerFactory.get(BancoHandlerFactory.valueOfByCodigo(codigoBanco));
			System.out.println(banco.gerarCodigoBarra(12, 34, 56, 78, 9));
		}
	}
}