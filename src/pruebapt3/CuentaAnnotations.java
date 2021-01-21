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

import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Ignore;
import org.junit.Test;


//import org.junit.jupiter.api.Test;

public class CuentaAnnotations {

	static Cuenta cuentaUno;
	static Cuenta cuentaDos;
	static Cuenta cuentaTres;
	static Cuenta cuentaCuatro;
	static Cuenta cuentaCinco;
	static Cuenta[] conjuntoCuentasUno = { cuentaUno, cuentaDos, cuentaTres };
	static Cuenta[] conjuntoCuentasDos = { cuentaUno, cuentaDos, cuentaTres };
	
	
	@BeforeClass
	  public static void beforeClass() {
		System.out.println("Before Class");
		cuentaUno= new Cuenta(200, "Francisco", "Martinez");
		cuentaDos= new Cuenta(200, "Juan", "Contreras");
		cuentaTres= new Cuenta(100, "Elena", "Garcia");
		cuentaCuatro= null;
		cuentaCinco= cuentaUno;
		Cuenta[] conjuntoCuentasUno = { cuentaUno, cuentaDos, cuentaTres };
		Cuenta[] conjuntoCuentasDos = { cuentaUno, cuentaDos, cuentaTres };
		
	   }
	
	
	@Before
	  public void before() {
		System.out.println("Before");
		cuentaUno.dineroRetirado (50);
		
	   }
	
	@After
	  public void after() {
		System.out.println("After");
		cuentaUno= null;
		cuentaDos= null;
		cuentaTres= null;
		cuentaCuatro= null;
		cuentaCinco= null;
		Cuenta[] conjuntoCuentasUno = { null, null, null };
		Cuenta[] conjuntoCuentasDos = { null, null, null };
		
	   }
	
	@AfterClass
	  public static void afterClass() {
		System.out.println("AfterClass");
		
	   }
	
	@Ignore
	@Test
	public void cuentaAnnotations1() {
		System.out.println("Test1");
		// assertTrue
		// checking if a condition is true
		assertTrue(cuentaUno.getBalance() == cuentaDos.getBalance());
	}
	@Test
	public void cuentaAnnotations2() {
		
		System.out.println("Test2");
		// assertFalse
		// checking if a condition is true
		assertFalse(cuentaUno.getBalance() == cuentaTres.getBalance());
	}
	
	@Test
	public void cuentaAnnotations3() {
		
		System.out.println("Test3");
		// assertNull
		// checking if an object is null
		assertNull(cuentaCuatro);
	}
	
	@Test
	public void cuentaAnnotations4() {
		
		System.out.println("Test4");
		// assertNotNull
		// checking if an object is not null
		assertNotNull(cuentaTres);	
	
	}
	
	@Test
	public void cuentaAnnotations5() {
		
		System.out.println("Test5");
		// assertEquals
		// checking if two objects are equal
		assertEquals(cuentaUno.getNombre(), cuentaCinco.getNombre());
	
	}
	
	@Test
	public void cuentaAnnotations6() {
		
		System.out.println("Test6");
		// assertSame
		// checking if two objects references point the same object
		assertSame(cuentaUno, cuentaCinco);
	
	}
	
	@Test
	public void cuentaAnnotations7() {
		
		System.out.println("Test7");
		// assertNotSame
		// checking if two objects references don't point the same object
		assertNotSame(cuentaUno, cuentaCuatro);
		
	}
	
	@Test
	public void cuentaAnnotations8() {
		
		System.out.println("Test8");
		// assertArrayEquals
		// checking if two arrays are the equal
		assertArrayEquals(conjuntoCuentasUno, conjuntoCuentasDos);
		
	}

}
