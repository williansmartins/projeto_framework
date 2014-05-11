package br.com.fiap.pattern.atividade.prototype;

public class Triangulo extends Figura {

	public Triangulo(String nome, Double area){
		setNome(nome);
		setArea(area);
	}
	
	@Override
	protected Object clone() {
		Triangulo triangulo = (Triangulo) super.clone();
		return triangulo;
	}
	
	@Override
	public String toString() {
		return "Triangulo [nome=" + super.getNome() + ", area=" + super.getArea() + "]";
	}
}