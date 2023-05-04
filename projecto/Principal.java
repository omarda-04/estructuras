import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
		List<Equiposbasketball>  lista= new ArrayList <>();
		
		Gestor gestor= new Gestor();
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de equipos que desea ingresar");
		
		int numeroEquipos = entrada.nextInt();
		
		for(int i=0;i<numeroEquipos;i++) {
			Equiposbasketball equipo = new Equiposbasketball();
			
			System.out.println("Ingrese el nombre del equipo");
			String nombre= entrada.next();
			equipo.nombreEquipo=nombre;
			System.out.println("Ingrese su posicion en la tabla:");
			int posicion=entrada.nextInt();
			equipo.posicion=posicion;
			System.out.println("Ingrese la ciudad en el que juega");
			String ciudad= entrada.next();
			equipo.ciudad=ciudad;
			lista.add(equipo);
			
			
		}
		
		
		
		gestor.ordenaBubbleSort();
		
		for(Object dato:lista) {
			System.out.println(" "+dato);
		}
	}
    
}
