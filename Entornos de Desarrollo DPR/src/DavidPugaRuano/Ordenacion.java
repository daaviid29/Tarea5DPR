/**
 * */
package DavidPugaRuano;
/**
 * @author David Puga Ruano
 * @version 1.0
 */
public class Ordenacion {
	/**
	 * Método encargado de ordenar un array de menor a mayor
	 * @param Recibe un parámetro de entrada que es un array unidimensional.
	 * 
	 * 
	 * */
	public void OrdenarArray(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int ValorMaximo = 0;
			for (int j = 0; j < i; j++) {
				if (array[j + 1] > array[ValorMaximo]) {
					ValorMaximo = j + 1;
				}
			}
			cambiar(array, i, ValorMaximo);
			imprimirArray(array);
		}
	}
	
	/**
	 * El método OrdenarArray2 Ordena un array de menor a mayor utilizando un array auxiliar
	 * @param Recibe un parámetro de entrada que es un array unidimensional.
	 * @return devuelve el Array con los números ordenados
	 * 
	 * */
	
	public int[] OrdenarArray2(int[] numeros) {
		for (int i=0; i < numeros.length - 1;i++) {
			for (int j=i+1;j<numeros.length;j++) {
				if (numeros[i]>numeros[j]) {
					int auxiliar=numeros[i];
					numeros[i]=numeros[j];
					numeros[j]=auxiliar;
				}
			}
		}
		return numeros;
	}

	/**
	 * 
	 * @param Recibe un parámetro de entrada que es un array unidimensional.
	 * Tenemos un bucle for el cual recorre toda la longitud del array y va imprimiendo todas las posiciones de dicho array, por último, tenemos un salto de línea para que no se nos junte con las siguientes líneas de código.
	 * 
	 * */
	
	public void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}
	
	/**
	 * Este método de encarga de intercambiar valores dentro de un array mediante su índice.
	 * @param array --> Recibe un array unidimensional
	 * @param a --> Recibe un parámetro de entrada entero.
	 * @param b --> Recibe un parámetro de entrada entero.
	 * 
	 * 
	 * */

	public void cambiar(int[] array, int a, int b) {
		int valor = array[b];
		array[b] = array[a];
		array[a] = valor;
	}
}
