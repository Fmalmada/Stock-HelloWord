package EjercicioaAlmacen.Almacen;

import java.util.HashMap;
import java.util.Map;

public class Stock {
	Map<String, Integer> productos = new HashMap<String, Integer>();

	public void agregarProducto(String string, Integer int1) {
		productos.put(string, int1);
		
	}

	public void comprar(String string, Integer int1) {
		int valorAnterior = (Integer) productos.get(string);
		productos.put(string, valorAnterior - int1);
	}

	public Integer conseguirUnidades(String string) {
		return (Integer) productos.get(string);
	}

	public void agregarUnidades(String string, Integer int1) {
		int valorAnterior = (Integer) productos.get(string);
		productos.put(string, valorAnterior + int1);
	}
}
