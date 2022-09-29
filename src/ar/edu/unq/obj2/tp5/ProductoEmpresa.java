package ar.edu.unq.obj2.tp5;

public class ProductoEmpresa extends Producto{

	public ProductoEmpresa(int precio, int stock) {
		this.stock = stock;
		this.precio = precio;
	}
	
	@Override
	public int cobrar() {
		int monto = this.getPrecio();
		if (this.stock > 0) {
			this.stock = this.stock - 1;
		} else {monto = 0;}
	return monto;
	}
}
