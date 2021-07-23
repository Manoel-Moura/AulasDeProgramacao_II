package aula_08_q3;

public class Fornecedor extends Pessoa {
	protected double valorCredito;
	protected double valorDivida;
	
	
	@Override
	public String toString() {
		return "\n\tFornecedor\n" +
			   "Nome: " + getNome() +
			   "\nEndereço: " + getEndereco() +
			   "\nTelefone: " + getTelefone() +
			   "\nCredito: " + getValorCredito()+
			   "\nDivida: " + getValorDivida() + 
			   "\nSaldo: " + obterSaldo();
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}
	

}
