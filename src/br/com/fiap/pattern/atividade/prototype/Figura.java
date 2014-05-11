package br.com.fiap.pattern.atividade.prototype;

public class Figura implements Cloneable {

	private String nome;
	private Double area;

	public Figura(){}
	public Figura(String nome, Double area){
		this.nome = nome;
		this.area = area;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}
	
	protected Object clone() {
		Object object = null;
		try{
			object = super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return object;
	}
	
	@Override
	public String toString() {
		return "Figura [nome=" + nome + ", area=" + area + "]";
	}
}