package aula_08_q3;

public class Main {
	
	public static void main(String[] args) {
		Administrador a1 = new Administrador("Manoel Moura","Rua dos Bobos, N 0","4002-8922",123,5000,11,100);
		Fornecedor f1 = new Fornecedor();
		Operario o1 = new Operario();
		Vendedor v1 = new Vendedor();
		
		f1.setNome("Jão Pedro");
		f1.setEndereco("Rua Nova");
		f1.setTelefone("86 98117-4884");
		f1.setValorCredito(1500);
		f1.setValorDivida(500);
		
		o1.setNome("Carlos");
		o1.setEndereco("Rua Santos Drumon");
		o1.setTelefone("55 4567-1230");
		o1.setCodigoSetor(321);
		o1.setSalarioBase(15000);
		o1.setImposto(10); // Operario recebe 10% do valor da Produção.
		o1.setValorProducao(5000);
		
		v1.setNome("Alex");
		v1.setEndereco("Centro");
		v1.setTelefone("99 3367-1730");
		v1.setCodigoSetor(656);
		v1.setSalarioBase(2500);
		v1.setValorVendas(2000);
		v1.setImposto(12); // Vendedor recebe 12% do valor da Produção.
		
		System.out.println(a1);
		
		System.out.println("\n\n" + f1);
		
		System.out.println("\n\n" + o1);
		
		System.out.println("\n\n" + v1);
	}
	
	
	
	
	

}
