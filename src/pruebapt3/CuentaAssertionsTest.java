package pruebapt3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CuentaAssertionsTest {

	Cuenta cuentaUno = new Cuenta(200, "Francisco", "Martinez");
	Cuenta cuentaDos = new Cuenta(200, "Juan", "Contreras");
	Cuenta cuentaTres = new Cuenta(100, "Elena", "Garcia");
	Cuenta cuentaCuatro = null;
	Cuenta cuentaCinco = cuentaUno;
	Cuenta[] conjuntoCuentasUno = { cuentaUno, cuentaDos, cuentaTres };
	Cuenta[] conjuntoCuentasDos = { cuentaUno, cuentaDos, cuentaTres };
	
	@Test
	public void cuentaAssertionsTest1() {
		
		// assertTrue
		// checking if a condition is true
		assertTrue(cuentaUno.getBalance() == cuentaDos.getBalance());
	}
	@Test
	public void cuentaAssertionsTest2() {
		// assertFalse
		// checking if a condition is true
		assertFalse(cuentaUno.getBalance() == cuentaTres.getBalance());
	}
	
	@Test
	public void cuentaAssertionsTest3() {
		
		
		// assertNull
		// checking if an object is null
		assertNull(cuentaCuatro);
	}
	
	@Test
	public void cuentaAssertionsTest4() {
		
		// assertNotNull
		// checking if an object is not null
		assertNotNull(cuentaTres);	
	
	}
	
	@Test
	public void cuentaAssertionsTest5() {
		
		// assertEquals
		// checking if two objects are equal
		assertEquals(cuentaUno.getNombre(), cuentaCinco.getNombre());
	
	}
	
	@Test
	public void cuentaAssertionsTest6() {
		
		// assertSame
		// checking if two objects references point the same object
		assertSame(cuentaUno, cuentaCinco);
	
	}
	
	@Test
	public void cuentaAssertionsTest7() {
		
		// assertNotSame
		// checking if two objects references don't point the same object
		assertNotSame(cuentaUno, cuentaCuatro);
		
	}
	
	@Test
	public void cuentaAssertionsTest8() {
		
		// assertArrayEquals
		// checking if two arrays are the equal
		assertArrayEquals(conjuntoCuentasUno, conjuntoCuentasDos);
		
	}

}
