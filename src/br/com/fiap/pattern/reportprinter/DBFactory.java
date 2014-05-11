package br.com.fiap.pattern.reportprinter;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.pattern.reportprinter.dao.CSVCityDAO;
import br.com.fiap.pattern.reportprinter.dao.CSVCountryDAO;
import br.com.fiap.pattern.reportprinter.dao.CSVStateDAO;
import br.com.fiap.pattern.reportprinter.dao.DBCityDAO;
import br.com.fiap.pattern.reportprinter.dao.DBCountryDAO;
import br.com.fiap.pattern.reportprinter.dao.DBStateDAO;
import br.com.fiap.pattern.reportprinter.dao.XMLCityDAO;
import br.com.fiap.pattern.reportprinter.dao.XMLCountryDAO;
import br.com.fiap.pattern.reportprinter.dao.XMLStateDAO;
import br.com.fiap.pattern.reportprinter.interfaces.ICityDAO;
import br.com.fiap.pattern.reportprinter.interfaces.ICountryDAO;
import br.com.fiap.pattern.reportprinter.interfaces.IStateDAO;

public class DBFactory extends AbstractFactory {

	private static Map<DBEnum, ICityDAO> dbsCity = new HashMap<DBEnum, ICityDAO>();
	static {
		dbsCity.put(DBEnum.XML, XMLCityDAO.getInstance());
		dbsCity.put(DBEnum.CSV, CSVCityDAO.getInstance());
		dbsCity.put(DBEnum.DB, DBCityDAO.getInstance());
	}
	
	private static Map<DBEnum, IStateDAO> dbsState = new HashMap<DBEnum, IStateDAO>();
	static {
		dbsState.put(DBEnum.XML, XMLStateDAO.getInstance());
		dbsState.put(DBEnum.CSV, CSVStateDAO.getInstance());
		dbsState.put(DBEnum.DB, DBStateDAO.getInstance());
	}
	
	private static Map<DBEnum, ICountryDAO> dbsCountry = new HashMap<DBEnum, ICountryDAO>();
	static {
		dbsCountry.put(DBEnum.XML, XMLCountryDAO.getInstance());
		dbsCountry.put(DBEnum.CSV, CSVCountryDAO.getInstance());
		dbsCountry.put(DBEnum.DB, DBCountryDAO.getInstance());
	}
	
	public static ICityDAO getCity(DBEnum dbEnum) throws Exception {
		ICityDAO cityDAO = dbsCity.get(dbEnum);
		if(cityDAO == null){
			throw new Exception("Bando de Dados n\u00e3o suportado!");
		}
		return cityDAO;
	}
	
	public static IStateDAO getState(DBEnum dbEnum) throws Exception {
		IStateDAO stateDAO = dbsState.get(dbEnum);
		if(stateDAO == null){
			throw new Exception("Bando de Dados n\u00e3o suportado!");
		}
		return stateDAO;
	}
	
	public static ICountryDAO getCountry(DBEnum dbEnum) throws Exception {
		ICountryDAO countryDAO = dbsCountry.get(dbEnum);
		if(countryDAO == null){
			throw new Exception("Bando de Dados n\u00e3o suportado!");
		}
		return countryDAO;
	}
	
	public static DBEnum valueOfByCodigo(String codigoDB){
		DBEnum dbEnum = null;
		for(DBEnum cDbEnum : DBEnum.values()){
			if(cDbEnum.getCodigo().equals(codigoDB)){
				dbEnum = cDbEnum;
			}
		}
		return dbEnum;
	}
	
	/**
	 * Retorna os Bandos de Dados que tem suporte
	 * @return bancos String
	 */
	public static String getBancosMenssage(){
		return "Banco de Dados Relacional, XML, CSV";
	}
	
	public static Boolean isBancoSuportado(String codigoDB){
		for(DBEnum cDbEnum : dbsCity.keySet()){
			if(cDbEnum.getCodigo().equals(codigoDB)){
				System.out.println("Bando de Dados " + cDbEnum.name() + "-City selecionado.");
				return true;
			}
		}
		for(DBEnum cDbEnum : dbsState.keySet()){
			if(cDbEnum.getCodigo().equals(codigoDB)){
				System.out.println("Bando de Dados " + cDbEnum.name() + "-State selecionado.");
				return true;
			}
		}
		for(DBEnum cDbEnum : dbsCountry.keySet()){
			if(cDbEnum.getCodigo().equals(codigoDB)){
				System.out.println("Bando de Dados " + cDbEnum.name() + "-Country selecionado.");
				return true;
			}
		}
		return false;
	}
	
	@Override
	public ICityDAO getICityDAO(String codigoDB) throws Exception {
		ICityDAO cityDAO = DBFactory.getCity(DBFactory.valueOfByCodigo(codigoDB));
		return cityDAO;
	}

	@Override
	public IStateDAO getIStateDAO(String codigoDB) throws Exception {
		IStateDAO stateDAO = DBFactory.getState(DBFactory.valueOfByCodigo(codigoDB));
		return stateDAO;
	}

	@Override
	public ICountryDAO getICountryDAO(String codigoDB) throws Exception {
		ICountryDAO countryDAO = DBFactory.getCountry(DBFactory.valueOfByCodigo(codigoDB));
		return countryDAO;
	}
}