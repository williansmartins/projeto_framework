package br.com.fiap.pattern.reportprinter.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import br.com.fiap.pattern.reportprinter.Config;
import br.com.fiap.pattern.reportprinter.Country;
import br.com.fiap.pattern.reportprinter.interfaces.ICountryDAO;

import com.thoughtworks.xstream.XStream;

public class XMLCountryDAO implements ICountryDAO {

	public static XMLCountryDAO instance = null;
	
	public static XMLCountryDAO getInstance(){
		if(instance == null){
			instance = new XMLCountryDAO();
		}
		return instance;
	}
	
	@Override
	public void insert(Country country) {
		System.out.println("XML - Insert Country: " + country.getName());
		
		XStream xt = new XStream();
		xt.alias("country", Country.class);
		String xml = xt.toXML(country);
        FileWriter arquivo;  
        try{
            arquivo = new FileWriter(new File(Config.URL_PASTA_ARQUIVOS + country.getName().trim() + ".xml"));  
            arquivo.write(xml);  
            arquivo.close();  
        }catch(IOException e){  
            e.printStackTrace();  
        }catch(Exception e){  
            e.printStackTrace();  
        }
	}

	@Override
	public Country update(Country country) {
		System.out.println("XML Update");
		return null;
	}

	@Override
	public void delete(Country country) {
		System.out.println("XML Delete");
	}
}