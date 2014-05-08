package br.com.fiap.pattern.atividade;

import java.util.HashMap;
import java.util.Map;

public class CartaoHandlerFactory {

	private static Map<CartaoEnum, ICartaoHandler> cartaoHandlers = new HashMap<CartaoEnum, ICartaoHandler>();
	static {
		cartaoHandlers.put(CartaoEnum.VISA, VisaHandler.getInstance());
		cartaoHandlers.put(CartaoEnum.MASTERCARD, MasterCardHandler.getInstance());
		//cartaoHandlers.put(CartaoEnum.Diners, SantanderHandler.getInstance());
		//cartaoHandlers.put(CartaoEnum.AmericanExpress, HSBCHandler.getInstance());
	}

	public static ICartaoHandler get(CartaoEnum cartaoEnum) throws Exception {
		ICartaoHandler cartaoHandler = cartaoHandlers.get(cartaoEnum);
		if(cartaoHandler == null){
			throw new Exception("Cart\u00e3o n\u00e3o suportado!");
		}
		return cartaoHandler;
	}
	
	public static CartaoEnum valueOfByCodigo(String codigoCartao){
		CartaoEnum cartaoEnum = null;
		for(CartaoEnum cCartaoEnum : CartaoEnum.values()){
			if(cCartaoEnum.getCodigo().equals(codigoCartao)){
				cartaoEnum = cCartaoEnum;
			}
		}
		return cartaoEnum;
	}
	
	/**
	 * Retorna os cartoes que tem suporte
	 * @return cartoes String
	 */
	public static String getBancosMenssage(){
		return "Cart\u00e3o Visa, Cart\u00e3o Master Card, Cart\u00e3o American Express e Cart\u00e3o Diners";
	}
	
	public static Boolean isCartaoSuportado(String codigoCartao){
		for(CartaoEnum cCartaoEnum : cartaoHandlers.keySet()){
			if(cCartaoEnum.getCodigo().equals(codigoCartao)){
				System.out.println("Cart\u00e3o " + cCartaoEnum.name() + " selecionado.");
				return true;
			}
		}
		return false;
	}
}