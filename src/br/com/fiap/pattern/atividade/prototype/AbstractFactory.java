package br.com.fiap.pattern.atividade.prototype;

public abstract class AbstractFactory {

	public abstract Figura createCirculo(Circulo c) throws Exception;
	public abstract Figura createQuadrado(Quadrado q) throws Exception;
	public abstract Figura createTriangulo(Triangulo t) throws Exception;
}