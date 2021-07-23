package aula_08_q3;

public class Operario extends Empregado {
	protected double valorProdução;
	protected double comissao;
	
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +
			   "\nEndereço: " + getEndereco() +
			   "\nTelefone: " + getTelefone() +
			   "\nCodigo Setor: " + getCodigoSetor()+
			   "\nSalario base: " + getSalarioBase()+
			   "\nComissão: " + getComissao() +
			   "\nSalario: " + calculaSalario() + 
			   "\nImposto: " + getImposto() * 100 + " %";
	}

	
	public double getValorProdução() {
		return valorProdução;
	}

	public void setValorProdução(double valorProdução) {
		this.valorProdução = valorProdução;
	}

	public double getComissao() {
		return valorProdução * imposto;
	}



	@Override
	public double calculaSalario() {
		return this.salarioBase + getComissao();
	}
}
