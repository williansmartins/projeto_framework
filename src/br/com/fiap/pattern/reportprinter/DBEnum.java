package br.com.fiap.pattern.reportprinter;

public enum DBEnum {
	DB("001"),
	XML("002"),
	CSV("003");
		
	public final String codigo;
		
	private DBEnum(String codigo){
		this.codigo = codigo;
	}
		
	public String getCodigo(){
		return codigo;
	}
		
	public static DBEnum valueOfByCodigo(String codigodb){
		DBEnum dbEnum = null;
		for(DBEnum cDbEnum : DBEnum.values()){
			if(cDbEnum.getCodigo().equals(codigodb)){
				dbEnum = cDbEnum;
			}
		}
		return dbEnum;
	}
}