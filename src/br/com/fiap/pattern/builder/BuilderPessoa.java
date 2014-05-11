package br.com.fiap.pattern.builder;

import java.io.Serializable;

public class BuilderPessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String identificacao;
	
	public static BuilderPessoa.Builder builderInstance(){
		return new BuilderPessoa.Builder();
	}
	
	public static BuilderPessoa.Builder builderInstance(Long id){
		return new BuilderPessoa.Builder(id);
	}
	
	public static BuilderPessoa.Builder builderInstance(String nome, String identificacao){
		return new BuilderPessoa.Builder(nome, identificacao);
	}
	
	public static BuilderPessoa.Builder builderInstance(Long id, String nome, String identificacao){
		return new BuilderPessoa.Builder(id, nome, identificacao);
	}
	
	public static class Builder {
		Pessoa pessoa = new Pessoa();
		private Long id;
		private String nome;
		private String identificacao;
		
		public Builder(){}
		
		public Builder(Long id){
			this.id = id;
		}
		
		public Builder(String nome, String identificacao){
			this.nome = nome;
			this.identificacao = identificacao;
		}
		
		public Builder(Long id, String nome, String identificacao){
			this.id = id;
			this.nome = nome;
			this.identificacao = identificacao;
		}
		
		public Pessoa build() {//TODO: Inserir validacoes.
			if(id != null){
				pessoa.setId(id);
			}else{
				//TODO: Adicionar validacoes.
			}
			
			if(nome != null){
				pessoa.setNome(nome);
			}else{
				//TODO: Adicionar validacoes.
			}
			
			if(identificacao != null){
				pessoa.setIdentificacao(identificacao);
			}else{
				//TODO: Adicionar validacoes.
			}
			
			return pessoa;
		}
		
		public Builder id(Long id){
			this.id = id;
			return this;
		}
		
		public Builder nome(String nome){
			this.nome = nome;
			return this;
		}
		
		public Builder identificacao(String identificacao){
			this.identificacao = identificacao;
			return this;
		}

		public Pessoa getPessoa() {
			return pessoa;
		}

		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getIdentificacao() {
			return identificacao;
		}

		public void setIdentificacao(String identificacao) {
			this.identificacao = identificacao;
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	@Override
	public String toString() {
		return "BuilderPessoa [id=" + id + ", nome=" + nome + ", identificacao=" + identificacao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BuilderPessoa other = (BuilderPessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}