package br.com.fiap.pattern.reportprinter.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import br.com.fiap.pattern.reportprinter.Config;
import br.com.fiap.pattern.reportprinter.State;
import br.com.fiap.pattern.reportprinter.interfaces.IStateDAO;

import com.thoughtworks.xstream.XStream;

public class XMLStateDAO implements IStateDAO {

	public static XMLStateDAO instance = null;
	
	public static XMLStateDAO getInstance(){
		if(instance == null){
			instance = new XMLStateDAO();
		}
		return instance;
	}
	
	@Override
	public void insert(State state) {
		System.out.println("XML - Insert State: " + state.getName());
		
		XStream xt = new XStream();
		xt.alias("state", State.class);
		String xml = xt.toXML(state);
        FileWriter arquivo;  
        try{
            arquivo = new FileWriter(new File(Config.URL_PASTA_ARQUIVOS + state.getName().trim() + ".xml"));  
            arquivo.write(xml);  
            arquivo.close();  
        }catch(IOException e){  
            e.printStackTrace();  
        }catch(Exception e){  
            e.printStackTrace();  
        }
	}

	@Override
	public State update(State state) {
		System.out.println("XML Update");
		return null;
	}

	@Override
	public void delete(State state) {
		System.out.println("XML Delete");
	}
}