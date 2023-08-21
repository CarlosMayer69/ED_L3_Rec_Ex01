package controller;

public class ContaDigitosController {

	public ContaDigitosController() {
		super();
	}

	// Função recursiva para contar dígitos
    public static int contadigitos(int n) {
    	
        // Condição de parada: 
    	//Quando o número for menor que 10, possui apenas 1 dígito
    	
        if (n < 10) {
            return 1;
            
        } else {
            // Chamada recursiva: 
        	//A quantidade de dígitos de n é igual a 1 (dígito atual) 
        	//mais a quantidade       	
            // de dígitos dos próximos números (n / 10) após remover o último dígito.
            return 1 + contadigitos(n / 10);
        }
    }
}






