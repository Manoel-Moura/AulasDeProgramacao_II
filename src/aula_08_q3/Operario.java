package aula_08_q3;

public class Operario extends Empregado {
	protected double valorProducao;
	protected double comissao;
	
	
	@Override
	public String toString() {
		return "\n\tOperario\n" +
				"Nome: " + getNome() +
			   "\nEndereço: " + getEndereco() +
			   "\nTelefone: " + getTelefone() +
			   "\nCodigo Setor: " + getCodigoSetor()+
			   "\nSalario base: " + getSalarioBase()+
			   "\nComissão: " + getComissao() +
			   "\nSalario: " + calculaSalario();
	}

	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return valorProducao * imposto;
	}



	@Override
	public double calculaSalario() {
		return this.salarioBase + getComissao();
	}
}
