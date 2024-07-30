package vehiculos;
import java.util.ArrayList;

public class Fabricante {
private String nombre;
private Pais pais;
private int cantidad = 0;
private static ArrayList<Fabricante> fabricantes = new ArrayList<>();


public Fabricante(String nombre, Pais pais) {
	this.nombre = nombre;
	this.pais = pais;
	fabricantes.add(this);
	pais.agregarFabricante(this);
}


public String getNombre() {
	return nombre;
}
public void setNombre(String Nombre) {
	this.nombre = nombre;
}


public Pais getPais() {
	return pais;
}
public void setPais(Pais pais) {
	this.pais = pais;
}


public void agregarCantidad() {
	cantidad ++;
}
public int getCantidad() {
	return cantidad;
}


public static Fabricante fabricaMayorVentas() {
	int v = 0;
	Fabricante mayor = null;
	for (int i = 0; i < fabricantes.size(); i++) {
		if (fabricantes.get(i).getCantidad() > v) {
			v = fabricantes.get(i).getCantidad();
			mayor = fabricantes.get(i);
		}
	}
			return mayor;
}

}
