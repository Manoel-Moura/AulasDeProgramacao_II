package aula_08_q4;

public class Carro extends Transporte{
	protected int numeroDePortas;
	protected String modelo;
	
	@Override
	public String toString() {
		return "\n\tCarro\n" +
			   "\nVelocidade: " + getVelocidade() +
			   "\nNumero de passageiro: " + getNumeroDePassageiro() +
			   "\nNumero de rodas: " + getNumeroDeRodas() +
			   "\nCor: " + getCor() + 
			   "\nNumero de portas: " +getNumeroDePortas() +
			   "\nModelo: " + getModelo();
	}
	
	protected int getNumeroDePortas() {
		return numeroDePortas;
	}
	protected void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
	protected String getModelo() {
		return modelo;
	}
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Carro(double velocidade,int numeroDePassageiro,int numeroDeRodas,String cor,int numeroDePortas,String modelo) {
		this.setVelocidade(velocidade);
		this.setNumeroDePassageiro(numeroDePassageiro);
		this.setNumeroDeRodas(numeroDeRodas);
		this.setCor(cor);
		this.setNumeroDePortas(numeroDePortas);
		this.setModelo(modelo);
	}
}
