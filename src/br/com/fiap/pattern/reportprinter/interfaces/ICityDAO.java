package br.com.fiap.pattern.reportprinter.interfaces;

import br.com.fiap.pattern.reportprinter.City;

public interface ICityDAO {

	public void insert(City city);
	public City update(City city);
	public void delete(City city);
}