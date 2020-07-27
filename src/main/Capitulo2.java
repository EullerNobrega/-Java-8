package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

//		for (Usuario usuario : usuarios) {
//			System.out.println(usuario.getNome());   Antes do Java 8
//		}

		System.out.println("Criando classe mostrador");

		usuarios.forEach(new Mostrador()); // Sem classe anonima

		System.out.println("\nCriando classe anonima");

		Consumer<Usuario> mostrador = new Consumer<Usuario>() { // Usando classe anonima

			@Override
			public void accept(Usuario t) {
				System.out.println(t.getNome());

			}
		};
		usuarios.forEach(new Mostrador());

		System.out.println("\nCriando classe anonima no parametro");

		usuarios.forEach(new Consumer<Usuario>() {
			@Override
			public void accept(Usuario t) {
				System.out.println(t.getNome());

			}
		});

//		---------------------- COM LAMBDA ---------------------------------

		Consumer<Usuario> mostradorLambda = (Usuario u) -> {
			System.out.println(u.getNome());
		}; // Inferido tipo na mao

		Consumer<Usuario> mostradorLambda2 = user -> {
			System.out.println(user.getNome());
		}; // Compilador inferido tipo sozinho

		System.out.println("\nUtilizando lambda com inferencia do compilador\n");
		usuarios.forEach(mostradorLambda2);
		
		System.out.println("\nUtilizando lambda no parametro do tipo Consumer do ForEach");
		
		
		usuarios.forEach(usuario -> {System.out.println(usuario.getNome());}); // Usando lamba sem precisar atribuir  a variavel local

	}

}
