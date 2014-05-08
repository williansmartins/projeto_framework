package br.com.fiap.pattern.banco;

public enum BancoEnum {
	BRASIL("001"),
	ITAU("341"),
	SANTANDER("033"),
	HSBC("399"),
	BRADESCO("237");
		
	public final String codigo;
		
	private BancoEnum(String codigo){
		this.codigo = codigo;
	}
		
	public String getCodigo(){
		return codigo;
	}
		
	public static BancoEnum valueOfByCodigo(String codigoBanco){
		BancoEnum bancoEnum = null;
		for(BancoEnum cBancoEnum : BancoEnum.values()){
			if (cBancoEnum.getCodigo().equals(codigoBanco)){
				bancoEnum = cBancoEnum;
			}
		}
		return bancoEnum;
	}
}