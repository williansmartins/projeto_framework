package br.com.fiap.pattern.reportprinter.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    
	public static Connection conn = null;
	
	public static Connection getInstance(){
		if(conn == null){
			try{
				String userName = "root";
		        String password = "junior";
		        String url = "jdbc:mysql://localhost/fiap";
		        Class.forName ("com.mysql.jdbc.Driver").newInstance();
		        conn = DriverManager.getConnection (url, userName, password);
		        System.out.println ("Conex\u00e3o com o BD estabelecida!");
			}catch(Exception e){
	            System.err.println ("N\u00e3o foi possível estabelecer conex\u00e3o com o BD.");
	        }
		}
		return conn;
	}
	
	public static void close(){
		 if(conn != null){
             try{
                 conn.close();
                 System.out.println ("Conex\u00e3o finalizada.");
             }catch(Exception e){
             	/* ignore close errors */
             }
         }
	}
	
	public static String sqlInsert(String table, String[] values){
		StringBuilder sql = new StringBuilder("INSERT INTO " + table + " VALUES ('" + values[0] + "'");
		for(int x=1, y=values.length-1; x<=y; x++){
			sql.append(", '" + values[x] + "'");
		}
		sql.append(")");
		return sql.toString();
	}
}