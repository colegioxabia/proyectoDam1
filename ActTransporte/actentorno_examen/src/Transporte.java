
import java.util.*;
/**
 * <p>
 * Programa para gestionar los trayectos de una empresa de transporte.
 * </p>
 * <ul>
 * 	<li>Imprimir todos los trayectos por pantalla.
 * 	<li>Trayectos Largos por pantalla.
 * 	<li>Trayectos cortos.
 * 	<li>Duración media de los trayectos.
 * 	<li>Trayectos complementarios.
 * </ul>
 * @author vesprada
 *
 */
public class Transporte {
	static int auto=0;//Código autonumerico
	private int cod=++auto;
	private String inici;
	private String destino;
	private double km;
	private int duracion;
/**
 * 	
 * @param inici
 * @param destino
 * @param km
 * @param duracion
 */
	public Transporte(String inici,String destino, double km,int duracion){
		this.inici=inici;
		this.destino=destino;
		this.km=km;
		this.duracion=duracion;
		
	}
// sett y gett
		public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getInici() {
		return inici;
	}

	public void setInici(String inici) {
		this.inici = inici;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
/**
 * 
 * Sirve para imprimir la informacion de la declaraciones de forma adecuada por pantalla.
 */
		public String toString(){
			return "============"+ "\n"+
			"cod=\t\t" +this.getCod()+ "\n"+
			"inici=\t\t" +this.getInici()+ "\n"+
			"destino=\t" +this.getDestino()+ "\n"+
			"km=\t\t" +this.getKm() +"\n"+
			"duracion=\t" +this.getDuracion()+ "\n";
		
	}
/**
 * <p>
 * Metodo utilizado para hacer las pruebas jUnit y debug
 * Metodo que muestra por pantalla si los trayectos son complementarios, y debe retornar true.
 * </p>	
 * 	
 * @param t
 * @return
 */
		
		public boolean esComplementario(Transporte t){
			
			boolean buscar=false;
			
			
			
				if((this.inici.equalsIgnoreCase(t.getDestino())) && (this.destino.equalsIgnoreCase(t.getInici()))){
						buscar=true;
			}
			return buscar;
		}
}//Fin de la clase Transporte
		
		

