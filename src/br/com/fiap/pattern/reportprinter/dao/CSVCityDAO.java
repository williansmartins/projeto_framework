package br.com.fiap.pattern.reportprinter.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import br.com.fiap.pattern.reportprinter.City;
import br.com.fiap.pattern.reportprinter.Config;
import br.com.fiap.pattern.reportprinter.interfaces.ICityDAO;

public class CSVCityDAO implements ICityDAO {

	public static CSVCityDAO instance = null;
	
	public static CSVCityDAO getInstance(){
		if(instance == null){
			instance = new CSVCityDAO();
		}
		return instance;
	}
	
	@Override
	public void insert(City city) {
		System.out.println("CSV - Insert City: " + city.getName());
		
		
		String csv = city.getCountry().getName() + ";" + city.getState().getName() + ";" + city.getName();
        FileWriter arquivo;  
        try{
            arquivo = new FileWriter(new File(Config.URL_PASTA_ARQUIVOS + city.getName().trim() + ".txt"));  
            arquivo.write(csv);  
            arquivo.close();  
        }catch(IOException e){  
            e.printStackTrace();  
        }catch(Exception e){  
            e.printStackTrace();  
        }
	}

	@Override
	public City update(City city) {
		System.out.println("CSV Update");
		return null;
	}

	@Override
	public void delete(City city) {
		System.out.println("CSV Delete");
	}
}