package operaciones;

/**
 * 
 * @author ikaslea
 * @version 1
 */
public class Operaciones{
	
	/**
	 * Sumar
	 * @param valor1: numero 1
	 * @param valor2: numero 2
	 * @return devuelve la suma de numero 1 y numero 2
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    /**
     * Restar
     * @param valor1: numero 1
	 * @param valor2: numero 2
     * @return devuelve la resta de numero 1 y numero 2
     */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
    /**
     * Multiplicar
     * @param valor1: numero 1
	 * @param valor2: numero 2
     * @return devuelve la multiplicacion de numero 1 y numero 2
     */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    /**
     * Dividir
     * @param valor1: numero 1
	 * @param valor2: numero 2
     * @return devuelve la division de numero 1 y numero 2
     */
    public int dividir (int valor1, int valor2) throws ArithmeticException{
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    /**
     * Resto
     * @param valor1: numero 1
	 * @param valor2: numero 2
     * @return devuelve el resto de numero 1 y numero 2
     */
    public int resto (int valor1, int valor2) throws ArithmeticException{
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}