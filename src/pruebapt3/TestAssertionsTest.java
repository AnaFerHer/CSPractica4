package pruebapt3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestAssertionsTest {

	Cuenta cuentaUno = new Cuenta(200, "Francisco", "Martinez");
	Cuenta cuentaDos = new Cuenta(200, "Juan", "Contreras");
	Cuenta cuentaTres = new Cuenta(100, "Elena", "Garcia");
	Cuenta cuentaCuatro = null;
	Cuenta cuentaCinco = cuentaUno;
	Cuenta[] conjuntoCuentasUno = { cuentaUno, cuentaDos, cuentaTres };
	Cuenta[] conjuntoCuentasDos = { cuentaUno, cuentaDos, cuentaTres };
	
	@Test
	public void testTestAssertions1() {
		
		// assertTrue
		// checking if a condition is true
		assertTrue(cuentaUno.getBalance() == cuentaTres.getBalance());
	}
	@Test
	public void testTestAssertions2() {
		// assertFalse
		// checking if a condition is true
		assertFalse(cuentaUno.getBalance() == cuentaDos.getBalance());
	}
	
	@Test
	public void testTestAssertions3() {
		
		
		// assertNull
		// checking if an object is null
		assertNull(cuentaTres);
	}
	
	@Test
	public void testTestAssertions4() {
		
		// assertNotNull
		// checking if an object is not null
		assertNotNull(cuentaCuatro);	
	
	}
	
	@Test
	public void testTestAssertions5() {
		
		// assertEquals
		// checking if two objects are equal
		assertEquals(cuentaUno.getNombre(), cuentaCinco.getNombre());
	
	}
	
	@Test
	public void testTestAssertions6() {
		
		// assertSame
		// checking if two objects references point the same object
		assertSame(cuentaUno, cuentaCinco);
	
	}
	
	@Test
	public void testTestAssertions7() {
		
		// assertNotSame
		// checking if two objects references don't point the same object
		assertNotSame(cuentaUno, cuentaCuatro);
		
	}
	
	@Test
	public void testTestAssertions8() {
		
		// assertArrayEquals
		// checking if two arrays are the equal
		assertArrayEquals(conjuntoCuentasUno, conjuntoCuentasDos);
		
	}
}
