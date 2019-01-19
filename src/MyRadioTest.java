/**
 * @author Isabel Ortiz y Diego Estrada 
 * Esta clase permite probar que los metodos funcionen correctamente.
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class MyRadioTest {
	MyRadio radioPrueba = new MyRadio();
	
	// Se prueban los metodos de getState() y toggle()
	@Test
	public void testGetState() {
		radioPrueba.toggle();
		assertEquals(false, radioPrueba.getState());
	}

	// Se prueban los metodos de getFrequency() y changeFrequency()
	@Test
	public void testGetFrequency() {
		radioPrueba.changeFrequency();
		assertEquals(89.7, radioPrueba.getFrequency());
	}

	// Se prueban los metodos de getStation() y changeStation()
	@Test
	public void testGetStation() {
		radioPrueba.changeStation(true);
		assertEquals(89.7, radioPrueba.getStation(), radioPrueba.getStation());
		
	}

}
