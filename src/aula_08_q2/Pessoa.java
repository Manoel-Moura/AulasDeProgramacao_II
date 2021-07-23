package aula_08_q2;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;

	protected String getNome() {
		return this.nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getIdade() {
		return this.idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	protected String getSexo() {
		return this.sexo;
	}

	protected void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
