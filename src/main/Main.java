package main;

public class Main {

	public static void main(String[] args) {
		
//		Validator<String> validator = new Validator<String>() { // Metodo antigos
//			public boolean valida(String t) {
//				return t.matches("[0-9]{5}-[0-9]{3}");
//			};
//		};
		
		Validator<String> validator = valor -> { // Com lambda function
			return valor.matches("[0-9]{5}-[0-9]{3}");
		};
		
		
		Validator<String> validatorSimplificado = valor -> valor.matches("[0-9]{5}-[0-9]{3}"); // Lambda Simplificado
	}
	
}
