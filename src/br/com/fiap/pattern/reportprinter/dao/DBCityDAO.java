package br.com.fiap.pattern.reportprinter.dao;

import br.com.fiap.pattern.reportprinter.City;
import br.com.fiap.pattern.reportprinter.interfaces.ICityDAO;

public class DBCityDAO implements ICityDAO {

	public static DBCityDAO instance = null;
	
	public static DBCityDAO getInstance(){
		if(instance == null){
			instance = new DBCityDAO();
		}
		return instance;
	}
	
	@Override
	public void insert(City city) {
		System.out.println("DB Insert");
	}

	@Override
	public City update(City city) {
		System.out.println("DB Update");
		return null;
	}

	@Override
	public void delete(City city) {
		System.out.println("DB Delete");
	}
}