package br.com.fiap.pattern.reportprinter.dao;

import java.sql.Connection;

import com.mysql.jdbc.Statement;

import br.com.fiap.pattern.reportprinter.State;
import br.com.fiap.pattern.reportprinter.interfaces.IStateDAO;

public class DBStateDAO implements IStateDAO {

	public static DBStateDAO instance = null;
	
	public static DBStateDAO getInstance(){
		if(instance == null){
			instance = new DBStateDAO();
		}
		return instance;
	}
	
	@Override
	public void insert(State state) {
		try{
			Connection conn = Connect.getInstance();
			Statement stmt = (Statement) conn.createStatement();
	        String sql = Connect.sqlInsert("TBL_STATE", new String[]{state.getName(), state.getCountry().getName()});
	        System.out.println("Script: " + sql);
	        stmt.executeUpdate(sql);
            System.out.println ("Inser\u00e7\u00e3o State: " + state.getName());
        }catch(Exception e){
            System.err.println ("N\u00e3o foi poss\u00edvel inserir o State: " + state.getName());
        }finally{
        	Connect.close();
        }
	}

	@Override
	public State update(State state) {
		System.out.println("DB Update");
		return null;
	}

	@Override
	public void delete(State state) {
		System.out.println("DB Delete");
	}
}