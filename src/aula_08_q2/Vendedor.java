package aula_08_q2;

public class Vendedor extends Empregado {
	protected double valorVendas;
	protected int qntVendas;
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +
			   "\nSalario: " + getSalario() + 
			   "\nValor das vendas: " + getValorVendas()+
			   "\nQuantidade de vendas: " + getQntVendas();
	}

	protected double getValorVendas() {
		return this.valorVendas;
	}

	protected void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	protected int getQntVendas() {
		return this.qntVendas;
	}

	protected void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}
	
	public Vendedor(String nome,double salario,double valorVendas,int qntVendas) {
		this.setNome(nome);
		this.setSalario(salario);
		this.setValorVendas(valorVendas);
		this.setQntVendas(qntVendas);
	}

}
