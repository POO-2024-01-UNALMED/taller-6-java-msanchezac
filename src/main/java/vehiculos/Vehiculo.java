package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
private String placa;
private int puertas;
private int velocidadMaxima;
private String nombre;
private int precio;
private int peso;
private String traccion;
private Fabricante fabricante;
private static int cantidadVehiculos = 0;
private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
	this.placa = placa;
	this.puertas = puertas;
	this.velocidadMaxima = velocidadMaxima;
	this.nombre = nombre;
	this.precio = precio;
	this.peso = peso;
	this.traccion = traccion;
	this.fabricante = fabricante;
	Vehiculo.cantidadVehiculos ++;
	Vehiculo.agregarVehiculo(this); 
	fabricante.agregarCantidad();	
}

public static String vehiculosPorTipo() {
	return "Automoviles: " + Automovil.getCantidad() + "\n" +
           "Camionetas: " + Camioneta.getCantidad() + "\n" +
		   "Camiones: " + Camion.getCantidad();
}

public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}

public int getPuertas() {
	return puertas;
}
public void setPuertas(int puertas) {
	this.puertas = puertas;
}

public int getVelocidadMaxima() {
	return velocidadMaxima; 
}
public void setVelocidadMaxima(int velocidadMaxima) {
	this.velocidadMaxima = velocidadMaxima;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}

public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}

public String getTraccion() {
	return traccion;
}
public void setTraccion(String traccion) {
	this.traccion = traccion;
}

public Fabricante getFabricante() {
	return fabricante;
}
public void setFabricante(Fabricante fabricante) {
	this.fabricante = fabricante;
}

public static int getCantidadVehiculos() {
	return cantidadVehiculos;
}
public static void setCantidadVehiculos(int cantidad) {
	cantidadVehiculos = cantidad;
}

public static void agregarVehiculo(Vehiculo vehiculo) {
	vehiculos.add(vehiculo);
}

public static ArrayList<Vehiculo> getLista(){
	return vehiculos;
}
}
