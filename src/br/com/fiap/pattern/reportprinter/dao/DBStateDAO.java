package br.com.fiap.pattern.reportprinter.dao;

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
		System.out.println("DB Insert");
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