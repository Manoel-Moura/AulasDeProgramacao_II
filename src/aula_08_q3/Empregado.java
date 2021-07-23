package aula_08_q3;

public class Empregado extends Pessoa{
	protected int codigoSetor;
	protected double salarioBase;
	protected double imposto;
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto / 100;
	}
	public double calculaSalario() {
		return this.salarioBase - this.salarioBase * this.imposto ;
	}
	
}
