
public class IR {
	
	    public static void main(String[] args) {
			
	        int salario = 3300;

	        //ifs aqui
	        

	        	if(salario >= 1900.0 && salario <= 2800.0) {
	        	System.out.println("Seu IR é de 7.5%, " + " você pode deduzir o valor de R$142,00.");
	       
	        	} else if(salario >= 2800.01 && salario <= 3751.0) {
	        	System.out.println("Seu IR é de 15%, " +  " você pode deduzir R$350");
	        
	        	} else if(salario >= 3751.01 && salario <= 4664.00) {
		        System.out.println("Seu IR é de 22.5%, " +  " você pode deduzir R$636");
	        }
	    }
	}

