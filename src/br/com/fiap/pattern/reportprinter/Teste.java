package br.com.fiap.pattern.reportprinter;

import br.com.fiap.pattern.reportprinter.interfaces.ICityDAO;

public class Teste {

	public static void main(String[] args) throws Exception {
		AbstractFactory af = new DBFactory();
		ICityDAO cityDAO = af.getICityDAO("001");
		Country country = new Country("Brasil");
		State state = new State("Bahia");
		cityDAO.insert(new City("Salvador", state, country));
	}
}