package main;

public class Main {

	public static void main(String[] args) {
		 final int numero = 1; //  Lambda encontra variasveis de valores imutaveis
		 int numero2 = 2; // tbm eh possivel ser encontrado nessa forma caso nao haja modificao da variavel depois
		
		
		Runnable runnable = () -> System.out.println(numero + numero2);
		new Thread(runnable).start();
	}
		
}
