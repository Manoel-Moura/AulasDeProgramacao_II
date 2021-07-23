package aula_08_q1;

public class Peixe extends Animal{
	private String tipoHabitat;
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nPeso: " + getPeso() +" Kg"+ "\nHabitat: " + getTipoHabitat();
	}
	
	public Peixe(String nome,double peso,String tipoHabitat) {
		setNome(nome);
		setPeso(peso);
		this.tipoHabitat = tipoHabitat;
	}
	public String getTipoHabitat() {
		return this.tipoHabitat;
	}
	public void settipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}
}
