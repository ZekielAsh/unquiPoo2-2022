package clase15v9;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<String> nombres = new ArrayList <String>();
	

	public List<String> getNombres(){
		return this.nombres;
	}
	
	public void agregarNombre(String n) {
		this.nombres.add(n);
	}
	
	public void quitarNombre(String n) {
		this.nombres.remove(n);
	}
	
	public boolean anyMatch(String inicio) {
		for (String primero : nombres) {
			if (primero.startsWith(inicio)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean allMatch (String inicio) {
		for (String primero : nombres) {
			if (!(primero.startsWith(inicio))) {
				return false;
			}
		}
		return true;
	}
	
	public boolean noneMatch (String inicio) {
		return !(this.anyMatch(inicio));
	}
	
	public List<String> filter(String inicio){
		List<String> nombresFiltrados = new ArrayList<String>();
		for (String primero : nombres) {
			if(primero.startsWith(inicio)) {
				nombresFiltrados.add(primero);
			}
		}
		return nombresFiltrados;
	}
	
	public void printAll(List<String> lista) {
		
	}

}
