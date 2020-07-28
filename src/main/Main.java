package main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		Predicate<Usuario> predicado = new Predicate<Usuario>() { // Predicado verifica uma condicao para que possa ser usado em um removeif
																  // E itera os usuarios e os remove caso satisfaçam a condicao do predicate
			@Override
			public boolean test(Usuario t) {
				return t.getPontos() > 140;
			}
		};

		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.removeIf(predicado);
		
		usuarios.removeIf(u -> u.getPontos() > 140); // Usando lambda function
		
		usuarios.forEach(u -> System.out.println(u.getNome() + '\n' + u.getPontos()));
	}

}
