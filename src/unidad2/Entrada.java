package unidad2;

import java.util.Scanner;

public class Entrada {
	 
	String nombre, apellido, hobbie, editor, so;
	int edad;

	public void leerDatos()
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese Nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Ingrese Apellido: ");
		apellido = teclado.nextLine();
		
		System.out.println("Ingrese Edad: ");
		edad = teclado.nextInt();
		
		System.out.println("Ingrese Hobbie: ");
		hobbie = teclado.nextLine();
		
		System.out.println("Ingrese Editor preferido: ");
		editor = teclado.nextLine();
		
		System.out.println("Ingrese Sistema Operativo: ");
		so = teclado.nextLine();
		
	}
	
	public void imprimirDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido" + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Hobbie: " + hobbie);
		System.out.println("Editor: " + editor);
		System.out.println("so: " + so);
		
		
	}
	
	
	public static void main (String[] args ) {
		
		
	}
}
