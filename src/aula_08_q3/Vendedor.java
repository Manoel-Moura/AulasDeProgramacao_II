package aula_08_q3;

public class Vendedor extends Empregado{
	protected double valorVendas;
	protected double comissao;
	

	@Override
	public String toString() {
		
		return "\n\tVendedor\n" +
			   "Nome: " + getNome() +
			   "\nEndereço: " + getEndereco() +
			   "\nTelefone: " + getTelefone() +
			   "\nCodigo Setor: " + getCodigoSetor()+
			   "\nSalario base: " + getSalarioBase()+
			   "\nComissão: " + getComissao() +
			   "\nSalario: " + calculaSalario();
	}
	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return this.valorVendas * this.imposto;
	}
	@Override
	public double calculaSalario() {
		return getSalarioBase() + getComissao();
	}

	


}
