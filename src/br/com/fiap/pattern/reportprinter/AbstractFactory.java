package br.com.fiap.pattern.reportprinter;

import br.com.fiap.pattern.reportprinter.interfaces.ICityDAO;
import br.com.fiap.pattern.reportprinter.interfaces.ICountryDAO;
import br.com.fiap.pattern.reportprinter.interfaces.IStateDAO;

public abstract class AbstractFactory {

	public abstract ICityDAO getICityDAO(String codigoDB) throws Exception;
	public abstract IStateDAO getIStateDAO(String codigoDB) throws Exception;
	public abstract ICountryDAO getICountryDAO(String codigoDB) throws Exception;
}