package aula_08_q1;
/**
 * Crie as classes solicitadas.
 * Faça o relacionamento (herança)
   entre as classes.
 * Defina a saída dos dados
   (toString) nas classes indicadas.
   A classe onde tem a indicação é
   onde estará a saída – toString().
 * Faça a classe de teste e execute.
 * O controle de visibilidade protected
 * */

public class Main {

	public static void main(String[] args) {
		Peixe peixe = new Peixe("Pirarucu",12.5,"Agua doce");
		Peixe peixe2 = new Peixe("Baiacu",8.5,"Agua salgada");
		Cachorro cachorro = new Cachorro("Bob",10.2,"Akita");
		Cachorro cachorro2 = new Cachorro("Bela",5.8,"Pug");
		
		peixe2.setNome("Peixe gato");
		peixe.setPeso(0);
		peixe.settipoHabitat("Ornamental");
		
		cachorro.setNome("Huck");
		cachorro2.setPeso(12.0);
		cachorro.setRaca("Poodle");
		cachorro2.setRaca("Akita");
		
		System.out.println(peixe.toString());
		System.out.println("\n\n" + peixe2.toString());
		System.out.println("\n\n" + cachorro.toString());
		System.out.println("\n\n" + cachorro2.toString());

	
	}

}
