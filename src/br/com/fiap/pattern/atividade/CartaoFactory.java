package br.com.fiap.pattern.atividade;

import java.util.HashMap;
import java.util.Map;

public class CartaoFactory extends AbstractFactory {

	private static Map<CartaoEnum, ICartaoHandler> cartoes = new HashMap<CartaoEnum, ICartaoHandler>();
	static {
		cartoes.put(CartaoEnum.AmericanExpress, AmericanExpressHandler.getInstance());
		cartoes.put(CartaoEnum.Bradesco, BradescoHandler.getInstance());
		cartoes.put(CartaoEnum.Diners, DinersHandler.getInstance());
		cartoes.put(CartaoEnum.HSBC, HSBCHandler.getInstance());
		cartoes.put(CartaoEnum.MASTERCARD, MasterCardHandler.getInstance());
		cartoes.put(CartaoEnum.VISA, VisaHandler.getInstance());
	}
	
	public static ICartaoHandler getCartao(CartaoEnum cartaoEnum) throws Exception {
		ICartaoHandler cartaoHandler = cartoes.get(cartaoEnum);
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
	 * Retorna os Cartoes que tem suporte
	 * @return cartoes String
	 */
	public static String getBancosMenssage(){
		return "VISA, MASTERCARD, Diners, AmericanExpress, HSBC, Bradesco";
	}
	
	public static Boolean isCartaoSuportado(String codigoCartao){
		for(CartaoEnum cCartaoEnum : cartoes.keySet()){
			if(cCartaoEnum.getCodigo().equals(codigoCartao)){
				System.out.println("Cart\u00e3o " + cCartaoEnum.name() + " selecionado.");
				return true;
			}
		}
		return false;
	}

	@Override
	public ICartaoHandler getICartaoHandler(String codigoCartao) throws Exception {
		ICartaoHandler cartaoHandler = CartaoFactory.getCartao(CartaoFactory.valueOfByCodigo(codigoCartao));
		return cartaoHandler;
	}
}