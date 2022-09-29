package ar.edu.unq.obj2.tp5;

import java.util.List;

public class Caja {
	 
	private float montoTotal;
	
	public void registrar(Producto producto) {
		montoTotal += producto.cobrar();
	}
	
	public void registrarLista(List<Producto> lista) {
		for (Producto producto : lista) {
			this.registrar(producto);
		}
	}
	
	public float montoTotal() {
		float montoFinal = montoTotal;
		this.montoTotal = 0;
		return montoFinal;
	}
}
