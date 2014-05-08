package br.com.fiap.pattern.reportprinter;

import br.com.fiap.pattern.reportprinter.interfaces.ICityDAO;

public class Teste {

	public static void main(String[] args) throws Exception {
		AbstractFactory af = new DBFactory();
		ICityDAO cityDAO = af.getICityDAO("003");
		Country country = new Country("Brasil");
		State state = new State("Sao Paulo", country);
		cityDAO.insert(new City("Diadema", state, country));
	}
}