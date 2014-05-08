package br.com.fiap.pattern.reportprinter.dao;

import br.com.fiap.pattern.reportprinter.Country;
import br.com.fiap.pattern.reportprinter.interfaces.ICountryDAO;

public class DBCountryDAO implements ICountryDAO {

	public static DBCountryDAO instance = null;
	
	public static DBCountryDAO getInstance(){
		if(instance == null){
			instance = new DBCountryDAO();
		}
		return instance;
	}
	
	@Override
	public void insert(Country country) {
		System.out.println("DB Insert");
	}

	@Override
	public Country update(Country country) {
		System.out.println("DB Update");
		return null;
	}

	@Override
	public void delete(Country country) {
		System.out.println("DB Delete");
	}
}