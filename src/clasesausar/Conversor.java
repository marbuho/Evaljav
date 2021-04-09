package clasesausar;
// clase para convertir enteros en romanos


public class Conversor{
	
	
	// metodo para convertir enteros en romanos:
		//input:: numeroentero, int : numero decimal y entero a convertir, 
		//		  minusc, boolean: parametro para la conversión, si es T la salida es en minuscula. int
		
		// output:: result, String: cadena del numero  romano.
	
	
	
    static public String to_romano(int numeroentero, boolean minusc) {
    	final int NUME[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    	final String SIMBOL_ROMAN[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    	StringBuilder result = new StringBuilder(); //clase especial de string que pemite usar el metodo append
    	result.append("");
    	String resultado;
    	int i = 0;
    	
    	while (numeroentero> 0) { 
    		if (numeroentero < NUME[i]) {
				i++;
    		}
    		else {
	    		result.append(SIMBOL_ROMAN[i]);
	    		numeroentero = numeroentero - NUME[i]; // se va "disminuyendo" el numero remanente a representar
    		}
    		
    	}
    	
    	if (minusc) {
    		resultado = result.toString().toLowerCase();
    	}
    	else {
    		resultado = result.toString();
    	}
    	
    	
		return resultado;
    	
    }
    static public String to_romano(int numeroentero) {
    	return to_romano(numeroentero, false);
    }
    
}

