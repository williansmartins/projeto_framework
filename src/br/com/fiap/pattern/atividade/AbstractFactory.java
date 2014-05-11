package br.com.fiap.pattern.atividade;

public abstract class AbstractFactory {

	public abstract ICartaoHandler getICartaoHandler(String codigoCartao) throws Exception;
}