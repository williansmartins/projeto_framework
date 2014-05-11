package br.com.fiap.dp.singleton;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private static Map<String, Registry> singletons = new HashMap<String, Registry>();
	private String name;
	
	public static Registry getInstance(String name){
		Registry registry = singletons.get(name);
		if(registry == null){
			registry = new Registry();
			singletons.put(name, registry);
		}
		return registry;
	}
	
	public static Map<String, Registry> getSingletons() {
		return singletons;
	}
	public static void setSingletons(Map<String, Registry> singletons) {
		Registry.singletons = singletons;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}