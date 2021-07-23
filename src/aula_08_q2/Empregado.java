package aula_08_q2;

public class Empregado extends Pessoa{

		private double salario;
		private String matricula;
		
		public double getSalario() {
			return this.salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public String getMatricula() {
			return this.matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		
		public double valorInss() {
			return this.salario * 11 / 100;
		}
		
		
}
