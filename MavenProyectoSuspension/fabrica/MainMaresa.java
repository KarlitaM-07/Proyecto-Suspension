package fabrica;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class MainMaresa {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();
		List<Empleado> listMaresa = new ArrayList<Empleado>();
		Empleado empleado = new Empleado();
		do {	
			
			System.out.println("--------------------------------");
			System.out.println(" Corporacion Maresa ");
			System.out.println("Ingrese Nombre");
			String nombre = teclado.nextLine();
			System.out.println("Ingrese Apellido");
			String apellido = teclado.nextLine();  
			System.out.println("Ingrese Cedula");
			String cedula = teclado.nextLine();
			System.out.println("Ingrese Edad");
			int edad = teclado.nextInt();
			System.out.println("Que tipo de Empleado es:");
			System.out.println("1.Empleado Nocturno");
			String empleado1=teclado.nextLine();
			System.out.println("2.Empleado Diurno");
			String tipoEmpleado = teclado.nextLine();
			if (tipoEmpleado.equals("1")) {
				System.out.println("Ingrese codigo de horas extra del empleado");
				String codigoHorasExtra = teclado.nextLine();
				empleado.setCedula(cedula);
				System.out.println("el empleado es: ");
				String eleccion=teclado.nextLine();
				
				switch(eleccion) {
				case"1":
					System.out.println("Empleado Nocturno");
					String e=teclado.nextLine();
					
					
				case "2":
					System.out.println("Empleado Diurno");
					String em= teclado.nextLine();
					for (int i = 0; (i <listEmpleado()); i++) {
						Empleado empleDiu = (Empleado) listMaresa;
						boolean encontar = empleDiu.getCedula().contains(codigoHorasExtra);
						
	
						System.out.println(tipoEmpleado);
					
						
				} 

				} 
			} else if (tipoEmpleado.equals("2")) {
				System.out.println("Ingrese codigo agencia del empleado");
				String codigoAgencia = teclado.nextLine();
				empleado.setCedula(cedula);
				System.out.println("el empleado es de tipo: ");
				String elegir=teclado.nextLine();
				
				
				switch(elegir) {
				case"1":
					System.out.println("Empleado Nocturno");
					String emd=teclado.nextLine();
					break;
					
				case "2":
					System.out.println("Empleado Diurno");
					String emp= teclado.nextLine();
					break;
					
	
				}
			}
				
		}while(opcion !=3);
		System.out.println(" Gracias por revisar la informacion");
		
			}

	private static int listEmpleado() {
		// TODO Auto-generated method stub
		return 0;
	}
			
		
	}
