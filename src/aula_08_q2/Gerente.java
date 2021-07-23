package aula_08_q2;

public class Gerente extends Empregado{
	protected String nomeGerencia;
	
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +
			   "\nIdade: " + getIdade() + 
			   "\nMatricula: " + getMatricula()+
			   "\nNome da Gerencia: " + getNomeGerencia()+
			   "\nValor INSS: " + valorInss();
	}
	
	public String getNomeGerencia() {
		return this.nomeGerencia;
	}
	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
	
	public Gerente(String nome,int idade,String matricula,String nomeGerencia) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setMatricula(matricula);
		this.setNomeGerencia(nomeGerencia);
				
	}
}
