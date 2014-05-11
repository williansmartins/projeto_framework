package br.com.fiap.pattern.atividade.prototype;

public class FiguraFactory extends AbstractFactory {

	@Override
	public Figura createCirculo(Circulo c) throws Exception {
		Figura circulo = (Figura) c.clone();
		System.out.println(circulo.toString());
		return (Circulo) circulo;
	}

	@Override
	public Figura createQuadrado(Quadrado q) throws Exception {
		Figura quadrado = (Quadrado) q.clone();
		System.out.println(quadrado.toString());
		return quadrado;
	}

	@Override
	public Figura createTriangulo(Triangulo t) throws Exception {
		Figura triangulo = (Triangulo) t.clone();
		System.out.println(triangulo.toString());
		return triangulo;
	}
}