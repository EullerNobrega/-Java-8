package main;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

	public static void main(String[] args) {
		
		Button button = new Button();
//		
//		button.addActionListener(new ActionListener() { Forma antiga
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		button.addActionListener((event) ->{
			System.out.println("Botao clicado");
		});
	}
}
