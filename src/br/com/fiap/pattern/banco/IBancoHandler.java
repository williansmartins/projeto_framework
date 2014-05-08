package br.com.fiap.pattern.banco;

import java.util.Map;

public interface IBancoHandler {

	public Map<InfoBancoEnum, Object> getInfoBoleto();
	public String gerarCodigoBarra(Integer nossoNumero, Integer numeroBanco, Integer numeroAgencia, Integer numeroConta, Integer digito);
}