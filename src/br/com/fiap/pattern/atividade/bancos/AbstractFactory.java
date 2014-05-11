package br.com.fiap.pattern.atividade.bancos;

public abstract class AbstractFactory {

	public abstract IBradesco getIBradesco(String codigoCartao) throws Exception;
	public abstract IHSBC getIHSBC(String codigoCartao) throws Exception;
}