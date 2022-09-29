package ar.edu.unq.obj2.tp5Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.obj2.tp5.Caja;
import ar.edu.unq.obj2.tp5.Producto;
import ar.edu.unq.obj2.tp5.ProductoCooperativa;
import ar.edu.unq.obj2.tp5.ProductoEmpresa;

public class ProductoTest {
	ProductoCooperativa prodCoop;
	ProductoCooperativa prodCoop2;
	ProductoCooperativa prodCoop3;
	ProductoCooperativa prodCoop4;
	ProductoEmpresa prodEmp;
	ProductoEmpresa prodEmp2;
	ProductoEmpresa prodEmp3;
	ProductoEmpresa prodEmp4;
	
	@BeforeEach
	public void setUp() {
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
	public void getYSetStockTest() {
		prodCoop.setStock(1);
		
		assertEquals(prodCoop.getStock(), 1);
	}
	
	
}
