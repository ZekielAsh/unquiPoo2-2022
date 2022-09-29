package ar.edu.unq.obj2.tp5;

public abstract class Producto {
	protected int precio;
	protected int stock;
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public abstract int cobrar();
}
