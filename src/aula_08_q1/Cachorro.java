package aula_08_q1;

public class Cachorro extends Animal{
	private String raca;
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nPeso: " + getPeso() +" Kg"+ "\nRaça: " + getRaca();
	}
	
	public String getRaca() {
		return this.raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public Cachorro(String nome,double peso,String raca) {
		setNome(nome);
		setPeso(peso);
		this.raca = raca;
	}
	
	
}
