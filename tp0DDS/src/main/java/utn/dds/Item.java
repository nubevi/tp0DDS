package utn.dds;

public class Item {
	private int id;
	private String nombre;
	private double precio;
	private String tipo;
	
	public Item(String nombre, int id, float precio, String tipo) {
		this.nombre = nombre;
		this.id = id;
		this.precio = precio;
		this.setTipo(tipo);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
}
