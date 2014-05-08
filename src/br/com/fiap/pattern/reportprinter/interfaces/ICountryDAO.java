package br.com.fiap.pattern.reportprinter.interfaces;

import br.com.fiap.pattern.reportprinter.Country;

public interface ICountryDAO {

	public void insert(Country country);
	public Country update(Country country);
	public void delete(Country country);
}