package main;

public class Capitulo2 {

	public static void main(String[] args) {

//		Runnable r = new Runnable() { // Metodo antigo para inicializacao de Threads
//
//			@Override
//			public void run() {
//				for (int i = 0; i <= 1000; i++) {
//					System.out.println(i);
//				}
//
//			}
//		};
//		new Thread(r).start();
//	}
	
		Runnable r = () -> {          // Utilizando Lambda Functions
			for (int i = 0; i <= 1000; i++) {
				System.out.println("Thread" + Thread.currentThread()  +i);
			}
		};
		
		Runnable r1 = () -> {          // Utilizando Lambda Functions
			for (int i = 0; i <= 1000; i++) {
				System.out.println("Thread" + Thread.currentThread()  +i);
			}
		};
		new Thread(r).start();
		new Thread(r1).start();
	}
}
