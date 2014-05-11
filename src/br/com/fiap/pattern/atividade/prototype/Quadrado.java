package br.com.fiap.pattern.atividade.prototype;

public class Quadrado extends Figura {

	public Quadrado(String nome, Double area){
		setNome(nome);
		setArea(area);
	}
	
	@Override
	protected Object clone() {
		Quadrado quadrado = (Quadrado) super.clone();
		return quadrado;
	}
	
	@Override
	public String toString() {
		return "Quadrado [nome=" + super.getNome() + ", area=" + super.getArea() + "]";
	}
}