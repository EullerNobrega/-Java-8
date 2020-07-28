package main;

@FunctionalInterface
public interface Validatoir<T> {
	boolean valida(T t);
	boolean outroMetodo(T t);
}
