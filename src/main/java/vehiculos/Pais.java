package vehiculos;
import java.util.ArrayList;

public class Pais {
private String nombre;
private static ArrayList<Pais> paises = new ArrayList<>();
private ArrayList<Fabricante> fabricantes = new ArrayList<>();

public Pais(String nombre) {
	this.nombre = nombre;
	paises.add(this);
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

public void agregarFabricante(Fabricante fab) {
	fabricantes.add(fab);
}

public static Pais paisMasVendedor() {
	return Fabricante.fabricaMayorVentas().getPais();
}

}
