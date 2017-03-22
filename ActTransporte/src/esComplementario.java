

import static org.junit.Assert.*;

import org.junit.Test;

public class esComplementario {
	
	
	Transporte t1=new Transporte("Gandia","xabia",40,50);
	 Transporte t2=new Transporte("Xabia","Denia",20,25);
	 Transporte t3=new Transporte("Oliva","Alicant",100,75);
	 Transporte t4=new Transporte("Valencia","Xabia",120,130);
	 Transporte t5=new Transporte("Alacant","calp",60,52);
	 Transporte t6=new Transporte("Xabia","Gandia",40,50);
	 
	
	
	@Test
	public void test() {
		
//Pruebas positivas		
		assertTrue(t1.esComplementario(t6));		
		//assertNull(null);
		
//Pruebas negativas		
		//assertTrue(false);
		//assertFalse(t1.esComplementario(t6));
		//assertTrue(t1.esComplementario(t2));
	}


	
}