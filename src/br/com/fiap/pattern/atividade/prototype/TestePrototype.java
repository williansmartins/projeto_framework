package br.com.fiap.pattern.atividade.prototype;

public class TestePrototype {

	public static void main(String[] args) throws Exception {
		AbstractFactory af = new FiguraFactory();
		af.createCirculo(new Circulo("Circulo", 1110.80));
		af.createQuadrado(new Quadrado("Quadrado", 1110.80));
		af.createTriangulo(new Triangulo("Triangulo", 1110.80));
	}
}