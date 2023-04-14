/*
 * NUMEROS DE FIBONACCI
 * un número ingresado por el usuario, que indique
cuántos elementos de la serie de Fibonacci se deben mostrar
 */
package cl.marely;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Fibonacci {

	public static void main(String[] args) {
//declaración de variables
		int a = 0;
		int b = 1;
		int c = 0;
		int i = 0;
		int n = 0;
		// lectura de ultimo numero fibonacci
		System.out.println("Ingrese n: ");
		Scanner sc = new Scanner(System.in);

		try {
			n = sc.nextInt();
			do {
				a = b;
				b = c;
				System.out.println(c); // imprime numero fibonacci
				c = a + b;
				i++; // incremento
			} while (i < n); // condición salida bucle
		} catch (InputMismatchException e) {
			System.out.println("error"); // mensaje de error del try catch }
			sc.close();
		}
		// FIN
	}
}