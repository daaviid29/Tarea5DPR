package DavidPugaRuano;

public class Ejercicio2 {
	
	// Ejercicio 1
	public static int ej1(int a, int b, int c) {
		int x = 5;
		if((a > 1) && (b > 5) && (c > 2)) {
			x = x + 1;
		}else {
			x = x - 1;
		}
		return x;
	}
	
	// Ejercicio 2
	public static int ej2(int a, int b, int c) {
		int x = 5;
		if((a > 5) || (b > 5) || (c < 2)) {
			x = x + 1;
		}else {
			x = x - 1;
		}
		return x;
	}
	
	// Ejercicio 5
	public static int ej5(int x, int y) {
		while(x != y) {
			if(x > y) {
				x = x - y;
			}else {
				y = y - x;			
			}
		}
		return x;
	}
	
	// Ejercicio 6
	public static int ej6(int num, int x, int y) {
		if(x < y) {
			if(x <= num && num <= y) {
				return 1;
			}else {
				return 0;
			}
		}else{
			return -1;
		}
	}
	
	// Ejercicio 8
	public static int ej8(int x, int y) {
		int contador = 0;
		for (int i = 0; i <= y; i++) {
			if(i % x == 0) {
				contador++;
			}
		}
		return contador;
	}
}
