package clase15v9;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clase15v9.Agenda;

public class AgendaTest {
	Agenda agenda;
	
	@BeforeEach
	public void setUp () throws Exception {
		agenda = new Agenda();
		agenda.agregarNombre("Nagao");
		agenda.agregarNombre("Nobbu");
		agenda.agregarNombre("Okita");
		agenda.agregarNombre("Hajime");
		agenda.agregarNombre("Nyck");
		agenda.agregarNombre("Chacha");
	}
	
	@Test
	public void testAnyMatch() {
		assertTrue(agenda.anyMatch("N"));
	}
	
	@Test
	public void testAnyMatchFalse() {
		assertFalse(agenda.anyMatch("A"));
	}
	
	@Test
	public void testAllMatch() {
		assertFalse(agenda.allMatch("N"));
	}
	
	@Test
	public void testAllMatchTrue() {
		agenda.quitarNombre("Hajime");
		agenda.quitarNombre("Okita");
		agenda.quitarNombre("Chacha");
		
		assertTrue(agenda.allMatch("N"));
		
	}
	
	@Test
	public void testNoneMatch() {
		assertTrue(agenda.noneMatch("Adios"));
	}
	
	@Test
	public void testNoneMatchFalse() {
		assertFalse(agenda.noneMatch("C"));
	}
	
	@Test
	public void testFilter() {
		Agenda res = new Agenda();
		res.agregarNombre("Nagao");
		res.agregarNombre("Nobbu");
		res.agregarNombre("Nyck");
		assertEquals(res, agenda.filter("N"));
	}
}
