package alumnos;
import java.util.*;


public class Alumne {
	public static Scanner lector=new Scanner(System.in);
	
	static int auto=0; //Creem un contador automàtic i el assignem a ident
	private int ident=++auto;
	private String nom;
	private int edat;
	private double[] notes=new double[3];
	
	
//Primer constructor
public Alumne(String nom, int edat, double nota1, double nota2, double nota3){
	this.nom=nom;
	this.edat=edat;
	this.notes[0]=nota1;
	this.notes[1]=nota2;
	this.notes[2]=nota3;
	
}


//Segon constructor(vuit)
	public  Alumne (){
		String nomAlu;
		int edatAlu;
		double nota1, nota2, nota3;
		
		System.out.println("Introduix nom del alumne==> ");
		nomAlu=lector.nextLine();
		lector.nextLine();
		
		do{
			System.out.println("Dis-me l'edat del alumne==> ");
			edatAlu=lector.nextInt();
		}while(edatAlu<11);
		
		//Demanem Notes
		do{
			System.out.println("Dis-me la nota1 del alumne==> ");
			nota1=lector.nextDouble();
		}while((nota1<0) || (nota1>10));
		
		do{
			System.out.println("Dis-me la nota2 del alumne==> ");
			nota2=lector.nextDouble();
		}while((nota2<0) || (nota2>10));
		
		do{
			System.out.println("Dis-me la nota3 del alumne==> ");
			nota3=lector.nextDouble();
		}while((nota3<0) || (nota3>10));
		
		//Si arriba hasta açi tot es correcte
		
		//Creem alumne
		this.nom=nomAlu;
		this.edat=edatAlu;
		this.notes[0]=nota1;
		this.notes[1]=nota2;
		this.notes[2]=nota3;
		
		System.out.println("L'alumne s'ha creat correctament...");
		
	}
	
	
public int getIdent() {
	return ident;
}


public void setIdent(int ident) {
	this.ident = ident;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public int getEdat() {
	return edat;
}


public void setEdat(int edat) {
	this.edat = edat;
}


public double[] getNotes() {
	return notes;
}


public void setNotes(double[] notes) {
	this.notes = notes;
}
public String toString(){
	
	
	
	return "============="+
			"\nNom==> " + this.nom + 
			"\nEdat==> " + this.edat +
			"\nNotes==> " + Arrays.toString(notes);
			
			
			
}

}
