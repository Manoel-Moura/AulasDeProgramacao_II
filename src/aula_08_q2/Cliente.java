package aula_08_q2;

public class Cliente extends Pessoa {
	protected double valorDivida;
	protected int anoNascim;

	
	@Override
	public String toString() {
		return "Nome: " + getNome() +
			   "\nIdade: " + getIdade() + 
			   "\nSexo: " + getSexo() +
			   "\nDivida: " + getValorDivida() +
			   "\nNacimento: " + getAnoNascim();
	}
	protected double getValorDivida() {
		return this.valorDivida;
	}

	protected void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	protected int getAnoNascim() {
		return this.anoNascim;
	}

	protected void setAnoNascim(int anoNascim) {
		this.anoNascim = anoNascim;
	}
	public Cliente(String nome,int idade,String sexo,double valorDivida,int anoNascim) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setValorDivida(valorDivida);
		this.setAnoNascim(anoNascim);
	}
}
