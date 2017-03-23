package alumnos;

import java.text.*;
import java.util.*;

public class mainAlumnes {
	
	public static DecimalFormat df=new DecimalFormat("#.##");
	public static Scanner lector=new Scanner(System.in);
	//Creem array
	public static Alumne[]arrayAlu=new Alumne[10];
		
		
		
	//Introduir nou alumne(Primer metode)
	public static void altaAlumne(){
		
		Alumne nouAlumne=new Alumne();//<==Alumne es el segon constructor, estem creant una flecha a eixe metode
		boolean trovat=true;
		
		for(int i=0;i<arrayAlu.length;i++){
			if(arrayAlu[i]==null){
				
				arrayAlu[i]=nouAlumne;
				System.out.println(arrayAlu[i].toString() + "\n s'ha introduit correctament" );
				trovat=true;
				break;
			}
		}
		if(trovat==false)System.out.println("No s'ha trovat lloc pel alumne");
	}
	
	//Mitjana notes cada alumne(segon metode)
	public static void mitjanaNotes(){
		
		int contador=0;
		double[]mitjanaAlumne=0.0;
		
		for(int i=0;i<arrayAlu.length;i++){
			if(arrayAlu[i]!=null){
				mitjanaAlumne=arrayAlu[i].getNotes();
				contador++;
		//Agarrar les 3 notes de cada alumne i divirles per 3(contador)		
			}
		}
		System.out.println("Mitjana del alumne "+ mitjanaAlumne/contador);
	}
	
	
	//Metode per a vore tots els alumnes(tercer medote)
	public static void llistatAlumnes(){
		for(int i=0;i<arrayAlu.length;i++){
			if(arrayAlu[i]!=null) System.out.println(arrayAlu[i].toString());
		}
	}
	
	
	//Mitjana de les edats(quart metode)
	public static double mitjanaEdat(){
		double sumaTotal=0;
		int contador=0;
	
		for(int i=0;i<arrayAlu.length;i++){
			if(arrayAlu[i]!=null){
				sumaTotal+=arrayAlu[i].getEdat();//Agarrem la edat mitjançant el metode GET de l'atra clase
				contador++;
			}
		}
		if(contador!=0)
			return sumaTotal/contador;
		return 0;
	}
	public static void main(String[] args) {

		//Piquem els alumnes
		Alumne a1= new Alumne("Pepe",20,2.50,7,2.5);
		Alumne a2= new Alumne("Juan",18,4,6,5);
		Alumne a3= new Alumne("Maria",22,7,6.50,7.50);
		Alumne a4= new Alumne("Sonia",36,5.20,6.80,0);
		Alumne a5= new Alumne("Pedro",21,2.50,6.50,5);
		Alumne a6= new Alumne("Vicent",23,9.20,8,8.50);
		
		//Els asignem una posició en el array
		arrayAlu[0]=a1;
		arrayAlu[1]=a2;
		arrayAlu[2]=a3;
		arrayAlu[3]=a4;
		arrayAlu[4]=a5;
		arrayAlu[5]=a6;
		
		
		System.out.println(Arrays.toString(arrayAlu));
		System.out.println("Creant alumnes i afegint a l'array d'alumnes\n");

		//...............
			
		
		int option=0;
		
		do{
			System.out.println();
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("====================");
			System.out.println("1.-Crear alumne demanant les dades ");
			System.out.println("2.-Calcular mitjana notes de cada alumne i mostrar");
			System.out.println("3.-Imprimir tots els alumnes ");
			System.out.println("4.-Mitjana edat de tots els alumnes..");
			System.out.println("5.-Mitjana d'una assignatura (de nota1, de nota2 o de nota3)");
			System.out.println("6.-Imprimir alumne en edat maxima==> ");
			System.out.println("7.-Imprimir alumne en nota maxima de una assignatura==> ");
			
			System.out.println("0.-Eixir de l'aplicació.");
			
			
			System.out.print("Inserta una opció vàlida: ");
			option=lector.nextInt();
			lector.nextLine();
			System.out.println("");
			switch(option){
			case 1:
				altaAlumne();
				break;
			case 2:			
				mitjanaNotes();
				break;
			case 3:			
				llistatAlumnes();
				break;
			case 4:			
				System.out.println("La mitjana dels alumnes es==> " + df.format(mitjanaEdat()));
				break;
			case 5:			
				System.out.println("Dime quina assignatura vols==> "); 
				int numAssig= lector.nextInt();
				System.out.println("La mitjana de de la assignatura "+ numAssig + " es ==> " + df.format(numAssignatura()));
				break;
			case 0:
				System.out.println("Aplicació finalitzada.");
				break;
			default:
				break;
			}
			
		}while (option!=0);
		
		
		
	}

}
