package aula_08_q2;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Manoel", 21, "Masculino", 120.50, 2000);
		Vendedor v1 = new Vendedor("Alexandre",5000,200,2);
		Gerente g1 = new Gerente("Brenne",20,"1071888","Carvalho");
		
		System.out.println("\n\tCliente\n");
		System.out.println(c1. toString());
		
		System.out.println("\n\tVendedor\n");
		System.out.println(v1. toString());
		
		g1.setSalario(2000); 
		
		System.out.println("\n\tGerente\n");
		System.out.println(g1. toString());
		
		
	}
	
}
