/**
 * 
 */
package DavidPugaRuano;

/**
 * @author David Puga Ruano
 * @version 1.0
 */
public class Calculadora {
	
	/**
	 * 
	 * @Constructor Constructor por defecto y sin par�metros
	 * 
	 * */
	public Calculadora(){
        
    }
	
	/**
	 * 
	 * @param num1 --> Recibe un n�mero entero llamado num1.
	 * @param num2 --> Recibe un n�mero entero llamado num2.
	 * @return Una vez recibido el n�mero num1 y num2 sumar� ambos dos n�meros y devolver� el resultado de la suma de ambos dos n�meros 
	 * 
	 * */
	
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
    /**
	 * 
	 * @param num1 --> Recibe un n�mero entero llamado num1.
	 * @param num2 --> Recibe un n�mero entero llamado num2.
	 * @return Una vez recibido el n�mero num1 y num2 restar� ambos dos n�meros y devolver� el resultado de la resta de ambos dos n�meros.
	 * 
	 * */
    
    public int resta(int num1,int num2){
        return num1-num2;
    }
    
    /**
	 * 
	 * @param num1 --> Recibe un n�mero entero llamado num1.
	 * @param num2 --> Recibe un n�mero entero llamado num2.
	 * @return Una vez recibido el n�mero num1 y num2 multiplicar� ambos dos n�meros y devolver� el resultado de la multiplicaci�n de ambos dos n�meros
	 * 
	 * */
    
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    
    /**
	 * 
	 * @param num1 --> Recibe un n�mero entero llamado num1.
	 * @param num2 --> Recibe un n�mero entero llamado num2.
	 * @return Una vez recibido el n�mero num1 y num2 dividir� ambos dos n�meros y devolver� el resultado de la divisi�n de ambos dos n�meros, adem�s.
	 * @throws este m�todo devolver� una excepci�n si se introduce en el segundo n�mero "num2" un 0 ya que la divisi�n de un n�mero entero entre 0 es un n�mero infinito 
	 * 
	 * */
    
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }

    /**
     * 
     * Tenemos 2 atributos llamados valor1 y valor2 de tipo entero
     * Variable valor 1 --> de tipo entero
     * Variable valor 2 --> de tipo entero
     * 
     * */
    
	private int valor1;
	private int valor2;
}
