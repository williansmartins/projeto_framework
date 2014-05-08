package br.com.fiap.pattern.reportprinter.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import br.com.fiap.pattern.reportprinter.Config;
import br.com.fiap.pattern.reportprinter.Country;
import br.com.fiap.pattern.reportprinter.interfaces.ICountryDAO;

public class CSVCountryDAO implements ICountryDAO {

	public static CSVCountryDAO instance = null;
	
	public static CSVCountryDAO getInstance(){
		if(instance == null){
			instance = new CSVCountryDAO();
		}
		return instance;
	}
	
	@Override
	public void insert(Country country) {
		System.out.println("CSV - Insert Country: " + country.getName());
		
		
		String csv = country.getName();
        FileWriter arquivo;  
        try{
            arquivo = new FileWriter(new File(Config.URL_PASTA_ARQUIVOS + country.getName().trim() + ".txt"));  
            arquivo.write(csv);  
            arquivo.close();  
        }catch(IOException e){  
            e.printStackTrace();  
        }catch(Exception e){  
            e.printStackTrace();  
        }
	}

	@Override
	public Country update(Country country) {
		System.out.println("CSV Update");
		return null;
	}

	@Override
	public void delete(Country country) {
		System.out.println("CSV Delete");
	}
}