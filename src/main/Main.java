package main;

public class Main {

	public static void main(String[] args) {
		Validator<String> validator = new Validato<String>() {
			public boolean valida(String t) {
				return t.matches("[0-9]{5}-[0-9]{3}");
			};
		};
	}
}
