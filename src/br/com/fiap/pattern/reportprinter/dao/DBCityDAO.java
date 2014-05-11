package br.com.fiap.pattern.reportprinter.dao;

import java.sql.Connection;

import com.mysql.jdbc.Statement;

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
		try{
			Connection conn = Connect.getInstance();
			Statement stmt = (Statement) conn.createStatement();
	        String sql = Connect.sqlInsert("TBL_CITY", new String[]{city.getName(), city.getState().getName(), city.getCountry().getName()});
	        System.out.println("Script: " + sql);
	        stmt.executeUpdate(sql);
            System.out.println ("Inser\u00e7\u00e3o City: " + city.getName());
        }catch(Exception e){
            System.err.println ("N\u00e3o foi poss\u00edvel inserir o City: " + city.getName());
        }finally{
        	Connect.close();
        }
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