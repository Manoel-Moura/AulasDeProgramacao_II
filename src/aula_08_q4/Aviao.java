package aula_08_q4;

public class Aviao extends Transporte{
	protected double alturaMaxima;
	protected int numeroDeAsas;
	
	
	@Override
	public String toString() {
		return "\n\tAvião\n" +
			   "\nVelocidade: " + getVelocidade() +
			   "\nNumero de passageiro: " + getNumeroDePassageiro() +
			   "\nNumero de rodas: " + getNumeroDeRodas() +
			   "\nCor: " + getCor() + 
			   "\nAltura maxima: " +getAlturaMaxima() +
			   "\nNumero de Asas: " +getNumeroDeAsas();
	}
	
	protected double getAlturaMaxima() {
		return alturaMaxima;
	}
	protected void setAlturaMaxima(double alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}
	protected int getNumeroDeAsas() {
		return numeroDeAsas;
	}
	protected void setNumeroDeAsas(int numeroDeAsas) {
		this.numeroDeAsas = numeroDeAsas;
	}
	
	public Aviao(double velocidade,int numeroDePassageiro,int numeroDeRodas,String cor,double alturaMaxima,int numeroDeAsas) {
		this.setVelocidade(velocidade);
		this.setNumeroDePassageiro(numeroDePassageiro);
		this.setNumeroDeRodas(numeroDeRodas);
		this.setCor(cor);
		this.setAlturaMaxima(alturaMaxima);
		this.setNumeroDeAsas(numeroDeAsas);
	}

}
