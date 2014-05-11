package br.com.fiap.pattern.builder;

public class TesteBuilder {

	public static void main(String[] args) {
		Pessoa pessoa = BuilderPessoa.builderInstance().nome("Alberto Cerqueira").identificacao("1").build();
		System.out.println(pessoa.toString());
		
		Empresa empresa = BuilderEmpresa.builderInstance().nome("Google").identificacao("2").build();
		System.out.println(empresa.toString());
	}
}