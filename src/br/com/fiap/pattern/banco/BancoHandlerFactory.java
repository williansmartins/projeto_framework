package br.com.fiap.pattern.banco;

import java.util.HashMap;
import java.util.Map;

public class BancoHandlerFactory {

	private static Map<BancoEnum, IBancoHandler> bancoHandlers = new HashMap<BancoEnum, IBancoHandler>();
	static {
		bancoHandlers.put(BancoEnum.BRASIL, BrasilHandler.getInstance());
		bancoHandlers.put(BancoEnum.ITAU, ItauHandler.getInstance());
		bancoHandlers.put(BancoEnum.SANTANDER, SantanderHandler.getInstance());
		bancoHandlers.put(BancoEnum.HSBC, HSBCHandler.getInstance());
		bancoHandlers.put(BancoEnum.BRADESCO, BradescoHandler.getInstance());
	}

	public static IBancoHandler get(BancoEnum bancoEnum) throws Exception {
		IBancoHandler bancoHandler = bancoHandlers.get(bancoEnum);
		if(bancoHandler == null){
			throw new Exception("Banco n\u00e3o suportado!");
		}
		return bancoHandler;
	}
	
	public static BancoEnum valueOfByCodigo(String codigoBanco){
		BancoEnum boletoEnum = null;
		for(BancoEnum cBoletoEnum : BancoEnum.values()){
			if(cBoletoEnum.getCodigo().equals(codigoBanco)){
				boletoEnum = cBoletoEnum;
			}
		}
		return boletoEnum;
	}
	
	/**
	 * Retorna os bancos que tem suporte
	 * @return bancos String
	 */
	public static String getBancosMenssage(){
		return "BANCO Ita\u00fa, BANCO Santander Banespa S.A, BANDO DO BRASIL, BANCO HSBC e BANCO Bradesco.";
	}
	
	public static Boolean isBancoSuportado(String codigoBanco){
		for(BancoEnum cBoletoEnum : bancoHandlers.keySet()){
			if(cBoletoEnum.getCodigo().equals(codigoBanco)){
				System.out.println("Banco " + cBoletoEnum.name() + " selecionado.");
				return true;
			}
		}
		return false;
	}
}