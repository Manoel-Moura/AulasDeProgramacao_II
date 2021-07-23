package aula_08_q2;

public class Empregado extends Pessoa{

		private double salario;
		private String matricula;
		
		protected double getSalario() {
			return this.salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		protected String getMatricula() {
			return this.matricula;
		}

		protected void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		
		protected double valorInss() {
			return this.salario * 11 / 100;
		}
		
		
}
