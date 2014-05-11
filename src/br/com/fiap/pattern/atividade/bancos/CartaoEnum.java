package br.com.fiap.pattern.atividade.bancos;

public enum CartaoEnum {
	VISA("001"),
	MASTERCARD("002"),
	Diners("003"),
	AmericanExpress("004");
		
	public final String codigo;
		
	private CartaoEnum(String codigo){
		this.codigo = codigo;
	}
		
	public String getCodigo(){
		return codigo;
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
}