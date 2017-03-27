
import java.util.*;
/**
 * Clase principal del programa.
 */
import java.text.*;
public class mainTransporte {
public static Scanner lector=new Scanner(System.in);
public static Transporte[] trayec=new Transporte[10];//Array
public static DecimalFormat df=new DecimalFormat("#.##");

/**
 * 
 * Método que imprime toda la tabla de trayectos del array
 */
public static void imprimirTransporte(){//Primer nodo, inicio del metodo
	                         
	for(int i=0; i<trayec.length; i++){//Segundo nodo
		if(trayec[i]!=null) //Tercer nodo
		System.out.println(trayec[i].toString());//Cuarto nodo
	}
	 
}// Fin del método
/*
 * eres una perra
 */
/**
 * Metodo que sirve para mostrar la informacion del trayecto mas largo y la duración media de ellos.
 */
public static void estadisticasTransporte(){
  		double maxTrayec=0;//Primer nodo
		int pos=-1;// declaracion, inicio
		for (int i = 0; i < trayec.length; i++) {//Segundo nodo
			if((trayec[i]!=null)&&(trayec[i].getKm()>maxTrayec)){//Tercer nodo
				maxTrayec=trayec[i].getKm();
				pos=i;
			}
		}
		if(pos!=-1)//Cuarto nodo
			System.out.println("El trayecto mas largo es: " + "\n"+trayec[pos].toString());//Nodo 6
		
		else System.out.println("El array esta vacio");//Nodo 5
		
/**
 * Sirve para calcular la media de los trayectos		
 */
			
			double sumaTotal=0;//Nodo 1
			int cont=0;//Nodo 1
			for (int j = 0; j < trayec.length; j++){ //Nodo 2 
				if(trayec[j]!=null)//Nodo 3
					sumaTotal+=trayec[j].getKm();
				cont ++;
			}
		
			
		System.out.println("La media de los trayectos es:"+df.format(sumaTotal/cont));//Nodo 4
}//fin del método




/**
 * 
 * <p>
 * Array de trayectos creados de forma explícita.
 * </p>
 * @param args
 */


	public static void main(String[] args) {
		 
		 Transporte t1=new Transporte("Gandia","xabia",40,50);
		 Transporte t2=new Transporte("Xabia","Denia",20,25);
		 Transporte t3=new Transporte("Oliva","Alicant",100,75);
		 Transporte t4=new Transporte("Valencia","Xabia",120,130);
		 Transporte t5=new Transporte("Alacant","calp",60,52);
		 Transporte t6=new Transporte("Xabia","Gandia",40,50);
		 trayec[0]=t1;
		 trayec[1]=t2;
		 trayec[2]=t3;
		 trayec[3]=t4;
		 trayec[4]=t5;
		 trayec[5]=t6;
		 imprimirTransporte();//llamada al método.
		 estadisticasTransporte();// llamada al método.
		 
		 System.out.println("SOY MARICA COME POLLA");
		 System.out.println("El trayecto 1 y 6 es complementario:"+ t1.esComplementario(t6));//Imprime por pantalla los que son complementarios
	}

}//Fin de la clase mainTransporte
