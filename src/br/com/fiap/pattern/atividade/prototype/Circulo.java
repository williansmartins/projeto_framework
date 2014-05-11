package br.com.fiap.pattern.atividade.prototype;

public class Circulo extends Figura {

	public Circulo(String nome, Double area){
		setNome(nome);
		setArea(area);
	}
	
	@Override
	protected Object clone() {
		Circulo circulo = (Circulo) super.clone();
		return circulo;
	}
	
	@Override
	public String toString() {
		return "Circulo [nome=" + super.getNome() + ", area=" + super.getArea() + "]";
	}
}