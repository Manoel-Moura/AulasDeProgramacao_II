package aula_08_q3;

public class Administrador extends Empregado {
	protected double ajudaDeCustos;
	
	
	@Override
	public String toString() {
		return "\n\tAdministrador\n" +
			"Nome: " + getNome() +
			   "\nEndereço: " + getEndereco() +
			   "\nTelefone: " + getTelefone() +
			   "\nCodigo Setor: " + getCodigoSetor()+
			   "\nSalario base: " + getSalarioBase()+
			   "\nAjuda: " + getAjudaDeCustos() +
			   "\nSalario: " + calculaSalario() ;
	}
	
	@Override
	public double calculaSalario() {
		return getSalarioBase() + this.ajudaDeCustos ;
	}
	
	public double getAjudaDeCustos() {
		return ajudaDeCustos;
	}

	public void setAjudaDeCustos(double ajudaDeCustos) {
		this.ajudaDeCustos = ajudaDeCustos;
	}
	
	public Administrador(String nome,String endereco,String telefone,int codigoSetor,double salarioBase,double imposto,double ajudaDeCustos) {
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
		this.setAjudaDeCustos(ajudaDeCustos);
	}
}
