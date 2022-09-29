package ar.edu.unq.obj2.tp5Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.obj2.tp5.Caja;
import ar.edu.unq.obj2.tp5.Producto;
import ar.edu.unq.obj2.tp5.ProductoCooperativa;
import ar.edu.unq.obj2.tp5.ProductoEmpresa;

public class CajaTest {
	Caja caja;
	ProductoCooperativa prodCoop;
	ProductoCooperativa prodCoop2;
	ProductoCooperativa prodCoop3;
	ProductoCooperativa prodCoop4;
	ProductoEmpresa prodEmp;
	ProductoEmpresa prodEmp2;
	ProductoEmpresa prodEmp3;
	ProductoEmpresa prodEmp4;
	ArrayList listaDeProductos = new ArrayList<Producto>();
	
	@BeforeEach
	public void setUp() throws Exception{
		caja = new Caja();
		prodCoop = new ProductoCooperativa(190, 23);
		prodCoop2 = new ProductoCooperativa(50, 3);
		prodCoop3 = new ProductoCooperativa(240, 0);
		prodCoop4 = new ProductoCooperativa(10, 25);
		prodEmp = new ProductoEmpresa(250, 15);
		prodEmp2 = new ProductoEmpresa(170, 5);
		prodEmp3 = new ProductoEmpresa(25, 1);
		prodEmp4 = new ProductoEmpresa(1250, 0);
	}
	
	@Test
	public void registrarUnProductoTest() {
		caja.registrar(prodCoop);
		
		assertEquals(caja.montoTotal(), prodCoop.cobrar());
	}
	
	@Test
	public void registrarVariosProductosTest() {
		listaDeProductos.add(prodEmp2);
		listaDeProductos.add(prodEmp4);
		listaDeProductos.add(prodCoop);
		listaDeProductos.add(prodCoop2);
		caja.registrarLista(listaDeProductos);
		float montoResultado = prodEmp2.cobrar()+prodEmp4.cobrar()+prodCoop2.cobrar()+prodCoop.cobrar();
		assertEquals(caja.montoTotal(), montoResultado);
	}
	
	@Test
	public void registrarSinStockTest() {
		caja.registrar(prodEmp4);
		
		assertEquals(caja.montoTotal(), 0);
	}
	@Test
	public void registrarPrecioNegativoTest() {
		prodCoop2.setPrecio(-10);
		caja.registrar(prodCoop2);
		
		assertEquals(caja.montoTotal(), -9);
	}
}