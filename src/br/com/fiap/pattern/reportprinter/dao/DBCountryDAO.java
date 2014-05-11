package br.com.fiap.pattern.reportprinter.dao;

import java.sql.Connection;

import br.com.fiap.pattern.reportprinter.Country;
import br.com.fiap.pattern.reportprinter.interfaces.ICountryDAO;

import com.mysql.jdbc.Statement;

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
		try{
			Connection conn = Connect.getInstance();
			Statement stmt = (Statement) conn.createStatement();
	        String sql = Connect.sqlInsert("TBL_COUNTRY", new String[]{country.getName()});
	        System.out.println("Script: " + sql);
	        stmt.executeUpdate(sql);
            System.out.println ("Inser\u00e7\u00e3o Country: " + country.getName());
        }catch(Exception e){
            System.err.println ("N\u00e3o foi poss\u00edvel inserir o Country: " + country.getName());
        }finally{
        	Connect.close();
        }
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