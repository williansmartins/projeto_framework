package br.com.fiap.pattern.reportprinter.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import br.com.fiap.pattern.reportprinter.City;
import br.com.fiap.pattern.reportprinter.Config;
import br.com.fiap.pattern.reportprinter.interfaces.ICityDAO;

import com.thoughtworks.xstream.XStream;

public class XMLCityDAO implements ICityDAO {

	public static XMLCityDAO instance = null;
	
	public static XMLCityDAO getInstance(){
		if(instance == null){
			instance = new XMLCityDAO();
		}
		return instance;
	}
	
	@Override
	public void insert(City city) {
		System.out.println("XML - Insert City: " + city.getName());
		
		XStream xt = new XStream();
		xt.alias("city", City.class);
		String xml = xt.toXML(city);
        FileWriter arquivo;  
        try{
            arquivo = new FileWriter(new File(Config.URL_PASTA_ARQUIVOS + city.getName().trim() + ".xml"));  
            arquivo.write(xml);  
            arquivo.close();  
        }catch(IOException e){  
            e.printStackTrace();  
        }catch(Exception e){  
            e.printStackTrace();  
        }
	}

	@Override
	public City update(City city) {
		System.out.println("XML Update");
		return null;
	}

	@Override
	public void delete(City city) {
		System.out.println("XML Delete");
	}
}