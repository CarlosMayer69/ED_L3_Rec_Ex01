package view;

import controller.ContaDigitosController;

public class Principal {

	public static void main(String[] args) {
		
			ContaDigitosController cd = new ContaDigitosController();
		
			int numero = 12345;
	        
	        int contadigitos = cd.contadigitos(numero);      
	        
	        System.out.println("N�mero de d�gitos em " + numero + ": " + contadigitos);
	    }

	}


