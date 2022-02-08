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
	 * @Constructor Constructor por defecto y sin parámetros
	 * 
	 * */
	public Calculadora(){
        
    }
	
	/**
	 * 
	 * @param num1 --> Recibe un número entero llamado num1.
	 * @param num2 --> Recibe un número entero llamado num2.
	 * @return Una vez recibido el número num1 y num2 sumará ambos dos números y devolverá el resultado de la suma de ambos dos números 
	 * 
	 * */
	
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
    /**
	 * 
	 * @param num1 --> Recibe un número entero llamado num1.
	 * @param num2 --> Recibe un número entero llamado num2.
	 * @return Una vez recibido el número num1 y num2 restará ambos dos números y devolverá el resultado de la resta de ambos dos números.
	 * 
	 * */
    
    public int resta(int num1,int num2){
        return num1-num2;
    }
    
    /**
	 * 
	 * @param num1 --> Recibe un número entero llamado num1.
	 * @param num2 --> Recibe un número entero llamado num2.
	 * @return Una vez recibido el número num1 y num2 multiplicará ambos dos números y devolverá el resultado de la multiplicación de ambos dos números
	 * 
	 * */
    
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    
    /**
	 * 
	 * @param num1 --> Recibe un número entero llamado num1.
	 * @param num2 --> Recibe un número entero llamado num2.
	 * @return Una vez recibido el número num1 y num2 dividirá ambos dos números y devolverá el resultado de la división de ambos dos números, además.
	 * @throws este método devolverá una excepción si se introduce en el segundo número "num2" un 0 ya que la división de un número entero entre 0 es un número infinito 
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
