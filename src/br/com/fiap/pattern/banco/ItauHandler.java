package br.com.fiap.pattern.banco;

import java.util.HashMap;
import java.util.Map;

public class ItauHandler implements IBancoHandler {
	
public static final BradescoHandler instance = new BradescoHandler();
	
	public static BradescoHandler getInstance(){
		return instance;
	}
	
	public Map<InfoBancoEnum, Object> getInfoBoleto(){
		Map<InfoBancoEnum, Object> infoBoletos = new HashMap<InfoBancoEnum, Object>();
		infoBoletos.put(InfoBancoEnum.QTDE_DIGITOS_NOSSO_NUMERO, Integer.valueOf(8));
		infoBoletos.put(InfoBancoEnum.GERAR_DIGITO_VERIFICADOR_NOSSO_NUMERO, Boolean.TRUE);
		return infoBoletos;
	}

	@Override
	public String gerarCodigoBarra(Integer nossoNumero, Integer numeroBanco, Integer numeroAgencia, Integer numeroConta, Integer digito) {
		return nossoNumero + "" + numeroBanco + "" + numeroAgencia + "" + numeroConta + "" + digito;
	}
}