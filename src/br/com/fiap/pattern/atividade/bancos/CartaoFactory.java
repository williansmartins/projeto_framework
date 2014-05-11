package br.com.fiap.pattern.atividade.bancos;

import java.util.HashMap;
import java.util.Map;

public class CartaoFactory extends AbstractFactory {

	private static Map<CartaoEnum, IBradesco> cartoesBradesco = new HashMap<CartaoEnum, IBradesco>();
	static {
		cartoesBradesco.put(CartaoEnum.AmericanExpress, AmericanExpressBradesco.getInstance());
		cartoesBradesco.put(CartaoEnum.Diners, DinersBradesco.getInstance());
		cartoesBradesco.put(CartaoEnum.MASTERCARD, MasterCardBradesco.getInstance());
		cartoesBradesco.put(CartaoEnum.VISA, VisaBradesco.getInstance());
	}
	
	private static Map<CartaoEnum, IHSBC> cartoesHSBC = new HashMap<CartaoEnum, IHSBC>();
	static {
		cartoesHSBC.put(CartaoEnum.AmericanExpress, AmericanExpressHSBC.getInstance());
		cartoesHSBC.put(CartaoEnum.Diners, DinersHSBC.getInstance());
		cartoesHSBC.put(CartaoEnum.MASTERCARD, MasterCardHSBC.getInstance());
		cartoesHSBC.put(CartaoEnum.VISA, VisaHSBC.getInstance());
	}
	
	public static IBradesco getCartaoBradesco(CartaoEnum cartaoEnum) throws Exception {
		IBradesco cartaoBradesco = cartoesBradesco.get(cartaoEnum);
		if(cartaoBradesco == null){
			throw new Exception("Cart\u00e3o n\u00e3o suportado!");
		}
		return cartaoBradesco;
	}
	
	public static IHSBC getCartaoHSBC(CartaoEnum cartaoEnum) throws Exception {
		IHSBC cartaoHSBC = cartoesHSBC.get(cartaoEnum);
		if(cartaoHSBC == null){
			throw new Exception("Cart\u00e3o n\u00e3o suportado!");
		}
		return cartaoHSBC;
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
		return "VISA, MASTERCARD, Diners, AmericanExpress";
	}
	
	public static Boolean isCartaoSuportado(String codigoCartao){
		for(CartaoEnum cCartaoEnum : cartoesBradesco.keySet()){
			if(cCartaoEnum.getCodigo().equals(codigoCartao)){
				System.out.println("Cart\u00e3o " + cCartaoEnum.name() + "-Bradesco selecionado.");
				return true;
			}
		}
		for(CartaoEnum cCartaoEnum : cartoesHSBC.keySet()){
			if(cCartaoEnum.getCodigo().equals(codigoCartao)){
				System.out.println("Cart\u00e3o " + cCartaoEnum.name() + "-HSBC selecionado.");
				return true;
			}
		}
		return false;
	}

	@Override
	public IBradesco getIBradesco(String codigoCartao) throws Exception {
		IBradesco cartaoBradesco = CartaoFactory.getCartaoBradesco(CartaoFactory.valueOfByCodigo(codigoCartao));
		return cartaoBradesco;
	}

	@Override
	public IHSBC getIHSBC(String codigoCartao) throws Exception {
		IHSBC cartaoHSBC = CartaoFactory.getCartaoHSBC(CartaoFactory.valueOfByCodigo(codigoCartao));
		return cartaoHSBC;
	}
}