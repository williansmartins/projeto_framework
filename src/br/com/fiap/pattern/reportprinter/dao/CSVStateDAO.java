package br.com.fiap.pattern.reportprinter.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import br.com.fiap.pattern.reportprinter.Config;
import br.com.fiap.pattern.reportprinter.State;
import br.com.fiap.pattern.reportprinter.interfaces.IStateDAO;

public class CSVStateDAO implements IStateDAO {

	public static CSVStateDAO instance = null;
	
	public static CSVStateDAO getInstance(){
		if(instance == null){
			instance = new CSVStateDAO();
		}
		return instance;
	}
	
	@Override
	public void insert(State state) {
		System.out.println("CSV - Insert State: " + state.getName());
		
		
		String csv = state.getCountry().getName() + ";" + state.getName();
        FileWriter arquivo;  
        try{
            arquivo = new FileWriter(new File(Config.URL_PASTA_ARQUIVOS + state.getName().trim() + ".txt"));  
            arquivo.write(csv);  
            arquivo.close();  
        }catch(IOException e){  
            e.printStackTrace();  
        }catch(Exception e){  
            e.printStackTrace();  
        }
	}

	@Override
	public State update(State state) {
		System.out.println("CSV Update");
		return null;
	}

	@Override
	public void delete(State state) {
		System.out.println("CSV Delete");
	}
}