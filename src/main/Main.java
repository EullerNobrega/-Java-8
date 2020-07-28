package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		Consumer<Usuario> mostraMensagem = u -> System.out.println("antes de imprimir os nomes");
		Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());
		usuarios.forEach(mostraMensagem.andThen(imprimeNome)); // As interfaces consideradas @FunctionalInterface além
																// de terem somente um método abstrato
																// Agora também default métodos os quais podem ser
																// chamados caso n haja nenhma implementação ou incluido
																// com o método
																// Inferido pela Lambda function
		
	}

}
